package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f3948a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(d3 d3Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3948a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
