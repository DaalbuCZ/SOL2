package e3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c.j;
import d3.b;
import d3.h;
import d3.l;
import d3.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.a0;
import p3.m0;
import p3.r;
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: h  reason: collision with root package name */
    private final int f6684h;

    /* renamed from: i  reason: collision with root package name */
    private final int f6685i;

    /* renamed from: j  reason: collision with root package name */
    private final int f6686j;

    /* renamed from: k  reason: collision with root package name */
    private final long f6687k;

    /* renamed from: n  reason: collision with root package name */
    private List<d3.b> f6690n;

    /* renamed from: o  reason: collision with root package name */
    private List<d3.b> f6691o;

    /* renamed from: p  reason: collision with root package name */
    private int f6692p;

    /* renamed from: q  reason: collision with root package name */
    private int f6693q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6694r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6695s;

    /* renamed from: t  reason: collision with root package name */
    private byte f6696t;

    /* renamed from: u  reason: collision with root package name */
    private byte f6697u;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6699w;

    /* renamed from: x  reason: collision with root package name */
    private long f6700x;

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f6681y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f6682z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, j.D0, j.E0, j.F0, j.G0, j.H0, j.I0, j.J0, j.K0, j.L0, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, j.M0, 125, 92, 94, 95, j.N0, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    private final a0 f6683g = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<C0095a> f6688l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private C0095a f6689m = new C0095a(0, 4);

    /* renamed from: v  reason: collision with root package name */
    private int f6698v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0096a> f6701a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f6702b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f6703c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        private int f6704d;

        /* renamed from: e  reason: collision with root package name */
        private int f6705e;

        /* renamed from: f  reason: collision with root package name */
        private int f6706f;

        /* renamed from: g  reason: collision with root package name */
        private int f6707g;

        /* renamed from: h  reason: collision with root package name */
        private int f6708h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e3.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0096a {

            /* renamed from: a  reason: collision with root package name */
            public final int f6709a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f6710b;

            /* renamed from: c  reason: collision with root package name */
            public int f6711c;

            public C0096a(int i10, boolean z10, int i11) {
                this.f6709a = i10;
                this.f6710b = z10;
                this.f6711c = i11;
            }
        }

        public C0095a(int i10, int i11) {
            j(i10);
            this.f6708h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6703c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f6701a.size()) {
                C0096a c0096a = this.f6701a.get(i10);
                boolean z11 = c0096a.f6710b;
                int i16 = c0096a.f6709a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0096a.f6711c;
                i10++;
                if (i17 != (i10 < this.f6701a.size() ? this.f6701a.get(i10).f6711c : length)) {
                    if (i12 != -1 && !z11) {
                        q(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i13 != -1 && !z10) {
                        o(spannableStringBuilder, i13, i17);
                        i13 = -1;
                    } else if (i13 == -1 && z10) {
                        i13 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i11, i17, i14);
                        i14 = i15;
                        i11 = i17;
                    }
                }
            }
            if (i12 != -1 && i12 != length) {
                q(spannableStringBuilder, i12, length);
            }
            if (i13 != -1 && i13 != length) {
                o(spannableStringBuilder, i13, length);
            }
            if (i11 != length) {
                n(spannableStringBuilder, i11, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f6703c.length() < 32) {
                this.f6703c.append(c10);
            }
        }

        public void f() {
            int length = this.f6703c.length();
            if (length > 0) {
                this.f6703c.delete(length - 1, length);
                for (int size = this.f6701a.size() - 1; size >= 0; size--) {
                    C0096a c0096a = this.f6701a.get(size);
                    int i10 = c0096a.f6711c;
                    if (i10 != length) {
                        return;
                    }
                    c0096a.f6711c = i10 - 1;
                }
            }
        }

        public d3.b g(int i10) {
            float f10;
            int i11 = this.f6705e + this.f6706f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f6702b.size(); i13++) {
                spannableStringBuilder.append(m0.W0(this.f6702b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(m0.W0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f6707g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f6707g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f6704d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f6707g == 1) {
                i15 -= this.f6708h - 1;
            }
            return new b.C0093b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f6701a.isEmpty() && this.f6702b.isEmpty() && this.f6703c.length() == 0;
        }

        public void j(int i10) {
            this.f6707g = i10;
            this.f6701a.clear();
            this.f6702b.clear();
            this.f6703c.setLength(0);
            this.f6704d = 15;
            this.f6705e = 0;
            this.f6706f = 0;
        }

        public void k() {
            this.f6702b.add(h());
            this.f6703c.setLength(0);
            this.f6701a.clear();
            int min = Math.min(this.f6708h, this.f6704d);
            while (this.f6702b.size() >= min) {
                this.f6702b.remove(0);
            }
        }

        public void l(int i10) {
            this.f6707g = i10;
        }

        public void m(int i10) {
            this.f6708h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f6701a.add(new C0096a(i10, z10, this.f6703c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f6687k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f6684h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f6686j = 1;
                this.f6685i = 0;
                N(0);
                M();
                this.f6699w = true;
                this.f6700x = -9223372036854775807L;
            }
            if (i10 == 3) {
                this.f6686j = 0;
            } else if (i10 != 4) {
                r.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f6686j = 1;
            }
            this.f6685i = 1;
            N(0);
            M();
            this.f6699w = true;
            this.f6700x = -9223372036854775807L;
        }
        this.f6686j = 0;
        this.f6685i = 0;
        N(0);
        M();
        this.f6699w = true;
        this.f6700x = -9223372036854775807L;
    }

    private static boolean A(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean F(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean G(boolean z10, byte b10, byte b11) {
        if (!z10 || !F(b10)) {
            this.f6695s = false;
        } else if (this.f6695s && this.f6696t == b10 && this.f6697u == b11) {
            this.f6695s = false;
            return true;
        } else {
            this.f6695s = true;
            this.f6696t = b10;
            this.f6697u = b11;
        }
        return false;
    }

    private static boolean H(byte b10) {
        return (b10 & 247) == 20;
    }

    private static boolean I(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean K(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void L(byte b10, byte b11) {
        if (!K(b10)) {
            if (H(b10)) {
                if (b11 != 32 && b11 != 47) {
                    switch (b11) {
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (b11) {
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    return;
                            }
                    }
                }
                this.f6699w = true;
                return;
            }
            return;
        }
        this.f6699w = false;
    }

    private void M() {
        this.f6689m.j(this.f6692p);
        this.f6688l.clear();
        this.f6688l.add(this.f6689m);
    }

    private void N(int i10) {
        int i11 = this.f6692p;
        if (i11 == i10) {
            return;
        }
        this.f6692p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f6688l.size(); i12++) {
                this.f6688l.get(i12).l(i10);
            }
            return;
        }
        M();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f6690n = Collections.emptyList();
        }
    }

    private void O(int i10) {
        this.f6693q = i10;
        this.f6689m.m(i10);
    }

    private boolean P() {
        return (this.f6687k == -9223372036854775807L || this.f6700x == -9223372036854775807L || k() - this.f6700x < this.f6687k) ? false : true;
    }

    private boolean Q(byte b10) {
        if (A(b10)) {
            this.f6698v = r(b10);
        }
        return this.f6698v == this.f6686j;
    }

    private static char q(byte b10) {
        return (char) B[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int r(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<d3.b> s() {
        int size = this.f6688l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            d3.b g10 = this.f6688l.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f6514v);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            d3.b bVar = (d3.b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f6514v != i10) {
                    bVar = (d3.b) p3.a.e(this.f6688l.get(i12).g(i10));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char t(byte b10) {
        return (char) D[b10 & 31];
    }

    private static char u(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char v(byte b10, byte b11) {
        return (b10 & 1) == 0 ? t(b11) : u(b11);
    }

    private static char w(byte b10) {
        return (char) C[b10 & 15];
    }

    private void x(byte b10) {
        this.f6689m.e(' ');
        this.f6689m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void y(byte b10) {
        if (b10 == 32) {
            N(2);
        } else if (b10 == 41) {
            N(3);
        } else {
            switch (b10) {
                case 37:
                    N(1);
                    O(2);
                    return;
                case 38:
                    N(1);
                    O(3);
                    return;
                case 39:
                    N(1);
                    O(4);
                    return;
                default:
                    int i10 = this.f6692p;
                    if (i10 == 0) {
                        return;
                    }
                    if (b10 == 33) {
                        this.f6689m.f();
                        return;
                    }
                    switch (b10) {
                        case 44:
                            this.f6690n = Collections.emptyList();
                            int i11 = this.f6692p;
                            if (i11 != 1 && i11 != 3) {
                                return;
                            }
                            break;
                        case 45:
                            if (i10 != 1 || this.f6689m.i()) {
                                return;
                            }
                            this.f6689m.k();
                            return;
                        case 46:
                            break;
                        case 47:
                            this.f6690n = s();
                            break;
                        default:
                            return;
                    }
                    M();
                    return;
            }
        }
    }

    private void z(byte b10, byte b11) {
        int i10 = f6681y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f6689m.f6704d) {
            if (this.f6692p != 1 && !this.f6689m.i()) {
                C0095a c0095a = new C0095a(this.f6692p, this.f6693q);
                this.f6689m = c0095a;
                this.f6688l.add(c0095a);
            }
            this.f6689m.f6704d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f6689m.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f6689m.f6705e = f6682z[i11];
        }
    }

    @Override // e3.e, v1.d
    public void a() {
    }

    @Override // e3.e, d3.i
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // e3.e
    protected h f() {
        List<d3.b> list = this.f6690n;
        this.f6691o = list;
        return new f((List) p3.a.e(list));
    }

    @Override // e3.e, v1.d
    public void flush() {
        super.flush();
        this.f6690n = null;
        this.f6691o = null;
        N(0);
        O(4);
        M();
        this.f6694r = false;
        this.f6695s = false;
        this.f6696t = (byte) 0;
        this.f6697u = (byte) 0;
        this.f6698v = 0;
        this.f6699w = true;
        this.f6700x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0018 A[SYNTHETIC] */
    @Override // e3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void g(d3.l r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.a.g(d3.l):void");
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ l h() {
        return super.e();
    }

    @Override // e3.e, v1.d
    /* renamed from: i */
    public m d() {
        m j10;
        m d10 = super.d();
        if (d10 != null) {
            return d10;
        }
        if (!P() || (j10 = j()) == null) {
            return null;
        }
        this.f6690n = Collections.emptyList();
        this.f6700x = -9223372036854775807L;
        j10.y(k(), f(), Long.MAX_VALUE);
        return j10;
    }

    @Override // e3.e
    protected boolean l() {
        return this.f6690n != this.f6691o;
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ void m(l lVar) {
        super.c(lVar);
    }
}
