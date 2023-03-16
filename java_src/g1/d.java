package g1;

import g1.p;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
final class d extends p {

    /* renamed from: a  reason: collision with root package name */
    private final String f7413a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7414b;

    /* renamed from: c  reason: collision with root package name */
    private final e1.d f7415c;

    /* loaded from: classes.dex */
    static final class b extends p.a {

        /* renamed from: a  reason: collision with root package name */
        private String f7416a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f7417b;

        /* renamed from: c  reason: collision with root package name */
        private e1.d f7418c;

        @Override // g1.p.a
        public p a() {
            String str = "";
            if (this.f7416a == null) {
                str = " backendName";
            }
            if (this.f7418c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f7416a, this.f7417b, this.f7418c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g1.p.a
        public p.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f7416a = str;
            return this;
        }

        @Override // g1.p.a
        public p.a c(byte[] bArr) {
            this.f7417b = bArr;
            return this;
        }

        @Override // g1.p.a
        public p.a d(e1.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f7418c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, e1.d dVar) {
        this.f7413a = str;
        this.f7414b = bArr;
        this.f7415c = dVar;
    }

    @Override // g1.p
    public String b() {
        return this.f7413a;
    }

    @Override // g1.p
    public byte[] c() {
        return this.f7414b;
    }

    @Override // g1.p
    public e1.d d() {
        return this.f7415c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f7413a.equals(pVar.b())) {
                if (Arrays.equals(this.f7414b, pVar instanceof d ? ((d) pVar).f7414b : pVar.c()) && this.f7415c.equals(pVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f7413a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7414b)) * 1000003) ^ this.f7415c.hashCode();
    }
}
