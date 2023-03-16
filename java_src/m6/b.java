package m6;

import m6.f;
/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f11418a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11419b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f11420c;

    /* renamed from: m6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0166b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11421a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11422b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f11423c;

        @Override // m6.f.a
        public f a() {
            String str = "";
            if (this.f11422b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f11421a, this.f11422b.longValue(), this.f11423c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m6.f.a
        public f.a b(f.b bVar) {
            this.f11423c = bVar;
            return this;
        }

        @Override // m6.f.a
        public f.a c(String str) {
            this.f11421a = str;
            return this;
        }

        @Override // m6.f.a
        public f.a d(long j10) {
            this.f11422b = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, long j10, f.b bVar) {
        this.f11418a = str;
        this.f11419b = j10;
        this.f11420c = bVar;
    }

    @Override // m6.f
    public f.b b() {
        return this.f11420c;
    }

    @Override // m6.f
    public String c() {
        return this.f11418a;
    }

    @Override // m6.f
    public long d() {
        return this.f11419b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f11418a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f11419b == fVar.d()) {
                    f.b bVar = this.f11420c;
                    f.b b10 = fVar.b();
                    if (bVar == null) {
                        if (b10 == null) {
                            return true;
                        }
                    } else if (bVar.equals(b10)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11418a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f11419b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f11420c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f11418a + ", tokenExpirationTimestamp=" + this.f11419b + ", responseCode=" + this.f11420c + "}";
    }
}
