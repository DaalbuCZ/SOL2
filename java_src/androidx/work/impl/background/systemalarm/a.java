package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import k0.j;
import l0.i;
import s0.g;
import s0.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2593a = j.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h y10 = iVar.o().y();
        g c10 = y10.c(str);
        if (c10 != null) {
            b(context, str, c10.f13209b);
            j.c().a(f2593a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            y10.d(str);
        }
    }

    private static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        j.c().a(f2593a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j10) {
        int b10;
        WorkDatabase o10 = iVar.o();
        h y10 = o10.y();
        g c10 = y10.c(str);
        if (c10 != null) {
            b(context, str, c10.f13209b);
            b10 = c10.f13209b;
        } else {
            b10 = new t0.c(o10).b();
            y10.a(new g(str, b10));
        }
        d(context, str, b10, j10);
    }

    private static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, str), i11 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i11 >= 19) {
                alarmManager.setExact(0, j10, service);
            } else {
                alarmManager.set(0, j10, service);
            }
        }
    }
}
