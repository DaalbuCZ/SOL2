package u1;

import java.nio.ByteBuffer;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f14878a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f14879b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f14880c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f14881d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f14882e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f14883f = {69, 87, 104, c.j.K0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: u1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0220b {

        /* renamed from: a  reason: collision with root package name */
        public final String f14884a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14885b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14886c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14887d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14888e;

        /* renamed from: f  reason: collision with root package name */
        public final int f14889f;

        private C0220b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f14884a = str;
            this.f14885b = i10;
            this.f14887d = i11;
            this.f14886c = i12;
            this.f14888e = i13;
            this.f14889f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((m0.I(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = f14879b;
            if (i10 >= iArr.length || i11 < 0) {
                return -1;
            }
            int[] iArr2 = f14883f;
            if (i12 >= iArr2.length) {
                return -1;
            }
            int i13 = iArr[i10];
            if (i13 == 44100) {
                return (iArr2[i12] + (i11 % 2)) * 2;
            }
            int i14 = f14882e[i12];
            return i13 == 32000 ? i14 * 6 : i14 * 4;
        }
        return -1;
    }

    public static m1 c(p3.a0 a0Var, String str, String str2, w1.m mVar) {
        int i10 = f14879b[(a0Var.C() & 192) >> 6];
        int C = a0Var.C();
        int i11 = f14881d[(C & 56) >> 3];
        if ((C & 4) != 0) {
            i11++;
        }
        return new m1.b().S(str).e0("audio/ac3").H(i11).f0(i10).M(mVar).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f14878a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0220b e(p3.z zVar) {
        int b10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int h10;
        int i14;
        int i15;
        int i16;
        int i17;
        int e10 = zVar.e();
        zVar.r(40);
        boolean z10 = zVar.h(5) > 10;
        zVar.p(e10);
        int i18 = -1;
        if (z10) {
            zVar.r(16);
            int h11 = zVar.h(2);
            if (h11 == 0) {
                i18 = 0;
            } else if (h11 == 1) {
                i18 = 1;
            } else if (h11 == 2) {
                i18 = 2;
            }
            zVar.r(3);
            b10 = (zVar.h(11) + 1) * 2;
            int h12 = zVar.h(2);
            if (h12 == 3) {
                i10 = f14880c[zVar.h(2)];
                i14 = 6;
                h10 = 3;
            } else {
                h10 = zVar.h(2);
                i14 = f14878a[h10];
                i10 = f14879b[h12];
            }
            i11 = i14 * 256;
            int h13 = zVar.h(3);
            boolean g10 = zVar.g();
            i12 = f14881d[h13] + (g10 ? 1 : 0);
            zVar.r(10);
            if (zVar.g()) {
                zVar.r(8);
            }
            if (h13 == 0) {
                zVar.r(5);
                if (zVar.g()) {
                    zVar.r(8);
                }
            }
            if (i18 == 1 && zVar.g()) {
                zVar.r(16);
            }
            if (zVar.g()) {
                if (h13 > 2) {
                    zVar.r(2);
                }
                if ((h13 & 1) == 0 || h13 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    zVar.r(6);
                }
                if ((h13 & 4) != 0) {
                    zVar.r(i16);
                }
                if (g10 && zVar.g()) {
                    zVar.r(5);
                }
                if (i18 == 0) {
                    if (zVar.g()) {
                        i17 = 6;
                        zVar.r(6);
                    } else {
                        i17 = 6;
                    }
                    if (h13 == 0 && zVar.g()) {
                        zVar.r(i17);
                    }
                    if (zVar.g()) {
                        zVar.r(i17);
                    }
                    int h14 = zVar.h(2);
                    if (h14 == 1) {
                        zVar.r(5);
                    } else if (h14 == 2) {
                        zVar.r(12);
                    } else if (h14 == 3) {
                        int h15 = zVar.h(5);
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(7);
                                if (zVar.g()) {
                                    zVar.r(8);
                                }
                            }
                        }
                        zVar.r((h15 + 2) * 8);
                        zVar.c();
                    }
                    if (h13 < 2) {
                        if (zVar.g()) {
                            zVar.r(14);
                        }
                        if (h13 == 0 && zVar.g()) {
                            zVar.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (h10 == 0) {
                            zVar.r(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (zVar.g()) {
                                    zVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar.r(5);
                if (h13 == 2) {
                    zVar.r(4);
                }
                if (h13 >= 6) {
                    zVar.r(2);
                }
                if (zVar.g()) {
                    zVar.r(8);
                }
                if (h13 == 0 && zVar.g()) {
                    zVar.r(8);
                }
                if (h12 < 3) {
                    zVar.q();
                }
            }
            if (i18 == 0 && h10 != 3) {
                zVar.q();
            }
            if (i18 == 2 && (h10 == 3 || zVar.g())) {
                i15 = 6;
                zVar.r(6);
            } else {
                i15 = 6;
            }
            str = (zVar.g() && zVar.h(i15) == 1 && zVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i18;
        } else {
            zVar.r(32);
            int h16 = zVar.h(2);
            String str2 = h16 == 3 ? null : "audio/ac3";
            b10 = b(h16, zVar.h(6));
            zVar.r(8);
            int h17 = zVar.h(3);
            if ((h17 & 1) != 0 && h17 != 1) {
                zVar.r(2);
            }
            if ((h17 & 4) != 0) {
                zVar.r(2);
            }
            if (h17 == 2) {
                zVar.r(2);
            }
            int[] iArr = f14879b;
            i10 = h16 < iArr.length ? iArr[h16] : -1;
            i11 = 1536;
            i12 = f14881d[h17] + (zVar.g() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new C0220b(str, i13, i12, i10, b10, i11);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static m1 g(p3.a0 a0Var, String str, String str2, w1.m mVar) {
        a0Var.P(2);
        int i10 = f14879b[(a0Var.C() & 192) >> 6];
        int C = a0Var.C();
        int i11 = f14881d[(C & 14) >> 1];
        if ((C & 1) != 0) {
            i11++;
        }
        if (((a0Var.C() & 30) >> 1) > 0 && (2 & a0Var.C()) != 0) {
            i11 += 2;
        }
        return new m1.b().S(str).e0((a0Var.a() <= 0 || (a0Var.C() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i11).f0(i10).M(mVar).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
