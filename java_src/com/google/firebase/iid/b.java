package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f5339a = a.f5338n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return f5339a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e4.a("firebase-iid-executor"));
    }
}
