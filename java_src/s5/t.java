package s5;

import s5.b0;
/* loaded from: classes.dex */
final class t extends b0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    private final Double f14319a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14320b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14321c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14322d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14323e;

    /* renamed from: f  reason: collision with root package name */
    private final long f14324f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f14325a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f14326b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f14327c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f14328d;

        /* renamed from: e  reason: collision with root package name */
        private Long f14329e;

        /* renamed from: f  reason: collision with root package name */
        private Long f14330f;

        @Override // s5.b0.e.d.c.a
        public b0.e.d.c a() {
            String str = "";
            if (this.f14326b == null) {
                str = " batteryVelocity";
            }
            if (this.f14327c == null) {
                str = str + " proximityOn";
            }
            if (this.f14328d == null) {
                str = str + " orientation";
            }
            if (this.f14329e == null) {
                str = str + " ramUsed";
            }
            if (this.f14330f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new t(this.f14325a, this.f14326b.intValue(), this.f14327c.booleanValue(), this.f14328d.intValue(), this.f14329e.longValue(), this.f14330f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.c.a
        public b0.e.d.c.a b(Double d10) {
            this.f14325a = d10;
            return this;
        }

        @Override // s5.b0.e.d.c.a
        public b0.e.d.c.a c(int i10) {
            this.f14326b = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.d.c.a
        public b0.e.d.c.a d(long j10) {
            this.f14330f = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.d.c.a
        public b0.e.d.c.a e(int i10) {
            this.f14328d = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.d.c.a
        public b0.e.d.c.a f(boolean z10) {
            this.f14327c = Boolean.valueOf(z10);
            return this;
        }

        @Override // s5.b0.e.d.c.a
        public b0.e.d.c.a g(long j10) {
            this.f14329e = Long.valueOf(j10);
            return this;
        }
    }

    private t(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f14319a = d10;
        this.f14320b = i10;
        this.f14321c = z10;
        this.f14322d = i11;
        this.f14323e = j10;
        this.f14324f = j11;
    }

    @Override // s5.b0.e.d.c
    public Double b() {
        return this.f14319a;
    }

    @Override // s5.b0.e.d.c
    public int c() {
        return this.f14320b;
    }

    @Override // s5.b0.e.d.c
    public long d() {
        return this.f14324f;
    }

    @Override // s5.b0.e.d.c
    public int e() {
        return this.f14322d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.c) {
            b0.e.d.c cVar = (b0.e.d.c) obj;
            Double d10 = this.f14319a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f14320b == cVar.c() && this.f14321c == cVar.g() && this.f14322d == cVar.e() && this.f14323e == cVar.f() && this.f14324f == cVar.d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // s5.b0.e.d.c
    public long f() {
        return this.f14323e;
    }

    @Override // s5.b0.e.d.c
    public boolean g() {
        return this.f14321c;
    }

    public int hashCode() {
        Double d10 = this.f14319a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f14320b) * 1000003;
        int i10 = this.f14321c ? 1231 : 1237;
        long j10 = this.f14323e;
        long j11 = this.f14324f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.f14322d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f14319a + ", batteryVelocity=" + this.f14320b + ", proximityOn=" + this.f14321c + ", orientation=" + this.f14322d + ", ramUsed=" + this.f14323e + ", diskUsed=" + this.f14324f + "}";
    }
}
