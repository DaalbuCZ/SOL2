package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class q extends b0.e.d.a.b.AbstractC0205d {

    /* renamed from: a  reason: collision with root package name */
    private final String f14297a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14298b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0205d.AbstractC0206a {

        /* renamed from: a  reason: collision with root package name */
        private String f14300a;

        /* renamed from: b  reason: collision with root package name */
        private String f14301b;

        /* renamed from: c  reason: collision with root package name */
        private Long f14302c;

        @Override // s5.b0.e.d.a.b.AbstractC0205d.AbstractC0206a
        public b0.e.d.a.b.AbstractC0205d a() {
            String str = "";
            if (this.f14300a == null) {
                str = " name";
            }
            if (this.f14301b == null) {
                str = str + " code";
            }
            if (this.f14302c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new q(this.f14300a, this.f14301b, this.f14302c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.a.b.AbstractC0205d.AbstractC0206a
        public b0.e.d.a.b.AbstractC0205d.AbstractC0206a b(long j10) {
            this.f14302c = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0205d.AbstractC0206a
        public b0.e.d.a.b.AbstractC0205d.AbstractC0206a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f14301b = str;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0205d.AbstractC0206a
        public b0.e.d.a.b.AbstractC0205d.AbstractC0206a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f14300a = str;
            return this;
        }
    }

    private q(String str, String str2, long j10) {
        this.f14297a = str;
        this.f14298b = str2;
        this.f14299c = j10;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0205d
    public long b() {
        return this.f14299c;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0205d
    public String c() {
        return this.f14298b;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0205d
    public String d() {
        return this.f14297a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.a.b.AbstractC0205d) {
            b0.e.d.a.b.AbstractC0205d abstractC0205d = (b0.e.d.a.b.AbstractC0205d) obj;
            return this.f14297a.equals(abstractC0205d.d()) && this.f14298b.equals(abstractC0205d.c()) && this.f14299c == abstractC0205d.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14299c;
        return ((((this.f14297a.hashCode() ^ 1000003) * 1000003) ^ this.f14298b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f14297a + ", code=" + this.f14298b + ", address=" + this.f14299c + "}";
    }
}
