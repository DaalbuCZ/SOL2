package j1;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f10226c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f10227a;

    /* renamed from: b  reason: collision with root package name */
    private final b f10228b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f10229a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f10230b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f10229a, this.f10230b);
        }

        public a b(long j10) {
            this.f10229a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f10230b = bVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements e6.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: n  reason: collision with root package name */
        private final int f10239n;

        b(int i10) {
            this.f10239n = i10;
        }

        @Override // e6.c
        public int d() {
            return this.f10239n;
        }
    }

    c(long j10, b bVar) {
        this.f10227a = j10;
        this.f10228b = bVar;
    }

    public static a c() {
        return new a();
    }

    @e6.d(tag = 1)
    public long a() {
        return this.f10227a;
    }

    @e6.d(tag = 3)
    public b b() {
        return this.f10228b;
    }
}
