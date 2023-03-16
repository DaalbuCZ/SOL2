package j$.util.concurrent;

import j$.util.AbstractC0251a;
import j$.util.B;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class z implements B {

    /* renamed from: a  reason: collision with root package name */
    long f9714a;

    /* renamed from: b  reason: collision with root package name */
    final long f9715b;

    /* renamed from: c  reason: collision with root package name */
    final int f9716c;

    /* renamed from: d  reason: collision with root package name */
    final int f9717d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j10, long j11, int i10, int i11) {
        this.f9714a = j10;
        this.f9715b = j11;
        this.f9716c = i10;
        this.f9717d = i11;
    }

    @Override // j$.util.B, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.r(this, consumer);
    }

    @Override // j$.util.H
    /* renamed from: b */
    public z trySplit() {
        long j10 = this.f9714a;
        long j11 = (this.f9715b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f9714a = j11;
        return new z(j10, j11, this.f9716c, this.f9717d);
    }

    @Override // j$.util.H
    public int characteristics() {
        return 17728;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9715b - this.f9714a;
    }

    @Override // j$.util.B, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.d(this, consumer);
    }

    @Override // j$.util.H
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.H
    public /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0251a.h(this);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0251a.j(this, i10);
    }

    @Override // j$.util.F
    /* renamed from: i */
    public boolean tryAdvance(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        long j10 = this.f9714a;
        if (j10 < this.f9715b) {
            mVar.d(ThreadLocalRandom.current().d(this.f9716c, this.f9717d));
            this.f9714a = j10 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.F
    /* renamed from: m */
    public void forEachRemaining(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        long j10 = this.f9714a;
        long j11 = this.f9715b;
        if (j10 < j11) {
            this.f9714a = j11;
            int i10 = this.f9716c;
            int i11 = this.f9717d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                mVar.d(current.d(i10, i11));
                j10++;
            } while (j10 < j11);
        }
    }
}
