package j$.util.stream;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B1 extends C0278a3 implements P0, H0 {
    @Override // j$.util.stream.C0278a3, j$.util.stream.P0
    public void a(Consumer consumer) {
        super.a(consumer);
    }

    @Override // j$.util.stream.C0278a3, j$.util.function.Consumer
    public void accept(Object obj) {
        super.accept(obj);
    }

    @Override // j$.util.stream.H0
    public P0 b() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void c(double d10) {
        D0.A();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void d(int i10) {
        D0.E();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.P0
    public P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        clear();
        u(j10);
    }

    @Override // j$.util.stream.C0278a3, j$.util.stream.P0
    public void m(Object[] objArr, int i10) {
        super.m(objArr, i10);
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public Object[] o(j$.util.function.n nVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) nVar.u((int) count);
            m(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ P0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.Q(this, j10, j11, nVar);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // j$.util.stream.C0278a3, java.lang.Iterable, j$.util.stream.P0
    public j$.util.H spliterator() {
        return super.spliterator();
    }
}
