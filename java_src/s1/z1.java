package s1;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import s1.h;
/* loaded from: classes.dex */
public final class z1 implements h {
    public static final z1 T = new b().F();
    public static final h.a<z1> U = y1.f13934a;
    public final Integer A;
    public final Integer B;
    public final Boolean C;
    @Deprecated
    public final Integer D;
    public final Integer E;
    public final Integer F;
    public final Integer G;
    public final Integer H;
    public final Integer I;
    public final Integer J;
    public final CharSequence K;
    public final CharSequence L;
    public final CharSequence M;
    public final Integer N;
    public final Integer O;
    public final CharSequence P;
    public final CharSequence Q;
    public final CharSequence R;
    public final Bundle S;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f13937n;

    /* renamed from: o  reason: collision with root package name */
    public final CharSequence f13938o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f13939p;

    /* renamed from: q  reason: collision with root package name */
    public final CharSequence f13940q;

    /* renamed from: r  reason: collision with root package name */
    public final CharSequence f13941r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f13942s;

    /* renamed from: t  reason: collision with root package name */
    public final CharSequence f13943t;

    /* renamed from: u  reason: collision with root package name */
    public final w2 f13944u;

    /* renamed from: v  reason: collision with root package name */
    public final w2 f13945v;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f13946w;

    /* renamed from: x  reason: collision with root package name */
    public final Integer f13947x;

    /* renamed from: y  reason: collision with root package name */
    public final Uri f13948y;

    /* renamed from: z  reason: collision with root package name */
    public final Integer f13949z;

    /* loaded from: classes.dex */
    public static final class b {
        private Integer A;
        private CharSequence B;
        private CharSequence C;
        private CharSequence D;
        private Bundle E;

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f13950a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f13951b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f13952c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f13953d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f13954e;

        /* renamed from: f  reason: collision with root package name */
        private CharSequence f13955f;

        /* renamed from: g  reason: collision with root package name */
        private CharSequence f13956g;

        /* renamed from: h  reason: collision with root package name */
        private w2 f13957h;

        /* renamed from: i  reason: collision with root package name */
        private w2 f13958i;

        /* renamed from: j  reason: collision with root package name */
        private byte[] f13959j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f13960k;

        /* renamed from: l  reason: collision with root package name */
        private Uri f13961l;

        /* renamed from: m  reason: collision with root package name */
        private Integer f13962m;

        /* renamed from: n  reason: collision with root package name */
        private Integer f13963n;

        /* renamed from: o  reason: collision with root package name */
        private Integer f13964o;

        /* renamed from: p  reason: collision with root package name */
        private Boolean f13965p;

        /* renamed from: q  reason: collision with root package name */
        private Integer f13966q;

        /* renamed from: r  reason: collision with root package name */
        private Integer f13967r;

        /* renamed from: s  reason: collision with root package name */
        private Integer f13968s;

        /* renamed from: t  reason: collision with root package name */
        private Integer f13969t;

        /* renamed from: u  reason: collision with root package name */
        private Integer f13970u;

        /* renamed from: v  reason: collision with root package name */
        private Integer f13971v;

        /* renamed from: w  reason: collision with root package name */
        private CharSequence f13972w;

        /* renamed from: x  reason: collision with root package name */
        private CharSequence f13973x;

        /* renamed from: y  reason: collision with root package name */
        private CharSequence f13974y;

        /* renamed from: z  reason: collision with root package name */
        private Integer f13975z;

        public b() {
        }

        private b(z1 z1Var) {
            this.f13950a = z1Var.f13937n;
            this.f13951b = z1Var.f13938o;
            this.f13952c = z1Var.f13939p;
            this.f13953d = z1Var.f13940q;
            this.f13954e = z1Var.f13941r;
            this.f13955f = z1Var.f13942s;
            this.f13956g = z1Var.f13943t;
            this.f13957h = z1Var.f13944u;
            this.f13958i = z1Var.f13945v;
            this.f13959j = z1Var.f13946w;
            this.f13960k = z1Var.f13947x;
            this.f13961l = z1Var.f13948y;
            this.f13962m = z1Var.f13949z;
            this.f13963n = z1Var.A;
            this.f13964o = z1Var.B;
            this.f13965p = z1Var.C;
            this.f13966q = z1Var.E;
            this.f13967r = z1Var.F;
            this.f13968s = z1Var.G;
            this.f13969t = z1Var.H;
            this.f13970u = z1Var.I;
            this.f13971v = z1Var.J;
            this.f13972w = z1Var.K;
            this.f13973x = z1Var.L;
            this.f13974y = z1Var.M;
            this.f13975z = z1Var.N;
            this.A = z1Var.O;
            this.B = z1Var.P;
            this.C = z1Var.Q;
            this.D = z1Var.R;
            this.E = z1Var.S;
        }

