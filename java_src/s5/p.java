package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class p extends b0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f14287a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14288b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> f14289c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.d.a.b.c f14290d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14291e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.a.b.c.AbstractC0204a {

        /* renamed from: a  reason: collision with root package name */
        private String f14292a;

        /* renamed from: b  reason: collision with root package name */
        private String f14293b;

        /* renamed from: c  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> f14294c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.d.a.b.c f14295d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f14296e;

        @Override // s5.b0.e.d.a.b.c.AbstractC0204a
        public b0.e.d.a.b.c a() {
            String str = "";
            if (this.f14292a == null) {
                str = " type";
            }
            if (this.f14294c == null) {
                str = str + " frames";
            }
            if (this.f14296e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f14292a, this.f14293b, this.f14294c, this.f14295d, this.f14296e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.a.b.c.AbstractC0204a
        public b0.e.d.a.b.c.AbstractC0204a b(b0.e.d.a.b.c cVar) {
            this.f14295d = cVar;
            return this;
        }

        @Override // s5.b0.e.d.a.b.c.AbstractC0204a
        public b0.e.d.a.b.c.AbstractC0204a c(c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> c0Var) {
            Objects.requireNonNull(c0Var, "Null frames");
            this.f14294c = c0Var;
            return this;
        }

        @Override // s5.b0.e.d.a.b.c.AbstractC0204a
        public b0.e.d.a.b.c.AbstractC0204a d(int i10) {
            this.f14296e = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.c.AbstractC0204a
        public b0.e.d.a.b.c.AbstractC0204a e(String str) {
            this.f14293b = str;
            return this;
        }

        @Override // s5.b0.e.d.a.b.c.AbstractC0204a
        public b0.e.d.a.b.c.AbstractC0204a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f14292a = str;
            return this;
        }
    }

    private p(String str, String str2, c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> c0Var, b0.e.d.a.b.c cVar, int i10) {
        this.f14287a = str;
        this.f14288b = str2;
        this.f14289c = c0Var;
        this.f14290d = cVar;
        this.f14291e = i10;
    }

    @Override // s5.b0.e.d.a.b.c
    public b0.e.d.a.b.c b() {
        return this.f14290d;
    }

    @Override // s5.b0.e.d.a.b.c
    public c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> c() {
        return this.f14289c;
    }

    @Override // s5.b0.e.d.a.b.c
    public int d() {
        return this.f14291e;
    }

    @Override // s5.b0.e.d.a.b.c
    public String e() {
        return this.f14288b;
    }

    public boolean equals(Object obj) {
        String str;
        b0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.a.b.c) {
            b0.e.d.a.b.c cVar2 = (b0.e.d.a.b.c) obj;
            return this.f14287a.equals(cVar2.f()) && ((str = this.f14288b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f14289c.equals(cVar2.c()) && ((cVar = this.f14290d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f14291e == cVar2.d();
        }
        return false;
    }

    @Override // s5.b0.e.d.a.b.c
    public String f() {
        return this.f14287a;
    }

    public int hashCode() {
        int hashCode = (this.f14287a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14288b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14289c.hashCode()) * 1000003;
        b0.e.d.a.b.c cVar = this.f14290d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f14291e;
    }

    public String toString() {
        return "Exception{type=" + this.f14287a + ", reason=" + this.f14288b + ", frames=" + this.f14289c + ", causedBy=" + this.f14290d + ", overflowCount=" + this.f14291e + "}";
    }
}
