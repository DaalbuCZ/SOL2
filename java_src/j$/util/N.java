package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N implements z {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f9615a;

    /* renamed from: b  reason: collision with root package name */
    private int f9616b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9617c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9618d;

    public N(double[] dArr, int i10, int i11, int i12) {
        this.f9615a = dArr;
        this.f9616b = i10;
        this.f9617c = i11;
        this.f9618d = i12 | 64 | 16384;
    }

    @Override // j$.util.z, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.q(this, consumer);
    }

    @Override // j$.util.H
    public int characteristics() {
        return this.f9618d;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9617c - this.f9616b;
    }

    @Override // j$.util.z, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.c(this, consumer);
    }

    @Override // j$.util.H
    public Comparator getComparator() {
        if (AbstractC0251a.j(this, 4)) {
            return null;
        }
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
        int i10 = this.f9616b;
        if (i10 < 0 || i10 >= this.f9617c) {
            return false;
        }
        double[] dArr = this.f9615a;
        this.f9616b = i10 + 1;
        hVar.c(dArr[i10]);
        return true;
    }

    @Override // j$.util.F
    /* renamed from: l */
    public void forEachRemaining(j$.util.function.h hVar) {
        int i10;
        Objects.requireNonNull(hVar);
        double[] dArr = this.f9615a;
        int length = dArr.length;
        int i11 = this.f9617c;
        if (length < i11 || (i10 = this.f9616b) < 0) {
            return;
        }
        this.f9616b = i11;
        if (i10 < i11) {
            do {
                hVar.c(dArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.H
    public z trySplit() {
        int i10 = this.f9616b;
        int i11 = (this.f9617c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        double[] dArr = this.f9615a;
        this.f9616b = i11;
        return new N(dArr, i10, i11, this.f9618d);
    }
}
