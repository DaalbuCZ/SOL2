package m6;

import m6.d;
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f11408a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11409b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11410c;

    /* renamed from: d  reason: collision with root package name */
    private final f f11411d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f11412e;

    /* loaded from: classes.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11413a;

        /* renamed from: b  reason: collision with root package name */
        private String f11414b;

        /* renamed from: c  reason: collision with root package name */
        private String f11415c;

        /* renamed from: d  reason: collision with root package name */
        private f f11416d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f11417e;

        @Override // m6.d.a
        public d a() {
            return new a(this.f11413a, this.f11414b, this.f11415c, this.f11416d, this.f11417e);
        }

        @Override // m6.d.a
        public d.a b(f fVar) {
            this.f11416d = fVar;
            return this;
        }

        @Override // m6.d.a
        public d.a c(String str) {
            this.f11414b = str;
            return this;
        }

        @Override // m6.d.a
        public d.a d(String str) {
            this.f11415c = str;
            return this;
        }

        @Override // m6.d.a
        public d.a e(d.b bVar) {
            this.f11417e = bVar;
            return this;
        }

        @Override // m6.d.a
        public d.a f(String str) {
            this.f11413a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f11408a = str;
        this.f11409b = str2;
        this.f11410c = str3;
        this.f11411d = fVar;
        this.f11412e = bVar;
    }

    @Override // m6.d
    public f b() {
        return this.f11411d;
    }

    @Override // m6.d
    public String c() {
        return this.f11409b;
    }

    @Override // m6.d
    public String d() {
        return this.f11410c;
    }

    @Override // m6.d
    public d.b e() {
        return this.f11412e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f11408a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f11409b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f11410c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f11411d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f11412e;
                            d.b e10 = dVar.e();
                            if (bVar == null) {
                                if (e10 == null) {
                                    return true;
                                }
                            } else if (bVar.equals(e10)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // m6.d
    public String f() {
        return this.f11408a;
    }

    public int hashCode() {
        String str = this.f11408a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f11409b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11410c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f11411d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f11412e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f11408a + ", fid=" + this.f11409b + ", refreshToken=" + this.f11410c + ", authToken=" + this.f11411d + ", responseCode=" + this.f11412e + "}";
    }
}
