package h1;

import h1.f;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<g1.i> f7681a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7682b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<g1.i> f7683a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f7684b;

        @Override // h1.f.a
        public f a() {
            String str = "";
            if (this.f7683a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f7683a, this.f7684b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h1.f.a
        public f.a b(Iterable<g1.i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f7683a = iterable;
            return this;
        }

        @Override // h1.f.a
        public f.a c(byte[] bArr) {
            this.f7684b = bArr;
            return this;
        }
    }

    private a(Iterable<g1.i> iterable, byte[] bArr) {
        this.f7681a = iterable;
        this.f7682b = bArr;
    }

    @Override // h1.f
    public Iterable<g1.i> b() {
        return this.f7681a;
    }

    @Override // h1.f
    public byte[] c() {
        return this.f7682b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f7681a.equals(fVar.b())) {
                if (Arrays.equals(this.f7682b, fVar instanceof a ? ((a) fVar).f7682b : fVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7681a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7682b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f7681a + ", extras=" + Arrays.toString(this.f7682b) + "}";
    }
}
