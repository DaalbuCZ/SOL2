package j$.util.stream;
/* loaded from: classes2.dex */
abstract class B3 {

    /* renamed from: a  reason: collision with root package name */
    final long f9782a;

    /* renamed from: b  reason: collision with root package name */
    final long f9783b;

    /* renamed from: c  reason: collision with root package name */
    j$.util.H f9784c;

    /* renamed from: d  reason: collision with root package name */
    long f9785d;

    /* renamed from: e  reason: collision with root package name */
    long f9786e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(j$.util.H h10, long j10, long j11, long j12, long j13) {
        this.f9784c = h10;
        this.f9782a = j10;
        this.f9783b = j11;
        this.f9785d = j12;
        this.f9786e = j13;
    }

    protected abstract j$.util.H b(j$.util.H h10, long j10, long j11, long j12, long j13);

    public int characteristics() {
        return this.f9784c.characteristics();
    }

    public long estimateSize() {
        long j10 = this.f9782a;
        long j11 = this.f9786e;
        if (j10 < j11) {
            return j11 - Math.max(j10, this.f9785d);
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) m2trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.D m0trySplit() {
        return (j$.util.D) m2trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.F m1trySplit() {
        return (j$.util.F) m2trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public j$.util.H m2trySplit() {
        long j10 = this.f9782a;
        long j11 = this.f9786e;
        if (j10 >= j11 || this.f9785d >= j11) {
            return null;
        }
        while (true) {
            j$.util.H trySplit = this.f9784c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f9785d;
            long min = Math.min(estimateSize, this.f9783b);
            long j12 = this.f9782a;
            if (j12 >= min) {
                this.f9785d = min;
            } else {
                long j13 = this.f9783b;
                if (min < j13) {
                    long j14 = this.f9785d;
                    if (j14 < j12 || estimateSize > j13) {
                        this.f9785d = min;
                        return b(trySplit, j12, j13, j14, min);
                    }
                    this.f9785d = min;
                    return trySplit;
                }
                this.f9784c = trySplit;
                this.f9786e = min;
            }
        }
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z m3trySplit() {
        return (j$.util.z) m2trySplit();
    }
}
