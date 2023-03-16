package g2;

import p3.a0;
import s1.h2;
import x1.m;
import x1.o;
/* loaded from: classes.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f7487a;

    /* renamed from: b  reason: collision with root package name */
    public int f7488b;

    /* renamed from: c  reason: collision with root package name */
    public long f7489c;

    /* renamed from: d  reason: collision with root package name */
    public long f7490d;

    /* renamed from: e  reason: collision with root package name */
    public long f7491e;

    /* renamed from: f  reason: collision with root package name */
    public long f7492f;

    /* renamed from: g  reason: collision with root package name */
    public int f7493g;

    /* renamed from: h  reason: collision with root package name */
    public int f7494h;

    /* renamed from: i  reason: collision with root package name */
    public int f7495i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f7496j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final a0 f7497k = new a0(255);

    public boolean a(m mVar, boolean z10) {
        b();
        this.f7497k.K(27);
        if (o.b(mVar, this.f7497k.d(), 0, 27, z10) && this.f7497k.E() == 1332176723) {
            int C = this.f7497k.C();
            this.f7487a = C;
            if (C != 0) {
                if (z10) {
                    return false;
                }
                throw h2.d("unsupported bit stream revision");
            }
            this.f7488b = this.f7497k.C();
            this.f7489c = this.f7497k.q();
            this.f7490d = this.f7497k.s();
            this.f7491e = this.f7497k.s();
            this.f7492f = this.f7497k.s();
            int C2 = this.f7497k.C();
            this.f7493g = C2;
            this.f7494h = C2 + 27;
            this.f7497k.K(C2);
            if (o.b(mVar, this.f7497k.d(), 0, this.f7493g, z10)) {
                for (int i10 = 0; i10 < this.f7493g; i10++) {
                    this.f7496j[i10] = this.f7497k.C();
                    this.f7495i += this.f7496j[i10];
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void b() {
        this.f7487a = 0;
        this.f7488b = 0;
        this.f7489c = 0L;
        this.f7490d = 0L;
        this.f7491e = 0L;
        this.f7492f = 0L;
        this.f7493g = 0;
        this.f7494h = 0;
        this.f7495i = 0;
    }

    public boolean c(m mVar) {
        return d(mVar, -1L);
    }

    public boolean d(m mVar, long j10) {
        int i10;
        p3.a.a(mVar.q() == mVar.m());
        this.f7497k.K(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || mVar.q() + 4 < j10) && o.b(mVar, this.f7497k.d(), 0, 4, true)) {
                this.f7497k.O(0);
                if (this.f7497k.E() == 1332176723) {
                    mVar.g();
                    return true;
                }
                mVar.h(1);
            }
        }
        do {
            if (i10 != 0 && mVar.q() >= j10) {
                break;
            }
        } while (mVar.c(1) != -1);
        return false;
    }
}
