package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import k5.f0;
import k5.x;
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final x<ScheduledExecutorService> f5268a = new x<>(l5.d.f11124a);

    /* renamed from: b  reason: collision with root package name */
    static final x<ScheduledExecutorService> f5269b = new x<>(l5.c.f11123a);

    /* renamed from: c  reason: collision with root package name */
    static final x<ScheduledExecutorService> f5270c = new x<>(l5.b.f11122a);

    /* renamed from: d  reason: collision with root package name */
    private static final x<ScheduledExecutorService> f5271d = new x<>(l5.a.f11121a);

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(k5.e eVar) {
        return f5268a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(k5.e eVar) {
        return f5270c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(k5.e eVar) {
        return f5269b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f5271d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k5.c<?>> getComponents() {
        return Arrays.asList(k5.c.f(f0.a(j5.a.class, ScheduledExecutorService.class), f0.a(j5.a.class, ExecutorService.class), f0.a(j5.a.class, Executor.class)).f(l5.h.f11128a).d(), k5.c.f(f0.a(j5.b.class, ScheduledExecutorService.class), f0.a(j5.b.class, ExecutorService.class), f0.a(j5.b.class, Executor.class)).f(l5.e.f11125a).d(), k5.c.f(f0.a(j5.c.class, ScheduledExecutorService.class), f0.a(j5.c.class, ExecutorService.class), f0.a(j5.c.class, Executor.class)).f(l5.g.f11127a).d(), k5.c.e(f0.a(j5.d.class, Executor.class)).f(l5.f.f11126a).d());
    }
}
