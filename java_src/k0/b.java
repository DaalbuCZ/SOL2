package k0;

import android.os.Build;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final b f10469i = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private k f10470a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10471b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10472c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10473d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10474e;

    /* renamed from: f  reason: collision with root package name */
    private long f10475f;

    /* renamed from: g  reason: collision with root package name */
    private long f10476g;

    /* renamed from: h  reason: collision with root package name */
    private c f10477h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f10478a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f10479b = false;

        /* renamed from: c  reason: collision with root package name */
        k f10480c = k.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f10481d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f10482e = false;

        /* renamed from: f  reason: collision with root package name */
        long f10483f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f10484g = -1;

        /* renamed from: h  reason: collision with root package name */
        c f10485h = new c();

        public b a() {
            return new b(this);
        }

        public a b(k kVar) {
            this.f10480c = kVar;
            return this;
        }

        public a c(boolean z10) {
            this.f10482e = z10;
            return this;
        }
    }

    public b() {
        this.f10470a = k.NOT_REQUIRED;
        this.f10475f = -1L;
        this.f10476g = -1L;
        this.f10477h = new c();
    }

    b(a aVar) {
        this.f10470a = k.NOT_REQUIRED;
        this.f10475f = -1L;
        this.f10476g = -1L;
        this.f10477h = new c();
        this.f10471b = aVar.f10478a;
        int i10 = Build.VERSION.SDK_INT;
        this.f10472c = i10 >= 23 && aVar.f10479b;
        this.f10470a = aVar.f10480c;
        this.f10473d = aVar.f10481d;
        this.f10474e = aVar.f10482e;
        if (i10 >= 24) {
            this.f10477h = aVar.f10485h;
            this.f10475f = aVar.f10483f;
            this.f10476g = aVar.f10484g;
        }
    }

    public b(b bVar) {
        this.f10470a = k.NOT_REQUIRED;
        this.f10475f = -1L;
        this.f10476g = -1L;
        this.f10477h = new c();
        this.f10471b = bVar.f10471b;
        this.f10472c = bVar.f10472c;
        this.f10470a = bVar.f10470a;
        this.f10473d = bVar.f10473d;
        this.f10474e = bVar.f10474e;
        this.f10477h = bVar.f10477h;
    }

    public c a() {
        return this.f10477h;
    }

    public k b() {
        return this.f10470a;
    }

    public long c() {
        return this.f10475f;
    }

    public long d() {
        return this.f10476g;
    }

    public boolean e() {
        return this.f10477h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10471b == bVar.f10471b && this.f10472c == bVar.f10472c && this.f10473d == bVar.f10473d && this.f10474e == bVar.f10474e && this.f10475f == bVar.f10475f && this.f10476g == bVar.f10476g && this.f10470a == bVar.f10470a) {
            return this.f10477h.equals(bVar.f10477h);
        }
        return false;
    }

    public boolean f() {
        return this.f10473d;
    }

    public boolean g() {
        return this.f10471b;
    }

    public boolean h() {
        return this.f10472c;
    }

    public int hashCode() {
        long j10 = this.f10475f;
        long j11 = this.f10476g;
        return (((((((((((((this.f10470a.hashCode() * 31) + (this.f10471b ? 1 : 0)) * 31) + (this.f10472c ? 1 : 0)) * 31) + (this.f10473d ? 1 : 0)) * 31) + (this.f10474e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f10477h.hashCode();
    }

    public boolean i() {
        return this.f10474e;
    }

    public void j(c cVar) {
        this.f10477h = cVar;
    }

    public void k(k kVar) {
        this.f10470a = kVar;
    }

    public void l(boolean z10) {
        this.f10473d = z10;
    }

    public void m(boolean z10) {
        this.f10471b = z10;
    }

    public void n(boolean z10) {
        this.f10472c = z10;
    }

    public void o(boolean z10) {
        this.f10474e = z10;
    }

    public void p(long j10) {
        this.f10475f = j10;
    }

    public void q(long j10) {
        this.f10476g = j10;
    }
}
