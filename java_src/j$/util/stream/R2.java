package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class R2 implements j$.util.H {

    /* renamed from: a  reason: collision with root package name */
    int f9894a;

    /* renamed from: b  reason: collision with root package name */
    final int f9895b;

    /* renamed from: c  reason: collision with root package name */
    int f9896c;

    /* renamed from: d  reason: collision with root package name */
    final int f9897d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f9898e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C0278a3 f9899f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(C0278a3 c0278a3, int i10, int i11, int i12, int i13) {
        this.f9899f = c0278a3;
        this.f9894a = i10;
        this.f9895b = i11;
        this.f9896c = i12;
        this.f9897d = i13;
        Object[][] objArr = c0278a3.f9978f;
        this.f9898e = objArr == null ? c0278a3.f9977e : objArr[i10];
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f9894a;
        int i11 = this.f9895b;
        if (i10 < i11 || (i10 == i11 && this.f9896c < this.f9897d)) {
            Object[] objArr = this.f9898e;
            int i12 = this.f9896c;
            this.f9896c = i12 + 1;
            consumer.accept(objArr[i12]);
            if (this.f9896c == this.f9898e.length) {
                this.f9896c = 0;
                int i13 = this.f9894a + 1;
                this.f9894a = i13;
                Object[][] objArr2 = this.f9899f.f9978f;
                if (objArr2 != null && i13 <= this.f9895b) {
                    this.f9898e = objArr2[i13];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.H
    public int characteristics() {
        return 16464;
    }

    @Override // j$.util.H
    public long estimateSize() {
        int i10 = this.f9894a;
        int i11 = this.f9895b;
        if (i10 == i11) {
            return this.f9897d - this.f9896c;
        }
        long[] jArr = this.f9899f.f10012d;
        return ((jArr[i11] + this.f9897d) - jArr[i10]) - this.f9896c;
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        int i10;
        Objects.requireNonNull(consumer);
        int i11 = this.f9894a;
        int i12 = this.f9895b;
        if (i11 < i12 || (i11 == i12 && this.f9896c < this.f9897d)) {
            int i13 = this.f9896c;
            while (true) {
                i10 = this.f9895b;
                if (i11 >= i10) {
                    break;
                }
                Object[] objArr = this.f9899f.f9978f[i11];
                while (i13 < objArr.length) {
                    consumer.accept(objArr[i13]);
                    i13++;
                }
                i13 = 0;
                i11++;
            }
            Object[] objArr2 = this.f9894a == i10 ? this.f9898e : this.f9899f.f9978f[i10];
            int i14 = this.f9897d;
            while (i13 < i14) {
                consumer.accept(objArr2[i13]);
                i13++;
            }
            this.f9894a = this.f9895b;
            this.f9896c = this.f9897d;
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

    @Override // j$.util.H
    public j$.util.H trySplit() {
        int i10 = this.f9894a;
        int i11 = this.f9895b;
        if (i10 < i11) {
            C0278a3 c0278a3 = this.f9899f;
            int i12 = i11 - 1;
            R2 r22 = new R2(c0278a3, i10, i12, this.f9896c, c0278a3.f9978f[i12].length);
            int i13 = this.f9895b;
            this.f9894a = i13;
            this.f9896c = 0;
            this.f9898e = this.f9899f.f9978f[i13];
            return r22;
        } else if (i10 == i11) {
            int i14 = this.f9897d;
            int i15 = this.f9896c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            j$.util.H m10 = j$.util.W.m(this.f9898e, i15, i15 + i16, 1040);
            this.f9896c += i16;
            return m10;
        } else {
            return null;
        }
    }
}
