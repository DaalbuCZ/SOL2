package o1;

import o1.e;
/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f11821b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11822c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11823d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11824e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11825f;

    /* loaded from: classes.dex */
    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f11826a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f11827b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f11828c;

        /* renamed from: d  reason: collision with root package name */
        private Long f11829d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f11830e;

        @Override // o1.e.a
        e a() {
            String str = "";
            if (this.f11826a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f11827b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f11828c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f11829d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f11830e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f11826a.longValue(), this.f11827b.intValue(), this.f11828c.intValue(), this.f11829d.longValue(), this.f11830e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o1.e.a
        e.a b(int i10) {
            this.f11828c = Integer.valueOf(i10);
            return this;
        }

        @Override // o1.e.a
        e.a c(long j10) {
            this.f11829d = Long.valueOf(j10);
            return this;
        }

        @Override // o1.e.a
        e.a d(int i10) {
            this.f11827b = Integer.valueOf(i10);
            return this;
        }

        @Override // o1.e.a
        e.a e(int i10) {
            this.f11830e = Integer.valueOf(i10);
            return this;
        }

        @Override // o1.e.a
        e.a f(long j10) {
            this.f11826a = Long.valueOf(j10);
            return this;
        }
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f11821b = j10;
        this.f11822c = i10;
        this.f11823d = i11;
        this.f11824e = j11;
        this.f11825f = i12;
    }

    @Override // o1.e
    int b() {
        return this.f11823d;
    }

    @Override // o1.e
    long c() {
        return this.f11824e;
    }

    @Override // o1.e
    int d() {
        return this.f11822c;
    }

    @Override // o1.e
    int e() {
        return this.f11825f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f11821b == eVar.f() && this.f11822c == eVar.d() && this.f11823d == eVar.b() && this.f11824e == eVar.c() && this.f11825f == eVar.e();
        }
        return false;
    }

    @Override // o1.e
    long f() {
        return this.f11821b;
    }

    public int hashCode() {
        long j10 = this.f11821b;
        long j11 = this.f11824e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f11822c) * 1000003) ^ this.f11823d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f11825f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f11821b + ", loadBatchSize=" + this.f11822c + ", criticalSectionEnterTimeoutMs=" + this.f11823d + ", eventCleanUpAge=" + this.f11824e + ", maxBlobByteSizePerRow=" + this.f11825f + "}";
    }
}
