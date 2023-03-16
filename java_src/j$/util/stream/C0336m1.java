package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0336m1 extends V2 implements L0, F0 {
    @Override // j$.util.stream.V2
    public j$.util.B B() {
        return super.spliterator();
    }

    @Override // j$.util.function.Consumer
    /* renamed from: C */
    public /* synthetic */ void accept(Integer num) {
        D0.C(this, num);
    }

    @Override // j$.util.stream.P0
    /* renamed from: D */
    public /* synthetic */ void m(Integer[] numArr, int i10) {
        D0.I(this, numArr, i10);
    }

    @Override // j$.util.stream.P0
    /* renamed from: E */
    public /* synthetic */ L0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.O(this, j10, j11);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.F0, j$.util.stream.H0
    public L0 b() {
        return this;
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

    @Override // j$.util.stream.V2, j$.util.function.m
    public void d(int i10) {
        super.d(i10);
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
        super.i((int[]) obj, i10);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        clear();
        x(j10);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public Object k() {
        return (int[]) super.k();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public void l(Object obj) {
        super.l((j$.util.function.m) obj);
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

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable
    public j$.util.F spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.P0
    public /* bridge */ /* synthetic */ P0 f(int i10) {
        f(i10);
        throw null;
    }

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable
    public j$.util.H spliterator() {
        return super.spliterator();
    }
}
