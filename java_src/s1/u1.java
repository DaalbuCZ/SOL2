package s1;

import android.net.Uri;
import android.os.Bundle;
import b5.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import s1.h;
/* loaded from: classes.dex */
public final class u1 implements s1.h {

    /* renamed from: v  reason: collision with root package name */
    public static final u1 f13760v = new c().a();

    /* renamed from: w  reason: collision with root package name */
    public static final h.a<u1> f13761w = t1.f13743a;

    /* renamed from: n  reason: collision with root package name */
    public final String f13762n;

    /* renamed from: o  reason: collision with root package name */
    public final h f13763o;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    public final i f13764p;

    /* renamed from: q  reason: collision with root package name */
    public final g f13765q;

    /* renamed from: r  reason: collision with root package name */
    public final z1 f13766r;

    /* renamed from: s  reason: collision with root package name */
    public final d f13767s;
    @Deprecated

    /* renamed from: t  reason: collision with root package name */
    public final e f13768t;

    /* renamed from: u  reason: collision with root package name */
    public final j f13769u;

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f13770a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f13771b;

        /* renamed from: c  reason: collision with root package name */
        private String f13772c;

        /* renamed from: d  reason: collision with root package name */
        private d.a f13773d;

        /* renamed from: e  reason: collision with root package name */
        private f.a f13774e;

        /* renamed from: f  reason: collision with root package name */
        private List<t2.c> f13775f;

        /* renamed from: g  reason: collision with root package name */
        private String f13776g;

        /* renamed from: h  reason: collision with root package name */
        private b5.q<l> f13777h;

        /* renamed from: i  reason: collision with root package name */
        private b f13778i;

        /* renamed from: j  reason: collision with root package name */
        private Object f13779j;

        /* renamed from: k  reason: collision with root package name */
        private z1 f13780k;

        /* renamed from: l  reason: collision with root package name */
        private g.a f13781l;

        /* renamed from: m  reason: collision with root package name */
        private j f13782m;

        public c() {
            this.f13773d = new d.a();
            this.f13774e = new f.a();
            this.f13775f = Collections.emptyList();
            this.f13777h = b5.q.J();
            this.f13781l = new g.a();
            this.f13782m = j.f13836q;
        }

        private c(u1 u1Var) {
            this();
            this.f13773d = u1Var.f13767s.b();
            this.f13770a = u1Var.f13762n;
            this.f13780k = u1Var.f13766r;
            this.f13781l = u1Var.f13765q.b();
            this.f13782m = u1Var.f13769u;
            h hVar = u1Var.f13763o;
            if (hVar != null) {
                this.f13776g = hVar.f13832f;
                this.f13772c = hVar.f13828b;
                this.f13771b = hVar.f13827a;
                this.f13775f = hVar.f13831e;
                this.f13777h = hVar.f13833g;
                this.f13779j = hVar.f13835i;
                f fVar = hVar.f13829c;
                this.f13774e = fVar != null ? fVar.b() : new f.a();
            }
        }

        public u1 a() {
            i iVar;
            p3.a.f(this.f13774e.f13808b == null || this.f13774e.f13807a != null);
            Uri uri = this.f13771b;
            if (uri != null) {
                iVar = new i(uri, this.f13772c, this.f13774e.f13807a != null ? this.f13774e.i() : null, this.f13778i, this.f13775f, this.f13776g, this.f13777h, this.f13779j);
            } else {
                iVar = null;
            }
            String str = this.f13770a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g10 = this.f13773d.g();
            g f10 = this.f13781l.f();
            z1 z1Var = this.f13780k;
            if (z1Var == null) {
                z1Var = z1.T;
            }
            return new u1(str2, g10, iVar, f10, z1Var, this.f13782m);
        }

        public c b(String str) {
            this.f13776g = str;
            return this;
        }

        public c c(String str) {
            this.f13770a = (String) p3.a.e(str);
            return this;
        }

        public c d(Object obj) {
            this.f13779j = obj;
            return this;
        }

        public c e(Uri uri) {
            this.f13771b = uri;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements s1.h {

        /* renamed from: s  reason: collision with root package name */
        public static final d f13783s = new a().f();

        /* renamed from: t  reason: collision with root package name */
        public static final h.a<e> f13784t = v1.f13867a;

        /* renamed from: n  reason: collision with root package name */
        public final long f13785n;

        /* renamed from: o  reason: collision with root package name */
        public final long f13786o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f13787p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f13788q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f13789r;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private long f13790a;

            /* renamed from: b  reason: collision with root package name */
            private long f13791b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f13792c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f13793d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f13794e;

            public a() {
                this.f13791b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f13790a = dVar.f13785n;
                this.f13791b = dVar.f13786o;
                this.f13792c = dVar.f13787p;
                this.f13793d = dVar.f13788q;
                this.f13794e = dVar.f13789r;
            }

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                p3.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f13791b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f13793d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f13792c = z10;
                return this;
            }

            public a k(long j10) {
                p3.a.a(j10 >= 0);
                this.f13790a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f13794e = z10;
                return this;
            }
        }

