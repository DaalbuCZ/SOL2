package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0291d1 extends T2 implements J0, E0 {
    @Override // j$.util.stream.T2
    public j$.util.z B() {
        return super.spliterator();
    }

    @Override // j$.util.function.Consumer
    /* renamed from: C */
    public /* synthetic */ void accept(Double d10) {
        D0.B(this, d10);
    }

    @Override // j$.util.stream.P0
    /* renamed from: D */
    public /* synthetic */ void m(Double[] dArr, int i10) {
        D0.H(this, dArr, i10);
    }

    @Override // j$.util.stream.P0
    /* renamed from: E */
    public /* synthetic */ J0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.N(this, j10, j11);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.E0, j$.util.stream.H0
    public J0 b() {
        return this;
    }

    @Override // j$.util.stream.H0
    public P0 b() {
        return this;
    }

    @Override // j$.util.stream.T2, j$.util.function.h
    public void c(double d10) {
        super.c(d10);
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

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public O0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void h() {
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public void i(Object obj, int i10) {
        super.i((double[]) obj, i10);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        clear();
        x(j10);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public Object k() {
        return (double[]) super.k();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public void l(Object obj) {
        super.l((j$.util.function.h) obj);
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ Object[] o(j$.util.function.n nVar) {
        return D0.G(this, nVar);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable
    public j$.util.F spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.P0
    public /* bridge */ /* synthetic */ P0 f(int i10) {
        f(i10);
        throw null;
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable
    public j$.util.H spliterator() {
        return super.spliterator();
    }
}
