package j$.util.concurrent;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class y implements j$.util.z {

    /* renamed from: a  reason: collision with root package name */
    long f9710a;

    /* renamed from: b  reason: collision with root package name */
    final long f9711b;

    /* renamed from: c  reason: collision with root package name */
    final double f9712c;

    /* renamed from: d  reason: collision with root package name */
    final double f9713d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(long j10, long j11, double d10, double d11) {
        this.f9710a = j10;
        this.f9711b = j11;
        this.f9712c = d10;
        this.f9713d = d11;
    }

    @Override // j$.util.z, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.q(this, consumer);
    }

    @Override // j$.util.z, j$.util.F, j$.util.H
    /* renamed from: b */
    public y trySplit() {
        long j10 = this.f9710a;
        long j11 = (this.f9711b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f9710a = j11;
        return new y(j10, j11, this.f9712c, this.f9713d);
    }

    @Override // j$.util.H
    public int characteristics() {
        return 17728;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9711b - this.f9710a;
    }

    @Override // j$.util.z, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.c(this, consumer);
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
    /* renamed from: k */
    public boolean tryAdvance(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
        long j10 = this.f9710a;
        if (j10 < this.f9711b) {
            hVar.c(ThreadLocalRandom.current().c(this.f9712c, this.f9713d));
            this.f9710a = j10 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.F
    /* renamed from: l */
    public void forEachRemaining(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
        long j10 = this.f9710a;
        long j11 = this.f9711b;
        if (j10 < j11) {
            this.f9710a = j11;
            double d10 = this.f9712c;
            double d11 = this.f9713d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                hVar.c(current.c(d10, d11));
                j10++;
            } while (j10 < j11);
        }
    }
}
