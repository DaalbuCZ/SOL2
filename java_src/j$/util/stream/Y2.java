package j$.util.stream;

import j$.util.AbstractC0251a;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Y2 implements j$.util.F {

    /* renamed from: a  reason: collision with root package name */
    int f9935a;

    /* renamed from: b  reason: collision with root package name */
    final int f9936b;

    /* renamed from: c  reason: collision with root package name */
    int f9937c;

    /* renamed from: d  reason: collision with root package name */
    final int f9938d;

    /* renamed from: e  reason: collision with root package name */
    Object f9939e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Z2 f9940f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y2(Z2 z22, int i10, int i11, int i12, int i13) {
        this.f9940f = z22;
        this.f9935a = i10;
        this.f9936b = i11;
        this.f9937c = i12;
        this.f9938d = i13;
        Object[] objArr = z22.f9951f;
        this.f9939e = objArr == null ? z22.f9950e : objArr[i10];
    }

    abstract void b(Object obj, int i10, Object obj2);

    abstract j$.util.F c(Object obj, int i10, int i11);

    @Override // j$.util.H
    public int characteristics() {
        return 16464;
    }

    abstract j$.util.F d(int i10, int i11, int i12, int i13);

    @Override // j$.util.H
    public long estimateSize() {
        int i10 = this.f9935a;
        int i11 = this.f9936b;
        if (i10 == i11) {
            return this.f9938d - this.f9937c;
        }
        long[] jArr = this.f9940f.f10012d;
        return ((jArr[i11] + this.f9938d) - jArr[i10]) - this.f9937c;
    }

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public void m(Object obj) {
        int i10;
        Objects.requireNonNull(obj);
        int i11 = this.f9935a;
        int i12 = this.f9936b;
        if (i11 < i12 || (i11 == i12 && this.f9937c < this.f9938d)) {
            int i13 = this.f9937c;
            while (true) {
                i10 = this.f9936b;
                if (i11 >= i10) {
                    break;
                }
                Z2 z22 = this.f9940f;
                Object obj2 = z22.f9951f[i11];
                z22.t(obj2, i13, z22.u(obj2), obj);
                i13 = 0;
                i11++;
            }
            this.f9940f.t(this.f9935a == i10 ? this.f9939e : this.f9940f.f9951f[i10], i13, this.f9938d, obj);
            this.f9935a = this.f9936b;
            this.f9937c = this.f9938d;
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
        Objects.requireNonNull(obj);
        int i10 = this.f9935a;
        int i11 = this.f9936b;
        if (i10 < i11 || (i10 == i11 && this.f9937c < this.f9938d)) {
            Object obj2 = this.f9939e;
            int i12 = this.f9937c;
            this.f9937c = i12 + 1;
            b(obj2, i12, obj);
            if (this.f9937c == this.f9940f.u(this.f9939e)) {
                this.f9937c = 0;
                int i13 = this.f9935a + 1;
                this.f9935a = i13;
                Object[] objArr = this.f9940f.f9951f;
                if (objArr != null && i13 <= this.f9936b) {
                    this.f9939e = objArr[i13];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) trySplit();
    }

    @Override // j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ j$.util.D trySplit() {
        return (j$.util.D) trySplit();
    }

    @Override // j$.util.H
    public j$.util.F trySplit() {
        int i10 = this.f9935a;
        int i11 = this.f9936b;
        if (i10 < i11) {
            int i12 = this.f9937c;
            Z2 z22 = this.f9940f;
            j$.util.F d10 = d(i10, i11 - 1, i12, z22.u(z22.f9951f[i11 - 1]));
            int i13 = this.f9936b;
            this.f9935a = i13;
            this.f9937c = 0;
            this.f9939e = this.f9940f.f9951f[i13];
            return d10;
        } else if (i10 == i11) {
            int i14 = this.f9938d;
            int i15 = this.f9937c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            j$.util.F c10 = c(this.f9939e, i15, i16);
            this.f9937c += i16;
            return c10;
        } else {
            return null;
        }
    }

    @Override // j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ j$.util.z trySplit() {
        return (j$.util.z) trySplit();
    }
}
