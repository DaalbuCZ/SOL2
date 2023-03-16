package j1;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f10250c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f10251a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10252b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f10253a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f10254b = 0;

        a() {
        }

        public f a() {
            return new f(this.f10253a, this.f10254b);
        }

        public a b(long j10) {
            this.f10254b = j10;
            return this;
        }

        public a c(long j10) {
            this.f10253a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f10251a = j10;
        this.f10252b = j11;
    }

    public static a c() {
        return new a();
    }

    @e6.d(tag = 2)
    public long a() {
        return this.f10252b;
    }

    @e6.d(tag = 1)
    public long b() {
        return this.f10251a;
    }
}
