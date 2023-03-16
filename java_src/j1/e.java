package j1;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f10245c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f10246a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10247b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f10248a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f10249b = 0;

        a() {
        }

        public e a() {
            return new e(this.f10248a, this.f10249b);
        }

        public a b(long j10) {
            this.f10248a = j10;
            return this;
        }

        public a c(long j10) {
            this.f10249b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f10246a = j10;
        this.f10247b = j11;
    }

    public static a c() {
        return new a();
    }

    @e6.d(tag = 1)
    public long a() {
        return this.f10246a;
    }

    @e6.d(tag = 2)
    public long b() {
        return this.f10247b;
    }
}
