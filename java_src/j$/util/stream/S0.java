package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class S0 implements P0 {

    /* renamed from: a  reason: collision with root package name */
    final Object[] f9902a;

    /* renamed from: b  reason: collision with root package name */
    int f9903b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(long j10, j$.util.function.n nVar) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9902a = (Object[]) nVar.u((int) j10);
        this.f9903b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(Object[] objArr) {
        this.f9902a = objArr;
        this.f9903b = objArr.length;
    }

    @Override // j$.util.stream.P0
    public void a(Consumer consumer) {
        for (int i10 = 0; i10 < this.f9903b; i10++) {
            consumer.accept(this.f9902a[i10]);
        }
    }

    @Override // j$.util.stream.P0
    public long count() {
        return this.f9903b;
    }

    @Override // j$.util.stream.P0
    public P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public void m(Object[] objArr, int i10) {
        System.arraycopy(this.f9902a, 0, objArr, i10, this.f9903b);
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public Object[] o(j$.util.function.n nVar) {
        Object[] objArr = this.f9902a;
        if (objArr.length == this.f9903b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ P0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.Q(this, j10, j11, nVar);
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return j$.util.W.m(this.f9902a, 0, this.f9903b, 1040);
    }

    public String toString() {
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(this.f9902a.length - this.f9903b), Arrays.toString(this.f9902a));
    }
}
