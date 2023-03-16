package x5;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f16339a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16340b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16341c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16342d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16343e;

    /* renamed from: f  reason: collision with root package name */
    public final double f16344f;

    /* renamed from: g  reason: collision with root package name */
    public final double f16345g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16346h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16347a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16348b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16349c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f16347a = z10;
            this.f16348b = z11;
            this.f16349c = z12;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16350a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16351b;

        public b(int i10, int i11) {
            this.f16350a = i10;
            this.f16351b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f16341c = j10;
        this.f16339a = bVar;
        this.f16340b = aVar;
        this.f16342d = i10;
        this.f16343e = i11;
        this.f16344f = d10;
        this.f16345g = d11;
        this.f16346h = i12;
    }

    public boolean a(long j10) {
        return this.f16341c < j10;
    }
}
