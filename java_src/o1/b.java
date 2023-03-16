package o1;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f11832a;

    /* renamed from: b  reason: collision with root package name */
    private final g1.p f11833b;

    /* renamed from: c  reason: collision with root package name */
    private final g1.i f11834c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j10, g1.p pVar, g1.i iVar) {
        this.f11832a = j10;
        Objects.requireNonNull(pVar, "Null transportContext");
        this.f11833b = pVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f11834c = iVar;
    }

    @Override // o1.k
    public g1.i b() {
        return this.f11834c;
    }

    @Override // o1.k
    public long c() {
        return this.f11832a;
    }

    @Override // o1.k
    public g1.p d() {
        return this.f11833b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f11832a == kVar.c() && this.f11833b.equals(kVar.d()) && this.f11834c.equals(kVar.b());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f11832a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f11833b.hashCode()) * 1000003) ^ this.f11834c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f11832a + ", transportContext=" + this.f11833b + ", event=" + this.f11834c + "}";
    }
}
