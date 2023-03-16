package n3;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import b5.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p3.m0;
import s1.h;
import u2.t0;
/* loaded from: classes.dex */
public class a0 implements s1.h {
    public static final a0 N;
    @Deprecated
    public static final a0 O;
    @Deprecated
    public static final h.a<a0> P;
    public final b5.q<String> A;
    public final int B;
    public final int C;
    public final int D;
    public final b5.q<String> E;
    public final b5.q<String> F;
    public final int G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final b5.r<t0, y> L;
    public final b5.s<Integer> M;

    /* renamed from: n  reason: collision with root package name */
    public final int f11596n;

    /* renamed from: o  reason: collision with root package name */
    public final int f11597o;

    /* renamed from: p  reason: collision with root package name */
    public final int f11598p;

    /* renamed from: q  reason: collision with root package name */
    public final int f11599q;

    /* renamed from: r  reason: collision with root package name */
    public final int f11600r;

    /* renamed from: s  reason: collision with root package name */
    public final int f11601s;

    /* renamed from: t  reason: collision with root package name */
    public final int f11602t;

    /* renamed from: u  reason: collision with root package name */
    public final int f11603u;

    /* renamed from: v  reason: collision with root package name */
    public final int f11604v;

    /* renamed from: w  reason: collision with root package name */
    public final int f11605w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f11606x;

    /* renamed from: y  reason: collision with root package name */
    public final b5.q<String> f11607y;

    /* renamed from: z  reason: collision with root package name */
    public final int f11608z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f11609a;

        /* renamed from: b  reason: collision with root package name */
        private int f11610b;

        /* renamed from: c  reason: collision with root package name */
        private int f11611c;

        /* renamed from: d  reason: collision with root package name */
        private int f11612d;

        /* renamed from: e  reason: collision with root package name */
        private int f11613e;

        /* renamed from: f  reason: collision with root package name */
        private int f11614f;

        /* renamed from: g  reason: collision with root package name */
        private int f11615g;

        /* renamed from: h  reason: collision with root package name */
        private int f11616h;

        /* renamed from: i  reason: collision with root package name */
        private int f11617i;

        /* renamed from: j  reason: collision with root package name */
        private int f11618j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f11619k;

        /* renamed from: l  reason: collision with root package name */
        private b5.q<String> f11620l;

        /* renamed from: m  reason: collision with root package name */
        private int f11621m;

        /* renamed from: n  reason: collision with root package name */
        private b5.q<String> f11622n;

        /* renamed from: o  reason: collision with root package name */
        private int f11623o;

        /* renamed from: p  reason: collision with root package name */
        private int f11624p;

        /* renamed from: q  reason: collision with root package name */
        private int f11625q;

        /* renamed from: r  reason: collision with root package name */
        private b5.q<String> f11626r;

        /* renamed from: s  reason: collision with root package name */
        private b5.q<String> f11627s;

        /* renamed from: t  reason: collision with root package name */
        private int f11628t;

        /* renamed from: u  reason: collision with root package name */
        private int f11629u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f11630v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f11631w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f11632x;

        /* renamed from: y  reason: collision with root package name */
        private HashMap<t0, y> f11633y;

        /* renamed from: z  reason: collision with root package name */
        private HashSet<Integer> f11634z;

        @Deprecated
        public a() {
            this.f11609a = Integer.MAX_VALUE;
            this.f11610b = Integer.MAX_VALUE;
            this.f11611c = Integer.MAX_VALUE;
            this.f11612d = Integer.MAX_VALUE;
            this.f11617i = Integer.MAX_VALUE;
            this.f11618j = Integer.MAX_VALUE;
            this.f11619k = true;
            this.f11620l = b5.q.J();
            this.f11621m = 0;
            this.f11622n = b5.q.J();
            this.f11623o = 0;
            this.f11624p = Integer.MAX_VALUE;
            this.f11625q = Integer.MAX_VALUE;
            this.f11626r = b5.q.J();
            this.f11627s = b5.q.J();
            this.f11628t = 0;
            this.f11629u = 0;
            this.f11630v = false;
            this.f11631w = false;
            this.f11632x = false;
            this.f11633y = new HashMap<>();
            this.f11634z = new HashSet<>();
        }

