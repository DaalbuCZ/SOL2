package y1;

import java.io.EOFException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.m0;
import s1.h2;
import s1.m1;
import x1.a0;
import x1.b0;
import x1.e;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.r;
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f16836r;

    /* renamed from: u  reason: collision with root package name */
    private static final int f16839u;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f16840a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16841b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16842c;

    /* renamed from: d  reason: collision with root package name */
    private long f16843d;

    /* renamed from: e  reason: collision with root package name */
    private int f16844e;

    /* renamed from: f  reason: collision with root package name */
    private int f16845f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16846g;

    /* renamed from: h  reason: collision with root package name */
    private long f16847h;

    /* renamed from: i  reason: collision with root package name */
    private int f16848i;

    /* renamed from: j  reason: collision with root package name */
    private int f16849j;

    /* renamed from: k  reason: collision with root package name */
    private long f16850k;

    /* renamed from: l  reason: collision with root package name */
    private n f16851l;

    /* renamed from: m  reason: collision with root package name */
    private e0 f16852m;

    /* renamed from: n  reason: collision with root package name */
    private b0 f16853n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16854o;

    /* renamed from: p  reason: collision with root package name */
    public static final r f16834p = a.f16833b;

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f16835q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f16837s = m0.l0("#!AMR\n");

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f16838t = m0.l0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f16836r = iArr;
        f16839u = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f16841b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f16840a = new byte[1];
        this.f16848i = -1;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void e() {
        p3.a.h(this.f16852m);
        m0.j(this.f16851l);
    }

    private static int f(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private b0 g(long j10, boolean z10) {
        return new e(j10, this.f16847h, f(this.f16848i, 20000L), this.f16848i, z10);
    }

    private int h(int i10) {
        if (l(i10)) {
            return this.f16842c ? f16836r[i10] : f16835q[i10];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f16842c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i10);
        throw h2.a(sb.toString(), null);
    }

    private boolean k(int i10) {
        return !this.f16842c && (i10 < 12 || i10 > 14);
    }

    private boolean l(int i10) {
        return i10 >= 0 && i10 <= 15 && (m(i10) || k(i10));
    }

    private boolean m(int i10) {
        return this.f16842c && (i10 < 10 || i10 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] n() {
        return new l[]{new b()};
    }

    @RequiresNonNull({"trackOutput"})
    private void o() {
        if (this.f16854o) {
            return;
        }
        this.f16854o = true;
        boolean z10 = this.f16842c;
        this.f16852m.e(new m1.b().e0(z10 ? "audio/amr-wb" : "audio/3gpp").W(f16839u).H(1).f0(z10 ? 16000 : 8000).E());
    }

    @RequiresNonNull({"extractorOutput"})
    private void p(long j10, int i10) {
        b0 bVar;
        int i11;
        if (this.f16846g) {
            return;
        }
        int i12 = this.f16841b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f16848i) == -1 || i11 == this.f16844e)) {
            bVar = new b0.b(-9223372036854775807L);
        } else if (this.f16849j < 20 && i10 != -1) {
            return;
        } else {
            bVar = g(j10, (i12 & 2) != 0);
        }
        this.f16853n = bVar;
        this.f16851l.t(bVar);
        this.f16846g = true;
    }

    private static boolean q(m mVar, byte[] bArr) {
        mVar.g();
        byte[] bArr2 = new byte[bArr.length];
        mVar.o(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int r(m mVar) {
        mVar.g();
        mVar.o(this.f16840a, 0, 1);
        byte b10 = this.f16840a[0];
        if ((b10 & 131) <= 0) {
            return h((b10 >> 3) & 15);
        }
        throw h2.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean s(m mVar) {
        int length;
        byte[] bArr = f16837s;
        if (q(mVar, bArr)) {
            this.f16842c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f16838t;
            if (!q(mVar, bArr2)) {
                return false;
            }
            this.f16842c = true;
            length = bArr2.length;
        }
        mVar.h(length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    private int t(m mVar) {
        if (this.f16845f == 0) {
            try {
                int r10 = r(mVar);
                this.f16844e = r10;
                this.f16845f = r10;
                if (this.f16848i == -1) {
                    this.f16847h = mVar.q();
                    this.f16848i = this.f16844e;
                }
                if (this.f16848i == this.f16844e) {
                    this.f16849j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int f10 = this.f16852m.f(mVar, this.f16845f, true);
        if (f10 == -1) {
            return -1;
        }
        int i10 = this.f16845f - f10;
        this.f16845f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f16852m.c(this.f16850k + this.f16843d, 1, this.f16844e, 0, null);
        this.f16843d += 20000;
        return 0;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f16843d = 0L;
        this.f16844e = 0;
        this.f16845f = 0;
        if (j10 != 0) {
            b0 b0Var = this.f16853n;
            if (b0Var instanceof e) {
                this.f16850k = ((e) b0Var).b(j10);
                return;
            }
        }
        this.f16850k = 0L;
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f16851l = nVar;
        this.f16852m = nVar.e(0, 1);
        nVar.i();
    }

    @Override // x1.l
    public int i(m mVar, a0 a0Var) {
        e();
        if (mVar.q() != 0 || s(mVar)) {
            o();
            int t10 = t(mVar);
            p(mVar.a(), t10);
            return t10;
        }
        throw h2.a("Could not find AMR header.", null);
    }

    @Override // x1.l
    public boolean j(m mVar) {
        return s(mVar);
    }
}
