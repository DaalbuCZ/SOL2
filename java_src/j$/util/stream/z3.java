package j$.util.stream;

import j$.util.AbstractC0251a;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class z3 extends B3 implements j$.util.F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(j$.util.F f10, long j10, long j11) {
        super(f10, j10, j11, 0L, Math.min(f10.estimateSize(), j11));
    }

    protected abstract Object c();

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public void m(Object obj) {
        Objects.requireNonNull(obj);
        long j10 = this.f9782a;
        long j11 = this.f9786e;
        if (j10 >= j11) {
            return;
        }
        long j12 = this.f9785d;
        if (j12 >= j11) {
            return;
        }
        if (j12 >= j10 && ((j$.util.F) this.f9784c).estimateSize() + j12 <= this.f9783b) {
            ((j$.util.F) this.f9784c).forEachRemaining(obj);
            this.f9785d = this.f9786e;
            return;
        }
        while (this.f9782a > this.f9785d) {
            ((j$.util.F) this.f9784c).tryAdvance(c());
            this.f9785d++;
        }
        while (this.f9785d < this.f9786e) {
            ((j$.util.F) this.f9784c).tryAdvance(obj);
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

    @Override // j$.util.F
    /* renamed from: tryAdvance */
    public boolean k(Object obj) {
        long j10;
        Objects.requireNonNull(obj);
        if (this.f9782a >= this.f9786e) {
            return false;
        }
        while (true) {
            long j11 = this.f9782a;
            j10 = this.f9785d;
            if (j11 <= j10) {
                break;
            }
            ((j$.util.F) this.f9784c).tryAdvance(c());
            this.f9785d++;
        }
        if (j10 >= this.f9786e) {
            return false;
        }
        this.f9785d = j10 + 1;
        return ((j$.util.F) this.f9784c).tryAdvance(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(j$.util.F f10, long j10, long j11, long j12, long j13, D0 d02) {
        super(f10, j10, j11, j12, j13);
    }
}
