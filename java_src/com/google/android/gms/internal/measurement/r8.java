package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class r8 extends r7 implements RandomAccess, va {

    /* renamed from: q  reason: collision with root package name */
    private static final r8 f4117q;

    /* renamed from: o  reason: collision with root package name */
    private double[] f4118o;

    /* renamed from: p  reason: collision with root package name */
    private int f4119p;

    static {
        r8 r8Var = new r8(new double[0], 0);
        f4117q = r8Var;
        r8Var.b();
    }

    r8() {
        this(new double[10], 0);
    }

    private r8(double[] dArr, int i10) {
        this.f4118o = dArr;
        this.f4119p = i10;
    }

    private final String h(int i10) {
        int i11 = this.f4119p;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4119p) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f4119p)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        double[] dArr = this.f4118o;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f4118o, i10, dArr2, i10 + 1, this.f4119p - i10);
            this.f4118o = dArr2;
        }
        this.f4118o[i10] = doubleValue;
        this.f4119p++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        p9.e(collection);
        if (collection instanceof r8) {
            r8 r8Var = (r8) collection;
            int i10 = r8Var.f4119p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4119p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                double[] dArr = this.f4118o;
                if (i12 > dArr.length) {
                    this.f4118o = Arrays.copyOf(dArr, i12);
                }
                System.arraycopy(r8Var.f4118o, 0, this.f4118o, this.f4119p, r8Var.f4119p);
                this.f4119p = i12;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8) {
            r8 r8Var = (r8) obj;
            if (this.f4119p != r8Var.f4119p) {
                return false;
            }
            double[] dArr = r8Var.f4118o;
            for (int i10 = 0; i10 < this.f4119p; i10++) {
                if (Double.doubleToLongBits(this.f4118o[i10]) != Double.doubleToLongBits(dArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(double d10) {
        d();
        int i10 = this.f4119p;
        double[] dArr = this.f4118o;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f4118o = dArr2;
        }
        double[] dArr3 = this.f4118o;
        int i11 = this.f4119p;
        this.f4119p = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Double.valueOf(this.f4118o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4119p; i11++) {
            i10 = (i10 * 31) + p9.c(Double.doubleToLongBits(this.f4118o[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i10 = this.f4119p;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4118o[i11] == doubleValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final /* bridge */ /* synthetic */ o9 j(int i10) {
        if (i10 >= this.f4119p) {
            return new r8(Arrays.copyOf(this.f4118o, i10), this.f4119p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        double[] dArr = this.f4118o;
        double d10 = dArr[i10];
        if (i10 < this.f4119p - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f4119p--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f4118o;
        System.arraycopy(dArr, i11, dArr, i10, this.f4119p - i11);
        this.f4119p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        k(i10);
        double[] dArr = this.f4118o;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4119p;
    }
}
