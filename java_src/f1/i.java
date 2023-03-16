package f1;

import f1.o;
/* loaded from: classes.dex */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f6953a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f6954b;

    /* loaded from: classes.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f6955a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f6956b;

        @Override // f1.o.a
        public o a() {
            return new i(this.f6955a, this.f6956b);
        }

        @Override // f1.o.a
        public o.a b(o.b bVar) {
            this.f6956b = bVar;
            return this;
        }

        @Override // f1.o.a
        public o.a c(o.c cVar) {
            this.f6955a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f6953a = cVar;
        this.f6954b = bVar;
    }

    @Override // f1.o
    public o.b b() {
        return this.f6954b;
    }

    @Override // f1.o
    public o.c c() {
        return this.f6953a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f6953a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f6954b;
                o.b b10 = oVar.b();
                if (bVar == null) {
                    if (b10 == null) {
                        return true;
                    }
                } else if (bVar.equals(b10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f6953a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f6954b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f6953a + ", mobileSubtype=" + this.f6954b + "}";
    }
}
