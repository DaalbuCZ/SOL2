package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class b extends b0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f14140b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14141c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14142d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14143e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14144f;

    /* renamed from: g  reason: collision with root package name */
    private final String f14145g;

    /* renamed from: h  reason: collision with root package name */
    private final b0.e f14146h;

    /* renamed from: i  reason: collision with root package name */
    private final b0.d f14147i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0196b extends b0.b {

        /* renamed from: a  reason: collision with root package name */
        private String f14148a;

        /* renamed from: b  reason: collision with root package name */
        private String f14149b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f14150c;

        /* renamed from: d  reason: collision with root package name */
        private String f14151d;

        /* renamed from: e  reason: collision with root package name */
        private String f14152e;

        /* renamed from: f  reason: collision with root package name */
        private String f14153f;

        /* renamed from: g  reason: collision with root package name */
        private b0.e f14154g;

        /* renamed from: h  reason: collision with root package name */
        private b0.d f14155h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0196b() {
        }

        private C0196b(b0 b0Var) {
            this.f14148a = b0Var.i();
            this.f14149b = b0Var.e();
            this.f14150c = Integer.valueOf(b0Var.h());
            this.f14151d = b0Var.f();
            this.f14152e = b0Var.c();
            this.f14153f = b0Var.d();
            this.f14154g = b0Var.j();
            this.f14155h = b0Var.g();
        }

        @Override // s5.b0.b
        public b0 a() {
            String str = "";
            if (this.f14148a == null) {
                str = " sdkVersion";
            }
            if (this.f14149b == null) {
                str = str + " gmpAppId";
            }
            if (this.f14150c == null) {
                str = str + " platform";
            }
            if (this.f14151d == null) {
                str = str + " installationUuid";
            }
            if (this.f14152e == null) {
                str = str + " buildVersion";
            }
            if (this.f14153f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f14148a, this.f14149b, this.f14150c.intValue(), this.f14151d, this.f14152e, this.f14153f, this.f14154g, this.f14155h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.b
        public b0.b b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f14152e = str;
            return this;
        }

        @Override // s5.b0.b
        public b0.b c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f14153f = str;
            return this;
        }

        @Override // s5.b0.b
        public b0.b d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f14149b = str;
            return this;
        }

        @Override // s5.b0.b
        public b0.b e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f14151d = str;
            return this;
        }

        @Override // s5.b0.b
        public b0.b f(b0.d dVar) {
            this.f14155h = dVar;
            return this;
        }

        @Override // s5.b0.b
        public b0.b g(int i10) {
            this.f14150c = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.b
        public b0.b h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f14148a = str;
            return this;
        }

        @Override // s5.b0.b
        public b0.b i(b0.e eVar) {
            this.f14154g = eVar;
            return this;
        }
    }

    private b(String str, String str2, int i10, String str3, String str4, String str5, b0.e eVar, b0.d dVar) {
        this.f14140b = str;
        this.f14141c = str2;
        this.f14142d = i10;
        this.f14143e = str3;
        this.f14144f = str4;
        this.f14145g = str5;
        this.f14146h = eVar;
        this.f14147i = dVar;
    }

    @Override // s5.b0
    public String c() {
        return this.f14144f;
    }

    @Override // s5.b0
    public String d() {
        return this.f14145g;
    }

    @Override // s5.b0
    public String e() {
        return this.f14141c;
    }

    public boolean equals(Object obj) {
        b0.e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f14140b.equals(b0Var.i()) && this.f14141c.equals(b0Var.e()) && this.f14142d == b0Var.h() && this.f14143e.equals(b0Var.f()) && this.f14144f.equals(b0Var.c()) && this.f14145g.equals(b0Var.d()) && ((eVar = this.f14146h) != null ? eVar.equals(b0Var.j()) : b0Var.j() == null)) {
                b0.d dVar = this.f14147i;
                b0.d g10 = b0Var.g();
                if (dVar == null) {
                    if (g10 == null) {
                        return true;
                    }
                } else if (dVar.equals(g10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // s5.b0
    public String f() {
        return this.f14143e;
    }

    @Override // s5.b0
    public b0.d g() {
        return this.f14147i;
    }

    @Override // s5.b0
    public int h() {
        return this.f14142d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f14140b.hashCode() ^ 1000003) * 1000003) ^ this.f14141c.hashCode()) * 1000003) ^ this.f14142d) * 1000003) ^ this.f14143e.hashCode()) * 1000003) ^ this.f14144f.hashCode()) * 1000003) ^ this.f14145g.hashCode()) * 1000003;
        b0.e eVar = this.f14146h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        b0.d dVar = this.f14147i;
        return hashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // s5.b0
    public String i() {
        return this.f14140b;
    }

    @Override // s5.b0
    public b0.e j() {
        return this.f14146h;
    }

    @Override // s5.b0
    protected b0.b k() {
        return new C0196b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f14140b + ", gmpAppId=" + this.f14141c + ", platform=" + this.f14142d + ", installationUuid=" + this.f14143e + ", buildVersion=" + this.f14144f + ", displayVersion=" + this.f14145g + ", session=" + this.f14146h + ", ndkPayload=" + this.f14147i + "}";
    }
}
