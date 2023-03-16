package i2;

import android.util.Pair;
import c.j;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.a0;
import p3.m0;
import s1.h2;
import s1.m1;
import u1.l0;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.r;
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: h  reason: collision with root package name */
    public static final r f8240h = i2.a.f8239b;

    /* renamed from: a  reason: collision with root package name */
    private n f8241a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f8242b;

    /* renamed from: e  reason: collision with root package name */
    private InterfaceC0124b f8245e;

    /* renamed from: c  reason: collision with root package name */
    private int f8243c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f8244d = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f8246f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f8247g = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0124b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f8248m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f8249n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, j.H0, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final n f8250a;

        /* renamed from: b  reason: collision with root package name */
        private final e0 f8251b;

        /* renamed from: c  reason: collision with root package name */
        private final i2.c f8252c;

        /* renamed from: d  reason: collision with root package name */
        private final int f8253d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f8254e;

        /* renamed from: f  reason: collision with root package name */
        private final a0 f8255f;

        /* renamed from: g  reason: collision with root package name */
        private final int f8256g;

        /* renamed from: h  reason: collision with root package name */
        private final m1 f8257h;

        /* renamed from: i  reason: collision with root package name */
        private int f8258i;

        /* renamed from: j  reason: collision with root package name */
        private long f8259j;

        /* renamed from: k  reason: collision with root package name */
        private int f8260k;

        /* renamed from: l  reason: collision with root package name */
        private long f8261l;

        public a(n nVar, e0 e0Var, i2.c cVar) {
            this.f8250a = nVar;
            this.f8251b = e0Var;
            this.f8252c = cVar;
            int max = Math.max(1, cVar.f8272c / 10);
            this.f8256g = max;
            a0 a0Var = new a0(cVar.f8276g);
            a0Var.u();
            int u10 = a0Var.u();
            this.f8253d = u10;
            int i10 = cVar.f8271b;
            int i11 = (((cVar.f8274e - (i10 * 4)) * 8) / (cVar.f8275f * i10)) + 1;
            if (u10 == i11) {
                int l10 = m0.l(max, u10);
                this.f8254e = new byte[cVar.f8274e * l10];
                this.f8255f = new a0(l10 * h(u10, i10));
                int i12 = ((cVar.f8272c * cVar.f8274e) * 8) / u10;
                this.f8257h = new m1.b().e0("audio/raw").G(i12).Z(i12).W(h(max, i10)).H(cVar.f8271b).f0(cVar.f8272c).Y(2).E();
                return;
            }
            throw h2.a("Expected frames per block: " + i11 + "; got: " + u10, null);
        }

        private void d(byte[] bArr, int i10, a0 a0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f8252c.f8271b; i12++) {
                    e(bArr, i11, i12, a0Var.d());
                }
            }
            int g10 = g(this.f8253d * i10);
            a0Var.O(0);
            a0Var.N(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            i2.c cVar = this.f8252c;
            int i12 = cVar.f8274e;
            int i13 = cVar.f8271b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f8249n[min];
            int i19 = ((i10 * this.f8253d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = m0.q(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f8248m[i22];
                int[] iArr = f8249n;
                min = m0.q(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f8252c.f8271b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f8252c.f8271b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long M0 = this.f8259j + m0.M0(this.f8261l, 1000000L, this.f8252c.f8272c);
            int g10 = g(i10);
            this.f8251b.c(M0, 1, g10, this.f8260k - g10, null);
            this.f8261l += i10;
            this.f8260k -= g10;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please submit an issue!!! */
        @Override // i2.b.InterfaceC0124b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(x1.m r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f8256g
                int r1 = r6.f8260k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f8253d
                int r0 = p3.m0.l(r0, r1)
                i2.c r1 = r6.f8252c
                int r1 = r1.f8274e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f8258i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f8254e
                int r5 = r6.f8258i
                int r3 = r7.b(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f8258i
                int r4 = r4 + r3
                r6.f8258i = r4
                goto L1e
            L3e:
                int r7 = r6.f8258i
                i2.c r8 = r6.f8252c
                int r8 = r8.f8274e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f8254e
                p3.a0 r9 = r6.f8255f
                r6.d(r8, r7, r9)
                int r8 = r6.f8258i
                i2.c r9 = r6.f8252c
                int r9 = r9.f8274e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f8258i = r8
                p3.a0 r7 = r6.f8255f
                int r7 = r7.f()
                x1.e0 r8 = r6.f8251b
                p3.a0 r9 = r6.f8255f
                r8.d(r9, r7)
                int r8 = r6.f8260k
                int r8 = r8 + r7
                r6.f8260k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f8256g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f8260k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i2.b.a.a(x1.m, long):boolean");
        }

        @Override // i2.b.InterfaceC0124b
        public void b(int i10, long j10) {
            this.f8250a.t(new e(this.f8252c, this.f8253d, i10, j10));
            this.f8251b.e(this.f8257h);
        }

        @Override // i2.b.InterfaceC0124b
        public void c(long j10) {
            this.f8258i = 0;
            this.f8259j = j10;
            this.f8260k = 0;
            this.f8261l = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0124b {
        boolean a(m mVar, long j10);

        void b(int i10, long j10);

        void c(long j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC0124b {

        /* renamed from: a  reason: collision with root package name */
        private final n f8262a;

        /* renamed from: b  reason: collision with root package name */
        private final e0 f8263b;

        /* renamed from: c  reason: collision with root package name */
        private final i2.c f8264c;

        /* renamed from: d  reason: collision with root package name */
        private final m1 f8265d;

        /* renamed from: e  reason: collision with root package name */
        private final int f8266e;

        /* renamed from: f  reason: collision with root package name */
        private long f8267f;

        /* renamed from: g  reason: collision with root package name */
        private int f8268g;

        /* renamed from: h  reason: collision with root package name */
        private long f8269h;

        public c(n nVar, e0 e0Var, i2.c cVar, String str, int i10) {
            this.f8262a = nVar;
            this.f8263b = e0Var;
            this.f8264c = cVar;
            int i11 = (cVar.f8271b * cVar.f8275f) / 8;
            if (cVar.f8274e == i11) {
                int i12 = cVar.f8272c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f8266e = max;
                this.f8265d = new m1.b().e0(str).G(i13).Z(i13).W(max).H(cVar.f8271b).f0(cVar.f8272c).Y(i10).E();
                return;
            }
            throw h2.a("Expected block size: " + i11 + "; got: " + cVar.f8274e, null);
        }

        @Override // i2.b.InterfaceC0124b
        public boolean a(m mVar, long j10) {
            int i10;
            i2.c cVar;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f8268g) >= (i12 = this.f8266e)) {
                    break;
                }
                int f10 = this.f8263b.f(mVar, (int) Math.min(i12 - i11, j11), true);
                if (f10 == -1) {
                    j11 = 0;
                } else {
                    this.f8268g += f10;
                    j11 -= f10;
                }
            }
            int i13 = this.f8264c.f8274e;
            int i14 = this.f8268g / i13;
            if (i14 > 0) {
                int i15 = i14 * i13;
                int i16 = this.f8268g - i15;
                this.f8263b.c(this.f8267f + m0.M0(this.f8269h, 1000000L, cVar.f8272c), 1, i15, i16, null);
                this.f8269h += i14;
                this.f8268g = i16;
            }
            return i10 <= 0;
        }

        @Override // i2.b.InterfaceC0124b
        public void b(int i10, long j10) {
            this.f8262a.t(new e(this.f8264c, 1, i10, j10));
            this.f8263b.e(this.f8265d);
        }

        @Override // i2.b.InterfaceC0124b
        public void c(long j10) {
            this.f8267f = j10;
            this.f8268g = 0;
            this.f8269h = 0L;
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void e() {
        p3.a.h(this.f8242b);
        m0.j(this.f8241a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] f() {
        return new l[]{new b()};
    }

    private void g(m mVar) {
        p3.a.f(mVar.q() == 0);
        int i10 = this.f8246f;
        if (i10 != -1) {
            mVar.h(i10);
            this.f8243c = 4;
        } else if (!d.a(mVar)) {
            throw h2.a("Unsupported or unrecognized wav file type.", null);
        } else {
            mVar.h((int) (mVar.m() - mVar.q()));
            this.f8243c = 1;
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void h(m mVar) {
        InterfaceC0124b cVar;
        i2.c b10 = d.b(mVar);
        int i10 = b10.f8270a;
        if (i10 == 17) {
            cVar = new a(this.f8241a, this.f8242b, b10);
        } else if (i10 == 6) {
            cVar = new c(this.f8241a, this.f8242b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            cVar = new c(this.f8241a, this.f8242b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = l0.a(i10, b10.f8275f);
            if (a10 == 0) {
                throw h2.d("Unsupported WAV format type: " + b10.f8270a);
            }
            cVar = new c(this.f8241a, this.f8242b, b10, "audio/raw", a10);
        }
        this.f8245e = cVar;
        this.f8243c = 3;
    }

    private void k(m mVar) {
        this.f8244d = d.c(mVar);
        this.f8243c = 2;
    }

    private int l(m mVar) {
        p3.a.f(this.f8247g != -1);
        return ((InterfaceC0124b) p3.a.e(this.f8245e)).a(mVar, this.f8247g - mVar.q()) ? -1 : 0;
    }

    private void m(m mVar) {
        Pair<Long, Long> e10 = d.e(mVar);
        this.f8246f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f8244d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f8247g = this.f8246f + longValue;
        long a10 = mVar.a();
        if (a10 != -1 && this.f8247g > a10) {
            p3.r.i("WavExtractor", "Data exceeds input length: " + this.f8247g + ", " + a10);
            this.f8247g = a10;
        }
        ((InterfaceC0124b) p3.a.e(this.f8245e)).b(this.f8246f, this.f8247g);
        this.f8243c = 4;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f8243c = j10 == 0 ? 0 : 4;
        InterfaceC0124b interfaceC0124b = this.f8245e;
        if (interfaceC0124b != null) {
            interfaceC0124b.c(j11);
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f8241a = nVar;
        this.f8242b = nVar.e(0, 1);
        nVar.i();
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        e();
        int i10 = this.f8243c;
        if (i10 == 0) {
            g(mVar);
            return 0;
        } else if (i10 == 1) {
            k(mVar);
            return 0;
        } else if (i10 == 2) {
            h(mVar);
            return 0;
        } else if (i10 == 3) {
            m(mVar);
            return 0;
        } else if (i10 == 4) {
            return l(mVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        return d.a(mVar);
    }
}
