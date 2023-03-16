package h1;

import h1.g;
import java.util.Objects;
/* loaded from: classes.dex */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f7685a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7686b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f7685a = aVar;
        this.f7686b = j10;
    }

    @Override // h1.g
    public long b() {
        return this.f7686b;
    }

    @Override // h1.g
    public g.a c() {
        return this.f7685a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f7685a.equals(gVar.c()) && this.f7686b == gVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f7686b;
        return ((this.f7685a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f7685a + ", nextRequestWaitMillis=" + this.f7686b + "}";
    }
}
