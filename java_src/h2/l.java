package h2;

import h2.i0;
import java.util.Collections;
import java.util.List;
import s1.m1;
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0.a> f7876a;

    /* renamed from: b  reason: collision with root package name */
    private final x1.e0[] f7877b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7878c;

    /* renamed from: d  reason: collision with root package name */
    private int f7879d;

    /* renamed from: e  reason: collision with root package name */
    private int f7880e;

    /* renamed from: f  reason: collision with root package name */
    private long f7881f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f7876a = list;
        this.f7877b = new x1.e0[list.size()];
    }

    private boolean f(p3.a0 a0Var, int i10) {
        if (a0Var.a() == 0) {
            return false;
        }
        if (a0Var.C() != i10) {
            this.f7878c = false;
        }
        this.f7879d--;
        return this.f7878c;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        x1.e0[] e0VarArr;
        if (this.f7878c) {
            if (this.f7879d != 2 || f(a0Var, 32)) {
                if (this.f7879d != 1 || f(a0Var, 0)) {
                    int e10 = a0Var.e();
                    int a10 = a0Var.a();
                    for (x1.e0 e0Var : this.f7877b) {
                        a0Var.O(e10);
                        e0Var.d(a0Var, a10);
                    }
                    this.f7880e += a10;
                }
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f7878c = false;
        this.f7881f = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f7877b.length; i10++) {
            i0.a aVar = this.f7876a.get(i10);
            dVar.a();
            x1.e0 e10 = nVar.e(dVar.c(), 3);
            e10.e(new m1.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f7851c)).V(aVar.f7849a).E());
            this.f7877b[i10] = e10;
        }
    }

    @Override // h2.m
    public void d() {
        if (this.f7878c) {
            if (this.f7881f != -9223372036854775807L) {
                for (x1.e0 e0Var : this.f7877b) {
                    e0Var.c(this.f7881f, 1, this.f7880e, 0, null);
                }
            }
            this.f7878c = false;
        }
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f7878c = true;
        if (j10 != -9223372036854775807L) {
            this.f7881f = j10;
        }
        this.f7880e = 0;
        this.f7879d = 2;
    }
}
