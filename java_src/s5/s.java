package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class s extends b0.e.d.a.b.AbstractC0207e.AbstractC0209b {

    /* renamed from: a  reason: collision with root package name */
    private final long f14309a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14310b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14311c;

    /* renamed from: d  reason: collision with root package name */
    private final long f14312d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14313e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a {

        /* renamed from: a  reason: collision with root package name */
        private Long f14314a;

        /* renamed from: b  reason: collision with root package name */
        private String f14315b;

        /* renamed from: c  reason: collision with root package name */
        private String f14316c;

        /* renamed from: d  reason: collision with root package name */
        private Long f14317d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f14318e;

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0209b a() {
            String str = "";
            if (this.f14314a == null) {
                str = " pc";
            }
            if (this.f14315b == null) {
                str = str + " symbol";
            }
            if (this.f14317d == null) {
                str = str + " offset";
            }
            if (this.f14318e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new s(this.f14314a.longValue(), this.f14315b, this.f14316c, this.f14317d.longValue(), this.f14318e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a b(String str) {
            this.f14316c = str;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a c(int i10) {
            this.f14318e = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a d(long j10) {
            this.f14317d = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a e(long j10) {
            this.f14314a = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f14315b = str;
            return this;
        }
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f14309a = j10;
        this.f14310b = str;
        this.f14311c = str2;
        this.f14312d = j11;
        this.f14313e = i10;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b
    public String b() {
        return this.f14311c;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b
    public int c() {
        return this.f14313e;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b
    public long d() {
        return this.f14312d;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b
    public long e() {
        return this.f14309a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.a.b.AbstractC0207e.AbstractC0209b) {
            b0.e.d.a.b.AbstractC0207e.AbstractC0209b abstractC0209b = (b0.e.d.a.b.AbstractC0207e.AbstractC0209b) obj;
            return this.f14309a == abstractC0209b.e() && this.f14310b.equals(abstractC0209b.f()) && ((str = this.f14311c) != null ? str.equals(abstractC0209b.b()) : abstractC0209b.b() == null) && this.f14312d == abstractC0209b.d() && this.f14313e == abstractC0209b.c();
        }
        return false;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0209b
    public String f() {
        return this.f14310b;
    }

    public int hashCode() {
        long j10 = this.f14309a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14310b.hashCode()) * 1000003;
        String str = this.f14311c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f14312d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14313e;
    }

    public String toString() {
        return "Frame{pc=" + this.f14309a + ", symbol=" + this.f14310b + ", file=" + this.f14311c + ", offset=" + this.f14312d + ", importance=" + this.f14313e + "}";
    }
}