        public z1 F() {
            return new z1(this);
        }

        public b G(byte[] bArr, int i10) {
            if (this.f13959j == null || p3.m0.c(Integer.valueOf(i10), 3) || !p3.m0.c(this.f13960k, 3)) {
                this.f13959j = (byte[]) bArr.clone();
                this.f13960k = Integer.valueOf(i10);
            }
            return this;
        }

        public b H(z1 z1Var) {
            if (z1Var == null) {
                return this;
            }
            CharSequence charSequence = z1Var.f13937n;
            if (charSequence != null) {
                i0(charSequence);
            }
            CharSequence charSequence2 = z1Var.f13938o;
            if (charSequence2 != null) {
                M(charSequence2);
            }
            CharSequence charSequence3 = z1Var.f13939p;
            if (charSequence3 != null) {
                L(charSequence3);
            }
            CharSequence charSequence4 = z1Var.f13940q;
            if (charSequence4 != null) {
                K(charSequence4);
            }
            CharSequence charSequence5 = z1Var.f13941r;
            if (charSequence5 != null) {
                U(charSequence5);
            }
            CharSequence charSequence6 = z1Var.f13942s;
            if (charSequence6 != null) {
                h0(charSequence6);
            }
            CharSequence charSequence7 = z1Var.f13943t;
            if (charSequence7 != null) {
                S(charSequence7);
            }
            w2 w2Var = z1Var.f13944u;
            if (w2Var != null) {
                m0(w2Var);
            }
            w2 w2Var2 = z1Var.f13945v;
            if (w2Var2 != null) {
                Z(w2Var2);
            }
            byte[] bArr = z1Var.f13946w;
            if (bArr != null) {
                N(bArr, z1Var.f13947x);
            }
            Uri uri = z1Var.f13948y;
            if (uri != null) {
                O(uri);
            }
            Integer num = z1Var.f13949z;
            if (num != null) {
                l0(num);
            }
            Integer num2 = z1Var.A;
            if (num2 != null) {
                k0(num2);
            }
            Integer num3 = z1Var.B;
            if (num3 != null) {
                W(num3);
            }
            Boolean bool = z1Var.C;
            if (bool != null) {
                Y(bool);
            }
            Integer num4 = z1Var.D;
            if (num4 != null) {
                c0(num4);
            }
            Integer num5 = z1Var.E;
            if (num5 != null) {
                c0(num5);
            }
            Integer num6 = z1Var.F;
            if (num6 != null) {
                b0(num6);
            }
            Integer num7 = z1Var.G;
            if (num7 != null) {
                a0(num7);
            }
            Integer num8 = z1Var.H;
            if (num8 != null) {
                f0(num8);
            }
            Integer num9 = z1Var.I;
            if (num9 != null) {
                e0(num9);
            }
            Integer num10 = z1Var.J;
            if (num10 != null) {
                d0(num10);
            }
            CharSequence charSequence8 = z1Var.K;
            if (charSequence8 != null) {
                n0(charSequence8);
            }
            CharSequence charSequence9 = z1Var.L;
            if (charSequence9 != null) {
                Q(charSequence9);
            }
            CharSequence charSequence10 = z1Var.M;
            if (charSequence10 != null) {
                R(charSequence10);
            }
            Integer num11 = z1Var.N;
            if (num11 != null) {
                T(num11);
            }
            Integer num12 = z1Var.O;
            if (num12 != null) {
                j0(num12);
            }
            CharSequence charSequence11 = z1Var.P;
            if (charSequence11 != null) {
                X(charSequence11);
            }
            CharSequence charSequence12 = z1Var.Q;
            if (charSequence12 != null) {
                P(charSequence12);
            }
            CharSequence charSequence13 = z1Var.R;
            if (charSequence13 != null) {
                g0(charSequence13);
            }
            Bundle bundle = z1Var.S;
            if (bundle != null) {
                V(bundle);
            }
            return this;
        }

        public b I(List<k2.a> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                k2.a aVar = list.get(i10);
                for (int i11 = 0; i11 < aVar.d(); i11++) {
                    aVar.c(i11).h(this);
                }
            }
            return this;
        }

