package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class da extends r7 implements RandomAccess, n9, va {

    /* renamed from: q  reason: collision with root package name */
    private static final da f3808q;

    /* renamed from: o  reason: collision with root package name */
    private long[] f3809o;

    /* renamed from: p  reason: collision with root package name */
    private int f3810p;

    static {
        da daVar = new da(new long[0], 0);
        f3808q = daVar;
        daVar.b();
    }

    da() {
        this(new long[10], 0);
    }

    private da(long[] jArr, int i10) {
        this.f3809o = jArr;
        this.f3810p = i10;
    }

    public static da g() {
        return f3808q;
    }

    private final String k(int i10) {
        int i11 = this.f3810p;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f3810p) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.n9
    public final long a(int i10) {
        l(i10);
        return this.f3809o[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f3810p)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f3809o;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f3809o, i10, jArr2, i10 + 1, this.f3810p - i10);
            this.f3809o = jArr2;
        }
        this.f3809o[i10] = longValue;
        this.f3810p++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        p9.e(collection);
        if (collection instanceof da) {
            da daVar = (da) collection;
            int i10 = daVar.f3810p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f3810p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                long[] jArr = this.f3809o;
                if (i12 > jArr.length) {
                    this.f3809o = Arrays.copyOf(jArr, i12);
                }
                System.arraycopy(daVar.f3809o, 0, this.f3809o, this.f3810p, daVar.f3810p);
                this.f3810p = i12;
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
        if (obj instanceof da) {
            da daVar = (da) obj;
            if (this.f3810p != daVar.f3810p) {
                return false;
            }
            long[] jArr = daVar.f3809o;
            for (int i10 = 0; i10 < this.f3810p; i10++) {
                if (this.f3809o[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Long.valueOf(this.f3809o[i10]);
    }

    public final void h(long j10) {
        d();
        int i10 = this.f3810p;
        long[] jArr = this.f3809o;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f3809o = jArr2;
        }
        long[] jArr3 = this.f3809o;
        int i11 = this.f3810p;
        this.f3810p = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3810p; i11++) {
            i10 = (i10 * 31) + p9.c(this.f3809o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f3810p;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f3809o[i11] == longValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    /* renamed from: o */
    public final n9 j(int i10) {
        if (i10 >= this.f3810p) {
            return new da(Arrays.copyOf(this.f3809o, i10), this.f3810p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        l(i10);
        long[] jArr = this.f3809o;
        long j10 = jArr[i10];
        if (i10 < this.f3810p - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f3810p--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f3809o;
        System.arraycopy(jArr, i11, jArr, i10, this.f3810p - i11);
        this.f3810p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        l(i10);
        long[] jArr = this.f3809o;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3810p;
    }
}
