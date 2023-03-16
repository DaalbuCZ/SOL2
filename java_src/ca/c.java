package ca;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private int f3256a;

    /* renamed from: b  reason: collision with root package name */
    private String f3257b;

    /* renamed from: c  reason: collision with root package name */
    private a f3258c;

    /* renamed from: d  reason: collision with root package name */
    private int f3259d;

    /* renamed from: e  reason: collision with root package name */
    private String f3260e;

    /* renamed from: f  reason: collision with root package name */
    private String f3261f;

    /* renamed from: g  reason: collision with root package name */
    private String f3262g;

    /* renamed from: h  reason: collision with root package name */
    private String f3263h;

    /* renamed from: i  reason: collision with root package name */
    private String f3264i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3265j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3266k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3267l;

    /* renamed from: m  reason: collision with root package name */
    private long f3268m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3269n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3270o;

    public c(int i10, String str, a aVar, int i11, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, boolean z12, long j10, boolean z13, boolean z14) {
        k9.k.e(str, "taskId");
        k9.k.e(aVar, "status");
        k9.k.e(str2, "url");
        k9.k.e(str4, "savedDir");
        k9.k.e(str5, "headers");
        k9.k.e(str6, "mimeType");
        this.f3256a = i10;
        this.f3257b = str;
        this.f3258c = aVar;
        this.f3259d = i11;
        this.f3260e = str2;
        this.f3261f = str3;
        this.f3262g = str4;
        this.f3263h = str5;
        this.f3264i = str6;
        this.f3265j = z10;
        this.f3266k = z11;
        this.f3267l = z12;
        this.f3268m = j10;
        this.f3269n = z13;
        this.f3270o = z14;
    }

    public final boolean a() {
        return this.f3270o;
    }

    public final String b() {
        return this.f3261f;
    }

    public final String c() {
        return this.f3263h;
    }

    public final String d() {
        return this.f3264i;
    }

    public final boolean e() {
        return this.f3267l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f3256a == cVar.f3256a && k9.k.a(this.f3257b, cVar.f3257b) && this.f3258c == cVar.f3258c && this.f3259d == cVar.f3259d && k9.k.a(this.f3260e, cVar.f3260e) && k9.k.a(this.f3261f, cVar.f3261f) && k9.k.a(this.f3262g, cVar.f3262g) && k9.k.a(this.f3263h, cVar.f3263h) && k9.k.a(this.f3264i, cVar.f3264i) && this.f3265j == cVar.f3265j && this.f3266k == cVar.f3266k && this.f3267l == cVar.f3267l && this.f3268m == cVar.f3268m && this.f3269n == cVar.f3269n && this.f3270o == cVar.f3270o;
        }
        return false;
    }

    public final int f() {
        return this.f3256a;
    }

    public final int g() {
        return this.f3259d;
    }

    public final boolean h() {
        return this.f3265j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f3256a * 31) + this.f3257b.hashCode()) * 31) + this.f3258c.hashCode()) * 31) + this.f3259d) * 31) + this.f3260e.hashCode()) * 31;
        String str = this.f3261f;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f3262g.hashCode()) * 31) + this.f3263h.hashCode()) * 31) + this.f3264i.hashCode()) * 31;
        boolean z10 = this.f3265j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.f3266k;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f3267l;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int a10 = (((i13 + i14) * 31) + b.a(this.f3268m)) * 31;
        boolean z13 = this.f3269n;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (a10 + i15) * 31;
        boolean z14 = this.f3270o;
        return i16 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final boolean i() {
        return this.f3269n;
    }

    public final String j() {
        return this.f3262g;
    }

    public final boolean k() {
        return this.f3266k;
    }

    public final a l() {
        return this.f3258c;
    }

    public final String m() {
        return this.f3257b;
    }

    public final long n() {
        return this.f3268m;
    }

    public final String o() {
        return this.f3260e;
    }

    public String toString() {
        return "DownloadTask(primaryId=" + this.f3256a + ", taskId=" + this.f3257b + ", status=" + this.f3258c + ", progress=" + this.f3259d + ", url=" + this.f3260e + ", filename=" + ((Object) this.f3261f) + ", savedDir=" + this.f3262g + ", headers=" + this.f3263h + ", mimeType=" + this.f3264i + ", resumable=" + this.f3265j + ", showNotification=" + this.f3266k + ", openFileFromNotification=" + this.f3267l + ", timeCreated=" + this.f3268m + ", saveInPublicStorage=" + this.f3269n + ", allowCellular=" + this.f3270o + ')';
    }
}
