package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class b9 extends r7 implements RandomAccess, va {

    /* renamed from: q  reason: collision with root package name */
    private static final b9 f3739q;

    /* renamed from: o  reason: collision with root package name */
    private float[] f3740o;

    /* renamed from: p  reason: collision with root package name */
    private int f3741p;

    static {
        b9 b9Var = new b9(new float[0], 0);
        f3739q = b9Var;
        b9Var.b();
    }

    b9() {
        this(new float[10], 0);
    }

    private b9(float[] fArr, int i10) {
        this.f3740o = fArr;
        this.f3741p = i10;
    }

    private final String h(int i10) {
        int i11 = this.f3741p;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f3741p) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f3741p)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        float[] fArr = this.f3740o;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f3740o, i10, fArr2, i10 + 1, this.f3741p - i10);
            this.f3740o = fArr2;
        }
        this.f3740o[i10] = floatValue;
        this.f3741p++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        p9.e(collection);
        if (collection instanceof b9) {
            b9 b9Var = (b9) collection;
            int i10 = b9Var.f3741p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f3741p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                float[] fArr = this.f3740o;
                if (i12 > fArr.length) {
                    this.f3740o = Arrays.copyOf(fArr, i12);
                }
                System.arraycopy(b9Var.f3740o, 0, this.f3740o, this.f3741p, b9Var.f3741p);
                this.f3741p = i12;
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
        if (obj instanceof b9) {
            b9 b9Var = (b9) obj;
            if (this.f3741p != b9Var.f3741p) {
                return false;
            }
            float[] fArr = b9Var.f3740o;
            for (int i10 = 0; i10 < this.f3741p; i10++) {
                if (Float.floatToIntBits(this.f3740o[i10]) != Float.floatToIntBits(fArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(float f10) {
        d();
        int i10 = this.f3741p;
        float[] fArr = this.f3740o;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f3740o = fArr2;
        }
        float[] fArr3 = this.f3740o;
        int i11 = this.f3741p;
        this.f3741p = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Float.valueOf(this.f3740o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3741p; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f3740o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.f3741p;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f3740o[i11] == floatValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final /* bridge */ /* synthetic */ o9 j(int i10) {
        if (i10 >= this.f3741p) {
            return new b9(Arrays.copyOf(this.f3740o, i10), this.f3741p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        float[] fArr = this.f3740o;
        float f10 = fArr[i10];
        if (i10 < this.f3741p - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f3741p--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f3740o;
        System.arraycopy(fArr, i11, fArr, i10, this.f3741p - i11);
        this.f3741p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        k(i10);
        float[] fArr = this.f3740o;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3741p;
    }
}
