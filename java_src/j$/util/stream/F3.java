package j$.util.stream;

import j$.util.AbstractC0251a;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class F3 extends H3 implements j$.util.F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(j$.util.F f10, long j10, long j11) {
        super(f10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(j$.util.F f10, F3 f32) {
        super(f10, f32);
    }

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public void m(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC0323j3 abstractC0323j3 = null;
        while (true) {
            int p10 = p();
            if (p10 == 1) {
                return;
            }
            if (p10 != 2) {
                ((j$.util.F) this.f9821a).forEachRemaining(obj);
                return;
            }
            if (abstractC0323j3 == null) {
                abstractC0323j3 = t(128);
            } else {
                abstractC0323j3.f10063b = 0;
            }
            long j10 = 0;
            while (((j$.util.F) this.f9821a).tryAdvance(abstractC0323j3)) {
                j10++;
                if (j10 >= 128) {
                    break;
                }
            }
            if (j10 == 0) {
                return;
            }
            abstractC0323j3.a(obj, n(j10));
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

    protected abstract void s(Object obj);

    protected abstract AbstractC0323j3 t(int i10);

    @Override // j$.util.F
    /* renamed from: tryAdvance */
    public boolean k(Object obj) {
        Objects.requireNonNull(obj);
        while (p() != 1 && ((j$.util.F) this.f9821a).tryAdvance(this)) {
            if (n(1L) == 1) {
                s(obj);
                return true;
            }
        }
        return false;
    }
}
