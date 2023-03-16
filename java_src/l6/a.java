package l6;

import java.util.Objects;
import l6.c;
import l6.d;
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f11149b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f11150c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11151d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11152e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11153f;

    /* renamed from: g  reason: collision with root package name */
    private final long f11154g;

    /* renamed from: h  reason: collision with root package name */
    private final String f11155h;

    /* loaded from: classes.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11156a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f11157b;

        /* renamed from: c  reason: collision with root package name */
        private String f11158c;

        /* renamed from: d  reason: collision with root package name */
        private String f11159d;

        /* renamed from: e  reason: collision with root package name */
        private Long f11160e;

        /* renamed from: f  reason: collision with root package name */
        private Long f11161f;

        /* renamed from: g  reason: collision with root package name */
        private String f11162g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.f11156a = dVar.d();
            this.f11157b = dVar.g();
            this.f11158c = dVar.b();
            this.f11159d = dVar.f();
            this.f11160e = Long.valueOf(dVar.c());
            this.f11161f = Long.valueOf(dVar.h());
            this.f11162g = dVar.e();
        }

        @Override // l6.d.a
        public d a() {
            String str = "";
            if (this.f11157b == null) {
                str = " registrationStatus";
            }
            if (this.f11160e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f11161f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f11156a, this.f11157b, this.f11158c, this.f11159d, this.f11160e.longValue(), this.f11161f.longValue(), this.f11162g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l6.d.a
        public d.a b(String str) {
            this.f11158c = str;
            return this;
        }

        @Override // l6.d.a
        public d.a c(long j10) {
            this.f11160e = Long.valueOf(j10);
            return this;
        }

        @Override // l6.d.a
        public d.a d(String str) {
            this.f11156a = str;
            return this;
        }

        @Override // l6.d.a
        public d.a e(String str) {
            this.f11162g = str;
            return this;
        }

        @Override // l6.d.a
        public d.a f(String str) {
            this.f11159d = str;
            return this;
        }

        @Override // l6.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f11157b = aVar;
            return this;
        }

        @Override // l6.d.a
        public d.a h(long j10) {
            this.f11161f = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f11149b = str;
        this.f11150c = aVar;
        this.f11151d = str2;
        this.f11152e = str3;
        this.f11153f = j10;
        this.f11154g = j11;
        this.f11155h = str4;
    }

    @Override // l6.d
    public String b() {
        return this.f11151d;
    }

    @Override // l6.d
    public long c() {
        return this.f11153f;
    }

    @Override // l6.d
    public String d() {
        return this.f11149b;
    }

    @Override // l6.d
    public String e() {
        return this.f11155h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str3 = this.f11149b;
            if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                if (this.f11150c.equals(dVar.g()) && ((str = this.f11151d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f11152e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f11153f == dVar.c() && this.f11154g == dVar.h()) {
                    String str4 = this.f11155h;
                    String e10 = dVar.e();
                    if (str4 == null) {
                        if (e10 == null) {
                            return true;
                        }
                    } else if (str4.equals(e10)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // l6.d
    public String f() {
        return this.f11152e;
    }

    @Override // l6.d
    public c.a g() {
        return this.f11150c;
    }

    @Override // l6.d
    public long h() {
        return this.f11154g;
    }

    public int hashCode() {
        String str = this.f11149b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f11150c.hashCode()) * 1000003;
        String str2 = this.f11151d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11152e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f11153f;
        long j11 = this.f11154g;
        int i10 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f11155h;
        return i10 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // l6.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f11149b + ", registrationStatus=" + this.f11150c + ", authToken=" + this.f11151d + ", refreshToken=" + this.f11152e + ", expiresInSecs=" + this.f11153f + ", tokenCreationEpochInSecs=" + this.f11154g + ", fisError=" + this.f11155h + "}";
    }
}
