package n3;

import java.util.List;
import s1.l3;
import s1.m1;
import u2.t0;
import u2.u;
/* loaded from: classes.dex */
public interface t extends w {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final t0 f11728a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f11729b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11730c;

        public a(t0 t0Var, int... iArr) {
            this(t0Var, iArr, 0);
        }

        public a(t0 t0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                p3.r.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f11728a = t0Var;
            this.f11729b = iArr;
            this.f11730c = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        t[] a(a[] aVarArr, o3.f fVar, u.b bVar, l3 l3Var);
    }

    void g();

    boolean h(int i10, long j10);

    boolean i(int i10, long j10);

    void j(boolean z10);

    void k();

    int l(long j10, List<? extends w2.n> list);

    int m();

    boolean n(long j10, w2.f fVar, List<? extends w2.n> list);

    m1 o();

    int p();

    int q();

    void r(long j10, long j11, long j12, List<? extends w2.n> list, w2.o[] oVarArr);

    void s(float f10);

    Object t();

    void u();

    void v();
}
