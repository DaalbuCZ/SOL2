package j$.util.concurrent;

import j$.util.AbstractC0251a;
import j$.util.D;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class A implements D {

    /* renamed from: a  reason: collision with root package name */
    long f9641a;

    /* renamed from: b  reason: collision with root package name */
    final long f9642b;

    /* renamed from: c  reason: collision with root package name */
    final long f9643c;

    /* renamed from: d  reason: collision with root package name */
    final long f9644d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(long j10, long j11, long j12, long j13) {
        this.f9641a = j10;
        this.f9642b = j11;
        this.f9643c = j12;
        this.f9644d = j13;
    }

    @Override // j$.util.D, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.s(this, consumer);
    }

    @Override // j$.util.H
    /* renamed from: b */
    public A trySplit() {
        long j10 = this.f9641a;
        long j11 = (this.f9642b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f9641a = j11;
        return new A(j10, j11, this.f9643c, this.f9644d);
    }

    @Override // j$.util.H
    public int characteristics() {
        return 17728;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9642b - this.f9641a;
    }

    @Override // j$.util.F
    /* renamed from: f */
    public void forEachRemaining(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        long j10 = this.f9641a;
        long j11 = this.f9642b;
        if (j10 < j11) {
            this.f9641a = j11;
            long j12 = this.f9643c;
            long j13 = this.f9644d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                rVar.e(current.e(j12, j13));
                j10++;
            } while (j10 < j11);
        }
    }

    @Override // j$.util.D, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.e(this, consumer);
    }

    @Override // j$.util.F
    /* renamed from: g */
    public boolean tryAdvance(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        long j10 = this.f9641a;
        if (j10 < this.f9642b) {
            rVar.e(ThreadLocalRandom.current().e(this.f9643c, this.f9644d));
            this.f9641a = j10 + 1;
            return true;
        }
        return false;
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
}
