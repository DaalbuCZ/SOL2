package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class w extends c<Float> implements a0.f, RandomAccess, b1 {

    /* renamed from: q  reason: collision with root package name */
    private static final w f6206q;

    /* renamed from: o  reason: collision with root package name */
    private float[] f6207o;

    /* renamed from: p  reason: collision with root package name */
    private int f6208p;

    static {
        w wVar = new w(new float[0], 0);
        f6206q = wVar;
        wVar.m();
    }

    w() {
        this(new float[10], 0);
    }

    private w(float[] fArr, int i10) {
        this.f6207o = fArr;
        this.f6208p = i10;
    }

    private String C(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6208p;
    }

    private void l(int i10, float f10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f6208p)) {
            throw new IndexOutOfBoundsException(C(i10));
        }
        float[] fArr = this.f6207o;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f6207o, i10, fArr2, i10 + 1, this.f6208p - i10);
            this.f6207o = fArr2;
        }
        this.f6207o[i10] = f10;
        this.f6208p++;
        ((AbstractList) this).modCount++;
    }

    private void s(int i10) {
        if (i10 < 0 || i10 >= this.f6208p) {
            throw new IndexOutOfBoundsException(C(i10));
        }
    }

    @Override // com.google.protobuf.a0.i
    /* renamed from: D */
    public a0.f i(int i10) {
        if (i10 >= this.f6208p) {
            return new w(Arrays.copyOf(this.f6207o, i10), this.f6208p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: E */
    public Float remove(int i10) {
        int i11;
        d();
        s(i10);
        float[] fArr = this.f6207o;
        float f10 = fArr[i10];
        if (i10 < this.f6208p - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f6208p--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Float set(int i10, Float f10) {
        return Float.valueOf(G(i10, f10.floatValue()));
    }

    public float G(int i10, float f10) {
        d();
        s(i10);
        float[] fArr = this.f6207o;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        d();
        a0.a(collection);
        if (collection instanceof w) {
            w wVar = (w) collection;
            int i10 = wVar.f6208p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6208p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                float[] fArr = this.f6207o;
                if (i12 > fArr.length) {
                    this.f6207o = Arrays.copyOf(fArr, i12);
                }
                System.arraycopy(wVar.f6207o, 0, this.f6207o, this.f6208p, wVar.f6208p);
                this.f6208p = i12;
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
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f6208p != wVar.f6208p) {
                return false;
            }
            float[] fArr = wVar.f6207o;
            for (int i10 = 0; i10 < this.f6208p; i10++) {
                if (Float.floatToIntBits(this.f6207o[i10]) != Float.floatToIntBits(fArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public void add(int i10, Float f10) {
        l(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h */
    public boolean add(Float f10) {
        k(f10.floatValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6208p; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f6207o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6207o[i10] == floatValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public void k(float f10) {
        d();
        int i10 = this.f6208p;
        float[] fArr = this.f6207o;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f6207o = fArr2;
        }
        float[] fArr3 = this.f6207o;
        int i11 = this.f6208p;
        this.f6208p = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f6207o;
        System.arraycopy(fArr, i11, fArr, i10, this.f6208p - i11);
        this.f6208p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6208p;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Float get(int i10) {
        return Float.valueOf(x(i10));
    }

    public float x(int i10) {
        s(i10);
        return this.f6207o[i10];
    }
}
