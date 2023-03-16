package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k0.g;
import k0.j;
import k0.s;
import l0.f;
import l0.h;
import l0.i;
import n0.b;
import s0.n;
import s0.p;
import s0.q;
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    private static final String f2664q = j.f("ForceStopRunnable");

    /* renamed from: r  reason: collision with root package name */
    private static final long f2665r = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: n  reason: collision with root package name */
    private final Context f2666n;

    /* renamed from: o  reason: collision with root package name */
    private final i f2667o;

    /* renamed from: p  reason: collision with root package name */
    private int f2668p = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f2669a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.c().g(f2669a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f2666n = context.getApplicationContext();
        this.f2667o = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, a.c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f2665r;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, d10);
            } else {
                alarmManager.set(0, currentTimeMillis, d10);
            }
        }
    }

    public boolean a() {
        boolean i10 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f2666n, this.f2667o) : false;
        WorkDatabase o10 = this.f2667o.o();
        q B = o10.B();
        n A = o10.A();
        o10.c();
        try {
            List<p> d10 = B.d();
            boolean z10 = (d10 == null || d10.isEmpty()) ? false : true;
            if (z10) {
                for (p pVar : d10) {
                    B.c(s.ENQUEUED, pVar.f13231a);
                    B.f(pVar.f13231a, -1L);
                }
            }
            A.b();
            o10.r();
            return z10 || i10;
        } finally {
            o10.g();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            j.c().a(f2664q, "Rescheduling Workers.", new Throwable[0]);
            this.f2667o.s();
            this.f2667o.l().c(false);
        } else if (e()) {
            j.c().a(f2664q, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f2667o.s();
        } else if (a10) {
            j.c().a(f2664q, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f2667o.i(), this.f2667o.o(), this.f2667o.n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            PendingIntent d10 = d(this.f2666n, a.c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f2666n.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        if (historicalProcessExitReasons.get(i10).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f2666n);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            j.c().h(f2664q, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a i10 = this.f2667o.i();
        if (TextUtils.isEmpty(i10.c())) {
            j.c().a(f2664q, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b10 = t0.f.b(this.f2666n, i10);
        j.c().a(f2664q, String.format("Is default app process = %s", Boolean.valueOf(b10)), new Throwable[0]);
        return b10;
    }

    boolean h() {
        return this.f2667o.l().a();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    h.e(this.f2666n);
                    j.c().a(f2664q, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                        i10 = this.f2668p + 1;
                        this.f2668p = i10;
                        if (i10 >= 3) {
                            j c10 = j.c();
                            String str = f2664q;
                            c10.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            g d10 = this.f2667o.i().d();
                            if (d10 == null) {
                                throw illegalStateException;
                            }
                            j.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                            d10.a(illegalStateException);
                        } else {
                            j.c().a(f2664q, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                            i(this.f2668p * 300);
                        }
                    }
                    j.c().a(f2664q, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                    i(this.f2668p * 300);
                }
            }
        } finally {
            this.f2667o.r();
        }
    }
}
