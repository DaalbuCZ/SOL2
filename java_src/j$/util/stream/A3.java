package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A3 extends B3 implements j$.util.H {
    /* JADX INFO: Access modifiers changed from: package-private */
    public A3(j$.util.H h10, long j10, long j11) {
        super(h10, j10, j11, 0L, Math.min(h10.estimateSize(), j11));
    }

    private A3(j$.util.H h10, long j10, long j11, long j12, long j13) {
        super(h10, j10, j11, j12, j13);
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        long j10;
        Objects.requireNonNull(consumer);
        if (this.f9782a >= this.f9786e) {
            return false;
        }
        while (true) {
            long j11 = this.f9782a;
            j10 = this.f9785d;
            if (j11 <= j10) {
                break;
            }
            this.f9784c.a(C0329l.f10092j);
            this.f9785d++;
        }
        if (j10 >= this.f9786e) {
            return false;
        }
        this.f9785d = j10 + 1;
        return this.f9784c.a(consumer);
    }

    @Override // j$.util.stream.B3
    protected j$.util.H b(j$.util.H h10, long j10, long j11, long j12, long j13) {
        return new A3(h10, j10, j11, j12, j13);
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j10 = this.f9782a;
        long j11 = this.f9786e;
        if (j10 >= j11) {
            return;
        }
        long j12 = this.f9785d;
        if (j12 >= j11) {
            return;
        }
        if (j12 >= j10 && this.f9784c.estimateSize() + j12 <= this.f9783b) {
            this.f9784c.forEachRemaining(consumer);
            this.f9785d = this.f9786e;
            return;
        }
        while (this.f9782a > this.f9785d) {
            this.f9784c.a(C0324k.f10077n);
            this.f9785d++;
        }
        while (this.f9785d < this.f9786e) {
            this.f9784c.a(consumer);
            this.f9785d++;
        }
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
