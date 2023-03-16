package p6;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: p  reason: collision with root package name */
    private static final a f12416p = new C0180a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f12417a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12418b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12419c;

    /* renamed from: d  reason: collision with root package name */
    private final c f12420d;

    /* renamed from: e  reason: collision with root package name */
    private final d f12421e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12422f;

    /* renamed from: g  reason: collision with root package name */
    private final String f12423g;

    /* renamed from: h  reason: collision with root package name */
    private final int f12424h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12425i;

    /* renamed from: j  reason: collision with root package name */
    private final String f12426j;

    /* renamed from: k  reason: collision with root package name */
    private final long f12427k;

    /* renamed from: l  reason: collision with root package name */
    private final b f12428l;

    /* renamed from: m  reason: collision with root package name */
    private final String f12429m;

    /* renamed from: n  reason: collision with root package name */
    private final long f12430n;

    /* renamed from: o  reason: collision with root package name */
    private final String f12431o;

    /* renamed from: p6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0180a {

        /* renamed from: a  reason: collision with root package name */
        private long f12432a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f12433b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f12434c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f12435d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f12436e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f12437f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f12438g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f12439h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f12440i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f12441j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f12442k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f12443l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f12444m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f12445n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f12446o = "";

        C0180a() {
        }

        public a a() {
            return new a(this.f12432a, this.f12433b, this.f12434c, this.f12435d, this.f12436e, this.f12437f, this.f12438g, this.f12439h, this.f12440i, this.f12441j, this.f12442k, this.f12443l, this.f12444m, this.f12445n, this.f12446o);
        }

        public C0180a b(String str) {
            this.f12444m = str;
            return this;
        }

        public C0180a c(String str) {
            this.f12438g = str;
            return this;
        }

        public C0180a d(String str) {
            this.f12446o = str;
            return this;
        }

        public C0180a e(b bVar) {
            this.f12443l = bVar;
            return this;
        }

        public C0180a f(String str) {
            this.f12434c = str;
            return this;
        }

        public C0180a g(String str) {
            this.f12433b = str;
            return this;
        }

        public C0180a h(c cVar) {
            this.f12435d = cVar;
            return this;
        }

        public C0180a i(String str) {
            this.f12437f = str;
            return this;
        }

        public C0180a j(long j10) {
            this.f12432a = j10;
            return this;
        }

        public C0180a k(d dVar) {
            this.f12436e = dVar;
            return this;
        }

        public C0180a l(String str) {
            this.f12441j = str;
            return this;
        }

        public C0180a m(int i10) {
            this.f12440i = i10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements e6.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: n  reason: collision with root package name */
        private final int f12451n;

        b(int i10) {
            this.f12451n = i10;
        }

        @Override // e6.c
        public int d() {
            return this.f12451n;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements e6.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: n  reason: collision with root package name */
        private final int f12457n;

        c(int i10) {
            this.f12457n = i10;
        }

        @Override // e6.c
        public int d() {
            return this.f12457n;
        }
    }

    /* loaded from: classes.dex */
    public enum d implements e6.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: n  reason: collision with root package name */
        private final int f12463n;

        d(int i10) {
            this.f12463n = i10;
        }

        @Override // e6.c
        public int d() {
            return this.f12463n;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f12417a = j10;
        this.f12418b = str;
        this.f12419c = str2;
        this.f12420d = cVar;
        this.f12421e = dVar;
        this.f12422f = str3;
        this.f12423g = str4;
        this.f12424h = i10;
        this.f12425i = i11;
        this.f12426j = str5;
        this.f12427k = j11;
        this.f12428l = bVar;
        this.f12429m = str6;
        this.f12430n = j12;
        this.f12431o = str7;
    }

    public static C0180a p() {
        return new C0180a();
    }

    @e6.d(tag = 13)
    public String a() {
        return this.f12429m;
    }

    @e6.d(tag = 11)
    public long b() {
        return this.f12427k;
    }

    @e6.d(tag = 14)
    public long c() {
        return this.f12430n;
    }

    @e6.d(tag = 7)
    public String d() {
        return this.f12423g;
    }

    @e6.d(tag = 15)
    public String e() {
        return this.f12431o;
    }

    @e6.d(tag = 12)
    public b f() {
        return this.f12428l;
    }

    @e6.d(tag = 3)
    public String g() {
        return this.f12419c;
    }

    @e6.d(tag = 2)
    public String h() {
        return this.f12418b;
    }

    @e6.d(tag = 4)
    public c i() {
        return this.f12420d;
    }

    @e6.d(tag = 6)
    public String j() {
        return this.f12422f;
    }

    @e6.d(tag = 8)
    public int k() {
        return this.f12424h;
    }

    @e6.d(tag = 1)
    public long l() {
        return this.f12417a;
    }

    @e6.d(tag = 5)
    public d m() {
        return this.f12421e;
    }

    @e6.d(tag = 10)
    public String n() {
        return this.f12426j;
    }

    @e6.d(tag = 9)
    public int o() {
        return this.f12425i;
    }
}
