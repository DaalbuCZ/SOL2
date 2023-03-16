package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.o3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0348o3 extends AbstractC0303f3 implements j$.util.z {
    C0348o3(D0 d02, j$.util.H h10, boolean z10) {
        super(d02, h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0348o3(D0 d02, j$.util.function.A a10, boolean z10) {
        super(d02, a10, z10);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.q(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0303f3
    void e() {
        T2 t22 = new T2();
        this.f10052h = t22;
        this.f10049e = this.f10046b.J0(new C0343n3(t22, 0));
        this.f10050f = new C0279b(this, 4);
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.c(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0303f3
    AbstractC0303f3 h(j$.util.H h10) {
        return new C0348o3(this.f10046b, h10, this.f10045a);
    }

    @Override // j$.util.F
    /* renamed from: k */
    public boolean tryAdvance(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
        boolean b10 = b();
        if (b10) {
            T2 t22 = (T2) this.f10052h;
            long j10 = this.f10051g;
            int w10 = t22.w(j10);
            hVar.c((t22.f10011c == 0 && w10 == 0) ? ((double[]) t22.f9950e)[(int) j10] : ((double[][]) t22.f9951f)[w10][(int) (j10 - t22.f10012d[w10])]);
        }
        return b10;
    }

    @Override // j$.util.F
    /* renamed from: l */
    public void forEachRemaining(j$.util.function.h hVar) {
        if (this.f10052h != null || this.f10053i) {
            do {
            } while (tryAdvance(hVar));
            return;
        }
        Objects.requireNonNull(hVar);
        d();
        this.f10046b.I0(new C0343n3(hVar, 1), this.f10048d);
        this.f10053i = true;
    }

    @Override // j$.util.stream.AbstractC0303f3, j$.util.H
    public j$.util.z trySplit() {
        return (j$.util.z) super.trySplit();
    }
}
