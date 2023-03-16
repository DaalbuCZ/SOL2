package com.google.android.gms.common.api.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ int f3603n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ m f3604o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(m mVar, int i10) {
        this.f3604o = mVar;
        this.f3603n = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3604o.k(this.f3603n);
    }
}
