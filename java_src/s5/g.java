package s5;

import java.util.Arrays;
import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class g extends b0.d.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f14190a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f14191b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.d.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f14192a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f14193b;

        @Override // s5.b0.d.b.a
        public b0.d.b a() {
            String str = "";
            if (this.f14192a == null) {
                str = " filename";
            }
            if (this.f14193b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f14192a, this.f14193b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.d.b.a
        public b0.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f14193b = bArr;
            return this;
        }

        @Override // s5.b0.d.b.a
        public b0.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f14192a = str;
            return this;
        }
    }

    private g(String str, byte[] bArr) {
        this.f14190a = str;
        this.f14191b = bArr;
    }

    @Override // s5.b0.d.b
    public byte[] b() {
        return this.f14191b;
    }

    @Override // s5.b0.d.b
    public String c() {
        return this.f14190a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.d.b) {
            b0.d.b bVar = (b0.d.b) obj;
            if (this.f14190a.equals(bVar.c())) {
                if (Arrays.equals(this.f14191b, bVar instanceof g ? ((g) bVar).f14191b : bVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14190a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14191b);
    }

    public String toString() {
        return "File{filename=" + this.f14190a + ", contents=" + Arrays.toString(this.f14191b) + "}";
    }
}
