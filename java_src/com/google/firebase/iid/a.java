package com.google.firebase.iid;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final /* synthetic */ class a implements Executor {

    /* renamed from: n  reason: collision with root package name */
    static final Executor f5338n = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
