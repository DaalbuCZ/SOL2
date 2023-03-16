package x1;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3.m0;
import s1.h2;
/* loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16233a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16234b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f16235c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16236d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16237e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f16233a = i10;
            this.f16234b = i11;
            this.f16235c = jArr;
            this.f16236d = i12;
            this.f16237e = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16238a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f16239b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16240c;

        public b(String str, String[] strArr, int i10) {
            this.f16238a = str;
            this.f16239b = strArr;
            this.f16240c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16241a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16242b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16243c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16244d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f16241a = z10;
            this.f16242b = i10;
            this.f16243c = i11;
            this.f16244d = i12;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f16245a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16246b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16247c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16248d;

        /* renamed from: e  reason: collision with root package name */
        public final int f16249e;

        /* renamed from: f  reason: collision with root package name */
        public final int f16250f;

        /* renamed from: g  reason: collision with root package name */
        public final int f16251g;

        /* renamed from: h  reason: collision with root package name */
        public final int f16252h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f16253i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f16254j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f16245a = i10;
            this.f16246b = i11;
            this.f16247c = i12;
            this.f16248d = i13;
            this.f16249e = i14;
            this.f16250f = i15;
            this.f16251g = i16;
            this.f16252h = i17;
            this.f16253i = z10;
            this.f16254j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static k2.a c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] Q0 = m0.Q0(str, "=");
            if (Q0.length != 2) {
                p3.r.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (Q0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(n2.a.a(new p3.a0(Base64.decode(Q0[1], 0))));
                } catch (RuntimeException e10) {
                    p3.r.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new s2.a(Q0[0], Q0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k2.a(arrayList);
    }

    private static a d(g0 g0Var) {
        if (g0Var.d(24) != 5653314) {
            throw h2.a("expected code book to start with [0x56, 0x43, 0x42] at " + g0Var.b(), null);
        }
        int d10 = g0Var.d(16);
        int d11 = g0Var.d(24);
        long[] jArr = new long[d11];
        boolean c10 = g0Var.c();
        long j10 = 0;
        if (c10) {
            int d12 = g0Var.d(5) + 1;
            int i10 = 0;
            while (i10 < d11) {
                int d13 = g0Var.d(a(d11 - i10));
                for (int i11 = 0; i11 < d13 && i10 < d11; i11++) {
                    jArr[i10] = d12;
                    i10++;
                }
                d12++;
            }
        } else {
            boolean c11 = g0Var.c();
            for (int i12 = 0; i12 < d11; i12++) {
                if (!c11) {
                    jArr[i12] = g0Var.d(5) + 1;
                } else if (g0Var.c()) {
                    jArr[i12] = g0Var.d(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int d14 = g0Var.d(4);
        if (d14 > 2) {
            throw h2.a("lookup type greater than 2 not decodable: " + d14, null);
        }
        if (d14 == 1 || d14 == 2) {
            g0Var.e(32);
            g0Var.e(32);
            int d15 = g0Var.d(4) + 1;
            g0Var.e(1);
            if (d14 != 1) {
                j10 = d11 * d10;
            } else if (d10 != 0) {
                j10 = b(d11, d10);
            }
            g0Var.e((int) (j10 * d15));
        }
        return new a(d10, d11, jArr, d14, c10);
    }

    private static void e(g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = g0Var.d(16);
            if (d11 == 0) {
                g0Var.e(8);
                g0Var.e(16);
                g0Var.e(16);
                g0Var.e(6);
                g0Var.e(8);
                int d12 = g0Var.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    g0Var.e(8);
                }
            } else if (d11 != 1) {
                throw h2.a("floor type greater than 1 not decodable: " + d11, null);
            } else {
                int d13 = g0Var.d(5);
                int i12 = -1;
                int[] iArr = new int[d13];
                for (int i13 = 0; i13 < d13; i13++) {
                    iArr[i13] = g0Var.d(4);
                    if (iArr[i13] > i12) {
                        i12 = iArr[i13];
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = g0Var.d(3) + 1;
                    int d14 = g0Var.d(2);
                    if (d14 > 0) {
                        g0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d14); i16++) {
                        g0Var.e(8);
                    }
                }
                g0Var.e(2);
                int d15 = g0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        g0Var.e(d15);
                        i18++;
                    }
                }
            }
        }
    }

    private static void f(int i10, g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = g0Var.d(16);
            if (d11 != 0) {
                p3.r.c("VorbisUtil", "mapping type other than 0 not supported: " + d11);
            } else {
                int d12 = g0Var.c() ? g0Var.d(4) + 1 : 1;
                if (g0Var.c()) {
                    int d13 = g0Var.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        g0Var.e(a(i13));
                        g0Var.e(a(i13));
                    }
                }
                if (g0Var.d(2) != 0) {
                    throw h2.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d12 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        g0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < d12; i15++) {
                    g0Var.e(8);
                    g0Var.e(8);
                    g0Var.e(8);
                }
            }
        }
    }

    private static c[] g(g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        c[] cVarArr = new c[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            cVarArr[i10] = new c(g0Var.c(), g0Var.d(16), g0Var.d(16), g0Var.d(8));
        }
        return cVarArr;
    }

    private static void h(g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            if (g0Var.d(16) > 2) {
                throw h2.a("residueType greater than 2 is not decodable", null);
            }
            g0Var.e(24);
            g0Var.e(24);
            g0Var.e(24);
            int d11 = g0Var.d(6) + 1;
            g0Var.e(8);
            int[] iArr = new int[d11];
            for (int i11 = 0; i11 < d11; i11++) {
                iArr[i11] = ((g0Var.c() ? g0Var.d(5) : 0) * 8) + g0Var.d(3);
            }
            for (int i12 = 0; i12 < d11; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        g0Var.e(8);
                    }
                }
            }
        }
    }

    public static b i(p3.a0 a0Var) {
        return j(a0Var, true, true);
    }

    public static b j(p3.a0 a0Var, boolean z10, boolean z11) {
        if (z10) {
            m(3, a0Var, false);
        }
        String z12 = a0Var.z((int) a0Var.s());
        int length = 11 + z12.length();
        long s10 = a0Var.s();
        String[] strArr = new String[(int) s10];
        int i10 = length + 4;
        for (int i11 = 0; i11 < s10; i11++) {
            strArr[i11] = a0Var.z((int) a0Var.s());
            i10 = i10 + 4 + strArr[i11].length();
        }
        if (z11 && (a0Var.C() & 1) == 0) {
            throw h2.a("framing bit expected to be set", null);
        }
        return new b(z12, strArr, i10 + 1);
    }

    public static d k(p3.a0 a0Var) {
        m(1, a0Var, false);
        int t10 = a0Var.t();
        int C = a0Var.C();
        int t11 = a0Var.t();
        int p10 = a0Var.p();
        if (p10 <= 0) {
            p10 = -1;
        }
        int p11 = a0Var.p();
        if (p11 <= 0) {
            p11 = -1;
        }
        int p12 = a0Var.p();
        if (p12 <= 0) {
            p12 = -1;
        }
        int C2 = a0Var.C();
        return new d(t10, C, t11, p10, p11, p12, (int) Math.pow(2.0d, C2 & 15), (int) Math.pow(2.0d, (C2 & 240) >> 4), (a0Var.C() & 1) > 0, Arrays.copyOf(a0Var.d(), a0Var.f()));
    }

    public static c[] l(p3.a0 a0Var, int i10) {
        m(5, a0Var, false);
        int C = a0Var.C() + 1;
        g0 g0Var = new g0(a0Var.d());
        g0Var.e(a0Var.e() * 8);
        for (int i11 = 0; i11 < C; i11++) {
            d(g0Var);
        }
        int d10 = g0Var.d(6) + 1;
        for (int i12 = 0; i12 < d10; i12++) {
            if (g0Var.d(16) != 0) {
                throw h2.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        e(g0Var);
        h(g0Var);
        f(i10, g0Var);
        c[] g10 = g(g0Var);
        if (g0Var.c()) {
            return g10;
        }
        throw h2.a("framing bit after modes not set as expected", null);
    }

    public static boolean m(int i10, p3.a0 a0Var, boolean z10) {
        if (a0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw h2.a("too short header: " + a0Var.a(), null);
        } else if (a0Var.C() != i10) {
            if (z10) {
                return false;
            }
            throw h2.a("expected header type " + Integer.toHexString(i10), null);
        } else if (a0Var.C() == 118 && a0Var.C() == 111 && a0Var.C() == 114 && a0Var.C() == 98 && a0Var.C() == 105 && a0Var.C() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw h2.a("expected characters 'vorbis'", null);
        }
    }
}
