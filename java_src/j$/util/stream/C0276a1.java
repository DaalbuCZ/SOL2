package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0276a1 extends R0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0276a1(P0 p02, P0 p03) {
        super(p02, p03);
    }

    @Override // j$.util.stream.P0
    public void a(Consumer consumer) {
        this.f9889a.a(consumer);
        this.f9890b.a(consumer);
    }

    @Override // j$.util.stream.P0
    public void m(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        this.f9889a.m(objArr, i10);
        this.f9890b.m(objArr, i10 + ((int) this.f9889a.count()));
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
    public P0 p(long j10, long j11, j$.util.function.n nVar) {
        if (j10 == 0 && j11 == count()) {
            return this;
        }
        long count = this.f9889a.count();
        return j10 >= count ? this.f9890b.p(j10 - count, j11 - count, nVar) : j11 <= count ? this.f9889a.p(j10, j11, nVar) : D0.d0(1, this.f9889a.p(j10, count, nVar), this.f9890b.p(0L, j11 - count, nVar));
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return new C0358r1(this);
    }

    public String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f9889a, this.f9890b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
