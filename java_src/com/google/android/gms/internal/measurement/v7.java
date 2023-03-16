package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class v7 extends r7 implements RandomAccess, va {

    /* renamed from: q  reason: collision with root package name */
    private static final v7 f4256q;

    /* renamed from: o  reason: collision with root package name */
    private boolean[] f4257o;

    /* renamed from: p  reason: collision with root package name */
    private int f4258p;

    static {
        v7 v7Var = new v7(new boolean[0], 0);
        f4256q = v7Var;
        v7Var.b();
    }

    v7() {
        this(new boolean[10], 0);
    }

    private v7(boolean[] zArr, int i10) {
        this.f4257o = zArr;
        this.f4258p = i10;
    }

    private final String h(int i10) {
        int i11 = this.f4258p;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4258p) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f4258p)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        boolean[] zArr = this.f4257o;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f4257o, i10, zArr2, i10 + 1, this.f4258p - i10);
            this.f4257o = zArr2;
        }
        this.f4257o[i10] = booleanValue;
        this.f4258p++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        p9.e(collection);
        if (collection instanceof v7) {
            v7 v7Var = (v7) collection;
            int i10 = v7Var.f4258p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4258p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                boolean[] zArr = this.f4257o;
                if (i12 > zArr.length) {
                    this.f4257o = Arrays.copyOf(zArr, i12);
                }
                System.arraycopy(v7Var.f4257o, 0, this.f4257o, this.f4258p, v7Var.f4258p);
                this.f4258p = i12;
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
        if (obj instanceof v7) {
            v7 v7Var = (v7) obj;
            if (this.f4258p != v7Var.f4258p) {
                return false;
            }
            boolean[] zArr = v7Var.f4257o;
            for (int i10 = 0; i10 < this.f4258p; i10++) {
                if (this.f4257o[i10] != zArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(boolean z10) {
        d();
        int i10 = this.f4258p;
        boolean[] zArr = this.f4257o;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f4257o = zArr2;
        }
        boolean[] zArr3 = this.f4257o;
        int i11 = this.f4258p;
        this.f4258p = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Boolean.valueOf(this.f4257o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4258p; i11++) {
            i10 = (i10 * 31) + p9.a(this.f4257o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.f4258p;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4257o[i11] == booleanValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final /* bridge */ /* synthetic */ o9 j(int i10) {
        if (i10 >= this.f4258p) {
            return new v7(Arrays.copyOf(this.f4257o, i10), this.f4258p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        boolean[] zArr = this.f4257o;
        boolean z10 = zArr[i10];
        if (i10 < this.f4258p - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f4258p--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f4257o;
        System.arraycopy(zArr, i11, zArr, i10, this.f4258p - i11);
        this.f4258p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        k(i10);
        boolean[] zArr = this.f4257o;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4258p;
    }
}
