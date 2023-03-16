package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: a  reason: collision with root package name */
    final y f4304a;

    /* renamed from: b  reason: collision with root package name */
    final z4 f4305b;

    /* renamed from: c  reason: collision with root package name */
    final z4 f4306c;

    /* renamed from: d  reason: collision with root package name */
    final c8 f4307d;

    public y3() {
        y yVar = new y();
        this.f4304a = yVar;
        z4 z4Var = new z4(null, yVar);
        this.f4306c = z4Var;
        this.f4305b = z4Var.a();
        c8 c8Var = new c8();
        this.f4307d = c8Var;
        z4Var.g("require", new ef(c8Var));
        c8Var.a("internal.platform", x2.f4284a);
        z4Var.g("runtime.counter", new i(Double.valueOf(0.0d)));
    }

    public final q a(z4 z4Var, y5... y5VarArr) {
        q qVar = q.f4079c;
        for (y5 y5Var : y5VarArr) {
            qVar = b7.a(y5Var);
            a6.c(this.f4306c);
            if ((qVar instanceof r) || (qVar instanceof p)) {
                qVar = this.f4304a.a(z4Var, qVar);
            }
        }
        return qVar;
    }
}
