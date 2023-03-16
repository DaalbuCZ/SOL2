package f1;

import f1.k;
/* loaded from: classes.dex */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f6920a;

    /* renamed from: b  reason: collision with root package name */
    private final f1.a f6921b;

    /* loaded from: classes.dex */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f6922a;

        /* renamed from: b  reason: collision with root package name */
        private f1.a f6923b;

        @Override // f1.k.a
        public k a() {
            return new e(this.f6922a, this.f6923b);
        }

        @Override // f1.k.a
        public k.a b(f1.a aVar) {
            this.f6923b = aVar;
            return this;
        }

        @Override // f1.k.a
        public k.a c(k.b bVar) {
            this.f6922a = bVar;
            return this;
        }
    }

    private e(k.b bVar, f1.a aVar) {
        this.f6920a = bVar;
        this.f6921b = aVar;
    }

    @Override // f1.k
    public f1.a b() {
        return this.f6921b;
    }

    @Override // f1.k
    public k.b c() {
        return this.f6920a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f6920a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                f1.a aVar = this.f6921b;
                f1.a b10 = kVar.b();
                if (aVar == null) {
                    if (b10 == null) {
                        return true;
                    }
                } else if (aVar.equals(b10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f6920a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        f1.a aVar = this.f6921b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f6920a + ", androidClientInfo=" + this.f6921b + "}";
    }
}
