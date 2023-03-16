package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0326k1 implements L0 {

    /* renamed from: a  reason: collision with root package name */
    final int[] f10079a;

    /* renamed from: b  reason: collision with root package name */
    int f10080b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0326k1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f10079a = new int[(int) j10];
        this.f10080b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0326k1(int[] iArr) {
        this.f10079a = iArr;
        this.f10080b = iArr.length;
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ void a(Consumer consumer) {
        D0.L(this, consumer);
    }

    @Override // j$.util.stream.P0
    public long count() {
        return this.f10080b;
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public O0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.O0
    public void i(Object obj, int i10) {
        System.arraycopy(this.f10079a, 0, (int[]) obj, i10, this.f10080b);
    }

    @Override // j$.util.stream.O0
    public Object k() {
        int[] iArr = this.f10079a;
        int length = iArr.length;
        int i10 = this.f10080b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override // j$.util.stream.O0
    public void l(Object obj) {
        j$.util.function.m mVar = (j$.util.function.m) obj;
        for (int i10 = 0; i10 < this.f10080b; i10++) {
            mVar.d(this.f10079a[i10]);
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
    public /* synthetic */ void m(Integer[] numArr, int i10) {
        D0.I(this, numArr, i10);
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public j$.util.F spliterator() {
        return j$.util.W.k(this.f10079a, 0, this.f10080b, 1040);
    }

    @Override // j$.util.stream.P0
    /* renamed from: t */
    public /* synthetic */ L0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.O(this, j10, j11);
    }

    public String toString() {
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(this.f10079a.length - this.f10080b), Arrays.toString(this.f10079a));
    }

    @Override // j$.util.stream.P0
    public /* bridge */ /* synthetic */ P0 f(int i10) {
        f(i10);
        throw null;
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return j$.util.W.k(this.f10079a, 0, this.f10080b, 1040);
    }
}