        public b J(k2.a aVar) {
            for (int i10 = 0; i10 < aVar.d(); i10++) {
                aVar.c(i10).h(this);
            }
            return this;
        }

        public b K(CharSequence charSequence) {
            this.f13953d = charSequence;
            return this;
        }

        public b L(CharSequence charSequence) {
            this.f13952c = charSequence;
            return this;
        }

        public b M(CharSequence charSequence) {
            this.f13951b = charSequence;
            return this;
        }

        public b N(byte[] bArr, Integer num) {
            this.f13959j = bArr == null ? null : (byte[]) bArr.clone();
            this.f13960k = num;
            return this;
        }

        public b O(Uri uri) {
            this.f13961l = uri;
            return this;
        }

        public b P(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b Q(CharSequence charSequence) {
            this.f13973x = charSequence;
            return this;
        }

        public b R(CharSequence charSequence) {
            this.f13974y = charSequence;
            return this;
        }

        public b S(CharSequence charSequence) {
            this.f13956g = charSequence;
            return this;
        }

        public b T(Integer num) {
            this.f13975z = num;
            return this;
        }

        public b U(CharSequence charSequence) {
            this.f13954e = charSequence;
            return this;
        }

        public b V(Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public b W(Integer num) {
            this.f13964o = num;
            return this;
        }

        public b X(CharSequence charSequence) {
            this.B = charSequence;
            return this;
        }

        public b Y(Boolean bool) {
            this.f13965p = bool;
            return this;
        }

        public b Z(w2 w2Var) {
            this.f13958i = w2Var;
            return this;
        }

        public b a0(Integer num) {
            this.f13968s = num;
            return this;
        }

        public b b0(Integer num) {
            this.f13967r = num;
            return this;
        }

        public b c0(Integer num) {
            this.f13966q = num;
            return this;
        }

        public b d0(Integer num) {
            this.f13971v = num;
            return this;
        }

        public b e0(Integer num) {
            this.f13970u = num;
            return this;
        }

        public b f0(Integer num) {
            this.f13969t = num;
            return this;
        }

        public b g0(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b h0(CharSequence charSequence) {
            this.f13955f = charSequence;
            return this;
        }

        public b i0(CharSequence charSequence) {
            this.f13950a = charSequence;
            return this;
        }

        public b j0(Integer num) {
            this.A = num;
            return this;
        }

        public b k0(Integer num) {
            this.f13963n = num;
            return this;
        }

        public b l0(Integer num) {
            this.f13962m = num;
            return this;
        }

        public b m0(w2 w2Var) {
            this.f13957h = w2Var;
            return this;
        }

        public b n0(CharSequence charSequence) {
            this.f13972w = charSequence;
            return this;
        }
    }

    private z1(b bVar) {
        this.f13937n = bVar.f13950a;
        this.f13938o = bVar.f13951b;
        this.f13939p = bVar.f13952c;
        this.f13940q = bVar.f13953d;
        this.f13941r = bVar.f13954e;
        this.f13942s = bVar.f13955f;
        this.f13943t = bVar.f13956g;
        this.f13944u = bVar.f13957h;
        this.f13945v = bVar.f13958i;
        this.f13946w = bVar.f13959j;
        this.f13947x = bVar.f13960k;
        this.f13948y = bVar.f13961l;
        this.f13949z = bVar.f13962m;
        this.A = bVar.f13963n;
        this.B = bVar.f13964o;
        this.C = bVar.f13965p;
        this.D = bVar.f13966q;
        this.E = bVar.f13966q;
        this.F = bVar.f13967r;
        this.G = bVar.f13968s;
        this.H = bVar.f13969t;
        this.I = bVar.f13970u;
        this.J = bVar.f13971v;
        this.K = bVar.f13972w;
        this.L = bVar.f13973x;
        this.M = bVar.f13974y;
        this.N = bVar.f13975z;
        this.O = bVar.A;
        this.P = bVar.B;
        this.Q = bVar.C;
        this.R = bVar.D;
        this.S = bVar.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z1 c(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.i0(bundle.getCharSequence(d(0))).M(bundle.getCharSequence(d(1))).L(bundle.getCharSequence(d(2))).K(bundle.getCharSequence(d(3))).U(bundle.getCharSequence(d(4))).h0(bundle.getCharSequence(d(5))).S(bundle.getCharSequence(d(6))).N(bundle.getByteArray(d(10)), bundle.containsKey(d(29)) ? Integer.valueOf(bundle.getInt(d(29))) : null).O((Uri) bundle.getParcelable(d(11))).n0(bundle.getCharSequence(d(22))).Q(bundle.getCharSequence(d(23))).R(bundle.getCharSequence(d(24))).X(bundle.getCharSequence(d(27))).P(bundle.getCharSequence(d(28))).g0(bundle.getCharSequence(d(30))).V(bundle.getBundle(d(1000)));
        if (bundle.containsKey(d(8)) && (bundle3 = bundle.getBundle(d(8))) != null) {
            bVar.m0(w2.f13926n.a(bundle3));
        }
        if (bundle.containsKey(d(9)) && (bundle2 = bundle.getBundle(d(9))) != null) {
            bVar.Z(w2.f13926n.a(bundle2));
        }
        if (bundle.containsKey(d(12))) {
            bVar.l0(Integer.valueOf(bundle.getInt(d(12))));
        }
        if (bundle.containsKey(d(13))) {
            bVar.k0(Integer.valueOf(bundle.getInt(d(13))));
        }
        if (bundle.containsKey(d(14))) {
            bVar.W(Integer.valueOf(bundle.getInt(d(14))));
        }
        if (bundle.containsKey(d(15))) {
            bVar.Y(Boolean.valueOf(bundle.getBoolean(d(15))));
        }
        if (bundle.containsKey(d(16))) {
            bVar.c0(Integer.valueOf(bundle.getInt(d(16))));
        }
        if (bundle.containsKey(d(17))) {
            bVar.b0(Integer.valueOf(bundle.getInt(d(17))));
        }
        if (bundle.containsKey(d(18))) {
            bVar.a0(Integer.valueOf(bundle.getInt(d(18))));
        }
        if (bundle.containsKey(d(19))) {
            bVar.f0(Integer.valueOf(bundle.getInt(d(19))));
        }
        if (bundle.containsKey(d(20))) {
            bVar.e0(Integer.valueOf(bundle.getInt(d(20))));
        }
        if (bundle.containsKey(d(21))) {
            bVar.d0(Integer.valueOf(bundle.getInt(d(21))));
        }
        if (bundle.containsKey(d(25))) {
            bVar.T(Integer.valueOf(bundle.getInt(d(25))));
        }
        if (bundle.containsKey(d(26))) {
            bVar.j0(Integer.valueOf(bundle.getInt(d(26))));
        }
        return bVar.F();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return p3.m0.c(this.f13937n, z1Var.f13937n) && p3.m0.c(this.f13938o, z1Var.f13938o) && p3.m0.c(this.f13939p, z1Var.f13939p) && p3.m0.c(this.f13940q, z1Var.f13940q) && p3.m0.c(this.f13941r, z1Var.f13941r) && p3.m0.c(this.f13942s, z1Var.f13942s) && p3.m0.c(this.f13943t, z1Var.f13943t) && p3.m0.c(this.f13944u, z1Var.f13944u) && p3.m0.c(this.f13945v, z1Var.f13945v) && Arrays.equals(this.f13946w, z1Var.f13946w) && p3.m0.c(this.f13947x, z1Var.f13947x) && p3.m0.c(this.f13948y, z1Var.f13948y) && p3.m0.c(this.f13949z, z1Var.f13949z) && p3.m0.c(this.A, z1Var.A) && p3.m0.c(this.B, z1Var.B) && p3.m0.c(this.C, z1Var.C) && p3.m0.c(this.E, z1Var.E) && p3.m0.c(this.F, z1Var.F) && p3.m0.c(this.G, z1Var.G) && p3.m0.c(this.H, z1Var.H) && p3.m0.c(this.I, z1Var.I) && p3.m0.c(this.J, z1Var.J) && p3.m0.c(this.K, z1Var.K) && p3.m0.c(this.L, z1Var.L) && p3.m0.c(this.M, z1Var.M) && p3.m0.c(this.N, z1Var.N) && p3.m0.c(this.O, z1Var.O) && p3.m0.c(this.P, z1Var.P) && p3.m0.c(this.Q, z1Var.Q) && p3.m0.c(this.R, z1Var.R);
    }

    public int hashCode() {
        return a5.i.b(this.f13937n, this.f13938o, this.f13939p, this.f13940q, this.f13941r, this.f13942s, this.f13943t, this.f13944u, this.f13945v, Integer.valueOf(Arrays.hashCode(this.f13946w)), this.f13947x, this.f13948y, this.f13949z, this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R);
    }
}
