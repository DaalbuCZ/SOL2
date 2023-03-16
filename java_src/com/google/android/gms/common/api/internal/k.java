package com.google.android.gms.common.api.internal;

import x3.a;
/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ l f3605n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar) {
        this.f3605n = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        m mVar = this.f3605n.f3606a;
        fVar = mVar.f3608b;
        fVar2 = mVar.f3608b;
        fVar.e(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
