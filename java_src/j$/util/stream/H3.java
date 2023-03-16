package j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
abstract class H3 {

    /* renamed from: a  reason: collision with root package name */
    protected final j$.util.H f9821a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f9822b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9823c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f9824d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H3(j$.util.H h10, long j10, long j11) {
        this.f9821a = h10;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        this.f9822b = i10 < 0;
        this.f9823c = i10 >= 0 ? j11 : 0L;
        this.f9824d = new AtomicLong(i10 >= 0 ? j10 + j11 : j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H3(j$.util.H h10, H3 h32) {
        this.f9821a = h10;
        this.f9822b = h32.f9822b;
        this.f9824d = h32.f9824d;
        this.f9823c = h32.f9823c;
    }

    public final int characteristics() {
        return this.f9821a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f9821a.estimateSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long n(long j10) {
        long j11;
        long min;
        do {
            j11 = this.f9824d.get();
            if (j11 != 0) {
                min = Math.min(j11, j10);
                if (min <= 0) {
                    break;
                }
            } else if (this.f9822b) {
                return j10;
            } else {
                return 0L;
            }
        } while (!this.f9824d.compareAndSet(j11, j11 - min));
        if (this.f9822b) {
            return Math.max(j10 - min, 0L);
        }
        long j12 = this.f9823c;
        return j11 > j12 ? Math.max(min - (j11 - j12), 0L) : min;
    }

    protected abstract j$.util.H o(j$.util.H h10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int p() {
        if (this.f9824d.get() > 0) {
            return 2;
        }
        return this.f9822b ? 3 : 1;
    }

    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) m6trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.D m4trySplit() {
        return (j$.util.D) m6trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.F m5trySplit() {
        return (j$.util.F) m6trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final j$.util.H m6trySplit() {
        j$.util.H trySplit;
        if (this.f9824d.get() == 0 || (trySplit = this.f9821a.trySplit()) == null) {
            return null;
        }
        return o(trySplit);
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z m7trySplit() {
        return (j$.util.z) m6trySplit();
    }
}
