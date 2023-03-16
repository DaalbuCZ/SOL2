package com.google.android.gms.measurement.internal;

import java.util.Map;
/* loaded from: classes.dex */
final class i3 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final h3 f4603n;

    /* renamed from: o  reason: collision with root package name */
    private final int f4604o;

    /* renamed from: p  reason: collision with root package name */
    private final Throwable f4605p;

    /* renamed from: q  reason: collision with root package name */
    private final byte[] f4606q;

    /* renamed from: r  reason: collision with root package name */
    private final String f4607r;

    /* renamed from: s  reason: collision with root package name */
    private final Map f4608s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ i3(String str, h3 h3Var, int i10, Throwable th, byte[] bArr, Map map, p4.h hVar) {
        z3.o.i(h3Var);
        this.f4603n = h3Var;
        this.f4604o = i10;
        this.f4605p = th;
        this.f4606q = bArr;
        this.f4607r = str;
        this.f4608s = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4603n.a(this.f4607r, this.f4604o, this.f4605p, this.f4606q, this.f4608s);
    }
}
