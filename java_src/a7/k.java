package a7;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: o  reason: collision with root package name */
    public static final k f250o;

    /* renamed from: p  reason: collision with root package name */
    public static final k f251p;

    /* renamed from: q  reason: collision with root package name */
    public static final k f252q;

    /* renamed from: r  reason: collision with root package name */
    public static final k f253r;

    /* renamed from: s  reason: collision with root package name */
    public static final k f254s;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ k[] f255t;

    /* renamed from: n  reason: collision with root package name */
    long f256n;

    /* loaded from: classes.dex */
    enum a extends k {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        f250o = aVar;
        k kVar = new k("GIGABYTES", 1, 1073741824L) { // from class: a7.k.b
        };
        f251p = kVar;
        k kVar2 = new k("MEGABYTES", 2, 1048576L) { // from class: a7.k.c
        };
        f252q = kVar2;
        k kVar3 = new k("KILOBYTES", 3, 1024L) { // from class: a7.k.d
        };
        f253r = kVar3;
        k kVar4 = new k("BYTES", 4, 1L) { // from class: a7.k.e
        };
        f254s = kVar4;
        f255t = new k[]{aVar, kVar, kVar2, kVar3, kVar4};
    }

    private k(String str, int i10, long j10) {
        this.f256n = j10;
    }

    /* synthetic */ k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f255t.clone();
    }

    public long e(long j10) {
        return (j10 * this.f256n) / f253r.f256n;
    }
}
