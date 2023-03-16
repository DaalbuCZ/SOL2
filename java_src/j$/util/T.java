package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T implements B {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f9619a;

    /* renamed from: b  reason: collision with root package name */
    private int f9620b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9621c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9622d;

    public T(int[] iArr, int i10, int i11, int i12) {
        this.f9619a = iArr;
        this.f9620b = i10;
        this.f9621c = i11;
        this.f9622d = i12 | 64 | 16384;
    }

    @Override // j$.util.B, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.r(this, consumer);
    }

    @Override // j$.util.H
    public int characteristics() {
        return this.f9622d;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9621c - this.f9620b;
    }

    @Override // j$.util.B, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.d(this, consumer);
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
    /* renamed from: i */
    public boolean tryAdvance(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        int i10 = this.f9620b;
        if (i10 < 0 || i10 >= this.f9621c) {
            return false;
        }
        int[] iArr = this.f9619a;
        this.f9620b = i10 + 1;
        mVar.d(iArr[i10]);
        return true;
    }

    @Override // j$.util.F
    /* renamed from: m */
    public void forEachRemaining(j$.util.function.m mVar) {
        int i10;
        Objects.requireNonNull(mVar);
        int[] iArr = this.f9619a;
        int length = iArr.length;
        int i11 = this.f9621c;
        if (length < i11 || (i10 = this.f9620b) < 0) {
            return;
        }
        this.f9620b = i11;
        if (i10 < i11) {
            do {
                mVar.d(iArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.H
    public B trySplit() {
        int i10 = this.f9620b;
        int i11 = (this.f9621c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        int[] iArr = this.f9619a;
        this.f9620b = i11;
        return new T(iArr, i10, i11, this.f9622d);
    }
}
