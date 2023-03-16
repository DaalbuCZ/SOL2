package n9;

import k9.g;
/* loaded from: classes.dex */
public final class c extends n9.a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f11811r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    private static final c f11812s = new c(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a() {
            return c.f11812s;
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // n9.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (d() != cVar.d() || g() != cVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // n9.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + g();
    }

    @Override // n9.a
    public boolean isEmpty() {
        return d() > g();
    }

    public boolean s(int i10) {
        return d() <= i10 && i10 <= g();
    }

    @Override // n9.a
    public String toString() {
        return d() + ".." + g();
    }

    public Integer v() {
        return Integer.valueOf(g());
    }

    public Integer x() {
        return Integer.valueOf(d());
    }
}
