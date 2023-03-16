package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class l extends b0.e.d {

    /* renamed from: a  reason: collision with root package name */
    private final long f14249a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14250b;

    /* renamed from: c  reason: collision with root package name */
    private final b0.e.d.a f14251c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.d.c f14252d;

    /* renamed from: e  reason: collision with root package name */
    private final b0.e.d.AbstractC0211d f14253e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        private Long f14254a;

        /* renamed from: b  reason: collision with root package name */
        private String f14255b;

        /* renamed from: c  reason: collision with root package name */
        private b0.e.d.a f14256c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.d.c f14257d;

        /* renamed from: e  reason: collision with root package name */
        private b0.e.d.AbstractC0211d f14258e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(b0.e.d dVar) {
            this.f14254a = Long.valueOf(dVar.e());
            this.f14255b = dVar.f();
            this.f14256c = dVar.b();
            this.f14257d = dVar.c();
            this.f14258e = dVar.d();
        }

        @Override // s5.b0.e.d.b
        public b0.e.d a() {
            String str = "";
            if (this.f14254a == null) {
                str = " timestamp";
            }
            if (this.f14255b == null) {
                str = str + " type";
            }
            if (this.f14256c == null) {
                str = str + " app";
            }
            if (this.f14257d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f14254a.longValue(), this.f14255b, this.f14256c, this.f14257d, this.f14258e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.b
        public b0.e.d.b b(b0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f14256c = aVar;
            return this;
        }

        @Override // s5.b0.e.d.b
        public b0.e.d.b c(b0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f14257d = cVar;
            return this;
        }

        @Override // s5.b0.e.d.b
        public b0.e.d.b d(b0.e.d.AbstractC0211d abstractC0211d) {
            this.f14258e = abstractC0211d;
            return this;
        }

        @Override // s5.b0.e.d.b
        public b0.e.d.b e(long j10) {
            this.f14254a = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.d.b
        public b0.e.d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f14255b = str;
            return this;
        }
    }

    private l(long j10, String str, b0.e.d.a aVar, b0.e.d.c cVar, b0.e.d.AbstractC0211d abstractC0211d) {
        this.f14249a = j10;
        this.f14250b = str;
        this.f14251c = aVar;
        this.f14252d = cVar;
        this.f14253e = abstractC0211d;
    }

    @Override // s5.b0.e.d
    public b0.e.d.a b() {
        return this.f14251c;
    }

    @Override // s5.b0.e.d
    public b0.e.d.c c() {
        return this.f14252d;
    }

    @Override // s5.b0.e.d
    public b0.e.d.AbstractC0211d d() {
        return this.f14253e;
    }

    @Override // s5.b0.e.d
    public long e() {
        return this.f14249a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d) {
            b0.e.d dVar = (b0.e.d) obj;
            if (this.f14249a == dVar.e() && this.f14250b.equals(dVar.f()) && this.f14251c.equals(dVar.b()) && this.f14252d.equals(dVar.c())) {
                b0.e.d.AbstractC0211d abstractC0211d = this.f14253e;
                b0.e.d.AbstractC0211d d10 = dVar.d();
                if (abstractC0211d == null) {
                    if (d10 == null) {
                        return true;
                    }
                } else if (abstractC0211d.equals(d10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // s5.b0.e.d
    public String f() {
        return this.f14250b;
    }

    @Override // s5.b0.e.d
    public b0.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f14249a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14250b.hashCode()) * 1000003) ^ this.f14251c.hashCode()) * 1000003) ^ this.f14252d.hashCode()) * 1000003;
        b0.e.d.AbstractC0211d abstractC0211d = this.f14253e;
        return hashCode ^ (abstractC0211d == null ? 0 : abstractC0211d.hashCode());
    }

    public String toString() {
        return "Event{timestamp=" + this.f14249a + ", type=" + this.f14250b + ", app=" + this.f14251c + ", device=" + this.f14252d + ", log=" + this.f14253e + "}";
    }
}