        private d(a aVar) {
            this.f13785n = aVar.f13790a;
            this.f13786o = aVar.f13791b;
            this.f13787p = aVar.f13792c;
            this.f13788q = aVar.f13793d;
            this.f13789r = aVar.f13794e;
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e d(Bundle bundle) {
            return new a().k(bundle.getLong(c(0), 0L)).h(bundle.getLong(c(1), Long.MIN_VALUE)).j(bundle.getBoolean(c(2), false)).i(bundle.getBoolean(c(3), false)).l(bundle.getBoolean(c(4), false)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f13785n == dVar.f13785n && this.f13786o == dVar.f13786o && this.f13787p == dVar.f13787p && this.f13788q == dVar.f13788q && this.f13789r == dVar.f13789r;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f13785n;
            long j11 = this.f13786o;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f13787p ? 1 : 0)) * 31) + (this.f13788q ? 1 : 0)) * 31) + (this.f13789r ? 1 : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class e extends d {

        /* renamed from: u  reason: collision with root package name */
        public static final e f13795u = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f13796a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final UUID f13797b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f13798c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public final b5.r<String, String> f13799d;

        /* renamed from: e  reason: collision with root package name */
        public final b5.r<String, String> f13800e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f13801f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f13802g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f13803h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public final b5.q<Integer> f13804i;

        /* renamed from: j  reason: collision with root package name */
        public final b5.q<Integer> f13805j;

        /* renamed from: k  reason: collision with root package name */
        private final byte[] f13806k;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private UUID f13807a;

            /* renamed from: b  reason: collision with root package name */
            private Uri f13808b;

            /* renamed from: c  reason: collision with root package name */
            private b5.r<String, String> f13809c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f13810d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f13811e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f13812f;

            /* renamed from: g  reason: collision with root package name */
            private b5.q<Integer> f13813g;

            /* renamed from: h  reason: collision with root package name */
            private byte[] f13814h;

            @Deprecated
            private a() {
                this.f13809c = b5.r.j();
                this.f13813g = b5.q.J();
            }

            private a(f fVar) {
                this.f13807a = fVar.f13796a;
                this.f13808b = fVar.f13798c;
                this.f13809c = fVar.f13800e;
                this.f13810d = fVar.f13801f;
                this.f13811e = fVar.f13802g;
                this.f13812f = fVar.f13803h;
                this.f13813g = fVar.f13805j;
                this.f13814h = fVar.f13806k;
            }

            public f i() {
                return new f(this);
            }
        }

        private f(a aVar) {
            p3.a.f((aVar.f13812f && aVar.f13808b == null) ? false : true);
            UUID uuid = (UUID) p3.a.e(aVar.f13807a);
            this.f13796a = uuid;
            this.f13797b = uuid;
            this.f13798c = aVar.f13808b;
            this.f13799d = aVar.f13809c;
            this.f13800e = aVar.f13809c;
            this.f13801f = aVar.f13810d;
            this.f13803h = aVar.f13812f;
            this.f13802g = aVar.f13811e;
            this.f13804i = aVar.f13813g;
            this.f13805j = aVar.f13813g;
            this.f13806k = aVar.f13814h != null ? Arrays.copyOf(aVar.f13814h, aVar.f13814h.length) : null;
        }

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f13806k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f13796a.equals(fVar.f13796a) && p3.m0.c(this.f13798c, fVar.f13798c) && p3.m0.c(this.f13800e, fVar.f13800e) && this.f13801f == fVar.f13801f && this.f13803h == fVar.f13803h && this.f13802g == fVar.f13802g && this.f13805j.equals(fVar.f13805j) && Arrays.equals(this.f13806k, fVar.f13806k);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f13796a.hashCode() * 31;
            Uri uri = this.f13798c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f13800e.hashCode()) * 31) + (this.f13801f ? 1 : 0)) * 31) + (this.f13803h ? 1 : 0)) * 31) + (this.f13802g ? 1 : 0)) * 31) + this.f13805j.hashCode()) * 31) + Arrays.hashCode(this.f13806k);
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements s1.h {

        /* renamed from: s  reason: collision with root package name */
        public static final g f13815s = new a().f();

        /* renamed from: t  reason: collision with root package name */
        public static final h.a<g> f13816t = w1.f13925a;

        /* renamed from: n  reason: collision with root package name */
        public final long f13817n;

        /* renamed from: o  reason: collision with root package name */
        public final long f13818o;

        /* renamed from: p  reason: collision with root package name */
        public final long f13819p;

        /* renamed from: q  reason: collision with root package name */
        public final float f13820q;

        /* renamed from: r  reason: collision with root package name */
        public final float f13821r;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private long f13822a;

            /* renamed from: b  reason: collision with root package name */
            private long f13823b;

            /* renamed from: c  reason: collision with root package name */
            private long f13824c;

            /* renamed from: d  reason: collision with root package name */
            private float f13825d;

            /* renamed from: e  reason: collision with root package name */
            private float f13826e;

            public a() {
                this.f13822a = -9223372036854775807L;
                this.f13823b = -9223372036854775807L;
                this.f13824c = -9223372036854775807L;
                this.f13825d = -3.4028235E38f;
                this.f13826e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f13822a = gVar.f13817n;
                this.f13823b = gVar.f13818o;
                this.f13824c = gVar.f13819p;
                this.f13825d = gVar.f13820q;
                this.f13826e = gVar.f13821r;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f13824c = j10;
                return this;
            }

            public a h(float f10) {
                this.f13826e = f10;
                return this;
            }

            public a i(long j10) {
                this.f13823b = j10;
                return this;
            }

            public a j(float f10) {
                this.f13825d = f10;
                return this;
            }

            public a k(long j10) {
                this.f13822a = j10;
                return this;
            }
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f13817n = j10;
            this.f13818o = j11;
            this.f13819p = j12;
            this.f13820q = f10;
            this.f13821r = f11;
        }

        private g(a aVar) {
            this(aVar.f13822a, aVar.f13823b, aVar.f13824c, aVar.f13825d, aVar.f13826e);
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g d(Bundle bundle) {
            return new g(bundle.getLong(c(0), -9223372036854775807L), bundle.getLong(c(1), -9223372036854775807L), bundle.getLong(c(2), -9223372036854775807L), bundle.getFloat(c(3), -3.4028235E38f), bundle.getFloat(c(4), -3.4028235E38f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f13817n == gVar.f13817n && this.f13818o == gVar.f13818o && this.f13819p == gVar.f13819p && this.f13820q == gVar.f13820q && this.f13821r == gVar.f13821r;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f13817n;
            long j11 = this.f13818o;
            long j12 = this.f13819p;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f13820q;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f13821r;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13827a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13828b;

        /* renamed from: c  reason: collision with root package name */
        public final f f13829c;

        /* renamed from: d  reason: collision with root package name */
        public final b f13830d;

        /* renamed from: e  reason: collision with root package name */
        public final List<t2.c> f13831e;

        /* renamed from: f  reason: collision with root package name */
        public final String f13832f;

        /* renamed from: g  reason: collision with root package name */
        public final b5.q<l> f13833g;
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        public final List<k> f13834h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f13835i;

        private h(Uri uri, String str, f fVar, b bVar, List<t2.c> list, String str2, b5.q<l> qVar, Object obj) {
            this.f13827a = uri;
            this.f13828b = str;
            this.f13829c = fVar;
            this.f13831e = list;
            this.f13832f = str2;
            this.f13833g = qVar;
            q.a D = b5.q.D();
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                D.a(qVar.get(i10).a().i());
            }
            this.f13834h = D.h();
            this.f13835i = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.f13827a.equals(hVar.f13827a) && p3.m0.c(this.f13828b, hVar.f13828b) && p3.m0.c(this.f13829c, hVar.f13829c) && p3.m0.c(this.f13830d, hVar.f13830d) && this.f13831e.equals(hVar.f13831e) && p3.m0.c(this.f13832f, hVar.f13832f) && this.f13833g.equals(hVar.f13833g) && p3.m0.c(this.f13835i, hVar.f13835i);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f13827a.hashCode() * 31;
            String str = this.f13828b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f13829c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f13831e.hashCode()) * 31;
            String str2 = this.f13832f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f13833g.hashCode()) * 31;
            Object obj = this.f13835i;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<t2.c> list, String str2, b5.q<l> qVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, qVar, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements s1.h {

        /* renamed from: q  reason: collision with root package name */
        public static final j f13836q = new a().d();

        /* renamed from: r  reason: collision with root package name */
        public static final h.a<j> f13837r = x1.f13930a;

        /* renamed from: n  reason: collision with root package name */
        public final Uri f13838n;

        /* renamed from: o  reason: collision with root package name */
        public final String f13839o;

        /* renamed from: p  reason: collision with root package name */
        public final Bundle f13840p;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Uri f13841a;

            /* renamed from: b  reason: collision with root package name */
            private String f13842b;

            /* renamed from: c  reason: collision with root package name */
            private Bundle f13843c;

            public j d() {
                return new j(this);
            }

            public a e(Bundle bundle) {
                this.f13843c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f13841a = uri;
                return this;
            }

            public a g(String str) {
                this.f13842b = str;
                return this;
            }
        }

        private j(a aVar) {
            this.f13838n = aVar.f13841a;
            this.f13839o = aVar.f13842b;
            this.f13840p = aVar.f13843c;
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ j c(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(b(0))).g(bundle.getString(b(1))).e(bundle.getBundle(b(2))).d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return p3.m0.c(this.f13838n, jVar.f13838n) && p3.m0.c(this.f13839o, jVar.f13839o);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f13838n;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f13839o;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13844a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13845b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13846c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13847d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13848e;

        /* renamed from: f  reason: collision with root package name */
        public final String f13849f;

        /* renamed from: g  reason: collision with root package name */
        public final String f13850g;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Uri f13851a;

            /* renamed from: b  reason: collision with root package name */
            private String f13852b;

            /* renamed from: c  reason: collision with root package name */
            private String f13853c;

            /* renamed from: d  reason: collision with root package name */
            private int f13854d;

            /* renamed from: e  reason: collision with root package name */
            private int f13855e;

            /* renamed from: f  reason: collision with root package name */
            private String f13856f;

            /* renamed from: g  reason: collision with root package name */
            private String f13857g;

            private a(l lVar) {
                this.f13851a = lVar.f13844a;
                this.f13852b = lVar.f13845b;
                this.f13853c = lVar.f13846c;
                this.f13854d = lVar.f13847d;
                this.f13855e = lVar.f13848e;
                this.f13856f = lVar.f13849f;
                this.f13857g = lVar.f13850g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public k i() {
                return new k(this);
            }
        }

        private l(a aVar) {
            this.f13844a = aVar.f13851a;
            this.f13845b = aVar.f13852b;
            this.f13846c = aVar.f13853c;
            this.f13847d = aVar.f13854d;
            this.f13848e = aVar.f13855e;
            this.f13849f = aVar.f13856f;
            this.f13850g = aVar.f13857g;
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return this.f13844a.equals(lVar.f13844a) && p3.m0.c(this.f13845b, lVar.f13845b) && p3.m0.c(this.f13846c, lVar.f13846c) && this.f13847d == lVar.f13847d && this.f13848e == lVar.f13848e && p3.m0.c(this.f13849f, lVar.f13849f) && p3.m0.c(this.f13850g, lVar.f13850g);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f13844a.hashCode() * 31;
            String str = this.f13845b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13846c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f13847d) * 31) + this.f13848e) * 31;
            String str3 = this.f13849f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f13850g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    private u1(String str, e eVar, i iVar, g gVar, z1 z1Var, j jVar) {
        this.f13762n = str;
        this.f13763o = iVar;
        this.f13764p = iVar;
        this.f13765q = gVar;
        this.f13766r = z1Var;
        this.f13767s = eVar;
        this.f13768t = eVar;
        this.f13769u = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u1 c(Bundle bundle) {
        String str = (String) p3.a.e(bundle.getString(e(0), ""));
        Bundle bundle2 = bundle.getBundle(e(1));
        g a10 = bundle2 == null ? g.f13815s : g.f13816t.a(bundle2);
        Bundle bundle3 = bundle.getBundle(e(2));
        z1 a11 = bundle3 == null ? z1.T : z1.U.a(bundle3);
        Bundle bundle4 = bundle.getBundle(e(3));
        e a12 = bundle4 == null ? e.f13795u : d.f13784t.a(bundle4);
        Bundle bundle5 = bundle.getBundle(e(4));
        return new u1(str, a12, null, a10, a11, bundle5 == null ? j.f13836q : j.f13837r.a(bundle5));
    }

    public static u1 d(Uri uri) {
        return new c().e(uri).a();
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            return p3.m0.c(this.f13762n, u1Var.f13762n) && this.f13767s.equals(u1Var.f13767s) && p3.m0.c(this.f13763o, u1Var.f13763o) && p3.m0.c(this.f13765q, u1Var.f13765q) && p3.m0.c(this.f13766r, u1Var.f13766r) && p3.m0.c(this.f13769u, u1Var.f13769u);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f13762n.hashCode() * 31;
        h hVar = this.f13763o;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f13765q.hashCode()) * 31) + this.f13767s.hashCode()) * 31) + this.f13766r.hashCode()) * 31) + this.f13769u.hashCode();
    }
}
