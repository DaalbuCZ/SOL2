package n1;

import java.util.Objects;
import java.util.Set;
import n1.g;
/* loaded from: classes.dex */
final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f11491a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11492b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<g.c> f11493c;

    /* loaded from: classes.dex */
    static final class b extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f11494a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11495b;

        /* renamed from: c  reason: collision with root package name */
        private Set<g.c> f11496c;

        @Override // n1.g.b.a
        public g.b a() {
            String str = "";
            if (this.f11494a == null) {
                str = " delta";
            }
            if (this.f11495b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f11496c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f11494a.longValue(), this.f11495b.longValue(), this.f11496c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n1.g.b.a
        public g.b.a b(long j10) {
            this.f11494a = Long.valueOf(j10);
            return this;
        }

        @Override // n1.g.b.a
        public g.b.a c(Set<g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f11496c = set;
            return this;
        }

        @Override // n1.g.b.a
        public g.b.a d(long j10) {
            this.f11495b = Long.valueOf(j10);
            return this;
        }
    }

    private d(long j10, long j11, Set<g.c> set) {
        this.f11491a = j10;
        this.f11492b = j11;
        this.f11493c = set;
    }

    @Override // n1.g.b
    long b() {
        return this.f11491a;
    }

    @Override // n1.g.b
    Set<g.c> c() {
        return this.f11493c;
    }

    @Override // n1.g.b
    long d() {
        return this.f11492b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g.b) {
            g.b bVar = (g.b) obj;
            return this.f11491a == bVar.b() && this.f11492b == bVar.d() && this.f11493c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f11491a;
        long j11 = this.f11492b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f11493c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f11491a + ", maxAllowedDelay=" + this.f11492b + ", flags=" + this.f11493c + "}";
    }
}
