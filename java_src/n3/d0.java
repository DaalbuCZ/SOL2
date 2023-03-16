package n3;

import p3.m0;
import s1.b3;
import s1.q3;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11646a;

    /* renamed from: b  reason: collision with root package name */
    public final b3[] f11647b;

    /* renamed from: c  reason: collision with root package name */
    public final t[] f11648c;

    /* renamed from: d  reason: collision with root package name */
    public final q3 f11649d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f11650e;

    public d0(b3[] b3VarArr, t[] tVarArr, q3 q3Var, Object obj) {
        this.f11647b = b3VarArr;
        this.f11648c = (t[]) tVarArr.clone();
        this.f11649d = q3Var;
        this.f11650e = obj;
        this.f11646a = b3VarArr.length;
    }

    public boolean a(d0 d0Var) {
        if (d0Var == null || d0Var.f11648c.length != this.f11648c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f11648c.length; i10++) {
            if (!b(d0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(d0 d0Var, int i10) {
        return d0Var != null && m0.c(this.f11647b[i10], d0Var.f11647b[i10]) && m0.c(this.f11648c[i10], d0Var.f11648c[i10]);
    }

    public boolean c(int i10) {
        return this.f11647b[i10] != null;
    }
}
