package u2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import s1.h;
import s1.m1;
/* loaded from: classes.dex */
public final class t0 implements s1.h {

    /* renamed from: s  reason: collision with root package name */
    public static final h.a<t0> f15362s = s0.f15361a;

    /* renamed from: n  reason: collision with root package name */
    public final int f15363n;

    /* renamed from: o  reason: collision with root package name */
    public final String f15364o;

    /* renamed from: p  reason: collision with root package name */
    public final int f15365p;

    /* renamed from: q  reason: collision with root package name */
    private final m1[] f15366q;

    /* renamed from: r  reason: collision with root package name */
    private int f15367r;

    public t0(String str, m1... m1VarArr) {
        p3.a.a(m1VarArr.length > 0);
        this.f15364o = str;
        this.f15366q = m1VarArr;
        this.f15363n = m1VarArr.length;
        int k10 = p3.v.k(m1VarArr[0].f13587y);
        this.f15365p = k10 == -1 ? p3.v.k(m1VarArr[0].f13586x) : k10;
        i();
    }

    public t0(m1... m1VarArr) {
        this("", m1VarArr);
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t0 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return new t0(bundle.getString(d(1), ""), (m1[]) (parcelableArrayList == null ? b5.q.J() : p3.c.b(m1.U, parcelableArrayList)).toArray(new m1[0]));
    }

    private static void f(String str, String str2, String str3, int i10) {
        p3.r.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String g(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int h(int i10) {
        return i10 | 16384;
    }

    private void i() {
        String g10 = g(this.f15366q[0].f13578p);
        int h10 = h(this.f15366q[0].f13580r);
        int i10 = 1;
        while (true) {
            m1[] m1VarArr = this.f15366q;
            if (i10 >= m1VarArr.length) {
                return;
            }
            if (!g10.equals(g(m1VarArr[i10].f13578p))) {
                m1[] m1VarArr2 = this.f15366q;
                f("languages", m1VarArr2[0].f13578p, m1VarArr2[i10].f13578p, i10);
                return;
            } else if (h10 != h(this.f15366q[i10].f13580r)) {
                f("role flags", Integer.toBinaryString(this.f15366q[0].f13580r), Integer.toBinaryString(this.f15366q[i10].f13580r), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public m1 b(int i10) {
        return this.f15366q[i10];
    }

    public int c(m1 m1Var) {
        int i10 = 0;
        while (true) {
            m1[] m1VarArr = this.f15366q;
            if (i10 >= m1VarArr.length) {
                return -1;
            }
            if (m1Var == m1VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f15364o.equals(t0Var.f15364o) && Arrays.equals(this.f15366q, t0Var.f15366q);
    }

    public int hashCode() {
        if (this.f15367r == 0) {
            this.f15367r = ((527 + this.f15364o.hashCode()) * 31) + Arrays.hashCode(this.f15366q);
        }
        return this.f15367r;
    }
}
