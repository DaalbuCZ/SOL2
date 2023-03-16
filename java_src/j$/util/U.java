package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class U implements H {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f9623a;

    /* renamed from: b  reason: collision with root package name */
    private java.util.Iterator f9624b = null;

    /* renamed from: c  reason: collision with root package name */
    private final int f9625c;

    /* renamed from: d  reason: collision with root package name */
    private long f9626d;

    /* renamed from: e  reason: collision with root package name */
    private int f9627e;

    public U(Collection collection, int i10) {
        this.f9623a = collection;
        this.f9625c = (i10 & 4096) == 0 ? i10 | 64 | 16384 : i10;
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f9624b == null) {
            this.f9624b = this.f9623a.iterator();
            this.f9626d = this.f9623a.size();
        }
        if (this.f9624b.hasNext()) {
            consumer.accept(this.f9624b.next());
            return true;
        }
        return false;
    }

    @Override // j$.util.H
    public int characteristics() {
        return this.f9625c;
    }

    @Override // j$.util.H
    public long estimateSize() {
        if (this.f9624b == null) {
            this.f9624b = this.f9623a.iterator();
            long size = this.f9623a.size();
            this.f9626d = size;
            return size;
        }
        return this.f9626d;
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.Iterator it = this.f9624b;
        if (it == null) {
            it = this.f9623a.iterator();
            this.f9624b = it;
            this.f9626d = this.f9623a.size();
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
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
        long j10;
        java.util.Iterator it = this.f9624b;
        if (it == null) {
            it = this.f9623a.iterator();
            this.f9624b = it;
            j10 = this.f9623a.size();
            this.f9626d = j10;
        } else {
            j10 = this.f9626d;
        }
        if (j10 <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f9627e + 1024;
        if (i10 > j10) {
            i10 = (int) j10;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f9627e = i11;
        long j11 = this.f9626d;
        if (j11 != Long.MAX_VALUE) {
            this.f9626d = j11 - i11;
        }
        return new M(objArr, 0, i11, this.f9625c);
    }
}
