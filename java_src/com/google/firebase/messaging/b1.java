package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f5488i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f5489a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f5490b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f5491c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f5492d;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f5494f;

    /* renamed from: h  reason: collision with root package name */
    private final z0 f5496h;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<t4.j<Void>>> f5493e = new m.a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f5495g = false;

    private b1(FirebaseMessaging firebaseMessaging, i0 i0Var, z0 z0Var, d0 d0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5492d = firebaseMessaging;
        this.f5490b = i0Var;
        this.f5496h = z0Var;
        this.f5491c = d0Var;
        this.f5489a = context;
        this.f5494f = scheduledExecutorService;
    }

    private void b(y0 y0Var, t4.j<Void> jVar) {
        ArrayDeque<t4.j<Void>> arrayDeque;
        synchronized (this.f5493e) {
            String e10 = y0Var.e();
            if (this.f5493e.containsKey(e10)) {
                arrayDeque = this.f5493e.get(e10);
            } else {
                ArrayDeque<t4.j<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f5493e.put(e10, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(jVar);
        }
    }

    private static <T> void c(t4.i<T> iVar) {
        try {
            t4.l.b(iVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void d(String str) {
        c(this.f5491c.l(this.f5492d.n(), str));
    }

    private void e(String str) {
        c(this.f5491c.m(this.f5492d.n(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t4.i<b1> f(final FirebaseMessaging firebaseMessaging, final i0 i0Var, final d0 d0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return t4.l.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.a1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b1 j10;
                j10 = b1.j(context, scheduledExecutorService, firebaseMessaging, i0Var, d0Var);
                return j10;
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, i0 i0Var, d0 d0Var) {
        return new b1(firebaseMessaging, i0Var, z0.b(context, scheduledExecutorService), d0Var, context, scheduledExecutorService);
    }

    private void k(y0 y0Var) {
        synchronized (this.f5493e) {
            String e10 = y0Var.e();
            if (this.f5493e.containsKey(e10)) {
                ArrayDeque<t4.j<Void>> arrayDeque = this.f5493e.get(e10);
                t4.j<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f5493e.remove(e10);
                }
            }
        }
    }

    private void p() {
        if (i()) {
            return;
        }
        t(0L);
    }

    boolean g() {
        return this.f5496h.c() != null;
    }

    synchronized boolean i() {
        return this.f5495g;
    }

    boolean l(y0 y0Var) {
        String str;
        String str2;
        try {
            String b10 = y0Var.b();
            char c10 = 65535;
            int hashCode = b10.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b10.equals("U")) {
                    c10 = 1;
                }
            } else if (b10.equals("S")) {
                c10 = 0;
            }
            if (c10 == 0) {
                d(y0Var.c());
                if (h()) {
                    str2 = "Subscribe to topic: " + y0Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            } else if (c10 != 1) {
                if (h()) {
                    str2 = "Unknown topic operation" + y0Var + ".";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            } else {
                e(y0Var.c());
                if (h()) {
                    str2 = "Unsubscribe from topic: " + y0Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            }
        } catch (IOException e10) {
            if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage())) {
            }
            str = "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.";
            Log.e("FirebaseMessaging", str);
            return false;
        }
        if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
            str = "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.";
        } else if (e10.getMessage() != null) {
            throw e10;
        } else {
            str = "Topic operation failed without exception message. Will retry Topic operation.";
        }
        Log.e("FirebaseMessaging", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Runnable runnable, long j10) {
        this.f5494f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    t4.i<Void> n(y0 y0Var) {
        this.f5496h.a(y0Var);
        t4.j<Void> jVar = new t4.j<>();
        b(y0Var, jVar);
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void o(boolean z10) {
        this.f5495g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        if (g()) {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<Void> r(String str) {
        t4.i<Void> n10 = n(y0.f(str));
        q();
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (h() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.z0 r0 = r2.f5496h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.y0 r0 = r0.c()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = h()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.l(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.z0 r1 = r2.f5496h
            r1.e(r0)
            r2.k(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b1.s():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(long j10) {
        m(new c1(this, this.f5489a, this.f5490b, Math.min(Math.max(30L, 2 * j10), f5488i)), j10);
        o(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<Void> u(String str) {
        t4.i<Void> n10 = n(y0.g(str));
        q();
        return n10;
    }
}
