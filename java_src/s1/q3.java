package s1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s1.h;
/* loaded from: classes.dex */
public final class q3 implements h {

    /* renamed from: o  reason: collision with root package name */
    public static final q3 f13693o = new q3(b5.q.J());

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<q3> f13694p = o3.f13653a;

    /* renamed from: n  reason: collision with root package name */
    private final b5.q<a> f13695n;

    /* loaded from: classes.dex */
    public static final class a implements h {

        /* renamed from: s  reason: collision with root package name */
        public static final h.a<a> f13696s = p3.f13677a;

        /* renamed from: n  reason: collision with root package name */
        public final int f13697n;

        /* renamed from: o  reason: collision with root package name */
        private final u2.t0 f13698o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f13699p;

        /* renamed from: q  reason: collision with root package name */
        private final int[] f13700q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean[] f13701r;

        public a(u2.t0 t0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = t0Var.f15363n;
            this.f13697n = i10;
            boolean z11 = false;
            p3.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f13698o = t0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f13699p = z11;
            this.f13700q = (int[]) iArr.clone();
            this.f13701r = (boolean[]) zArr.clone();
        }

        private static String f(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ a g(Bundle bundle) {
            u2.t0 a10 = u2.t0.f15362s.a((Bundle) p3.a.e(bundle.getBundle(f(0))));
            return new a(a10, bundle.getBoolean(f(4), false), (int[]) a5.g.a(bundle.getIntArray(f(1)), new int[a10.f15363n]), (boolean[]) a5.g.a(bundle.getBooleanArray(f(3)), new boolean[a10.f15363n]));
        }

        public m1 b(int i10) {
            return this.f13698o.b(i10);
        }

        public int c() {
            return this.f13698o.f15365p;
        }

        public boolean d() {
            return d5.a.b(this.f13701r, true);
        }

        public boolean e(int i10) {
            return this.f13701r[i10];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13699p == aVar.f13699p && this.f13698o.equals(aVar.f13698o) && Arrays.equals(this.f13700q, aVar.f13700q) && Arrays.equals(this.f13701r, aVar.f13701r);
        }

        public int hashCode() {
            return (((((this.f13698o.hashCode() * 31) + (this.f13699p ? 1 : 0)) * 31) + Arrays.hashCode(this.f13700q)) * 31) + Arrays.hashCode(this.f13701r);
        }
    }

    public q3(List<a> list) {
        this.f13695n = b5.q.F(list);
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q3 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return new q3(parcelableArrayList == null ? b5.q.J() : p3.c.b(a.f13696s, parcelableArrayList));
    }

    public b5.q<a> b() {
        return this.f13695n;
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f13695n.size(); i11++) {
            a aVar = this.f13695n.get(i11);
            if (aVar.d() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q3.class != obj.getClass()) {
            return false;
        }
        return this.f13695n.equals(((q3) obj).f13695n);
    }

    public int hashCode() {
        return this.f13695n.hashCode();
    }
}
