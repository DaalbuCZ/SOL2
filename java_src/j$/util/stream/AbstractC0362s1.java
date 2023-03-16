package j$.util.stream;

import j$.util.AbstractC0251a;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
/* renamed from: j$.util.stream.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0362s1 implements j$.util.H {

    /* renamed from: a  reason: collision with root package name */
    P0 f10132a;

    /* renamed from: b  reason: collision with root package name */
    int f10133b;

    /* renamed from: c  reason: collision with root package name */
    j$.util.H f10134c;

    /* renamed from: d  reason: collision with root package name */
    j$.util.H f10135d;

    /* renamed from: e  reason: collision with root package name */
    Deque f10136e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0362s1(P0 p02) {
        this.f10132a = p02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final P0 b(Deque deque) {
        while (true) {
            P0 p02 = (P0) deque.pollFirst();
            if (p02 == null) {
                return null;
            }
            if (p02.n() != 0) {
                for (int n10 = p02.n() - 1; n10 >= 0; n10--) {
                    deque.addFirst(p02.f(n10));
                }
            } else if (p02.count() > 0) {
                return p02;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Deque c() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int n10 = this.f10132a.n();
        while (true) {
            n10--;
            if (n10 < this.f10133b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f10132a.f(n10));
        }
    }

    @Override // j$.util.H
    public final int characteristics() {
        return 64;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        if (this.f10132a == null) {
            return false;
        }
        if (this.f10135d == null) {
            j$.util.H h10 = this.f10134c;
            if (h10 == null) {
                Deque c10 = c();
                this.f10136e = c10;
                P0 b10 = b(c10);
                if (b10 == null) {
                    this.f10132a = null;
                    return false;
                }
                h10 = b10.spliterator();
            }
            this.f10135d = h10;
            return true;
        }
        return true;
    }

    @Override // j$.util.H
    public final long estimateSize() {
        long j10 = 0;
        if (this.f10132a == null) {
            return 0L;
        }
        j$.util.H h10 = this.f10134c;
        if (h10 != null) {
            return h10.estimateSize();
        }
        for (int i10 = this.f10133b; i10 < this.f10132a.n(); i10++) {
            j10 += this.f10132a.f(i10).count();
        }
        return j10;
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

    @Override // j$.util.H
    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) trySplit();
    }

    @Override // j$.util.H
    public /* bridge */ /* synthetic */ j$.util.D trySplit() {
        return (j$.util.D) trySplit();
    }

    @Override // j$.util.H
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.H
    public final j$.util.H trySplit() {
        P0 p02 = this.f10132a;
        if (p02 == null || this.f10135d != null) {
            return null;
        }
        j$.util.H h10 = this.f10134c;
        if (h10 != null) {
            return h10.trySplit();
        }
        if (this.f10133b < p02.n() - 1) {
            P0 p03 = this.f10132a;
            int i10 = this.f10133b;
            this.f10133b = i10 + 1;
            return p03.f(i10).spliterator();
        }
        P0 f10 = this.f10132a.f(this.f10133b);
        this.f10132a = f10;
        if (f10.n() == 0) {
            j$.util.H spliterator = this.f10132a.spliterator();
            this.f10134c = spliterator;
            return spliterator.trySplit();
        }
        this.f10133b = 0;
        P0 p04 = this.f10132a;
        this.f10133b = 0 + 1;
        return p04.f(0).spliterator();
    }

    @Override // j$.util.H
    public /* bridge */ /* synthetic */ j$.util.z trySplit() {
        return (j$.util.z) trySplit();
    }
}
