package p3;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f12350a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f12351b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12352c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f12353d = new int[10];

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12354a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12355b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12356c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12357d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f12358e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12359f;

        /* renamed from: g  reason: collision with root package name */
        public final int f12360g;

        /* renamed from: h  reason: collision with root package name */
        public final int f12361h;

        /* renamed from: i  reason: collision with root package name */
        public final int f12362i;

        /* renamed from: j  reason: collision with root package name */
        public final float f12363j;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f12354a = i10;
            this.f12355b = z10;
            this.f12356c = i11;
            this.f12357d = i12;
            this.f12358e = iArr;
            this.f12359f = i13;
            this.f12360g = i14;
            this.f12361h = i15;
            this.f12362i = i16;
            this.f12363j = f10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12364a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12365b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12366c;

        public b(int i10, int i11, boolean z10) {
            this.f12364a = i10;
            this.f12365b = i11;
            this.f12366c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f12367a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12368b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12369c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12370d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12371e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12372f;

        /* renamed from: g  reason: collision with root package name */
        public final int f12373g;

        /* renamed from: h  reason: collision with root package name */
        public final float f12374h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f12375i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f12376j;

        /* renamed from: k  reason: collision with root package name */
        public final int f12377k;

        /* renamed from: l  reason: collision with root package name */
        public final int f12378l;

        /* renamed from: m  reason: collision with root package name */
        public final int f12379m;

        /* renamed from: n  reason: collision with root package name */
        public final boolean f12380n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f12367a = i10;
            this.f12368b = i11;
            this.f12369c = i12;
            this.f12370d = i13;
            this.f12371e = i14;
            this.f12372f = i15;
            this.f12373g = i16;
            this.f12374h = f10;
            this.f12375i = z10;
            this.f12376j = z11;
            this.f12377k = i17;
            this.f12378l = i18;
            this.f12379m = i19;
            this.f12380n = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= position) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i10 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        p3.a.f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                if ((bArr[i14] & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
            zArr[2] = bArr[i13] == 0;
            return i11;
        }
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        b0Var.l(4);
        int e10 = b0Var.e(3);
        b0Var.k();
        int e11 = b0Var.e(2);
        boolean d10 = b0Var.d();
        int e12 = b0Var.e(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (b0Var.d()) {
                i12 |= 1 << i13;
            }
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = b0Var.e(8);
        }
        int e13 = b0Var.e(8);
        int i15 = 0;
        for (int i16 = 0; i16 < e10; i16++) {
            if (b0Var.d()) {
                i15 += 89;
            }
            if (b0Var.d()) {
                i15 += 8;
            }
        }
        b0Var.l(i15);
        if (e10 > 0) {
            b0Var.l((8 - e10) * 2);
        }
        int h10 = b0Var.h();
        int h11 = b0Var.h();
        if (h11 == 3) {
            b0Var.k();
        }
        int h12 = b0Var.h();
        int h13 = b0Var.h();
        if (b0Var.d()) {
            int h14 = b0Var.h();
            int h15 = b0Var.h();
            int h16 = b0Var.h();
            int h17 = b0Var.h();
            h12 -= ((h11 == 1 || h11 == 2) ? 2 : 1) * (h14 + h15);
            h13 -= (h11 == 1 ? 2 : 1) * (h16 + h17);
        }
        b0Var.h();
        b0Var.h();
        int h18 = b0Var.h();
        int i17 = b0Var.d() ? 0 : e10;
        while (true) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
            if (i17 > e10) {
                break;
            }
            i17++;
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            n(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        p(b0Var);
        if (b0Var.d()) {
            for (int i18 = 0; i18 < b0Var.h(); i18++) {
                b0Var.l(h18 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f10 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int e14 = b0Var.e(8);
                if (e14 == 255) {
                    int e15 = b0Var.e(16);
                    int e16 = b0Var.e(16);
                    if (e15 != 0 && e16 != 0) {
                        f10 = e15 / e16;
                    }
                } else {
                    float[] fArr = f12351b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        r.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e14);
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                h13 *= 2;
            }
        }
        return new a(e11, d10, e12, i12, iArr, e13, h10, h12, h13, f10);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        int h10 = b0Var.h();
        int h11 = b0Var.h();
        b0Var.k();
        return new b(h10, h11, b0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p3.w.c m(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.w.m(byte[], int, int):p3.w$c");
    }

    private static void n(b0 b0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (b0Var.d()) {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        b0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        b0Var.g();
                    }
                } else {
                    b0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(b0 b0Var, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((b0Var.g() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    private static void p(b0 b0Var) {
        int h10 = b0Var.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i10 = -1;
        int i11 = 0;
        int i12 = -1;
        while (i11 < h10) {
            if (((i11 == 0 || !b0Var.d()) ? null : 1) != null) {
                int i13 = i10 + i12;
                int h11 = (1 - ((b0Var.d() ? 1 : 0) * 2)) * (b0Var.h() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (b0Var.d()) {
                        zArr[i15] = true;
                    } else {
                        zArr[i15] = b0Var.d();
                    }
                }
                int[] iArr3 = new int[i14];
                int[] iArr4 = new int[i14];
                int i16 = 0;
                for (int i17 = i12 - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + h11;
                    if (i18 < 0 && zArr[i10 + i17]) {
                        iArr3[i16] = i18;
                        i16++;
                    }
                }
                if (h11 < 0 && zArr[i13]) {
                    iArr3[i16] = h11;
                    i16++;
                }
                for (int i19 = 0; i19 < i10; i19++) {
                    int i20 = iArr[i19] + h11;
                    if (i20 < 0 && zArr[i19]) {
                        iArr3[i16] = i20;
                        i16++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i16);
                int i21 = 0;
                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + h11;
                    if (i23 > 0 && zArr[i22]) {
                        iArr4[i21] = i23;
                        i21++;
                    }
                }
                if (h11 > 0 && zArr[i13]) {
                    iArr4[i21] = h11;
                    i21++;
                }
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = iArr2[i24] + h11;
                    if (i25 > 0 && zArr[i10 + i24]) {
                        iArr4[i21] = i25;
                        i21++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i21);
                iArr = copyOf;
                i10 = i16;
                i12 = i21;
            } else {
                int h12 = b0Var.h();
                int h13 = b0Var.h();
                int[] iArr5 = new int[h12];
                for (int i26 = 0; i26 < h12; i26++) {
                    iArr5[i26] = b0Var.h() + 1;
                    b0Var.k();
                }
                int[] iArr6 = new int[h13];
                for (int i27 = 0; i27 < h13; i27++) {
                    iArr6[i27] = b0Var.h() + 1;
                    b0Var.k();
                }
                i10 = h12;
                iArr = iArr5;
                i12 = h13;
                iArr2 = iArr6;
            }
            i11++;
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f12352c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f12353d;
                        if (iArr.length <= i13) {
                            f12353d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f12353d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f12353d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
