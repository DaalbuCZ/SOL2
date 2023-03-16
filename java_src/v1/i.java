package v1;

import s1.m1;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f15546a;

    /* renamed from: b  reason: collision with root package name */
    public final m1 f15547b;

    /* renamed from: c  reason: collision with root package name */
    public final m1 f15548c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15549d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15550e;

    public i(String str, m1 m1Var, m1 m1Var2, int i10, int i11) {
        p3.a.a(i10 == 0 || i11 == 0);
        this.f15546a = p3.a.d(str);
        this.f15547b = (m1) p3.a.e(m1Var);
        this.f15548c = (m1) p3.a.e(m1Var2);
        this.f15549d = i10;
        this.f15550e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15549d == iVar.f15549d && this.f15550e == iVar.f15550e && this.f15546a.equals(iVar.f15546a) && this.f15547b.equals(iVar.f15547b) && this.f15548c.equals(iVar.f15548c);
    }

    public int hashCode() {
        return ((((((((527 + this.f15549d) * 31) + this.f15550e) * 31) + this.f15546a.hashCode()) * 31) + this.f15547b.hashCode()) * 31) + this.f15548c.hashCode();
    }
}
