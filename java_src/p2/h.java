package p2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p3.a0;
import p3.m0;
import p3.r;
import p3.z;
/* loaded from: classes.dex */
public final class h extends k2.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12222b = g.f12221a;

    /* renamed from: a  reason: collision with root package name */
    private final a f12223a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f12224a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f12225b;

        /* renamed from: c  reason: collision with root package name */
        private final int f12226c;

        public b(int i10, boolean z10, int i11) {
            this.f12224a = i10;
            this.f12225b = z10;
            this.f12226c = i11;
        }
    }

    public h() {
        this(null);
    }

    public h(a aVar) {
        this.f12223a = aVar;
    }

    private static int A(a0 a0Var, int i10) {
        byte[] d10 = a0Var.d();
        int e10 = a0Var.e();
        int i11 = e10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= e10 + i10) {
                return i10;
            }
            if ((d10[i11] & 255) == 255 && d10[i12] == 0) {
                System.arraycopy(d10, i11 + 2, d10, i12, (i10 - (i11 - e10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean B(p3.a0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.e()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.E()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.I()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.F()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.F()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.O(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.O(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.O(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.O(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.P(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.O(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.O(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.B(p3.a0, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? m0.f12311f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static p2.a f(a0 a0Var, int i10, int i11) {
        int y10;
        String str;
        int C = a0Var.C();
        String v10 = v(C);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        a0Var.j(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + a5.b.e(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            y10 = 2;
        } else {
            y10 = y(bArr, 0);
            String e10 = a5.b.e(new String(bArr, 0, y10, "ISO-8859-1"));
            if (e10.indexOf(47) == -1) {
                str = "image/" + e10;
            } else {
                str = e10;
            }
        }
        int i13 = y10 + 2;
        int x10 = x(bArr, i13, C);
        return new p2.a(str, new String(bArr, i13, x10 - i13, v10), bArr[y10 + 1] & 255, d(bArr, x10 + u(C), i12));
    }

    private static p2.b g(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        return new p2.b(str, bArr);
    }

    private static c h(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int e10 = a0Var.e();
        int y10 = y(a0Var.d(), e10);
        String str = new String(a0Var.d(), e10, y10 - e10, "ISO-8859-1");
        a0Var.O(y10 + 1);
        int m10 = a0Var.m();
        int m11 = a0Var.m();
        long E = a0Var.E();
        long j10 = E == 4294967295L ? -1L : E;
        long E2 = a0Var.E();
        long j11 = E2 == 4294967295L ? -1L : E2;
        ArrayList arrayList = new ArrayList();
        int i13 = e10 + i10;
        while (a0Var.e() < i13) {
            i k10 = k(i11, a0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, m10, m11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int e10 = a0Var.e();
        int y10 = y(a0Var.d(), e10);
        String str = new String(a0Var.d(), e10, y10 - e10, "ISO-8859-1");
        a0Var.O(y10 + 1);
        int C = a0Var.C();
        boolean z11 = (C & 2) != 0;
        boolean z12 = (C & 1) != 0;
        int C2 = a0Var.C();
        String[] strArr = new String[C2];
        for (int i13 = 0; i13 < C2; i13++) {
            int e11 = a0Var.e();
            int y11 = y(a0Var.d(), e11);
            strArr[i13] = new String(a0Var.d(), e11, y11 - e11, "ISO-8859-1");
            a0Var.O(y11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = e10 + i10;
        while (a0Var.e() < i14) {
            i k10 = k(i11, a0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(a0 a0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int C = a0Var.C();
        String v10 = v(C);
        byte[] bArr = new byte[3];
        a0Var.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        a0Var.j(bArr2, 0, i11);
        int x10 = x(bArr2, 0, C);
        String str2 = new String(bArr2, 0, x10, v10);
        int u10 = x10 + u(C);
        return new e(str, str2, p(bArr2, u10, x(bArr2, u10, C), v10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p2.i k(int r19, p3.a0 r20, boolean r21, int r22, p2.h.a r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.k(int, p3.a0, boolean, int, p2.h$a):p2.i");
    }

    private static f l(a0 a0Var, int i10) {
        int C = a0Var.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int y10 = y(bArr, 0);
        String str = new String(bArr, 0, y10, "ISO-8859-1");
        int i12 = y10 + 1;
        int x10 = x(bArr, i12, C);
        String p10 = p(bArr, i12, x10, v10);
        int u10 = x10 + u(C);
        int x11 = x(bArr, u10, C);
        return new f(str, p10, p(bArr, u10, x11, v10), d(bArr, x11 + u(C), i11));
    }

    private static b m(a0 a0Var) {
        StringBuilder sb;
        String str;
        if (a0Var.a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int F = a0Var.F();
            boolean z10 = false;
            if (F == 4801587) {
                int C = a0Var.C();
                a0Var.P(1);
                int C2 = a0Var.C();
                int B = a0Var.B();
                if (C == 2) {
                    if ((C2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (C == 3) {
                    if ((C2 & 64) != 0) {
                        int m10 = a0Var.m();
                        a0Var.P(m10);
                        B -= m10 + 4;
                    }
                } else if (C == 4) {
                    if ((C2 & 64) != 0) {
                        int B2 = a0Var.B();
                        a0Var.P(B2 - 4);
                        B -= B2;
                    }
                    if ((C2 & 16) != 0) {
                        B -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(C);
                }
                if (C < 4 && (C2 & 128) != 0) {
                    z10 = true;
                }
                return new b(C, z10, B);
            }
            sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", Integer.valueOf(F)));
            str = sb.toString();
        }
        r.i("Id3Decoder", str);
        return null;
    }

    private static k n(a0 a0Var, int i10) {
        int I = a0Var.I();
        int F = a0Var.F();
        int F2 = a0Var.F();
        int C = a0Var.C();
        int C2 = a0Var.C();
        z zVar = new z();
        zVar.m(a0Var);
        int i11 = ((i10 - 10) * 8) / (C + C2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = zVar.h(C);
            int h11 = zVar.h(C2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new k(I, F, F2, iArr, iArr2);
    }

    private static l o(a0 a0Var, int i10) {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        int y10 = y(bArr, 0);
        return new l(new String(bArr, 0, y10, "ISO-8859-1"), d(bArr, y10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    private static m q(a0 a0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int C = a0Var.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        return new m(str, null, new String(bArr, 0, x(bArr, 0, C), v10));
    }

    private static m r(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int C = a0Var.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, C);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(C);
        return new m("TXXX", str, p(bArr, u10, x(bArr, u10, C), v10));
    }

    private static n s(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        return new n(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    private static n t(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int C = a0Var.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, C);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(C);
        return new n("WXXX", str, p(bArr, u10, y(bArr, u10), "ISO-8859-1"));
    }

    private static int u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String w(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int x(byte[] bArr, int i10, int i11) {
        int y10 = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return y10;
        }
        while (y10 < bArr.length - 1) {
            if ((y10 - i10) % 2 == 0 && bArr[y10 + 1] == 0) {
                return y10;
            }
            y10 = y(bArr, y10 + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // k2.h
    protected k2.a b(k2.e eVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public k2.a e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        b m10 = m(a0Var);
        if (m10 == null) {
            return null;
        }
        int e10 = a0Var.e();
        int i11 = m10.f12224a == 2 ? 6 : 10;
        int i12 = m10.f12226c;
        if (m10.f12225b) {
            i12 = A(a0Var, m10.f12226c);
        }
        a0Var.N(e10 + i12);
        boolean z10 = false;
        if (!B(a0Var, m10.f12224a, i11, false)) {
            if (m10.f12224a != 4 || !B(a0Var, 4, i11, true)) {
                r.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10.f12224a);
                return null;
            }
            z10 = true;
        }
        while (a0Var.a() >= i11) {
            i k10 = k(m10.f12224a, a0Var, z10, i11, this.f12223a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new k2.a(arrayList);
    }
}
