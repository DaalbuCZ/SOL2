package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f4358n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ long f4359o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ a2 f4360p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(a2 a2Var, String str, long j10) {
        this.f4360p = a2Var;
        this.f4358n = str;
        this.f4359o = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2.i(this.f4360p, this.f4358n, this.f4359o);
    }
}
