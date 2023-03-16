package u2;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o3.b;
import u2.m0;
import x1.e0;
/* loaded from: classes.dex */
class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final o3.b f15259a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15260b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f15261c;

    /* renamed from: d  reason: collision with root package name */
    private a f15262d;

    /* renamed from: e  reason: collision with root package name */
    private a f15263e;

    /* renamed from: f  reason: collision with root package name */
    private a f15264f;

    /* renamed from: g  reason: collision with root package name */
    private long f15265g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f15266a;

        /* renamed from: b  reason: collision with root package name */
        public long f15267b;

        /* renamed from: c  reason: collision with root package name */
        public o3.a f15268c;

        /* renamed from: d  reason: collision with root package name */
        public a f15269d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // o3.b.a
        public o3.a a() {
            return (o3.a) p3.a.e(this.f15268c);
        }

        public a b() {
            this.f15268c = null;
            a aVar = this.f15269d;
            this.f15269d = null;
            return aVar;
        }

        public void c(o3.a aVar, a aVar2) {
            this.f15268c = aVar;
            this.f15269d = aVar2;
        }

        public void d(long j10, int i10) {
            p3.a.f(this.f15268c == null);
            this.f15266a = j10;
            this.f15267b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f15266a)) + this.f15268c.f11927b;
        }

        @Override // o3.b.a
        public b.a next() {
            a aVar = this.f15269d;
            if (aVar == null || aVar.f15268c == null) {
                return null;
            }
            return aVar;
        }
    }

    public k0(o3.b bVar) {
        this.f15259a = bVar;
        int e10 = bVar.e();
        this.f15260b = e10;
        this.f15261c = new p3.a0(32);
        a aVar = new a(0L, e10);
        this.f15262d = aVar;
        this.f15263e = aVar;
        this.f15264f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f15268c == null) {
            return;
        }
        this.f15259a.a(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f15267b) {
            aVar = aVar.f15269d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f15265g + i10;
        this.f15265g = j10;
        a aVar = this.f15264f;
        if (j10 == aVar.f15267b) {
            this.f15264f = aVar.f15269d;
        }
    }

    private int h(int i10) {
        a aVar = this.f15264f;
        if (aVar.f15268c == null) {
            aVar.c(this.f15259a.d(), new a(this.f15264f.f15267b, this.f15260b));
        }
        return Math.min(i10, (int) (this.f15264f.f15267b - this.f15265g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f15267b - j10));
            byteBuffer.put(d10.f15268c.f11926a, d10.e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == d10.f15267b) {
                d10 = d10.f15269d;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f15267b - j10));
            System.arraycopy(d10.f15268c.f11926a, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == d10.f15267b) {
                d10 = d10.f15269d;
            }
        }
        return d10;
    }

    private static a k(a aVar, v1.g gVar, m0.b bVar, p3.a0 a0Var) {
        long j10 = bVar.f15304b;
        int i10 = 1;
        a0Var.K(1);
        a j11 = j(aVar, j10, a0Var.d(), 1);
        long j12 = j10 + 1;
        byte b10 = a0Var.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        v1.c cVar = gVar.f15535o;
        byte[] bArr = cVar.f15511a;
        if (bArr == null) {
            cVar.f15511a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, cVar.f15511a, i11);
        long j14 = j12 + i11;
        if (z10) {
            a0Var.K(2);
            j13 = j(j13, j14, a0Var.d(), 2);
            j14 += 2;
            i10 = a0Var.I();
        }
        int i12 = i10;
        int[] iArr = cVar.f15514d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f15515e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            a0Var.K(i13);
            j13 = j(j13, j14, a0Var.d(), i13);
            j14 += i13;
            a0Var.O(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = a0Var.I();
                iArr4[i14] = a0Var.G();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f15303a - ((int) (j14 - bVar.f15304b));
        }
        e0.a aVar2 = (e0.a) p3.m0.j(bVar.f15305c);
        cVar.c(i12, iArr2, iArr4, aVar2.f16210b, cVar.f15511a, aVar2.f16209a, aVar2.f16211c, aVar2.f16212d);
        long j15 = bVar.f15304b;
        int i15 = (int) (j14 - j15);
        bVar.f15304b = j15 + i15;
        bVar.f15303a -= i15;
        return j13;
    }

    private static a l(a aVar, v1.g gVar, m0.b bVar, p3.a0 a0Var) {
        long j10;
        ByteBuffer byteBuffer;
        if (gVar.A()) {
            aVar = k(aVar, gVar, bVar, a0Var);
        }
        if (gVar.r()) {
            a0Var.K(4);
            a j11 = j(aVar, bVar.f15304b, a0Var.d(), 4);
            int G = a0Var.G();
            bVar.f15304b += 4;
            bVar.f15303a -= 4;
            gVar.y(G);
            aVar = i(j11, bVar.f15304b, gVar.f15536p, G);
            bVar.f15304b += G;
            int i10 = bVar.f15303a - G;
            bVar.f15303a = i10;
            gVar.C(i10);
            j10 = bVar.f15304b;
            byteBuffer = gVar.f15539s;
        } else {
            gVar.y(bVar.f15303a);
            j10 = bVar.f15304b;
            byteBuffer = gVar.f15536p;
        }
        return i(aVar, j10, byteBuffer, bVar.f15303a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f15262d;
            if (j10 < aVar.f15267b) {
                break;
            }
            this.f15259a.c(aVar.f15268c);
            this.f15262d = this.f15262d.b();
        }
        if (this.f15263e.f15266a < aVar.f15266a) {
            this.f15263e = aVar;
        }
    }

    public void c(long j10) {
        p3.a.a(j10 <= this.f15265g);
        this.f15265g = j10;
        if (j10 != 0) {
            a aVar = this.f15262d;
            if (j10 != aVar.f15266a) {
                while (this.f15265g > aVar.f15267b) {
                    aVar = aVar.f15269d;
                }
                a aVar2 = (a) p3.a.e(aVar.f15269d);
                a(aVar2);
                a aVar3 = new a(aVar.f15267b, this.f15260b);
                aVar.f15269d = aVar3;
                if (this.f15265g == aVar.f15267b) {
                    aVar = aVar3;
                }
                this.f15264f = aVar;
                if (this.f15263e == aVar2) {
                    this.f15263e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f15262d);
        a aVar4 = new a(this.f15265g, this.f15260b);
        this.f15262d = aVar4;
        this.f15263e = aVar4;
        this.f15264f = aVar4;
    }

    public long e() {
        return this.f15265g;
    }

    public void f(v1.g gVar, m0.b bVar) {
        l(this.f15263e, gVar, bVar, this.f15261c);
    }

    public void m(v1.g gVar, m0.b bVar) {
        this.f15263e = l(this.f15263e, gVar, bVar, this.f15261c);
    }

    public void n() {
        a(this.f15262d);
        this.f15262d.d(0L, this.f15260b);
        a aVar = this.f15262d;
        this.f15263e = aVar;
        this.f15264f = aVar;
        this.f15265g = 0L;
        this.f15259a.b();
    }

    public void o() {
        this.f15263e = this.f15262d;
    }

    public int p(o3.i iVar, int i10, boolean z10) {
        int h10 = h(i10);
        a aVar = this.f15264f;
        int b10 = iVar.b(aVar.f15268c.f11926a, aVar.e(this.f15265g), h10);
        if (b10 != -1) {
            g(b10);
            return b10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void q(p3.a0 a0Var, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f15264f;
            a0Var.j(aVar.f15268c.f11926a, aVar.e(this.f15265g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
