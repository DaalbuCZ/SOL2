package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class j0 extends c<Long> implements a0.h, RandomAccess, b1 {

    /* renamed from: q  reason: collision with root package name */
    private static final j0 f6000q;

    /* renamed from: o  reason: collision with root package name */
    private long[] f6001o;

    /* renamed from: p  reason: collision with root package name */
    private int f6002p;

    static {
        j0 j0Var = new j0(new long[0], 0);
        f6000q = j0Var;
        j0Var.m();
    }

    j0() {
        this(new long[10], 0);
    }

    private j0(long[] jArr, int i10) {
        this.f6001o = jArr;
        this.f6002p = i10;
    }

    private String C(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6002p;
    }

    private void k(int i10, long j10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f6002p)) {
            throw new IndexOutOfBoundsException(C(i10));
        }
        long[] jArr = this.f6001o;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f6001o, i10, jArr2, i10 + 1, this.f6002p - i10);
            this.f6001o = jArr2;
        }
        this.f6001o[i10] = j10;
        this.f6002p++;
        ((AbstractList) this).modCount++;
    }

    private void s(int i10) {
        if (i10 < 0 || i10 >= this.f6002p) {
            throw new IndexOutOfBoundsException(C(i10));
        }
    }

    @Override // com.google.protobuf.a0.i
    /* renamed from: D */
    public a0.h i(int i10) {
        if (i10 >= this.f6002p) {
            return new j0(Arrays.copyOf(this.f6001o, i10), this.f6002p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: E */
    public Long remove(int i10) {
        int i11;
        d();
        s(i10);
        long[] jArr = this.f6001o;
        long j10 = jArr[i10];
        if (i10 < this.f6002p - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f6002p--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Long set(int i10, Long l10) {
        return Long.valueOf(G(i10, l10.longValue()));
    }

    public long G(int i10, long j10) {
        d();
        s(i10);
        long[] jArr = this.f6001o;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        d();
        a0.a(collection);
        if (collection instanceof j0) {
            j0 j0Var = (j0) collection;
            int i10 = j0Var.f6002p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6002p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                long[] jArr = this.f6001o;
                if (i12 > jArr.length) {
                    this.f6001o = Arrays.copyOf(jArr, i12);
                }
                System.arraycopy(j0Var.f6001o, 0, this.f6001o, this.f6002p, j0Var.f6002p);
                this.f6002p = i12;
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
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.f6002p != j0Var.f6002p) {
                return false;
            }
            long[] jArr = j0Var.f6001o;
            for (int i10 = 0; i10 < this.f6002p; i10++) {
                if (this.f6001o[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public void add(int i10, Long l10) {
        k(i10, l10.longValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h */
    public boolean add(Long l10) {
        l(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6002p; i11++) {
            i10 = (i10 * 31) + a0.f(this.f6001o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6001o[i10] == longValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public void l(long j10) {
        d();
        int i10 = this.f6002p;
        long[] jArr = this.f6001o;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f6001o = jArr2;
        }
        long[] jArr3 = this.f6001o;
        int i11 = this.f6002p;
        this.f6002p = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6001o;
        System.arraycopy(jArr, i11, jArr, i10, this.f6002p - i11);
        this.f6002p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6002p;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Long get(int i10) {
        return Long.valueOf(x(i10));
    }

    public long x(int i10) {
        s(i10);
        return this.f6001o[i10];
    }
}
