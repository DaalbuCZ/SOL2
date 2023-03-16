package e3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c.j;
import d3.b;
import d3.h;
import d3.l;
import d3.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.a0;
import p3.r;
import p3.z;
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: g  reason: collision with root package name */
    private final a0 f6713g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final z f6714h = new z();

    /* renamed from: i  reason: collision with root package name */
    private int f6715i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f6716j;

    /* renamed from: k  reason: collision with root package name */
    private final int f6717k;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f6718l;

    /* renamed from: m  reason: collision with root package name */
    private b f6719m;

    /* renamed from: n  reason: collision with root package name */
    private List<d3.b> f6720n;

    /* renamed from: o  reason: collision with root package name */
    private List<d3.b> f6721o;

    /* renamed from: p  reason: collision with root package name */
    private C0097c f6722p;

    /* renamed from: q  reason: collision with root package name */
    private int f6723q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private static final Comparator<a> f6724c = e3.b.f6712n;

        /* renamed from: a  reason: collision with root package name */
        public final d3.b f6725a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6726b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0093b n10 = new b.C0093b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f6725a = n10.a();
            this.f6726b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f6726b, aVar.f6726b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w  reason: collision with root package name */
        public static final int f6727w = h(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f6728x;

        /* renamed from: y  reason: collision with root package name */
        public static final int f6729y;

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f6730z;

        /* renamed from: a  reason: collision with root package name */
        private final List<SpannableString> f6731a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f6732b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f6733c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6734d;

        /* renamed from: e  reason: collision with root package name */
        private int f6735e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6736f;

        /* renamed from: g  reason: collision with root package name */
        private int f6737g;

        /* renamed from: h  reason: collision with root package name */
        private int f6738h;

        /* renamed from: i  reason: collision with root package name */
        private int f6739i;

        /* renamed from: j  reason: collision with root package name */
        private int f6740j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f6741k;

        /* renamed from: l  reason: collision with root package name */
        private int f6742l;

        /* renamed from: m  reason: collision with root package name */
        private int f6743m;

        /* renamed from: n  reason: collision with root package name */
        private int f6744n;

        /* renamed from: o  reason: collision with root package name */
        private int f6745o;

        /* renamed from: p  reason: collision with root package name */
        private int f6746p;

        /* renamed from: q  reason: collision with root package name */
        private int f6747q;

        /* renamed from: r  reason: collision with root package name */
        private int f6748r;

        /* renamed from: s  reason: collision with root package name */
        private int f6749s;

        /* renamed from: t  reason: collision with root package name */
        private int f6750t;

        /* renamed from: u  reason: collision with root package name */
        private int f6751u;

        /* renamed from: v  reason: collision with root package name */
        private int f6752v;

        static {
            int h10 = h(0, 0, 0, 0);
            f6728x = h10;
            int h11 = h(0, 0, 0, 3);
            f6729y = h11;
            f6730z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p3.a.c(r4, r0, r1)
                p3.a.c(r5, r0, r1)
                p3.a.c(r6, r0, r1)
                p3.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f6732b.append(c10);
                return;
            }
            this.f6731a.add(d());
            this.f6732b.clear();
            if (this.f6746p != -1) {
                this.f6746p = 0;
            }
            if (this.f6747q != -1) {
                this.f6747q = 0;
            }
            if (this.f6748r != -1) {
                this.f6748r = 0;
            }
            if (this.f6750t != -1) {
                this.f6750t = 0;
            }
            while (true) {
                if ((!this.f6741k || this.f6731a.size() < this.f6740j) && this.f6731a.size() < 15) {
                    return;
                }
                this.f6731a.remove(0);
            }
        }

        public void b() {
            int length = this.f6732b.length();
            if (length > 0) {
                this.f6732b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e3.c.a c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.c.b.c():e3.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6732b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f6746p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f6746p, length, 33);
                }
                if (this.f6747q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f6747q, length, 33);
                }
                if (this.f6748r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f6749s), this.f6748r, length, 33);
                }
                if (this.f6750t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f6751u), this.f6750t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f6731a.clear();
            this.f6732b.clear();
            this.f6746p = -1;
            this.f6747q = -1;
            this.f6748r = -1;
            this.f6750t = -1;
            this.f6752v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f6733c = true;
            this.f6734d = z10;
            this.f6741k = z11;
            this.f6735e = i10;
            this.f6736f = z13;
            this.f6737g = i11;
            this.f6738h = i12;
            this.f6739i = i15;
            int i18 = i13 + 1;
            if (this.f6740j != i18) {
                this.f6740j = i18;
                while (true) {
                    if ((!z11 || this.f6731a.size() < this.f6740j) && this.f6731a.size() < 15) {
                        break;
                    }
                    this.f6731a.remove(0);
                }
            }
            if (i16 != 0 && this.f6743m != i16) {
                this.f6743m = i16;
                int i19 = i16 - 1;
                q(D[i19], f6729y, C[i19], 0, A[i19], B[i19], f6730z[i19]);
            }
            if (i17 == 0 || this.f6744n == i17) {
                return;
            }
            this.f6744n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f6727w, G[i20], f6728x);
        }

        public boolean i() {
            return this.f6733c;
        }

        public boolean j() {
            return !i() || (this.f6731a.isEmpty() && this.f6732b.length() == 0);
        }

        public boolean k() {
            return this.f6734d;
        }

        public void l() {
            e();
            this.f6733c = false;
            this.f6734d = false;
            this.f6735e = 4;
            this.f6736f = false;
            this.f6737g = 0;
            this.f6738h = 0;
            this.f6739i = 0;
            this.f6740j = 15;
            this.f6741k = true;
            this.f6742l = 0;
            this.f6743m = 0;
            this.f6744n = 0;
            int i10 = f6728x;
            this.f6745o = i10;
            this.f6749s = f6727w;
            this.f6751u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f6746p != -1) {
                if (!z10) {
                    this.f6732b.setSpan(new StyleSpan(2), this.f6746p, this.f6732b.length(), 33);
                    this.f6746p = -1;
                }
            } else if (z10) {
                this.f6746p = this.f6732b.length();
            }
            if (this.f6747q == -1) {
                if (z11) {
                    this.f6747q = this.f6732b.length();
                }
            } else if (z11) {
            } else {
                this.f6732b.setSpan(new UnderlineSpan(), this.f6747q, this.f6732b.length(), 33);
                this.f6747q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f6748r != -1 && this.f6749s != i10) {
                this.f6732b.setSpan(new ForegroundColorSpan(this.f6749s), this.f6748r, this.f6732b.length(), 33);
            }
            if (i10 != f6727w) {
                this.f6748r = this.f6732b.length();
                this.f6749s = i10;
            }
            if (this.f6750t != -1 && this.f6751u != i11) {
                this.f6732b.setSpan(new BackgroundColorSpan(this.f6751u), this.f6750t, this.f6732b.length(), 33);
            }
            if (i11 != f6728x) {
                this.f6750t = this.f6732b.length();
                this.f6751u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f6752v != i10) {
                a('\n');
            }
            this.f6752v = i10;
        }

        public void p(boolean z10) {
            this.f6734d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f6745o = i10;
            this.f6742l = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0097c {

        /* renamed from: a  reason: collision with root package name */
        public final int f6753a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6754b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f6755c;

        /* renamed from: d  reason: collision with root package name */
        int f6756d = 0;

        public C0097c(int i10, int i11) {
            this.f6753a = i10;
            this.f6754b = i11;
            this.f6755c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f6717k = i10 == -1 ? 1 : i10;
        this.f6716j = (list == null || !p3.e.h(list)) ? false : z10;
        this.f6718l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f6718l[i11] = new b();
        }
        this.f6719m = this.f6718l[0];
    }

    private void A() {
        this.f6719m.m(this.f6714h.h(4), this.f6714h.h(2), this.f6714h.h(2), this.f6714h.g(), this.f6714h.g(), this.f6714h.h(3), this.f6714h.h(3));
    }

    private void B() {
        int h10 = b.h(this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2));
        int h11 = b.h(this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2));
        this.f6714h.r(2);
        this.f6719m.n(h10, h11, b.g(this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2)));
    }

    private void C() {
        this.f6714h.r(4);
        int h10 = this.f6714h.h(4);
        this.f6714h.r(2);
        this.f6719m.o(h10, this.f6714h.h(6));
    }

    private void D() {
        int h10 = b.h(this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2));
        int h11 = this.f6714h.h(2);
        int g10 = b.g(this.f6714h.h(2), this.f6714h.h(2), this.f6714h.h(2));
        if (this.f6714h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f6714h.g();
        int h12 = this.f6714h.h(2);
        int h13 = this.f6714h.h(2);
        int h14 = this.f6714h.h(2);
        this.f6714h.r(8);
        this.f6719m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    private void E() {
        StringBuilder sb;
        String str;
        C0097c c0097c = this.f6722p;
        if (c0097c.f6756d != (c0097c.f6754b * 2) - 1) {
            r.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f6722p.f6754b * 2) - 1) + ", but current index is " + this.f6722p.f6756d + " (sequence number " + this.f6722p.f6753a + ");");
        }
        boolean z10 = false;
        z zVar = this.f6714h;
        C0097c c0097c2 = this.f6722p;
        zVar.o(c0097c2.f6755c, c0097c2.f6756d);
        while (true) {
            if (this.f6714h.b() <= 0) {
                break;
            }
            int h10 = this.f6714h.h(3);
            int h11 = this.f6714h.h(5);
            if (h10 == 7) {
                this.f6714h.r(2);
                h10 = this.f6714h.h(6);
                if (h10 < 7) {
                    r.i("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    r.i("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f6717k) {
                this.f6714h.s(h11);
            } else {
                int e10 = this.f6714h.e() + (h11 * 8);
                while (this.f6714h.e() < e10) {
                    int h12 = this.f6714h.h(8);
                    if (h12 == 16) {
                        h12 = this.f6714h.h(8);
                        if (h12 <= 31) {
                            t(h12);
                        } else {
                            if (h12 <= 127) {
                                y(h12);
                            } else if (h12 <= 159) {
                                u(h12);
                            } else if (h12 <= 255) {
                                z(h12);
                            } else {
                                sb = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb.append(str);
                                sb.append(h12);
                                r.i("Cea708Decoder", sb.toString());
                            }
                            z10 = true;
                        }
                    } else if (h12 <= 31) {
                        r(h12);
                    } else {
                        if (h12 <= 127) {
                            w(h12);
                        } else if (h12 <= 159) {
                            s(h12);
                        } else if (h12 <= 255) {
                            x(h12);
                        } else {
                            sb = new StringBuilder();
                            str = "Invalid base command: ";
                            sb.append(str);
                            sb.append(h12);
                            r.i("Cea708Decoder", sb.toString());
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f6720n = q();
        }
    }

    private void F() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f6718l[i10].l();
        }
    }

    private void p() {
        if (this.f6722p == null) {
            return;
        }
        E();
        this.f6722p = null;
    }

    private List<d3.b> q() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f6718l[i10].j() && this.f6718l[i10].k() && (c10 = this.f6718l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f6724c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f6725a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r(int i10) {
        z zVar;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f6720n = q();
                return;
            }
            int i11 = 8;
            if (i10 == 8) {
                this.f6719m.b();
                return;
            }
            switch (i10) {
                case 12:
                    F();
                    return;
                case 13:
                    this.f6719m.a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        zVar = this.f6714h;
                    } else if (i10 < 24 || i10 > 31) {
                        r.i("Cea708Decoder", "Invalid C0 command: " + i10);
                        return;
                    } else {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        zVar = this.f6714h;
                        i11 = 16;
                    }
                    zVar.r(i11);
                    return;
            }
        }
    }

    private void s(int i10) {
        b bVar;
        b bVar2;
        z zVar;
        int i11 = 16;
        int i12 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i10 - 128;
                if (this.f6723q != i13) {
                    this.f6723q = i13;
                    bVar = this.f6718l[i13];
                    this.f6719m = bVar;
                    return;
                }
                return;
            case 136:
                while (i12 <= 8) {
                    if (this.f6714h.g()) {
                        this.f6718l[8 - i12].e();
                    }
                    i12++;
                }
                return;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f6714h.g()) {
                        this.f6718l[8 - i14].p(true);
                    }
                }
                return;
            case 138:
                while (i12 <= 8) {
                    if (this.f6714h.g()) {
                        this.f6718l[8 - i12].p(false);
                    }
                    i12++;
                }
                return;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f6714h.g()) {
                        this.f6718l[8 - i15].p(!bVar2.k());
                    }
                }
                return;
            case 140:
                while (i12 <= 8) {
                    if (this.f6714h.g()) {
                        this.f6718l[8 - i12].l();
                    }
                    i12++;
                }
                return;
            case 141:
                this.f6714h.r(8);
                return;
            case 142:
                return;
            case 143:
                F();
                return;
            case 144:
                if (this.f6719m.i()) {
                    A();
                    return;
                }
                zVar = this.f6714h;
                zVar.r(i11);
                return;
            case 145:
                if (this.f6719m.i()) {
                    B();
                    return;
                }
                zVar = this.f6714h;
                i11 = 24;
                zVar.r(i11);
                return;
            case 146:
                if (this.f6719m.i()) {
                    C();
                    return;
                }
                zVar = this.f6714h;
                zVar.r(i11);
                return;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                r.i("Cea708Decoder", "Invalid C1 command: " + i10);
                return;
            case 151:
                if (this.f6719m.i()) {
                    D();
                    return;
                }
                zVar = this.f6714h;
                i11 = 32;
                zVar.r(i11);
                return;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i16 = i10 - 152;
                v(i16);
                if (this.f6723q != i16) {
                    this.f6723q = i16;
                    bVar = this.f6718l[i16];
                    this.f6719m = bVar;
                    return;
                }
                return;
        }
    }

    private void t(int i10) {
        z zVar;
        int i11;
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            zVar = this.f6714h;
            i11 = 8;
        } else if (i10 <= 23) {
            zVar = this.f6714h;
            i11 = 16;
        } else if (i10 > 31) {
            return;
        } else {
            zVar = this.f6714h;
            i11 = 24;
        }
        zVar.r(i11);
    }

    private void u(int i10) {
        z zVar;
        int i11;
        if (i10 <= 135) {
            zVar = this.f6714h;
            i11 = 32;
        } else if (i10 > 143) {
            if (i10 <= 159) {
                this.f6714h.r(2);
                this.f6714h.r(this.f6714h.h(6) * 8);
                return;
            }
            return;
        } else {
            zVar = this.f6714h;
            i11 = 40;
        }
        zVar.r(i11);
    }

    private void v(int i10) {
        b bVar = this.f6718l[i10];
        this.f6714h.r(2);
        boolean g10 = this.f6714h.g();
        boolean g11 = this.f6714h.g();
        boolean g12 = this.f6714h.g();
        int h10 = this.f6714h.h(3);
        boolean g13 = this.f6714h.g();
        int h11 = this.f6714h.h(7);
        int h12 = this.f6714h.h(8);
        int h13 = this.f6714h.h(4);
        int h14 = this.f6714h.h(4);
        this.f6714h.r(2);
        int h15 = this.f6714h.h(6);
        this.f6714h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f6714h.h(3), this.f6714h.h(3));
    }

    private void w(int i10) {
        if (i10 == 127) {
            this.f6719m.a((char) 9835);
        } else {
            this.f6719m.a((char) (i10 & 255));
        }
    }

    private void x(int i10) {
        this.f6719m.a((char) (i10 & 255));
    }

    private void y(int i10) {
        b bVar;
        char c10 = ' ';
        if (i10 == 32) {
            bVar = this.f6719m;
        } else if (i10 == 33) {
            bVar = this.f6719m;
            c10 = 160;
        } else if (i10 == 37) {
            bVar = this.f6719m;
            c10 = 8230;
        } else if (i10 == 42) {
            bVar = this.f6719m;
            c10 = 352;
        } else if (i10 == 44) {
            bVar = this.f6719m;
            c10 = 338;
        } else if (i10 == 63) {
            bVar = this.f6719m;
            c10 = 376;
        } else if (i10 == 57) {
            bVar = this.f6719m;
            c10 = 8482;
        } else if (i10 == 58) {
            bVar = this.f6719m;
            c10 = 353;
        } else if (i10 == 60) {
            bVar = this.f6719m;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    bVar = this.f6719m;
                    c10 = 9608;
                    break;
                case 49:
                    bVar = this.f6719m;
                    c10 = 8216;
                    break;
                case 50:
                    bVar = this.f6719m;
                    c10 = 8217;
                    break;
                case 51:
                    bVar = this.f6719m;
                    c10 = 8220;
                    break;
                case 52:
                    bVar = this.f6719m;
                    c10 = 8221;
                    break;
                case 53:
                    bVar = this.f6719m;
                    c10 = 8226;
                    break;
                default:
                    switch (i10) {
                        case j.H0 /* 118 */:
                            bVar = this.f6719m;
                            c10 = 8539;
                            break;
                        case j.I0 /* 119 */:
                            bVar = this.f6719m;
                            c10 = 8540;
                            break;
                        case j.J0 /* 120 */:
                            bVar = this.f6719m;
                            c10 = 8541;
                            break;
                        case j.K0 /* 121 */:
                            bVar = this.f6719m;
                            c10 = 8542;
                            break;
                        case j.L0 /* 122 */:
                            bVar = this.f6719m;
                            c10 = 9474;
                            break;
                        case j.M0 /* 123 */:
                            bVar = this.f6719m;
                            c10 = 9488;
                            break;
                        case j.N0 /* 124 */:
                            bVar = this.f6719m;
                            c10 = 9492;
                            break;
                        case 125:
                            bVar = this.f6719m;
                            c10 = 9472;
                            break;
                        case 126:
                            bVar = this.f6719m;
                            c10 = 9496;
                            break;
                        case 127:
                            bVar = this.f6719m;
                            c10 = 9484;
                            break;
                        default:
                            r.i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            bVar = this.f6719m;
            c10 = 8480;
        }
        bVar.a(c10);
    }

    private void z(int i10) {
        b bVar;
        char c10;
        if (i10 == 160) {
            bVar = this.f6719m;
            c10 = 13252;
        } else {
            r.i("Cea708Decoder", "Invalid G3 character: " + i10);
            bVar = this.f6719m;
            c10 = '_';
        }
        bVar.a(c10);
    }

    @Override // e3.e, v1.d
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // e3.e, d3.i
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // e3.e
    protected h f() {
        List<d3.b> list = this.f6720n;
        this.f6721o = list;
        return new f((List) p3.a.e(list));
    }

    @Override // e3.e, v1.d
    public void flush() {
        super.flush();
        this.f6720n = null;
        this.f6721o = null;
        this.f6723q = 0;
        this.f6719m = this.f6718l[0];
        F();
        this.f6722p = null;
    }

    @Override // e3.e
    protected void g(l lVar) {
        ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(lVar.f15536p);
        this.f6713g.M(byteBuffer.array(), byteBuffer.limit());
        while (this.f6713g.a() >= 3) {
            int C = this.f6713g.C() & 7;
            int i10 = C & 3;
            boolean z10 = (C & 4) == 4;
            byte C2 = (byte) this.f6713g.C();
            byte C3 = (byte) this.f6713g.C();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        p();
                        int i11 = (C2 & 192) >> 6;
                        int i12 = this.f6715i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            F();
                            r.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f6715i + " current=" + i11);
                        }
                        this.f6715i = i11;
                        int i13 = C2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0097c c0097c = new C0097c(i11, i13);
                        this.f6722p = c0097c;
                        byte[] bArr = c0097c.f6755c;
                        int i14 = c0097c.f6756d;
                        c0097c.f6756d = i14 + 1;
                        bArr[i14] = C3;
                    } else {
                        p3.a.a(i10 == 2);
                        C0097c c0097c2 = this.f6722p;
                        if (c0097c2 == null) {
                            r.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0097c2.f6755c;
                            int i15 = c0097c2.f6756d;
                            int i16 = i15 + 1;
                            c0097c2.f6756d = i16;
                            bArr2[i15] = C2;
                            c0097c2.f6756d = i16 + 1;
                            bArr2[i16] = C3;
                        }
                    }
                    C0097c c0097c3 = this.f6722p;
                    if (c0097c3.f6756d == (c0097c3.f6754b * 2) - 1) {
                        p();
                    }
                }
            }
        }
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ l h() {
        return super.e();
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ m i() {
        return super.d();
    }

    @Override // e3.e
    protected boolean l() {
        return this.f6720n != this.f6721o;
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ void m(l lVar) {
        super.c(lVar);
    }
}
