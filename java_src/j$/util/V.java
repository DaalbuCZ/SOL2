package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V implements D {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f9628a;

    /* renamed from: b  reason: collision with root package name */
    private int f9629b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9630c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9631d;

    public V(long[] jArr, int i10, int i11, int i12) {
        this.f9628a = jArr;
        this.f9629b = i10;
        this.f9630c = i11;
        this.f9631d = i12 | 64 | 16384;
    }

    @Override // j$.util.D, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.s(this, consumer);
    }

    @Override // j$.util.H
    public int characteristics() {
        return this.f9631d;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9630c - this.f9629b;
    }

    @Override // j$.util.F
    /* renamed from: f */
    public void forEachRemaining(j$.util.function.r rVar) {
        int i10;
        Objects.requireNonNull(rVar);
        long[] jArr = this.f9628a;
        int length = jArr.length;
        int i11 = this.f9630c;
        if (length < i11 || (i10 = this.f9629b) < 0) {
            return;
        }
        this.f9629b = i11;
        if (i10 < i11) {
            do {
                rVar.e(jArr[i10]);
                i10++;
            } while (i10 < i11);
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
        int i10 = this.f9629b;
        if (i10 < 0 || i10 >= this.f9630c) {
            return false;
        }
        long[] jArr = this.f9628a;
        this.f9629b = i10 + 1;
        rVar.e(jArr[i10]);
        return true;
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

    @Override // j$.util.H
    public D trySplit() {
        int i10 = this.f9629b;
        int i11 = (this.f9630c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        long[] jArr = this.f9628a;
        this.f9629b = i11;
        return new V(jArr, i10, i11, this.f9631d);
    }
}
