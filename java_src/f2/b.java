package f2;

import android.util.Pair;
import f2.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.a;
import p3.a0;
import p3.m0;
import p3.v;
import s1.m1;
import x1.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f7001a = m0.l0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7002a;

        /* renamed from: b  reason: collision with root package name */
        public int f7003b;

        /* renamed from: c  reason: collision with root package name */
        public int f7004c;

        /* renamed from: d  reason: collision with root package name */
        public long f7005d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f7006e;

        /* renamed from: f  reason: collision with root package name */
        private final a0 f7007f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f7008g;

        /* renamed from: h  reason: collision with root package name */
        private int f7009h;

        /* renamed from: i  reason: collision with root package name */
        private int f7010i;

        public a(a0 a0Var, a0 a0Var2, boolean z10) {
            this.f7008g = a0Var;
            this.f7007f = a0Var2;
            this.f7006e = z10;
            a0Var2.O(12);
            this.f7002a = a0Var2.G();
            a0Var.O(12);
            this.f7010i = a0Var.G();
            x1.o.a(a0Var.m() == 1, "first_chunk must be 1");
            this.f7003b = -1;
        }

        public boolean a() {
            int i10 = this.f7003b + 1;
            this.f7003b = i10;
            if (i10 == this.f7002a) {
                return false;
            }
            this.f7005d = this.f7006e ? this.f7007f.H() : this.f7007f.E();
            if (this.f7003b == this.f7009h) {
                this.f7004c = this.f7008g.G();
                this.f7008g.P(4);
                int i11 = this.f7010i - 1;
                this.f7010i = i11;
                this.f7009h = i11 > 0 ? this.f7008g.G() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0105b {

        /* renamed from: a  reason: collision with root package name */
        private final String f7011a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f7012b;

        /* renamed from: c  reason: collision with root package name */
        private final long f7013c;

        /* renamed from: d  reason: collision with root package name */
        private final long f7014d;

        public C0105b(String str, byte[] bArr, long j10, long j11) {
            this.f7011a = str;
            this.f7012b = bArr;
            this.f7013c = j10;
            this.f7014d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final p[] f7015a;

        /* renamed from: b  reason: collision with root package name */
        public m1 f7016b;

        /* renamed from: c  reason: collision with root package name */
        public int f7017c;

        /* renamed from: d  reason: collision with root package name */
        public int f7018d = 0;

        public d(int i10) {
            this.f7015a = new p[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f7019a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7020b;

        /* renamed from: c  reason: collision with root package name */
        private final a0 f7021c;

        public e(a.b bVar, m1 m1Var) {
            a0 a0Var = bVar.f7000b;
            this.f7021c = a0Var;
            a0Var.O(12);
            int G = a0Var.G();
            if ("audio/raw".equals(m1Var.f13587y)) {
                int d02 = m0.d0(m1Var.N, m1Var.L);
                if (G == 0 || G % d02 != 0) {
                    p3.r.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + d02 + ", stsz sample size: " + G);
                    G = d02;
                }
            }
            this.f7019a = G == 0 ? -1 : G;
            this.f7020b = a0Var.G();
        }

        @Override // f2.b.c
        public int a() {
            return this.f7019a;
        }

        @Override // f2.b.c
        public int b() {
            return this.f7020b;
        }

        @Override // f2.b.c
        public int c() {
            int i10 = this.f7019a;
            return i10 == -1 ? this.f7021c.G() : i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f7022a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7023b;

        /* renamed from: c  reason: collision with root package name */
        private final int f7024c;

        /* renamed from: d  reason: collision with root package name */
        private int f7025d;

        /* renamed from: e  reason: collision with root package name */
        private int f7026e;

        public f(a.b bVar) {
            a0 a0Var = bVar.f7000b;
            this.f7022a = a0Var;
            a0Var.O(12);
            this.f7024c = a0Var.G() & 255;
            this.f7023b = a0Var.G();
        }

        @Override // f2.b.c
        public int a() {
            return -1;
        }

        @Override // f2.b.c
        public int b() {
            return this.f7023b;
        }

        @Override // f2.b.c
        public int c() {
            int i10 = this.f7024c;
            if (i10 == 8) {
                return this.f7022a.C();
            }
            if (i10 == 16) {
                return this.f7022a.I();
            }
            int i11 = this.f7025d;
            this.f7025d = i11 + 1;
            if (i11 % 2 == 0) {
                int C = this.f7022a.C();
                this.f7026e = C;
                return (C & 240) >> 4;
            }
            return this.f7026e & 15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final int f7027a;

        /* renamed from: b  reason: collision with root package name */
        private final long f7028b;

        /* renamed from: c  reason: collision with root package name */
        private final int f7029c;

        public g(int i10, long j10, int i11) {
            this.f7027a = i10;
            this.f7028b = j10;
            this.f7029c = i11;
        }
    }

    public static List<r> A(a.C0104a c0104a, x xVar, long j10, w1.m mVar, boolean z10, boolean z11, a5.f<o, o> fVar) {
        o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0104a.f6999d.size(); i10++) {
            a.C0104a c0104a2 = c0104a.f6999d.get(i10);
            if (c0104a2.f6996a == 1953653099 && (apply = fVar.apply(z(c0104a2, (a.b) p3.a.e(c0104a.g(1836476516)), j10, mVar, z10, z11))) != null) {
                arrayList.add(v(apply, (a.C0104a) p3.a.e(((a.C0104a) p3.a.e(((a.C0104a) p3.a.e(c0104a2.f(1835297121))).f(1835626086))).f(1937007212)), xVar));
            }
        }
        return arrayList;
    }

    public static Pair<k2.a, k2.a> B(a.b bVar) {
        a0 a0Var = bVar.f7000b;
        a0Var.O(8);
        k2.a aVar = null;
        k2.a aVar2 = null;
        while (a0Var.a() >= 8) {
            int e10 = a0Var.e();
            int m10 = a0Var.m();
            int m11 = a0Var.m();
            if (m11 == 1835365473) {
                a0Var.O(e10);
                aVar = C(a0Var, e10 + m10);
            } else if (m11 == 1936553057) {
                a0Var.O(e10);
                aVar2 = u(a0Var, e10 + m10);
            }
            a0Var.O(e10 + m10);
        }
        return Pair.create(aVar, aVar2);
    }

    private static k2.a C(a0 a0Var, int i10) {
        a0Var.P(8);
        e(a0Var);
        while (a0Var.e() < i10) {
            int e10 = a0Var.e();
            int m10 = a0Var.m();
            if (a0Var.m() == 1768715124) {
                a0Var.O(e10);
                return l(a0Var, e10 + m10);
            }
            a0Var.O(e10 + m10);
        }
        return null;
    }

    private static void D(a0 a0Var, int i10, int i11, int i12, int i13, int i14, w1.m mVar, d dVar, int i15) {
        w1.m mVar2;
        int i16;
        int i17;
        byte[] bArr;
        float f10;
        List<byte[]> list;
        String str;
        int i18 = i11;
        int i19 = i12;
        w1.m mVar3 = mVar;
        d dVar2 = dVar;
        a0Var.O(i18 + 8 + 8);
        a0Var.P(16);
        int I = a0Var.I();
        int I2 = a0Var.I();
        a0Var.P(50);
        int e10 = a0Var.e();
        int i20 = i10;
        if (i20 == 1701733238) {
            Pair<Integer, p> s10 = s(a0Var, i18, i19);
            if (s10 != null) {
                i20 = ((Integer) s10.first).intValue();
                mVar3 = mVar3 == null ? null : mVar3.c(((p) s10.second).f7140b);
                dVar2.f7015a[i15] = (p) s10.second;
            }
            a0Var.O(e10);
        }
        String str2 = "video/3gpp";
        String str3 = i20 == 1831958048 ? "video/mpeg" : i20 == 1211250227 ? "video/3gpp" : null;
        float f11 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        ByteBuffer byteBuffer = null;
        C0105b c0105b = null;
        boolean z10 = false;
        while (true) {
            if (e10 - i18 >= i19) {
                mVar2 = mVar3;
                break;
            }
            a0Var.O(e10);
            int e11 = a0Var.e();
            String str5 = str2;
            int m10 = a0Var.m();
            if (m10 == 0) {
                mVar2 = mVar3;
                if (a0Var.e() - i18 == i19) {
                    break;
                }
            } else {
                mVar2 = mVar3;
            }
            x1.o.a(m10 > 0, "childAtomSize must be positive");
            int m11 = a0Var.m();
            if (m11 == 1635148611) {
                x1.o.a(str3 == null, null);
                a0Var.O(e11 + 8);
                q3.a b10 = q3.a.b(a0Var);
                list2 = b10.f12557a;
                dVar2.f7017c = b10.f12558b;
                if (!z10) {
                    f11 = b10.f12561e;
                }
                str4 = b10.f12562f;
                str = "video/avc";
            } else if (m11 == 1752589123) {
                x1.o.a(str3 == null, null);
                a0Var.O(e11 + 8);
                q3.f a10 = q3.f.a(a0Var);
                list2 = a10.f12587a;
                dVar2.f7017c = a10.f12588b;
                if (!z10) {
                    f11 = a10.f12591e;
                }
                str4 = a10.f12592f;
                str = "video/hevc";
            } else {
                if (m11 == 1685480259 || m11 == 1685485123) {
                    i16 = I2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    q3.d a11 = q3.d.a(a0Var);
                    if (a11 != null) {
                        str4 = a11.f12572c;
                        str3 = "video/dolby-vision";
                    }
                } else if (m11 == 1987076931) {
                    x1.o.a(str3 == null, null);
                    str = i20 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (m11 == 1635135811) {
                    x1.o.a(str3 == null, null);
                    str = "video/av01";
                } else if (m11 == 1668050025) {
                    ByteBuffer a12 = byteBuffer == null ? a() : byteBuffer;
                    a12.position(21);
                    a12.putShort(a0Var.y());
                    a12.putShort(a0Var.y());
                    byteBuffer = a12;
                    i16 = I2;
                    i17 = i20;
                    e10 += m10;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i20 = i17;
                    I2 = i16;
                } else if (m11 == 1835295606) {
                    ByteBuffer a13 = byteBuffer == null ? a() : byteBuffer;
                    short y10 = a0Var.y();
                    short y11 = a0Var.y();
                    short y12 = a0Var.y();
                    i17 = i20;
                    short y13 = a0Var.y();
                    short y14 = a0Var.y();
                    List<byte[]> list3 = list2;
                    short y15 = a0Var.y();
                    byte[] bArr3 = bArr2;
                    short y16 = a0Var.y();
                    float f12 = f11;
                    short y17 = a0Var.y();
                    long E = a0Var.E();
                    long E2 = a0Var.E();
                    i16 = I2;
                    a13.position(1);
                    a13.putShort(y14);
                    a13.putShort(y15);
                    a13.putShort(y10);
                    a13.putShort(y11);
                    a13.putShort(y12);
                    a13.putShort(y13);
                    a13.putShort(y16);
                    a13.putShort(y17);
                    a13.putShort((short) (E / 10000));
                    a13.putShort((short) (E2 / 10000));
                    byteBuffer = a13;
                    list2 = list3;
                    bArr2 = bArr3;
                    f11 = f12;
                    e10 += m10;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i20 = i17;
                    I2 = i16;
                } else {
                    i16 = I2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    if (m11 == 1681012275) {
                        x1.o.a(str3 == null, null);
                        str3 = str5;
                    } else if (m11 == 1702061171) {
                        x1.o.a(str3 == null, null);
                        c0105b = i(a0Var, e11);
                        String str6 = c0105b.f7011a;
                        byte[] bArr4 = c0105b.f7012b;
                        list2 = bArr4 != null ? b5.q.K(bArr4) : list;
                        str3 = str6;
                        bArr2 = bArr;
                        f11 = f10;
                        e10 += m10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        I2 = i16;
                    } else if (m11 == 1885434736) {
                        f11 = q(a0Var, e11);
                        list2 = list;
                        bArr2 = bArr;
                        z10 = true;
                        e10 += m10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        I2 = i16;
                    } else if (m11 == 1937126244) {
                        bArr2 = r(a0Var, e11, m10);
                        list2 = list;
                        f11 = f10;
                        e10 += m10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        I2 = i16;
                    } else if (m11 == 1936995172) {
                        int C = a0Var.C();
                        a0Var.P(3);
                        if (C == 0) {
                            int C2 = a0Var.C();
                            if (C2 == 0) {
                                i21 = 0;
                            } else if (C2 == 1) {
                                i21 = 1;
                            } else if (C2 == 2) {
                                i21 = 2;
                            } else if (C2 == 3) {
                                i21 = 3;
                            }
                        }
                    } else if (m11 == 1668246642) {
                        int m12 = a0Var.m();
                        if (m12 == 1852009592 || m12 == 1852009571) {
                            int I3 = a0Var.I();
                            int I4 = a0Var.I();
                            a0Var.P(2);
                            boolean z11 = m10 == 19 && (a0Var.C() & 128) != 0;
                            i22 = q3.c.b(I3);
                            i23 = z11 ? 1 : 2;
                            i24 = q3.c.c(I4);
                        } else {
                            p3.r.i("AtomParsers", "Unsupported color type: " + f2.a.a(m12));
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f11 = f10;
                e10 += m10;
                i18 = i11;
                i19 = i12;
                dVar2 = dVar;
                str2 = str5;
                mVar3 = mVar2;
                i20 = i17;
                I2 = i16;
            }
            str3 = str;
            i16 = I2;
            i17 = i20;
            e10 += m10;
            i18 = i11;
            i19 = i12;
            dVar2 = dVar;
            str2 = str5;
            mVar3 = mVar2;
            i20 = i17;
            I2 = i16;
        }
        int i25 = I2;
        byte[] bArr5 = bArr2;
        float f13 = f11;
        List<byte[]> list4 = list2;
        if (str3 == null) {
            return;
        }
        m1.b M = new m1.b().R(i13).e0(str3).I(str4).j0(I).Q(i25).a0(f13).d0(i14).b0(bArr5).h0(i21).T(list4).M(mVar2);
        int i26 = i22;
        int i27 = i23;
        int i28 = i24;
        if (i26 != -1 || i27 != -1 || i28 != -1 || byteBuffer != null) {
            M.J(new q3.c(i26, i27, i28, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c0105b != null) {
            M.G(d5.d.j(c0105b.f7013c)).Z(d5.d.j(c0105b.f7014d));
        }
        dVar.f7016b = M.E();
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[m0.q(4, 0, length)] && jArr[m0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(a0 a0Var, int i10, int i11, int i12) {
        int e10 = a0Var.e();
        x1.o.a(e10 >= i11, null);
        while (e10 - i11 < i12) {
            a0Var.O(e10);
            int m10 = a0Var.m();
            x1.o.a(m10 > 0, "childAtomSize must be positive");
            if (a0Var.m() == i10) {
                return e10;
            }
            e10 += m10;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(a0 a0Var) {
        int e10 = a0Var.e();
        a0Var.P(4);
        if (a0Var.m() != 1751411826) {
            e10 += 4;
        }
        a0Var.O(e10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(p3.a0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, w1.m r29, f2.b.d r30, int r31) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.f(p3.a0, int, int, int, int, java.lang.String, boolean, w1.m, f2.b$d, int):void");
    }

    static Pair<Integer, p> g(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        String str = null;
        Integer num = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            a0Var.O(i12);
            int m10 = a0Var.m();
            int m11 = a0Var.m();
            if (m11 == 1718775137) {
                num = Integer.valueOf(a0Var.m());
            } else if (m11 == 1935894637) {
                a0Var.P(4);
                str = a0Var.z(4);
            } else if (m11 == 1935894633) {
                i13 = i12;
                i14 = m10;
            }
            i12 += m10;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            x1.o.a(num != null, "frma atom is mandatory");
            x1.o.a(i13 != -1, "schi atom is mandatory");
            p t10 = t(a0Var, i13, i14, str);
            x1.o.a(t10 != null, "tenc atom is mandatory");
            return Pair.create(num, (p) m0.j(t10));
        }
        return null;
    }

    private static Pair<long[], long[]> h(a.C0104a c0104a) {
        a.b g10 = c0104a.g(1701606260);
        if (g10 == null) {
            return null;
        }
        a0 a0Var = g10.f7000b;
        a0Var.O(8);
        int c10 = f2.a.c(a0Var.m());
        int G = a0Var.G();
        long[] jArr = new long[G];
        long[] jArr2 = new long[G];
        for (int i10 = 0; i10 < G; i10++) {
            jArr[i10] = c10 == 1 ? a0Var.H() : a0Var.E();
            jArr2[i10] = c10 == 1 ? a0Var.v() : a0Var.m();
            if (a0Var.y() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            a0Var.P(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0105b i(a0 a0Var, int i10) {
        a0Var.O(i10 + 8 + 4);
        a0Var.P(1);
        j(a0Var);
        a0Var.P(2);
        int C = a0Var.C();
        if ((C & 128) != 0) {
            a0Var.P(2);
        }
        if ((C & 64) != 0) {
            a0Var.P(a0Var.C());
        }
        if ((C & 32) != 0) {
            a0Var.P(2);
        }
        a0Var.P(1);
        j(a0Var);
        String h10 = v.h(a0Var.C());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return new C0105b(h10, null, -1L, -1L);
        }
        a0Var.P(4);
        long E = a0Var.E();
        long E2 = a0Var.E();
        a0Var.P(1);
        int j10 = j(a0Var);
        byte[] bArr = new byte[j10];
        a0Var.j(bArr, 0, j10);
        return new C0105b(h10, bArr, E2 > 0 ? E2 : -1L, E > 0 ? E : -1L);
    }

    private static int j(a0 a0Var) {
        int C = a0Var.C();
        int i10 = C & 127;
        while ((C & 128) == 128) {
            C = a0Var.C();
            i10 = (i10 << 7) | (C & 127);
        }
        return i10;
    }

    private static int k(a0 a0Var) {
        a0Var.O(16);
        return a0Var.m();
    }

    private static k2.a l(a0 a0Var, int i10) {
        a0Var.P(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.e() < i10) {
            a.b c10 = h.c(a0Var);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k2.a(arrayList);
    }

    private static Pair<Long, String> m(a0 a0Var) {
        a0Var.O(8);
        int c10 = f2.a.c(a0Var.m());
        a0Var.P(c10 == 0 ? 8 : 16);
        long E = a0Var.E();
        a0Var.P(c10 == 0 ? 4 : 8);
        int I = a0Var.I();
        return Pair.create(Long.valueOf(E), "" + ((char) (((I >> 10) & 31) + 96)) + ((char) (((I >> 5) & 31) + 96)) + ((char) ((I & 31) + 96)));
    }

    public static k2.a n(a.C0104a c0104a) {
        a.b g10 = c0104a.g(1751411826);
        a.b g11 = c0104a.g(1801812339);
        a.b g12 = c0104a.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || k(g10.f7000b) != 1835299937) {
            return null;
        }
        a0 a0Var = g11.f7000b;
        a0Var.O(12);
        int m10 = a0Var.m();
        String[] strArr = new String[m10];
        for (int i10 = 0; i10 < m10; i10++) {
            int m11 = a0Var.m();
            a0Var.P(4);
            strArr[i10] = a0Var.z(m11 - 8);
        }
        a0 a0Var2 = g12.f7000b;
        a0Var2.O(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.a() > 8) {
            int e10 = a0Var2.e();
            int m12 = a0Var2.m();
            int m13 = a0Var2.m() - 1;
            if (m13 < 0 || m13 >= m10) {
                p3.r.i("AtomParsers", "Skipped metadata with unknown key index: " + m13);
            } else {
                q2.a f10 = h.f(a0Var2, e10 + m12, strArr[m13]);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            a0Var2.O(e10 + m12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k2.a(arrayList);
    }

    private static void o(a0 a0Var, int i10, int i11, int i12, d dVar) {
        a0Var.O(i11 + 8 + 8);
        if (i10 == 1835365492) {
            a0Var.w();
            String w10 = a0Var.w();
            if (w10 != null) {
                dVar.f7016b = new m1.b().R(i12).e0(w10).E();
            }
        }
    }

    private static long p(a0 a0Var) {
        a0Var.O(8);
        a0Var.P(f2.a.c(a0Var.m()) != 0 ? 16 : 8);
        return a0Var.E();
    }

    private static float q(a0 a0Var, int i10) {
        a0Var.O(i10 + 8);
        return a0Var.G() / a0Var.G();
    }

    private static byte[] r(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            a0Var.O(i12);
            int m10 = a0Var.m();
            if (a0Var.m() == 1886547818) {
                return Arrays.copyOfRange(a0Var.d(), i12, m10 + i12);
            }
            i12 += m10;
        }
        return null;
    }

    private static Pair<Integer, p> s(a0 a0Var, int i10, int i11) {
        Pair<Integer, p> g10;
        int e10 = a0Var.e();
        while (e10 - i10 < i11) {
            a0Var.O(e10);
            int m10 = a0Var.m();
            x1.o.a(m10 > 0, "childAtomSize must be positive");
            if (a0Var.m() == 1936289382 && (g10 = g(a0Var, e10, m10)) != null) {
                return g10;
            }
            e10 += m10;
        }
        return null;
    }

    private static p t(a0 a0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            a0Var.O(i14);
            int m10 = a0Var.m();
            if (a0Var.m() == 1952804451) {
                int c10 = f2.a.c(a0Var.m());
                a0Var.P(1);
                if (c10 == 0) {
                    a0Var.P(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int C = a0Var.C();
                    i12 = C & 15;
                    i13 = (C & 240) >> 4;
                }
                boolean z10 = a0Var.C() == 1;
                int C2 = a0Var.C();
                byte[] bArr2 = new byte[16];
                a0Var.j(bArr2, 0, 16);
                if (z10 && C2 == 0) {
                    int C3 = a0Var.C();
                    bArr = new byte[C3];
                    a0Var.j(bArr, 0, C3);
                }
                return new p(z10, str, C2, bArr2, i13, i12, bArr);
            }
            i14 += m10;
        }
    }

    private static k2.a u(a0 a0Var, int i10) {
        a0Var.P(12);
        while (a0Var.e() < i10) {
            int e10 = a0Var.e();
            int m10 = a0Var.m();
            if (a0Var.m() == 1935766900) {
                if (m10 < 14) {
                    return null;
                }
                a0Var.P(5);
                int C = a0Var.C();
                if (C == 12 || C == 13) {
                    float f10 = C == 12 ? 240.0f : 120.0f;
                    a0Var.P(1);
                    return new k2.a(new q2.e(f10, a0Var.C()));
                }
                return null;
            }
            a0Var.O(e10 + m10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0435 A[EDGE_INSN: B:210:0x0435->B:169:0x0435 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static f2.r v(f2.o r38, f2.a.C0104a r39, x1.x r40) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.v(f2.o, f2.a$a, x1.x):f2.r");
    }

    private static d w(a0 a0Var, int i10, int i11, String str, w1.m mVar, boolean z10) {
        int i12;
        a0Var.O(12);
        int m10 = a0Var.m();
        d dVar = new d(m10);
        for (int i13 = 0; i13 < m10; i13++) {
            int e10 = a0Var.e();
            int m11 = a0Var.m();
            x1.o.a(m11 > 0, "childAtomSize must be positive");
            int m12 = a0Var.m();
            if (m12 == 1635148593 || m12 == 1635148595 || m12 == 1701733238 || m12 == 1831958048 || m12 == 1836070006 || m12 == 1752589105 || m12 == 1751479857 || m12 == 1932670515 || m12 == 1211250227 || m12 == 1987063864 || m12 == 1987063865 || m12 == 1635135537 || m12 == 1685479798 || m12 == 1685479729 || m12 == 1685481573 || m12 == 1685481521) {
                i12 = e10;
                D(a0Var, m12, i12, m11, i10, i11, mVar, dVar, i13);
            } else if (m12 == 1836069985 || m12 == 1701733217 || m12 == 1633889587 || m12 == 1700998451 || m12 == 1633889588 || m12 == 1835823201 || m12 == 1685353315 || m12 == 1685353317 || m12 == 1685353320 || m12 == 1685353324 || m12 == 1685353336 || m12 == 1935764850 || m12 == 1935767394 || m12 == 1819304813 || m12 == 1936684916 || m12 == 1953984371 || m12 == 778924082 || m12 == 778924083 || m12 == 1835557169 || m12 == 1835560241 || m12 == 1634492771 || m12 == 1634492791 || m12 == 1970037111 || m12 == 1332770163 || m12 == 1716281667) {
                i12 = e10;
                f(a0Var, m12, e10, m11, i10, str, z10, mVar, dVar, i13);
            } else {
                if (m12 == 1414810956 || m12 == 1954034535 || m12 == 2004251764 || m12 == 1937010800 || m12 == 1664495672) {
                    x(a0Var, m12, e10, m11, i10, str, dVar);
                } else if (m12 == 1835365492) {
                    o(a0Var, m12, e10, i10, dVar);
                } else if (m12 == 1667329389) {
                    dVar.f7016b = new m1.b().R(i10).e0("application/x-camera-motion").E();
                }
                i12 = e10;
            }
            a0Var.O(i12 + m11);
        }
        return dVar;
    }

    private static void x(a0 a0Var, int i10, int i11, int i12, int i13, String str, d dVar) {
        a0Var.O(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        b5.q qVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                a0Var.j(bArr, 0, i14);
                qVar = b5.q.K(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 != 1664495672) {
                throw new IllegalStateException();
            } else {
                dVar.f7018d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f7016b = new m1.b().R(i13).e0(str2).V(str).i0(j10).T(qVar).E();
    }

    private static g y(a0 a0Var) {
        boolean z10;
        a0Var.O(8);
        int c10 = f2.a.c(a0Var.m());
        a0Var.P(c10 == 0 ? 8 : 16);
        int m10 = a0Var.m();
        a0Var.P(4);
        int e10 = a0Var.e();
        int i10 = c10 == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (a0Var.d()[e10 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            a0Var.P(i10);
        } else {
            long E = c10 == 0 ? a0Var.E() : a0Var.H();
            if (E != 0) {
                j10 = E;
            }
        }
        a0Var.P(16);
        int m11 = a0Var.m();
        int m12 = a0Var.m();
        a0Var.P(4);
        int m13 = a0Var.m();
        int m14 = a0Var.m();
        if (m11 == 0 && m12 == 65536 && m13 == -65536 && m14 == 0) {
            i11 = 90;
        } else if (m11 == 0 && m12 == -65536 && m13 == 65536 && m14 == 0) {
            i11 = 270;
        } else if (m11 == -65536 && m12 == 0 && m13 == 0 && m14 == -65536) {
            i11 = 180;
        }
        return new g(m10, j10, i11);
    }

    private static o z(a.C0104a c0104a, a.b bVar, long j10, w1.m mVar, boolean z10, boolean z11) {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0104a f10;
        Pair<long[], long[]> h10;
        a.C0104a c0104a2 = (a.C0104a) p3.a.e(c0104a.f(1835297121));
        int d10 = d(k(((a.b) p3.a.e(c0104a2.g(1751411826))).f7000b));
        if (d10 == -1) {
            return null;
        }
        g y10 = y(((a.b) p3.a.e(c0104a.g(1953196132))).f7000b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = y10.f7028b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long p10 = p(bVar2.f7000b);
        long M0 = j11 != -9223372036854775807L ? m0.M0(j11, 1000000L, p10) : -9223372036854775807L;
        Pair<Long, String> m10 = m(((a.b) p3.a.e(c0104a2.g(1835296868))).f7000b);
        d w10 = w(((a.b) p3.a.e(((a.C0104a) p3.a.e(((a.C0104a) p3.a.e(c0104a2.f(1835626086))).f(1937007212))).g(1937011556))).f7000b, y10.f7027a, y10.f7029c, (String) m10.second, mVar, z11);
        if (z10 || (f10 = c0104a.f(1701082227)) == null || (h10 = h(f10)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            jArr2 = (long[]) h10.second;
            jArr = (long[]) h10.first;
        }
        if (w10.f7016b == null) {
            return null;
        }
        return new o(y10.f7027a, d10, ((Long) m10.first).longValue(), p10, M0, w10.f7016b, w10.f7018d, w10.f7015a, w10.f7017c, jArr, jArr2);
    }
}