        public a(Context context) {
            this();
            E(context);
            H(context, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(Bundle bundle) {
            String b10 = a0.b(6);
            a0 a0Var = a0.N;
            this.f11609a = bundle.getInt(b10, a0Var.f11596n);
            this.f11610b = bundle.getInt(a0.b(7), a0Var.f11597o);
            this.f11611c = bundle.getInt(a0.b(8), a0Var.f11598p);
            this.f11612d = bundle.getInt(a0.b(9), a0Var.f11599q);
            this.f11613e = bundle.getInt(a0.b(10), a0Var.f11600r);
            this.f11614f = bundle.getInt(a0.b(11), a0Var.f11601s);
            this.f11615g = bundle.getInt(a0.b(12), a0Var.f11602t);
            this.f11616h = bundle.getInt(a0.b(13), a0Var.f11603u);
            this.f11617i = bundle.getInt(a0.b(14), a0Var.f11604v);
            this.f11618j = bundle.getInt(a0.b(15), a0Var.f11605w);
            this.f11619k = bundle.getBoolean(a0.b(16), a0Var.f11606x);
            this.f11620l = b5.q.G((String[]) a5.g.a(bundle.getStringArray(a0.b(17)), new String[0]));
            this.f11621m = bundle.getInt(a0.b(25), a0Var.f11608z);
            this.f11622n = C((String[]) a5.g.a(bundle.getStringArray(a0.b(1)), new String[0]));
            this.f11623o = bundle.getInt(a0.b(2), a0Var.B);
            this.f11624p = bundle.getInt(a0.b(18), a0Var.C);
            this.f11625q = bundle.getInt(a0.b(19), a0Var.D);
            this.f11626r = b5.q.G((String[]) a5.g.a(bundle.getStringArray(a0.b(20)), new String[0]));
            this.f11627s = C((String[]) a5.g.a(bundle.getStringArray(a0.b(3)), new String[0]));
            this.f11628t = bundle.getInt(a0.b(4), a0Var.G);
            this.f11629u = bundle.getInt(a0.b(26), a0Var.H);
            this.f11630v = bundle.getBoolean(a0.b(5), a0Var.I);
            this.f11631w = bundle.getBoolean(a0.b(21), a0Var.J);
            this.f11632x = bundle.getBoolean(a0.b(22), a0Var.K);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(a0.b(23));
            b5.q J = parcelableArrayList == null ? b5.q.J() : p3.c.b(y.f11742p, parcelableArrayList);
            this.f11633y = new HashMap<>();
            for (int i10 = 0; i10 < J.size(); i10++) {
                y yVar = (y) J.get(i10);
                this.f11633y.put(yVar.f11743n, yVar);
            }
            int[] iArr = (int[]) a5.g.a(bundle.getIntArray(a0.b(24)), new int[0]);
            this.f11634z = new HashSet<>();
            for (int i11 : iArr) {
                this.f11634z.add(Integer.valueOf(i11));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(a0 a0Var) {
            B(a0Var);
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void B(a0 a0Var) {
            this.f11609a = a0Var.f11596n;
            this.f11610b = a0Var.f11597o;
            this.f11611c = a0Var.f11598p;
            this.f11612d = a0Var.f11599q;
            this.f11613e = a0Var.f11600r;
            this.f11614f = a0Var.f11601s;
            this.f11615g = a0Var.f11602t;
            this.f11616h = a0Var.f11603u;
            this.f11617i = a0Var.f11604v;
            this.f11618j = a0Var.f11605w;
            this.f11619k = a0Var.f11606x;
            this.f11620l = a0Var.f11607y;
            this.f11621m = a0Var.f11608z;
            this.f11622n = a0Var.A;
            this.f11623o = a0Var.B;
            this.f11624p = a0Var.C;
            this.f11625q = a0Var.D;
            this.f11626r = a0Var.E;
            this.f11627s = a0Var.F;
            this.f11628t = a0Var.G;
            this.f11629u = a0Var.H;
            this.f11630v = a0Var.I;
            this.f11631w = a0Var.J;
            this.f11632x = a0Var.K;
            this.f11634z = new HashSet<>(a0Var.M);
            this.f11633y = new HashMap<>(a0Var.L);
        }

        private static b5.q<String> C(String[] strArr) {
            q.a D = b5.q.D();
            for (String str : (String[]) p3.a.e(strArr)) {
                D.a(m0.C0((String) p3.a.e(str)));
            }
            return D.h();
        }

        private void F(Context context) {
            CaptioningManager captioningManager;
            if ((m0.f12306a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f11628t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f11627s = b5.q.K(m0.X(locale));
                }
            }
        }

        public a0 A() {
            return new a0(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a D(a0 a0Var) {
            B(a0Var);
            return this;
        }

        public a E(Context context) {
            if (m0.f12306a >= 19) {
                F(context);
            }
            return this;
        }

        public a G(int i10, int i11, boolean z10) {
            this.f11617i = i10;
            this.f11618j = i11;
            this.f11619k = z10;
            return this;
        }

        public a H(Context context, boolean z10) {
            Point O = m0.O(context);
            return G(O.x, O.y, z10);
        }
    }

    static {
        a0 A = new a().A();
        N = A;
        O = A;
        P = z.f11745a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a0(a aVar) {
        this.f11596n = aVar.f11609a;
        this.f11597o = aVar.f11610b;
        this.f11598p = aVar.f11611c;
        this.f11599q = aVar.f11612d;
        this.f11600r = aVar.f11613e;
        this.f11601s = aVar.f11614f;
        this.f11602t = aVar.f11615g;
        this.f11603u = aVar.f11616h;
        this.f11604v = aVar.f11617i;
        this.f11605w = aVar.f11618j;
        this.f11606x = aVar.f11619k;
        this.f11607y = aVar.f11620l;
        this.f11608z = aVar.f11621m;
        this.A = aVar.f11622n;
        this.B = aVar.f11623o;
        this.C = aVar.f11624p;
        this.D = aVar.f11625q;
        this.E = aVar.f11626r;
        this.F = aVar.f11627s;
        this.G = aVar.f11628t;
        this.H = aVar.f11629u;
        this.I = aVar.f11630v;
        this.J = aVar.f11631w;
        this.K = aVar.f11632x;
        this.L = b5.r.c(aVar.f11633y);
        this.M = b5.s.D(aVar.f11634z);
    }

    public static a0 a(Bundle bundle) {
        return new a(bundle).A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f11596n == a0Var.f11596n && this.f11597o == a0Var.f11597o && this.f11598p == a0Var.f11598p && this.f11599q == a0Var.f11599q && this.f11600r == a0Var.f11600r && this.f11601s == a0Var.f11601s && this.f11602t == a0Var.f11602t && this.f11603u == a0Var.f11603u && this.f11606x == a0Var.f11606x && this.f11604v == a0Var.f11604v && this.f11605w == a0Var.f11605w && this.f11607y.equals(a0Var.f11607y) && this.f11608z == a0Var.f11608z && this.A.equals(a0Var.A) && this.B == a0Var.B && this.C == a0Var.C && this.D == a0Var.D && this.E.equals(a0Var.E) && this.F.equals(a0Var.F) && this.G == a0Var.G && this.H == a0Var.H && this.I == a0Var.I && this.J == a0Var.J && this.K == a0Var.K && this.L.equals(a0Var.L) && this.M.equals(a0Var.M);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f11596n + 31) * 31) + this.f11597o) * 31) + this.f11598p) * 31) + this.f11599q) * 31) + this.f11600r) * 31) + this.f11601s) * 31) + this.f11602t) * 31) + this.f11603u) * 31) + (this.f11606x ? 1 : 0)) * 31) + this.f11604v) * 31) + this.f11605w) * 31) + this.f11607y.hashCode()) * 31) + this.f11608z) * 31) + this.A.hashCode()) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G) * 31) + this.H) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }
}
