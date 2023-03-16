package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class m extends c<Double> implements a0.b, RandomAccess, b1 {

    /* renamed from: q  reason: collision with root package name */
    private static final m f6053q;

    /* renamed from: o  reason: collision with root package name */
    private double[] f6054o;

    /* renamed from: p  reason: collision with root package name */
    private int f6055p;

    static {
        m mVar = new m(new double[0], 0);
        f6053q = mVar;
        mVar.m();
    }

    m() {
        this(new double[10], 0);
    }

    private m(double[] dArr, int i10) {
        this.f6054o = dArr;
        this.f6055p = i10;
    }

    private String C(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6055p;
    }

    private void l(int i10, double d10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f6055p)) {
            throw new IndexOutOfBoundsException(C(i10));
        }
        double[] dArr = this.f6054o;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f6054o, i10, dArr2, i10 + 1, this.f6055p - i10);
            this.f6054o = dArr2;
        }
        this.f6054o[i10] = d10;
        this.f6055p++;
        ((AbstractList) this).modCount++;
    }

    private void s(int i10) {
        if (i10 < 0 || i10 >= this.f6055p) {
            throw new IndexOutOfBoundsException(C(i10));
        }
    }

    @Override // com.google.protobuf.a0.i
    /* renamed from: D */
    public a0.b i(int i10) {
        if (i10 >= this.f6055p) {
            return new m(Arrays.copyOf(this.f6054o, i10), this.f6055p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: E */
    public Double remove(int i10) {
        int i11;
        d();
        s(i10);
        double[] dArr = this.f6054o;
        double d10 = dArr[i10];
        if (i10 < this.f6055p - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f6055p--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Double set(int i10, Double d10) {
        return Double.valueOf(G(i10, d10.doubleValue()));
    }

    public double G(int i10, double d10) {
        d();
        s(i10);
        double[] dArr = this.f6054o;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        d();
        a0.a(collection);
        if (collection instanceof m) {
            m mVar = (m) collection;
            int i10 = mVar.f6055p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6055p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                double[] dArr = this.f6054o;
                if (i12 > dArr.length) {
                    this.f6054o = Arrays.copyOf(dArr, i12);
                }
                System.arraycopy(mVar.f6054o, 0, this.f6054o, this.f6055p, mVar.f6055p);
                this.f6055p = i12;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f6055p != mVar.f6055p) {
                return false;
            }
            double[] dArr = mVar.f6054o;
            for (int i10 = 0; i10 < this.f6055p; i10++) {
                if (Double.doubleToLongBits(this.f6054o[i10]) != Double.doubleToLongBits(dArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public void add(int i10, Double d10) {
        l(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h */
    public boolean add(Double d10) {
        k(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6055p; i11++) {
            i10 = (i10 * 31) + a0.f(Double.doubleToLongBits(this.f6054o[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6054o[i10] == doubleValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public void k(double d10) {
        d();
        int i10 = this.f6055p;
        double[] dArr = this.f6054o;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f6054o = dArr2;
        }
        double[] dArr3 = this.f6054o;
        int i11 = this.f6055p;
        this.f6055p = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f6054o;
        System.arraycopy(dArr, i11, dArr, i10, this.f6055p - i11);
        this.f6055p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6055p;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Double get(int i10) {
        return Double.valueOf(x(i10));
    }

    public double x(int i10) {
        s(i10);
        return this.f6054o[i10];
    }
}
