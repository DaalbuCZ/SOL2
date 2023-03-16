package g1;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final e1.b f7433a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7434b;

    public h(e1.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f7433a = bVar;
        this.f7434b = bArr;
    }

    public byte[] a() {
        return this.f7434b;
    }

    public e1.b b() {
        return this.f7433a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f7433a.equals(hVar.f7433a)) {
                return Arrays.equals(this.f7434b, hVar.f7434b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7433a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7434b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f7433a + ", bytes=[...]}";
    }
}
