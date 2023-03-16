package y8;
/* loaded from: classes.dex */
public final class e implements Comparable<e> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f17084r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public static final e f17085s = f.a();

    /* renamed from: n  reason: collision with root package name */
    private final int f17086n;

    /* renamed from: o  reason: collision with root package name */
    private final int f17087o;

    /* renamed from: p  reason: collision with root package name */
    private final int f17088p;

    /* renamed from: q  reason: collision with root package name */
    private final int f17089q;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }

    public e(int i10, int i11, int i12) {
        this.f17086n = i10;
        this.f17087o = i11;
        this.f17088p = i12;
        this.f17089q = g(i10, i11, i12);
    }

    private final int g(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new n9.c(0, 255).s(i10) && new n9.c(0, 255).s(i11) && new n9.c(0, 255).s(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(e eVar) {
        k9.k.e(eVar, "other");
        return this.f17089q - eVar.f17089q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f17089q == eVar.f17089q;
    }

    public int hashCode() {
        return this.f17089q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17086n);
        sb.append('.');
        sb.append(this.f17087o);
        sb.append('.');
        sb.append(this.f17088p);
        return sb.toString();
    }
}
