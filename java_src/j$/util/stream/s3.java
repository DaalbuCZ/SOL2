package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class s3 extends AbstractC0303f3 implements j$.util.D {
    s3(D0 d02, j$.util.H h10, boolean z10) {
        super(d02, h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s3(D0 d02, j$.util.function.A a10, boolean z10) {
        super(d02, a10, z10);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.s(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0303f3
    void e() {
        X2 x22 = new X2();
        this.f10052h = x22;
        this.f10049e = this.f10046b.J0(new r3(x22, 0));
        this.f10050f = new C0279b(this, 6);
    }

    @Override // j$.util.F
    /* renamed from: f */
    public void forEachRemaining(j$.util.function.r rVar) {
        if (this.f10052h != null || this.f10053i) {
            do {
            } while (tryAdvance(rVar));
            return;
        }
        Objects.requireNonNull(rVar);
        d();
        this.f10046b.I0(new r3(rVar, 1), this.f10048d);
        this.f10053i = true;
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.e(this, consumer);
    }

    @Override // j$.util.F
    /* renamed from: g */
    public boolean tryAdvance(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        boolean b10 = b();
        if (b10) {
            X2 x22 = (X2) this.f10052h;
            long j10 = this.f10051g;
            int w10 = x22.w(j10);
            rVar.e((x22.f10011c == 0 && w10 == 0) ? ((long[]) x22.f9950e)[(int) j10] : ((long[][]) x22.f9951f)[w10][(int) (j10 - x22.f10012d[w10])]);
        }
        return b10;
    }

    @Override // j$.util.stream.AbstractC0303f3
    AbstractC0303f3 h(j$.util.H h10) {
        return new s3(this.f10046b, h10, this.f10045a);
    }

    @Override // j$.util.stream.AbstractC0303f3, j$.util.H
    public j$.util.D trySplit() {
        return (j$.util.D) super.trySplit();
    }
}
