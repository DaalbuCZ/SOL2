package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class j9 extends r7 implements RandomAccess, m9, va {

    /* renamed from: q  reason: collision with root package name */
    private static final j9 f3927q;

    /* renamed from: o  reason: collision with root package name */
    private int[] f3928o;

    /* renamed from: p  reason: collision with root package name */
    private int f3929p;

    static {
        j9 j9Var = new j9(new int[0], 0);
        f3927q = j9Var;
        j9Var.b();
    }

    j9() {
        this(new int[10], 0);
    }

    private j9(int[] iArr, int i10) {
        this.f3928o = iArr;
        this.f3929p = i10;
    }

    public static j9 h() {
        return f3927q;
    }

    private final String l(int i10) {
        int i11 = this.f3929p;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void s(int i10) {
        if (i10 < 0 || i10 >= this.f3929p) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f3929p)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int[] iArr = this.f3928o;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f3928o, i10, iArr2, i10 + 1, this.f3929p - i10);
            this.f3928o = iArr2;
        }
        this.f3928o[i10] = intValue;
        this.f3929p++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        p9.e(collection);
        if (collection instanceof j9) {
            j9 j9Var = (j9) collection;
            int i10 = j9Var.f3929p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f3929p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                int[] iArr = this.f3928o;
                if (i12 > iArr.length) {
                    this.f3928o = Arrays.copyOf(iArr, i12);
                }
                System.arraycopy(j9Var.f3928o, 0, this.f3928o, this.f3929p, j9Var.f3929p);
                this.f3929p = i12;
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
        if (obj instanceof j9) {
            j9 j9Var = (j9) obj;
            if (this.f3929p != j9Var.f3929p) {
                return false;
            }
            int[] iArr = j9Var.f3928o;
            for (int i10 = 0; i10 < this.f3929p; i10++) {
                if (this.f3928o[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final int g(int i10) {
        s(i10);
        return this.f3928o[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        s(i10);
        return Integer.valueOf(this.f3928o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3929p; i11++) {
            i10 = (i10 * 31) + this.f3928o[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f3929p;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f3928o[i11] == intValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void k(int i10) {
        d();
        int i11 = this.f3929p;
        int[] iArr = this.f3928o;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f3928o = iArr2;
        }
        int[] iArr3 = this.f3928o;
        int i12 = this.f3929p;
        this.f3929p = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        s(i10);
        int[] iArr = this.f3928o;
        int i12 = iArr[i10];
        if (i10 < this.f3929p - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f3929p--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f3928o;
        System.arraycopy(iArr, i11, iArr, i10, this.f3929p - i11);
        this.f3929p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        s(i10);
        int[] iArr = this.f3928o;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3929p;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    /* renamed from: y */
    public final m9 j(int i10) {
        if (i10 >= this.f3929p) {
            return new j9(Arrays.copyOf(this.f3928o, i10), this.f3929p);
        }
        throw new IllegalArgumentException();
    }
}
