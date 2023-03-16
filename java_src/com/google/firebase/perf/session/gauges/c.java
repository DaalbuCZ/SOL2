package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class c {

    /* renamed from: g  reason: collision with root package name */
    private static final u6.a f5764g = u6.a.e();

    /* renamed from: h  reason: collision with root package name */
    private static final long f5765h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: c  reason: collision with root package name */
    private final String f5768c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5769d;

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture f5770e = null;

    /* renamed from: f  reason: collision with root package name */
    private long f5771f = -1;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b7.e> f5766a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f5767b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public c() {
        int myPid = Process.myPid();
        this.f5768c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f5769d = e();
    }

    private long d(long j10) {
        return Math.round((j10 / this.f5769d) * f5765h);
    }

    private long e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Os.sysconf(OsConstants._SC_CLK_TCK);
        }
        return -1L;
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(a7.l lVar) {
        b7.e m10 = m(lVar);
        if (m10 != null) {
            this.f5766a.add(m10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(a7.l lVar) {
        b7.e m10 = m(lVar);
        if (m10 != null) {
            this.f5766a.add(m10);
        }
    }

    private synchronized void i(final a7.l lVar) {
        try {
            this.f5767b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.g(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            u6.a aVar = f5764g;
            aVar.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void j(long j10, final a7.l lVar) {
        this.f5771f = j10;
        try {
            this.f5770e = this.f5767b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.h(lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            u6.a aVar = f5764g;
            aVar.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private b7.e m(a7.l lVar) {
        u6.a aVar;
        StringBuilder sb;
        String message;
        if (lVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f5768c));
            try {
                long b10 = lVar.b();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                b7.e a10 = b7.e.V().L(b10).M(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).N(d(parseLong + parseLong2)).a();
                bufferedReader.close();
                return a10;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            aVar = f5764g;
            sb = new StringBuilder();
            sb.append("Unable to read 'proc/[pid]/stat' file: ");
            message = e10.getMessage();
            sb.append(message);
            aVar.j(sb.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            aVar = f5764g;
            sb = new StringBuilder();
            sb.append("Unexpected '/proc/[pid]/stat' file format encountered: ");
            message = e.getMessage();
            sb.append(message);
            aVar.j(sb.toString());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            aVar = f5764g;
            sb = new StringBuilder();
            sb.append("Unexpected '/proc/[pid]/stat' file format encountered: ");
            message = e.getMessage();
            sb.append(message);
            aVar.j(sb.toString());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            aVar = f5764g;
            sb = new StringBuilder();
            sb.append("Unexpected '/proc/[pid]/stat' file format encountered: ");
            message = e.getMessage();
            sb.append(message);
            aVar.j(sb.toString());
            return null;
        }
    }

    public void c(a7.l lVar) {
        i(lVar);
    }

    public void k(long j10, a7.l lVar) {
        long j11 = this.f5769d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f5770e == null) {
            j(j10, lVar);
        } else if (this.f5771f != j10) {
            l();
            j(j10, lVar);
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f5770e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f5770e = null;
        this.f5771f = -1L;
    }
}
