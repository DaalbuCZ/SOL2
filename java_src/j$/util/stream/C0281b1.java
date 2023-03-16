package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0281b1 implements J0 {

    /* renamed from: a  reason: collision with root package name */
    final double[] f9983a;

    /* renamed from: b  reason: collision with root package name */
    int f9984b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0281b1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9983a = new double[(int) j10];
        this.f9984b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0281b1(double[] dArr) {
        this.f9983a = dArr;
        this.f9984b = dArr.length;
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ void a(Consumer consumer) {
        D0.K(this, consumer);
    }

    @Override // j$.util.stream.P0
    public long count() {
        return this.f9984b;
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public O0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.O0
    public void i(Object obj, int i10) {
        System.arraycopy(this.f9983a, 0, (double[]) obj, i10, this.f9984b);
    }

    @Override // j$.util.stream.O0
    public Object k() {
        double[] dArr = this.f9983a;
        int length = dArr.length;
        int i10 = this.f9984b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // j$.util.stream.O0
    public void l(Object obj) {
        j$.util.function.h hVar = (j$.util.function.h) obj;
        for (int i10 = 0; i10 < this.f9984b; i10++) {
            hVar.c(this.f9983a[i10]);
        }
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ Object[] o(j$.util.function.n nVar) {
        return D0.G(this, nVar);
    }

    @Override // j$.util.stream.P0
    /* renamed from: s */
    public /* synthetic */ void m(Double[] dArr, int i10) {
        D0.H(this, dArr, i10);
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public j$.util.F spliterator() {
        return j$.util.W.j(this.f9983a, 0, this.f9984b, 1040);
    }

    @Override // j$.util.stream.P0
    /* renamed from: t */
    public /* synthetic */ J0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.N(this, j10, j11);
    }

    public String toString() {
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(this.f9983a.length - this.f9984b), Arrays.toString(this.f9983a));
    }

    @Override // j$.util.stream.P0
    public /* bridge */ /* synthetic */ P0 f(int i10) {
        f(i10);
        throw null;
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return j$.util.W.j(this.f9983a, 0, this.f9984b, 1040);
    }
}
