package n3;

import android.util.Pair;
import java.util.Arrays;
import p3.m0;
import s1.a3;
import s1.b3;
import s1.l3;
import s1.z2;
import u2.t0;
import u2.u;
import u2.v0;
/* loaded from: classes.dex */
public abstract class v extends c0 {

    /* renamed from: c  reason: collision with root package name */
    private a f11733c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f11734a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f11735b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f11736c;

        /* renamed from: d  reason: collision with root package name */
        private final v0[] f11737d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f11738e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f11739f;

        /* renamed from: g  reason: collision with root package name */
        private final v0 f11740g;

        a(String[] strArr, int[] iArr, v0[] v0VarArr, int[] iArr2, int[][][] iArr3, v0 v0Var) {
            this.f11735b = strArr;
            this.f11736c = iArr;
            this.f11737d = v0VarArr;
            this.f11739f = iArr3;
            this.f11738e = iArr2;
            this.f11740g = v0Var;
            this.f11734a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f11737d[i10].b(i11).f15363n;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f11737d[i10].b(i11).b(iArr[i12]).f13587y;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !m0.c(str, str2);
                }
                i13 = Math.min(i13, z2.d(this.f11739f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f11738e[i10]) : i13;
        }

        public int c(int i10, int i11, int i12) {
            return this.f11739f[i10][i11][i12];
        }

        public int d() {
            return this.f11734a;
        }

        public int e(int i10) {
            return this.f11736c[i10];
        }

        public v0 f(int i10) {
            return this.f11737d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return z2.f(c(i10, i11, i12));
        }

        public v0 h() {
            return this.f11740g;
        }
    }

    private static int i(a3[] a3VarArr, t0 t0Var, int[] iArr, boolean z10) {
        int length = a3VarArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < a3VarArr.length; i11++) {
            a3 a3Var = a3VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < t0Var.f15363n; i13++) {
                i12 = Math.max(i12, z2.f(a3Var.a(t0Var.b(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] j(a3 a3Var, t0 t0Var) {
        int[] iArr = new int[t0Var.f15363n];
        for (int i10 = 0; i10 < t0Var.f15363n; i10++) {
            iArr[i10] = a3Var.a(t0Var.b(i10));
        }
        return iArr;
    }

    private static int[] k(a3[] a3VarArr) {
        int length = a3VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = a3VarArr[i10].n();
        }
        return iArr;
    }

    @Override // n3.c0
    public final void e(Object obj) {
        this.f11733c = (a) obj;
    }

    @Override // n3.c0
    public final d0 g(a3[] a3VarArr, v0 v0Var, u.b bVar, l3 l3Var) {
        int[] iArr = new int[a3VarArr.length + 1];
        int length = a3VarArr.length + 1;
        t0[][] t0VarArr = new t0[length];
        int[][][] iArr2 = new int[a3VarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = v0Var.f15375n;
            t0VarArr[i10] = new t0[i11];
            iArr2[i10] = new int[i11];
        }
        int[] k10 = k(a3VarArr);
        for (int i12 = 0; i12 < v0Var.f15375n; i12++) {
            t0 b10 = v0Var.b(i12);
            int i13 = i(a3VarArr, b10, iArr, b10.f15365p == 5);
            int[] j10 = i13 == a3VarArr.length ? new int[b10.f15363n] : j(a3VarArr[i13], b10);
            int i14 = iArr[i13];
            t0VarArr[i13][i14] = b10;
            iArr2[i13][i14] = j10;
            iArr[i13] = iArr[i13] + 1;
        }
        v0[] v0VarArr = new v0[a3VarArr.length];
        String[] strArr = new String[a3VarArr.length];
        int[] iArr3 = new int[a3VarArr.length];
        for (int i15 = 0; i15 < a3VarArr.length; i15++) {
            int i16 = iArr[i15];
            v0VarArr[i15] = new v0((t0[]) m0.F0(t0VarArr[i15], i16));
            iArr2[i15] = (int[][]) m0.F0(iArr2[i15], i16);
            strArr[i15] = a3VarArr[i15].e();
            iArr3[i15] = a3VarArr[i15].k();
        }
        a aVar = new a(strArr, iArr3, v0VarArr, k10, iArr2, new v0((t0[]) m0.F0(t0VarArr[a3VarArr.length], iArr[a3VarArr.length])));
        Pair<b3[], t[]> l10 = l(aVar, iArr2, k10, bVar, l3Var);
        return new d0((b3[]) l10.first, (t[]) l10.second, b0.b(aVar, (w[]) l10.second), aVar);
    }

    protected abstract Pair<b3[], t[]> l(a aVar, int[][][] iArr, int[] iArr2, u.b bVar, l3 l3Var);
}
