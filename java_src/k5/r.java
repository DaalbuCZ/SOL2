package k5;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final f0<?> f10674a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10675b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10676c;

    private r(Class<?> cls, int i10, int i11) {
        this(f0.b(cls), i10, i11);
    }

    private r(f0<?> f0Var, int i10, int i11) {
        this.f10674a = (f0) e0.c(f0Var, "Null dependency anInterface.");
        this.f10675b = i10;
        this.f10676c = i11;
    }

    public static r a(Class<?> cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i10);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    public static r h(Class<?> cls) {
        return new r(cls, 0, 0);
    }

    public static r i(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r j(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r k(f0<?> f0Var) {
        return new r(f0Var, 1, 0);
    }

    public static r l(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r m(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public f0<?> c() {
        return this.f10674a;
    }

    public boolean d() {
        return this.f10676c == 2;
    }

    public boolean e() {
        return this.f10676c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f10674a.equals(rVar.f10674a) && this.f10675b == rVar.f10675b && this.f10676c == rVar.f10676c;
        }
        return false;
    }

    public boolean f() {
        return this.f10675b == 1;
    }

    public boolean g() {
        return this.f10675b == 2;
    }

    public int hashCode() {
        return ((((this.f10674a.hashCode() ^ 1000003) * 1000003) ^ this.f10675b) * 1000003) ^ this.f10676c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f10674a);
        sb.append(", type=");
        int i10 = this.f10675b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f10676c));
        sb.append("}");
        return sb.toString();
    }
}
