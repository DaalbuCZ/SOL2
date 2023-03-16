package o3;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s1.j1;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f12034a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12035b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12036c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f12037d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f12038e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final long f12039f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12040g;

    /* renamed from: h  reason: collision with root package name */
    public final long f12041h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12042i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12043j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f12044k;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f12045a;

        /* renamed from: b  reason: collision with root package name */
        private long f12046b;

        /* renamed from: c  reason: collision with root package name */
        private int f12047c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f12048d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f12049e;

        /* renamed from: f  reason: collision with root package name */
        private long f12050f;

        /* renamed from: g  reason: collision with root package name */
        private long f12051g;

        /* renamed from: h  reason: collision with root package name */
        private String f12052h;

        /* renamed from: i  reason: collision with root package name */
        private int f12053i;

        /* renamed from: j  reason: collision with root package name */
        private Object f12054j;

        public b() {
            this.f12047c = 1;
            this.f12049e = Collections.emptyMap();
            this.f12051g = -1L;
        }

        private b(p pVar) {
            this.f12045a = pVar.f12034a;
            this.f12046b = pVar.f12035b;
            this.f12047c = pVar.f12036c;
            this.f12048d = pVar.f12037d;
            this.f12049e = pVar.f12038e;
            this.f12050f = pVar.f12040g;
            this.f12051g = pVar.f12041h;
            this.f12052h = pVar.f12042i;
            this.f12053i = pVar.f12043j;
            this.f12054j = pVar.f12044k;
        }

        public p a() {
            p3.a.i(this.f12045a, "The uri must be set.");
            return new p(this.f12045a, this.f12046b, this.f12047c, this.f12048d, this.f12049e, this.f12050f, this.f12051g, this.f12052h, this.f12053i, this.f12054j);
        }

        public b b(int i10) {
            this.f12053i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f12048d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f12047c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f12049e = map;
            return this;
        }

        public b f(String str) {
            this.f12052h = str;
            return this;
        }

        public b g(long j10) {
            this.f12051g = j10;
            return this;
        }

        public b h(long j10) {
            this.f12050f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f12045a = uri;
            return this;
        }

        public b j(String str) {
            this.f12045a = Uri.parse(str);
            return this;
        }
    }

    static {
        j1.a("goog.exo.datasource");
    }

    public p(Uri uri) {
        this(uri, 0L, -1L);
    }

    private p(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        p3.a.a(j13 >= 0);
        p3.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        p3.a.a(z10);
        this.f12034a = uri;
        this.f12035b = j10;
        this.f12036c = i10;
        this.f12037d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f12038e = Collections.unmodifiableMap(new HashMap(map));
        this.f12040g = j11;
        this.f12039f = j13;
        this.f12041h = j12;
        this.f12042i = str;
        this.f12043j = i11;
        this.f12044k = obj;
    }

    public p(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    public static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f12036c);
    }

    public boolean d(int i10) {
        return (this.f12043j & i10) == i10;
    }

    public p e(long j10) {
        long j11 = this.f12041h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public p f(long j10, long j11) {
        return (j10 == 0 && this.f12041h == j11) ? this : new p(this.f12034a, this.f12035b, this.f12036c, this.f12037d, this.f12038e, this.f12040g + j10, j11, this.f12042i, this.f12043j, this.f12044k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f12034a + ", " + this.f12040g + ", " + this.f12041h + ", " + this.f12042i + ", " + this.f12043j + "]";
    }
}
