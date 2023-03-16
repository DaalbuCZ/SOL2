package f5;
/* loaded from: classes.dex */
final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f7233a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7234b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7235c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j10, long j11, long j12) {
        this.f7233a = j10;
        this.f7234b = j11;
        this.f7235c = j12;
    }

    @Override // f5.m
    public long b() {
        return this.f7234b;
    }

    @Override // f5.m
    public long c() {
        return this.f7233a;
    }

    @Override // f5.m
    public long d() {
        return this.f7235c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f7233a == mVar.c() && this.f7234b == mVar.b() && this.f7235c == mVar.d();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f7233a;
        long j11 = this.f7234b;
        long j12 = this.f7235c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f7233a + ", elapsedRealtime=" + this.f7234b + ", uptimeMillis=" + this.f7235c + "}";
    }
}
