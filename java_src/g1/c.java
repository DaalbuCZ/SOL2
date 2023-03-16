package g1;

import g1.o;
import java.util.Objects;
/* loaded from: classes.dex */
final class c extends o {

    /* renamed from: a  reason: collision with root package name */
    private final p f7403a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7404b;

    /* renamed from: c  reason: collision with root package name */
    private final e1.c<?> f7405c;

    /* renamed from: d  reason: collision with root package name */
    private final e1.e<?, byte[]> f7406d;

    /* renamed from: e  reason: collision with root package name */
    private final e1.b f7407e;

    /* loaded from: classes.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private p f7408a;

        /* renamed from: b  reason: collision with root package name */
        private String f7409b;

        /* renamed from: c  reason: collision with root package name */
        private e1.c<?> f7410c;

        /* renamed from: d  reason: collision with root package name */
        private e1.e<?, byte[]> f7411d;

        /* renamed from: e  reason: collision with root package name */
        private e1.b f7412e;

        @Override // g1.o.a
        public o a() {
            String str = "";
            if (this.f7408a == null) {
                str = " transportContext";
            }
            if (this.f7409b == null) {
                str = str + " transportName";
            }
            if (this.f7410c == null) {
                str = str + " event";
            }
            if (this.f7411d == null) {
                str = str + " transformer";
            }
            if (this.f7412e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f7408a, this.f7409b, this.f7410c, this.f7411d, this.f7412e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g1.o.a
        o.a b(e1.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f7412e = bVar;
            return this;
        }

        @Override // g1.o.a
        o.a c(e1.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f7410c = cVar;
            return this;
        }

        @Override // g1.o.a
        o.a d(e1.e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f7411d = eVar;
            return this;
        }

        @Override // g1.o.a
        public o.a e(p pVar) {
            Objects.requireNonNull(pVar, "Null transportContext");
            this.f7408a = pVar;
            return this;
        }

        @Override // g1.o.a
        public o.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f7409b = str;
            return this;
        }
    }

    private c(p pVar, String str, e1.c<?> cVar, e1.e<?, byte[]> eVar, e1.b bVar) {
        this.f7403a = pVar;
        this.f7404b = str;
        this.f7405c = cVar;
        this.f7406d = eVar;
        this.f7407e = bVar;
    }

    @Override // g1.o
    public e1.b b() {
        return this.f7407e;
    }

    @Override // g1.o
    e1.c<?> c() {
        return this.f7405c;
    }

    @Override // g1.o
    e1.e<?, byte[]> e() {
        return this.f7406d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f7403a.equals(oVar.f()) && this.f7404b.equals(oVar.g()) && this.f7405c.equals(oVar.c()) && this.f7406d.equals(oVar.e()) && this.f7407e.equals(oVar.b());
        }
        return false;
    }

    @Override // g1.o
    public p f() {
        return this.f7403a;
    }

    @Override // g1.o
    public String g() {
        return this.f7404b;
    }

    public int hashCode() {
        return ((((((((this.f7403a.hashCode() ^ 1000003) * 1000003) ^ this.f7404b.hashCode()) * 1000003) ^ this.f7405c.hashCode()) * 1000003) ^ this.f7406d.hashCode()) * 1000003) ^ this.f7407e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f7403a + ", transportName=" + this.f7404b + ", event=" + this.f7405c + ", transformer=" + this.f7406d + ", encoding=" + this.f7407e + "}";
    }
}
