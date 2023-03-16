package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class M implements H {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f9611a;

    /* renamed from: b  reason: collision with root package name */
    private int f9612b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9613c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9614d;

    public M(Object[] objArr, int i10, int i11, int i12) {
        this.f9611a = objArr;
        this.f9612b = i10;
        this.f9613c = i11;
        this.f9614d = i12 | 64 | 16384;
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f9612b;
        if (i10 < 0 || i10 >= this.f9613c) {
            return false;
        }
        Object[] objArr = this.f9611a;
        this.f9612b = i10 + 1;
        consumer.accept(objArr[i10]);
        return true;
    }

    @Override // j$.util.H
    public int characteristics() {
        return this.f9614d;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9613c - this.f9612b;
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        int i10;
        Objects.requireNonNull(consumer);
        Object[] objArr = this.f9611a;
        int length = objArr.length;
        int i11 = this.f9613c;
        if (length < i11 || (i10 = this.f9612b) < 0) {
            return;
        }
        this.f9612b = i11;
        if (i10 < i11) {
            do {
                consumer.accept(objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
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
    public H trySplit() {
        int i10 = this.f9612b;
        int i11 = (this.f9613c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        Object[] objArr = this.f9611a;
        this.f9612b = i11;
        return new M(objArr, i10, i11, this.f9614d);
    }
}
