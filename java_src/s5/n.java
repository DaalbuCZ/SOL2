package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class n extends b0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0207e> f14269a;

    /* renamed from: b  reason: collision with root package name */
    private final b0.e.d.a.b.c f14270b;

    /* renamed from: c  reason: collision with root package name */
    private final b0.a f14271c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.d.a.b.AbstractC0205d f14272d;

    /* renamed from: e  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0201a> f14273e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0203b {

        /* renamed from: a  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0207e> f14274a;

        /* renamed from: b  reason: collision with root package name */
        private b0.e.d.a.b.c f14275b;

        /* renamed from: c  reason: collision with root package name */
        private b0.a f14276c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.d.a.b.AbstractC0205d f14277d;

        /* renamed from: e  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0201a> f14278e;

        @Override // s5.b0.e.d.a.b.AbstractC0203b
        public b0.e.d.a.b a() {
            String str = "";
            if (this.f14277d == null) {
                str = " signal";
            }
            if (this.f14278e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f14274a, this.f14275b, this.f14276c, this.f14277d, this.f14278e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.a.b.AbstractC0203b
        public b0.e.d.a.b.AbstractC0203b b(b0.a aVar) {
            this.f14276c = aVar;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0203b
        public b0.e.d.a.b.AbstractC0203b c(c0<b0.e.d.a.b.AbstractC0201a> c0Var) {
            Objects.requireNonNull(c0Var, "Null binaries");
            this.f14278e = c0Var;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0203b
        public b0.e.d.a.b.AbstractC0203b d(b0.e.d.a.b.c cVar) {
            this.f14275b = cVar;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0203b
        public b0.e.d.a.b.AbstractC0203b e(b0.e.d.a.b.AbstractC0205d abstractC0205d) {
            Objects.requireNonNull(abstractC0205d, "Null signal");
            this.f14277d = abstractC0205d;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0203b
        public b0.e.d.a.b.AbstractC0203b f(c0<b0.e.d.a.b.AbstractC0207e> c0Var) {
            this.f14274a = c0Var;
            return this;
        }
    }

    private n(c0<b0.e.d.a.b.AbstractC0207e> c0Var, b0.e.d.a.b.c cVar, b0.a aVar, b0.e.d.a.b.AbstractC0205d abstractC0205d, c0<b0.e.d.a.b.AbstractC0201a> c0Var2) {
        this.f14269a = c0Var;
        this.f14270b = cVar;
        this.f14271c = aVar;
        this.f14272d = abstractC0205d;
        this.f14273e = c0Var2;
    }

    @Override // s5.b0.e.d.a.b
    public b0.a b() {
        return this.f14271c;
    }

    @Override // s5.b0.e.d.a.b
    public c0<b0.e.d.a.b.AbstractC0201a> c() {
        return this.f14273e;
    }

    @Override // s5.b0.e.d.a.b
    public b0.e.d.a.b.c d() {
        return this.f14270b;
    }

    @Override // s5.b0.e.d.a.b
    public b0.e.d.a.b.AbstractC0205d e() {
        return this.f14272d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.a.b) {
            b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
            c0<b0.e.d.a.b.AbstractC0207e> c0Var = this.f14269a;
            if (c0Var != null ? c0Var.equals(bVar.f()) : bVar.f() == null) {
                b0.e.d.a.b.c cVar = this.f14270b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    b0.a aVar = this.f14271c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f14272d.equals(bVar.e()) && this.f14273e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // s5.b0.e.d.a.b
    public c0<b0.e.d.a.b.AbstractC0207e> f() {
        return this.f14269a;
    }

    public int hashCode() {
        c0<b0.e.d.a.b.AbstractC0207e> c0Var = this.f14269a;
        int hashCode = ((c0Var == null ? 0 : c0Var.hashCode()) ^ 1000003) * 1000003;
        b0.e.d.a.b.c cVar = this.f14270b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0.a aVar = this.f14271c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f14272d.hashCode()) * 1000003) ^ this.f14273e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f14269a + ", exception=" + this.f14270b + ", appExitInfo=" + this.f14271c + ", signal=" + this.f14272d + ", binaries=" + this.f14273e + "}";
    }
}
