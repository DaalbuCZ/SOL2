package d3;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import org.checkerframework.dataflow.qual.Pure;
import s1.h;
/* loaded from: classes.dex */
public final class b implements s1.h {
    public static final b E = new C0093b().o("").a();
    public static final h.a<b> F = d3.a.f6505a;
    public final int A;
    public final float B;
    public final int C;
    public final float D;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f6506n;

    /* renamed from: o  reason: collision with root package name */
    public final Layout.Alignment f6507o;

    /* renamed from: p  reason: collision with root package name */
    public final Layout.Alignment f6508p;

    /* renamed from: q  reason: collision with root package name */
    public final Bitmap f6509q;

    /* renamed from: r  reason: collision with root package name */
    public final float f6510r;

    /* renamed from: s  reason: collision with root package name */
    public final int f6511s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6512t;

    /* renamed from: u  reason: collision with root package name */
    public final float f6513u;

    /* renamed from: v  reason: collision with root package name */
    public final int f6514v;

    /* renamed from: w  reason: collision with root package name */
    public final float f6515w;

    /* renamed from: x  reason: collision with root package name */
    public final float f6516x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f6517y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6518z;

    /* renamed from: d3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0093b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f6519a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f6520b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f6521c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f6522d;

        /* renamed from: e  reason: collision with root package name */
        private float f6523e;

        /* renamed from: f  reason: collision with root package name */
        private int f6524f;

        /* renamed from: g  reason: collision with root package name */
        private int f6525g;

        /* renamed from: h  reason: collision with root package name */
        private float f6526h;

        /* renamed from: i  reason: collision with root package name */
        private int f6527i;

        /* renamed from: j  reason: collision with root package name */
        private int f6528j;

        /* renamed from: k  reason: collision with root package name */
        private float f6529k;

        /* renamed from: l  reason: collision with root package name */
        private float f6530l;

        /* renamed from: m  reason: collision with root package name */
        private float f6531m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f6532n;

        /* renamed from: o  reason: collision with root package name */
        private int f6533o;

        /* renamed from: p  reason: collision with root package name */
        private int f6534p;

        /* renamed from: q  reason: collision with root package name */
        private float f6535q;

        public C0093b() {
            this.f6519a = null;
            this.f6520b = null;
            this.f6521c = null;
            this.f6522d = null;
            this.f6523e = -3.4028235E38f;
            this.f6524f = Integer.MIN_VALUE;
            this.f6525g = Integer.MIN_VALUE;
            this.f6526h = -3.4028235E38f;
            this.f6527i = Integer.MIN_VALUE;
            this.f6528j = Integer.MIN_VALUE;
            this.f6529k = -3.4028235E38f;
            this.f6530l = -3.4028235E38f;
            this.f6531m = -3.4028235E38f;
            this.f6532n = false;
            this.f6533o = -16777216;
            this.f6534p = Integer.MIN_VALUE;
        }

        private C0093b(b bVar) {
            this.f6519a = bVar.f6506n;
            this.f6520b = bVar.f6509q;
            this.f6521c = bVar.f6507o;
            this.f6522d = bVar.f6508p;
            this.f6523e = bVar.f6510r;
            this.f6524f = bVar.f6511s;
            this.f6525g = bVar.f6512t;
            this.f6526h = bVar.f6513u;
            this.f6527i = bVar.f6514v;
            this.f6528j = bVar.A;
            this.f6529k = bVar.B;
            this.f6530l = bVar.f6515w;
            this.f6531m = bVar.f6516x;
            this.f6532n = bVar.f6517y;
            this.f6533o = bVar.f6518z;
            this.f6534p = bVar.C;
            this.f6535q = bVar.D;
        }

        public b a() {
            return new b(this.f6519a, this.f6521c, this.f6522d, this.f6520b, this.f6523e, this.f6524f, this.f6525g, this.f6526h, this.f6527i, this.f6528j, this.f6529k, this.f6530l, this.f6531m, this.f6532n, this.f6533o, this.f6534p, this.f6535q);
        }

        public C0093b b() {
            this.f6532n = false;
            return this;
        }

        @Pure
        public int c() {
            return this.f6525g;
        }

        @Pure
        public int d() {
            return this.f6527i;
        }

        @Pure
        public CharSequence e() {
            return this.f6519a;
        }

        public C0093b f(Bitmap bitmap) {
            this.f6520b = bitmap;
            return this;
        }

        public C0093b g(float f10) {
            this.f6531m = f10;
            return this;
        }

        public C0093b h(float f10, int i10) {
            this.f6523e = f10;
            this.f6524f = i10;
            return this;
        }

