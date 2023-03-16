package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0366t1 implements N0 {

    /* renamed from: a  reason: collision with root package name */
    final long[] f10143a;

    /* renamed from: b  reason: collision with root package name */
    int f10144b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0366t1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f10143a = new long[(int) j10];
        this.f10144b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0366t1(long[] jArr) {
        this.f10143a = jArr;
        this.f10144b = jArr.length;
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ void a(Consumer consumer) {
        D0.M(this, consumer);
    }

    @Override // j$.util.stream.P0
    public long count() {
        return this.f10144b;
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public O0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.O0
    public void i(Object obj, int i10) {
        System.arraycopy(this.f10143a, 0, (long[]) obj, i10, this.f10144b);
    }

    @Override // j$.util.stream.O0
    public Object k() {
        long[] jArr = this.f10143a;
        int length = jArr.length;
        int i10 = this.f10144b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override // j$.util.stream.O0
    public void l(Object obj) {
        j$.util.function.r rVar = (j$.util.function.r) obj;
        for (int i10 = 0; i10 < this.f10144b; i10++) {
            rVar.e(this.f10143a[i10]);
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
    public /* synthetic */ void m(Long[] lArr, int i10) {
        D0.J(this, lArr, i10);
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public j$.util.F spliterator() {
        return j$.util.W.l(this.f10143a, 0, this.f10144b, 1040);
    }

    @Override // j$.util.stream.P0
    /* renamed from: t */
    public /* synthetic */ N0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.P(this, j10, j11);
    }

    public String toString() {
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(this.f10143a.length - this.f10144b), Arrays.toString(this.f10143a));
    }

    @Override // j$.util.stream.P0
    public /* bridge */ /* synthetic */ P0 f(int i10) {
        f(i10);
        throw null;
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return j$.util.W.l(this.f10143a, 0, this.f10144b, 1040);
    }
}
