package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class o extends b0.e.d.a.b.AbstractC0201a {

    /* renamed from: a  reason: collision with root package name */
    private final long f14279a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14280b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14281c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14282d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0201a.AbstractC0202a {

        /* renamed from: a  reason: collision with root package name */
        private Long f14283a;

        /* renamed from: b  reason: collision with root package name */
        private Long f14284b;

        /* renamed from: c  reason: collision with root package name */
        private String f14285c;

        /* renamed from: d  reason: collision with root package name */
        private String f14286d;

        @Override // s5.b0.e.d.a.b.AbstractC0201a.AbstractC0202a
        public b0.e.d.a.b.AbstractC0201a a() {
            String str = "";
            if (this.f14283a == null) {
                str = " baseAddress";
            }
            if (this.f14284b == null) {
                str = str + " size";
            }
            if (this.f14285c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new o(this.f14283a.longValue(), this.f14284b.longValue(), this.f14285c, this.f14286d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.a.b.AbstractC0201a.AbstractC0202a
        public b0.e.d.a.b.AbstractC0201a.AbstractC0202a b(long j10) {
            this.f14283a = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0201a.AbstractC0202a
        public b0.e.d.a.b.AbstractC0201a.AbstractC0202a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f14285c = str;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0201a.AbstractC0202a
        public b0.e.d.a.b.AbstractC0201a.AbstractC0202a d(long j10) {
            this.f14284b = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0201a.AbstractC0202a
        public b0.e.d.a.b.AbstractC0201a.AbstractC0202a e(String str) {
            this.f14286d = str;
            return this;
        }
    }

    private o(long j10, long j11, String str, String str2) {
        this.f14279a = j10;
        this.f14280b = j11;
        this.f14281c = str;
        this.f14282d = str2;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0201a
    public long b() {
        return this.f14279a;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0201a
    public String c() {
        return this.f14281c;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0201a
    public long d() {
        return this.f14280b;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0201a
    public String e() {
        return this.f14282d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.a.b.AbstractC0201a) {
            b0.e.d.a.b.AbstractC0201a abstractC0201a = (b0.e.d.a.b.AbstractC0201a) obj;
            if (this.f14279a == abstractC0201a.b() && this.f14280b == abstractC0201a.d() && this.f14281c.equals(abstractC0201a.c())) {
                String str = this.f14282d;
                String e10 = abstractC0201a.e();
                if (str == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (str.equals(e10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14279a;
        long j11 = this.f14280b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14281c.hashCode()) * 1000003;
        String str = this.f14282d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f14279a + ", size=" + this.f14280b + ", name=" + this.f14281c + ", uuid=" + this.f14282d + "}";
    }
}