        public C0093b i(int i10) {
            this.f6525g = i10;
            return this;
        }

        public C0093b j(Layout.Alignment alignment) {
            this.f6522d = alignment;
            return this;
        }

        public C0093b k(float f10) {
            this.f6526h = f10;
            return this;
        }

        public C0093b l(int i10) {
            this.f6527i = i10;
            return this;
        }

        public C0093b m(float f10) {
            this.f6535q = f10;
            return this;
        }

        public C0093b n(float f10) {
            this.f6530l = f10;
            return this;
        }

        public C0093b o(CharSequence charSequence) {
            this.f6519a = charSequence;
            return this;
        }

        public C0093b p(Layout.Alignment alignment) {
            this.f6521c = alignment;
            return this;
        }

        public C0093b q(float f10, int i10) {
            this.f6529k = f10;
            this.f6528j = i10;
            return this;
        }

        public C0093b r(int i10) {
            this.f6534p = i10;
            return this;
        }

        public C0093b s(int i10) {
            this.f6533o = i10;
            this.f6532n = true;
            return this;
        }
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            p3.a.e(bitmap);
        } else {
            p3.a.a(bitmap == null);
        }
        this.f6506n = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f6507o = alignment;
        this.f6508p = alignment2;
        this.f6509q = bitmap;
        this.f6510r = f10;
        this.f6511s = i10;
        this.f6512t = i11;
        this.f6513u = f11;
        this.f6514v = i12;
        this.f6515w = f13;
        this.f6516x = f14;
        this.f6517y = z10;
        this.f6518z = i14;
        this.A = i13;
        this.B = f12;
        this.C = i15;
        this.D = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0093b c0093b = new C0093b();
        CharSequence charSequence = bundle.getCharSequence(d(0));
        if (charSequence != null) {
            c0093b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d(1));
        if (alignment != null) {
            c0093b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(d(2));
        if (alignment2 != null) {
            c0093b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(d(3));
        if (bitmap != null) {
            c0093b.f(bitmap);
        }
        if (bundle.containsKey(d(4)) && bundle.containsKey(d(5))) {
            c0093b.h(bundle.getFloat(d(4)), bundle.getInt(d(5)));
        }
        if (bundle.containsKey(d(6))) {
            c0093b.i(bundle.getInt(d(6)));
        }
        if (bundle.containsKey(d(7))) {
            c0093b.k(bundle.getFloat(d(7)));
        }
        if (bundle.containsKey(d(8))) {
            c0093b.l(bundle.getInt(d(8)));
        }
        if (bundle.containsKey(d(10)) && bundle.containsKey(d(9))) {
            c0093b.q(bundle.getFloat(d(10)), bundle.getInt(d(9)));
        }
        if (bundle.containsKey(d(11))) {
            c0093b.n(bundle.getFloat(d(11)));
        }
        if (bundle.containsKey(d(12))) {
            c0093b.g(bundle.getFloat(d(12)));
        }
        if (bundle.containsKey(d(13))) {
            c0093b.s(bundle.getInt(d(13)));
        }
        if (!bundle.getBoolean(d(14), false)) {
            c0093b.b();
        }
        if (bundle.containsKey(d(15))) {
            c0093b.r(bundle.getInt(d(15)));
        }
        if (bundle.containsKey(d(16))) {
            c0093b.m(bundle.getFloat(d(16)));
        }
        return c0093b.a();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public C0093b b() {
        return new C0093b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f6506n, bVar.f6506n) && this.f6507o == bVar.f6507o && this.f6508p == bVar.f6508p && ((bitmap = this.f6509q) != null ? !((bitmap2 = bVar.f6509q) == null || !bitmap.sameAs(bitmap2)) : bVar.f6509q == null) && this.f6510r == bVar.f6510r && this.f6511s == bVar.f6511s && this.f6512t == bVar.f6512t && this.f6513u == bVar.f6513u && this.f6514v == bVar.f6514v && this.f6515w == bVar.f6515w && this.f6516x == bVar.f6516x && this.f6517y == bVar.f6517y && this.f6518z == bVar.f6518z && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D;
    }

    public int hashCode() {
        return a5.i.b(this.f6506n, this.f6507o, this.f6508p, this.f6509q, Float.valueOf(this.f6510r), Integer.valueOf(this.f6511s), Integer.valueOf(this.f6512t), Float.valueOf(this.f6513u), Integer.valueOf(this.f6514v), Float.valueOf(this.f6515w), Float.valueOf(this.f6516x), Boolean.valueOf(this.f6517y), Integer.valueOf(this.f6518z), Integer.valueOf(this.A), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D));
    }
}
