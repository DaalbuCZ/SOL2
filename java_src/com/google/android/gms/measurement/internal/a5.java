package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class a5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f4371n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4372o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f4373p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ long f4374q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ b5 f4375r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a5(b5 b5Var, String str, String str2, String str3, long j10) {
        this.f4375r = b5Var;
        this.f4371n = str;
        this.f4372o = str2;
        this.f4373p = str3;
        this.f4374q = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        String str = this.f4371n;
        if (str == null) {
            a9Var2 = this.f4375r.f4418a;
            a9Var2.w(this.f4372o, null);
            return;
        }
        o6 o6Var = new o6(this.f4373p, str, this.f4374q);
        a9Var = this.f4375r.f4418a;
        a9Var.w(this.f4372o, o6Var);
    }
}
