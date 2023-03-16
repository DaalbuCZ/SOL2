package f1;
/* loaded from: classes.dex */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f6952a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j10) {
        this.f6952a = j10;
    }

    @Override // f1.n
    public long c() {
        return this.f6952a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f6952a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f6952a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f6952a + "}";
    }
}
