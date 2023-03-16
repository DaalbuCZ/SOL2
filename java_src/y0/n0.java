package y0;

import java.util.Date;
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    private int f16582a;

    /* renamed from: b  reason: collision with root package name */
    private int f16583b;

    /* renamed from: c  reason: collision with root package name */
    private long f16584c;

    /* renamed from: d  reason: collision with root package name */
    private Date f16585d;

    /* renamed from: e  reason: collision with root package name */
    private String f16586e;

    /* renamed from: f  reason: collision with root package name */
    private String f16587f;

    /* renamed from: g  reason: collision with root package name */
    private String f16588g;

    /* renamed from: h  reason: collision with root package name */
    private String f16589h;

    /* renamed from: i  reason: collision with root package name */
    private String f16590i;

    /* renamed from: j  reason: collision with root package name */
    private String f16591j;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16592a;

        static {
            int[] iArr = new int[y0.b.values().length];
            f16592a = iArr;
            try {
                iArr[y0.b.Debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16592a[y0.b.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16592a[y0.b.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16592a[y0.b.Trace.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16592a[y0.b.Info.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16592a[y0.b.Fatal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f16593a;

        /* renamed from: b  reason: collision with root package name */
        private int f16594b;

        /* renamed from: c  reason: collision with root package name */
        private long f16595c;

        /* renamed from: d  reason: collision with root package name */
        private Date f16596d;

        /* renamed from: e  reason: collision with root package name */
        private String f16597e;

        /* renamed from: f  reason: collision with root package name */
        private String f16598f;

        /* renamed from: g  reason: collision with root package name */
        private String f16599g;

        /* renamed from: h  reason: collision with root package name */
        private String f16600h;

        /* renamed from: i  reason: collision with root package name */
        private String f16601i;

        /* renamed from: j  reason: collision with root package name */
        private String f16602j;

        public b a(int i10) {
            this.f16594b = i10;
            return this;
        }

        public b b(long j10) {
            this.f16595c = j10;
            return this;
        }

        public b c(String str) {
            this.f16599g = str;
            return this;
        }

        public b d(Date date) {
            this.f16596d = date;
            return this;
        }

        public n0 e() {
            return new n0(this.f16593a, this.f16594b, this.f16595c, this.f16596d, this.f16597e, this.f16598f, this.f16599g, this.f16600h, this.f16601i, this.f16602j, null);
        }

        public b f(int i10) {
            this.f16593a = i10;
            return this;
        }

        public b g(String str) {
            this.f16598f = str;
            return this;
        }

        public b h(String str) {
            this.f16597e = str;
            return this;
        }

        public b i(String str) {
            this.f16600h = str;
            return this;
        }

        public b j(String str) {
            this.f16602j = str;
            return this;
        }

        public b k(String str) {
            this.f16601i = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        D(0),
        W(1),
        E(2),
        T(3),
        I(4),
        F(5);
        

        /* renamed from: n  reason: collision with root package name */
        private final int f16610n;

        c(int i10) {
            this.f16610n = i10;
        }

        public static c g(y0.b bVar) {
            switch (a.f16592a[bVar.ordinal()]) {
                case 1:
                    return D;
                case 2:
                    return W;
                case 3:
                    return E;
                case 4:
                    return T;
                case 5:
                    return I;
                case 6:
                    return F;
                default:
                    return D;
            }
        }

        public int e() {
            return this.f16610n;
        }
    }

    private n0(int i10, int i11, long j10, Date date, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f16582a = i10;
        this.f16583b = i11;
        this.f16584c = j10;
        this.f16585d = date;
        this.f16586e = str;
        this.f16587f = str2;
        this.f16588g = str3;
        this.f16589h = str4;
        this.f16590i = str5;
        this.f16591j = str6;
    }

    /* synthetic */ n0(int i10, int i11, long j10, Date date, String str, String str2, String str3, String str4, String str5, String str6, a aVar) {
        this(i10, i11, j10, date, str, str2, str3, str4, str5, str6);
    }

    public long a() {
        return this.f16584c;
    }

    public Date b() {
        return this.f16585d;
    }

    public String c() {
        return this.f16588g;
    }

    public int d() {
        return this.f16583b;
    }

    public int e() {
        return this.f16582a;
    }

    public String f() {
        return this.f16587f;
    }

    public String g() {
        return this.f16586e;
    }

    public String h() {
        return this.f16589h;
    }

    public String i() {
        return this.f16591j;
    }

    public String j() {
        return this.f16590i;
    }
}
