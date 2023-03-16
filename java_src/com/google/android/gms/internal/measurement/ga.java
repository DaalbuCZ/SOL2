package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ga implements ab {

    /* renamed from: b  reason: collision with root package name */
    private static final ma f3866b = new ea();

    /* renamed from: a  reason: collision with root package name */
    private final ma f3867a;

    public ga() {
        ma maVar;
        ma[] maVarArr = new ma[2];
        maVarArr[0] = e9.c();
        try {
            maVar = (ma) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            maVar = f3866b;
        }
        maVarArr[1] = maVar;
        fa faVar = new fa(maVarArr);
        p9.f(faVar, "messageInfoFactory");
        this.f3867a = faVar;
    }

    private static boolean b(la laVar) {
        return laVar.c() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.ab
    public final za a(Class cls) {
        ta a10;
        ca c10;
        rb a11;
        v8 v8Var;
        ja a12;
        rb b02;
        v8 a13;
        bb.g(cls);
        la a14 = this.f3867a.a(cls);
        if (a14.b()) {
            if (i9.class.isAssignableFrom(cls)) {
                b02 = bb.b();
                a13 = x8.b();
            } else {
                b02 = bb.b0();
                a13 = x8.a();
            }
            return sa.j(b02, a13, a14.a());
        }
        if (i9.class.isAssignableFrom(cls)) {
            boolean b10 = b(a14);
            a10 = ua.b();
            c10 = ca.d();
            a11 = bb.b();
            v8Var = b10 ? x8.b() : null;
            a12 = ka.b();
        } else {
            boolean b11 = b(a14);
            a10 = ua.a();
            c10 = ca.c();
            if (b11) {
                a11 = bb.b0();
                v8Var = x8.a();
            } else {
                a11 = bb.a();
                v8Var = null;
            }
            a12 = ka.a();
        }
        return ra.L(cls, a14, a10, c10, a11, v8Var, a12);
    }
}
