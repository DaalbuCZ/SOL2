package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.InterfaceC0261d;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0303f3 implements j$.util.H {

    /* renamed from: a  reason: collision with root package name */
    final boolean f10045a;

    /* renamed from: b  reason: collision with root package name */
    final D0 f10046b;

    /* renamed from: c  reason: collision with root package name */
    private j$.util.function.A f10047c;

    /* renamed from: d  reason: collision with root package name */
    j$.util.H f10048d;

    /* renamed from: e  reason: collision with root package name */
    InterfaceC0356q2 f10049e;

    /* renamed from: f  reason: collision with root package name */
    InterfaceC0261d f10050f;

    /* renamed from: g  reason: collision with root package name */
    long f10051g;

    /* renamed from: h  reason: collision with root package name */
    AbstractC0294e f10052h;

    /* renamed from: i  reason: collision with root package name */
    boolean f10053i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0303f3(D0 d02, j$.util.H h10, boolean z10) {
        this.f10046b = d02;
        this.f10047c = null;
        this.f10048d = h10;
        this.f10045a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0303f3(D0 d02, j$.util.function.A a10, boolean z10) {
        this.f10046b = d02;
        this.f10047c = a10;
        this.f10048d = null;
        this.f10045a = z10;
    }

    private boolean c() {
        boolean a10;
        while (this.f10052h.count() == 0) {
            if (!this.f10049e.r()) {
                C0279b c0279b = (C0279b) this.f10050f;
                switch (c0279b.f9979a) {
                    case 4:
                        C0348o3 c0348o3 = (C0348o3) c0279b.f9980b;
                        a10 = c0348o3.f10048d.a(c0348o3.f10049e);
                        break;
                    case 5:
                        q3 q3Var = (q3) c0279b.f9980b;
                        a10 = q3Var.f10048d.a(q3Var.f10049e);
                        break;
                    case 6:
                        s3 s3Var = (s3) c0279b.f9980b;
                        a10 = s3Var.f10048d.a(s3Var.f10049e);
                        break;
                    default:
                        J3 j32 = (J3) c0279b.f9980b;
                        a10 = j32.f10048d.a(j32.f10049e);
                        break;
                }
                if (a10) {
                    continue;
                }
            }
            if (this.f10053i) {
                return false;
            }
            this.f10049e.h();
            this.f10053i = true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        AbstractC0294e abstractC0294e = this.f10052h;
        if (abstractC0294e == null) {
            if (this.f10053i) {
                return false;
            }
            d();
            e();
            this.f10051g = 0L;
            this.f10049e.j(this.f10048d.getExactSizeIfKnown());
            return c();
        }
        long j10 = this.f10051g + 1;
        this.f10051g = j10;
        boolean z10 = j10 < abstractC0294e.count();
        if (z10) {
            return z10;
        }
        this.f10051g = 0L;
        this.f10052h.clear();
        return c();
    }

    @Override // j$.util.H
    public final int characteristics() {
        d();
        int k10 = EnumC0298e3.k(this.f10046b.r0()) & EnumC0298e3.f10016f;
        return (k10 & 64) != 0 ? (k10 & (-16449)) | (this.f10048d.characteristics() & 16448) : k10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.f10048d == null) {
            this.f10048d = (j$.util.H) this.f10047c.get();
            this.f10047c = null;
        }
    }

    abstract void e();

    @Override // j$.util.H
    public final long estimateSize() {
        d();
        return this.f10048d.estimateSize();
    }

    @Override // j$.util.H
    public Comparator getComparator() {
        if (AbstractC0251a.j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.H
    public final long getExactSizeIfKnown() {
        d();
        if (EnumC0298e3.SIZED.g(this.f10046b.r0())) {
            return this.f10048d.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract AbstractC0303f3 h(j$.util.H h10);

    @Override // j$.util.H
    public /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0251a.j(this, i10);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f10048d);
    }

    @Override // j$.util.H
    public j$.util.H trySplit() {
        if (!this.f10045a || this.f10053i) {
            return null;
        }
        d();
        j$.util.H trySplit = this.f10048d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return h(trySplit);
    }
}
