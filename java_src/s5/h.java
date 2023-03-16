package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class h extends b0.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f14194a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14195b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14196c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f14197d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14198e;

    /* renamed from: f  reason: collision with root package name */
    private final b0.e.a f14199f;

    /* renamed from: g  reason: collision with root package name */
    private final b0.e.f f14200g;

    /* renamed from: h  reason: collision with root package name */
    private final b0.e.AbstractC0212e f14201h;

    /* renamed from: i  reason: collision with root package name */
    private final b0.e.c f14202i;

    /* renamed from: j  reason: collision with root package name */
    private final c0<b0.e.d> f14203j;

    /* renamed from: k  reason: collision with root package name */
    private final int f14204k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.b {

        /* renamed from: a  reason: collision with root package name */
        private String f14205a;

        /* renamed from: b  reason: collision with root package name */
        private String f14206b;

        /* renamed from: c  reason: collision with root package name */
        private Long f14207c;

        /* renamed from: d  reason: collision with root package name */
        private Long f14208d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f14209e;

        /* renamed from: f  reason: collision with root package name */
        private b0.e.a f14210f;

        /* renamed from: g  reason: collision with root package name */
        private b0.e.f f14211g;

        /* renamed from: h  reason: collision with root package name */
        private b0.e.AbstractC0212e f14212h;

        /* renamed from: i  reason: collision with root package name */
        private b0.e.c f14213i;

        /* renamed from: j  reason: collision with root package name */
        private c0<b0.e.d> f14214j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f14215k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(b0.e eVar) {
            this.f14205a = eVar.f();
            this.f14206b = eVar.h();
            this.f14207c = Long.valueOf(eVar.k());
            this.f14208d = eVar.d();
            this.f14209e = Boolean.valueOf(eVar.m());
            this.f14210f = eVar.b();
            this.f14211g = eVar.l();
            this.f14212h = eVar.j();
            this.f14213i = eVar.c();
            this.f14214j = eVar.e();
            this.f14215k = Integer.valueOf(eVar.g());
        }

        @Override // s5.b0.e.b
        public b0.e a() {
            String str = "";
            if (this.f14205a == null) {
                str = " generator";
            }
            if (this.f14206b == null) {
                str = str + " identifier";
            }
            if (this.f14207c == null) {
                str = str + " startedAt";
            }
            if (this.f14209e == null) {
                str = str + " crashed";
            }
            if (this.f14210f == null) {
                str = str + " app";
            }
            if (this.f14215k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f14205a, this.f14206b, this.f14207c.longValue(), this.f14208d, this.f14209e.booleanValue(), this.f14210f, this.f14211g, this.f14212h, this.f14213i, this.f14214j, this.f14215k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.b
        public b0.e.b b(b0.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f14210f = aVar;
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b c(boolean z10) {
            this.f14209e = Boolean.valueOf(z10);
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b d(b0.e.c cVar) {
            this.f14213i = cVar;
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b e(Long l10) {
            this.f14208d = l10;
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b f(c0<b0.e.d> c0Var) {
            this.f14214j = c0Var;
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f14205a = str;
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b h(int i10) {
            this.f14215k = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f14206b = str;
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b k(b0.e.AbstractC0212e abstractC0212e) {
            this.f14212h = abstractC0212e;
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b l(long j10) {
            this.f14207c = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.b
        public b0.e.b m(b0.e.f fVar) {
            this.f14211g = fVar;
            return this;
        }
    }

    private h(String str, String str2, long j10, Long l10, boolean z10, b0.e.a aVar, b0.e.f fVar, b0.e.AbstractC0212e abstractC0212e, b0.e.c cVar, c0<b0.e.d> c0Var, int i10) {
        this.f14194a = str;
        this.f14195b = str2;
        this.f14196c = j10;
        this.f14197d = l10;
        this.f14198e = z10;
        this.f14199f = aVar;
        this.f14200g = fVar;
        this.f14201h = abstractC0212e;
        this.f14202i = cVar;
        this.f14203j = c0Var;
        this.f14204k = i10;
    }

    @Override // s5.b0.e
    public b0.e.a b() {
        return this.f14199f;
    }

    @Override // s5.b0.e
    public b0.e.c c() {
        return this.f14202i;
    }

    @Override // s5.b0.e
    public Long d() {
        return this.f14197d;
    }

    @Override // s5.b0.e
    public c0<b0.e.d> e() {
        return this.f14203j;
    }

    public boolean equals(Object obj) {
        Long l10;
        b0.e.f fVar;
        b0.e.AbstractC0212e abstractC0212e;
        b0.e.c cVar;
        c0<b0.e.d> c0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e) {
            b0.e eVar = (b0.e) obj;
            return this.f14194a.equals(eVar.f()) && this.f14195b.equals(eVar.h()) && this.f14196c == eVar.k() && ((l10 = this.f14197d) != null ? l10.equals(eVar.d()) : eVar.d() == null) && this.f14198e == eVar.m() && this.f14199f.equals(eVar.b()) && ((fVar = this.f14200g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0212e = this.f14201h) != null ? abstractC0212e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.f14202i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((c0Var = this.f14203j) != null ? c0Var.equals(eVar.e()) : eVar.e() == null) && this.f14204k == eVar.g();
        }
        return false;
    }

    @Override // s5.b0.e
    public String f() {
        return this.f14194a;
    }

    @Override // s5.b0.e
    public int g() {
        return this.f14204k;
    }

    @Override // s5.b0.e
    public String h() {
        return this.f14195b;
    }

    public int hashCode() {
        long j10 = this.f14196c;
        int hashCode = (((((this.f14194a.hashCode() ^ 1000003) * 1000003) ^ this.f14195b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f14197d;
        int hashCode2 = (((((hashCode ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f14198e ? 1231 : 1237)) * 1000003) ^ this.f14199f.hashCode()) * 1000003;
        b0.e.f fVar = this.f14200g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        b0.e.AbstractC0212e abstractC0212e = this.f14201h;
        int hashCode4 = (hashCode3 ^ (abstractC0212e == null ? 0 : abstractC0212e.hashCode())) * 1000003;
        b0.e.c cVar = this.f14202i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        c0<b0.e.d> c0Var = this.f14203j;
        return ((hashCode5 ^ (c0Var != null ? c0Var.hashCode() : 0)) * 1000003) ^ this.f14204k;
    }

    @Override // s5.b0.e
    public b0.e.AbstractC0212e j() {
        return this.f14201h;
    }

    @Override // s5.b0.e
    public long k() {
        return this.f14196c;
    }

    @Override // s5.b0.e
    public b0.e.f l() {
        return this.f14200g;
    }

    @Override // s5.b0.e
    public boolean m() {
        return this.f14198e;
    }

    @Override // s5.b0.e
    public b0.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f14194a + ", identifier=" + this.f14195b + ", startedAt=" + this.f14196c + ", endedAt=" + this.f14197d + ", crashed=" + this.f14198e + ", app=" + this.f14199f + ", user=" + this.f14200g + ", os=" + this.f14201h + ", device=" + this.f14202i + ", events=" + this.f14203j + ", generatorType=" + this.f14204k + "}";
    }
}
