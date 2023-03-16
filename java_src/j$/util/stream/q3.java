package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class q3 extends AbstractC0303f3 implements j$.util.B {
    q3(D0 d02, j$.util.H h10, boolean z10) {
        super(d02, h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q3(D0 d02, j$.util.function.A a10, boolean z10) {
        super(d02, a10, z10);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.r(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0303f3
    void e() {
        V2 v22 = new V2();
        this.f10052h = v22;
        this.f10049e = this.f10046b.J0(new p3(v22, 0));
        this.f10050f = new C0279b(this, 5);
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.d(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0303f3
    AbstractC0303f3 h(j$.util.H h10) {
        return new q3(this.f10046b, h10, this.f10045a);
    }

    @Override // j$.util.F
    /* renamed from: i */
    public boolean tryAdvance(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        boolean b10 = b();
        if (b10) {
            V2 v22 = (V2) this.f10052h;
            long j10 = this.f10051g;
            int w10 = v22.w(j10);
            mVar.d((v22.f10011c == 0 && w10 == 0) ? ((int[]) v22.f9950e)[(int) j10] : ((int[][]) v22.f9951f)[w10][(int) (j10 - v22.f10012d[w10])]);
        }
        return b10;
    }

    @Override // j$.util.F
    /* renamed from: m */
    public void forEachRemaining(j$.util.function.m mVar) {
        if (this.f10052h != null || this.f10053i) {
            do {
            } while (tryAdvance(mVar));
            return;
        }
        Objects.requireNonNull(mVar);
        d();
        this.f10046b.I0(new p3(mVar, 1), this.f10048d);
        this.f10053i = true;
    }

    @Override // j$.util.stream.AbstractC0303f3, j$.util.H
    public j$.util.B trySplit() {
        return (j$.util.B) super.trySplit();
    }
}
