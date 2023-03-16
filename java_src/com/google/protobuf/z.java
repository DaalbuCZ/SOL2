package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z extends c<Integer> implements a0.g, RandomAccess, b1 {

    /* renamed from: q  reason: collision with root package name */
    private static final z f6233q;

    /* renamed from: o  reason: collision with root package name */
    private int[] f6234o;

    /* renamed from: p  reason: collision with root package name */
    private int f6235p;

    static {
        z zVar = new z(new int[0], 0);
        f6233q = zVar;
        zVar.m();
    }

    z() {
        this(new int[10], 0);
    }

    private z(int[] iArr, int i10) {
        this.f6234o = iArr;
        this.f6235p = i10;
    }

    private void k(int i10, int i11) {
        int i12;
        d();
        if (i10 < 0 || i10 > (i12 = this.f6235p)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        int[] iArr = this.f6234o;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f6234o, i10, iArr2, i10 + 1, this.f6235p - i10);
            this.f6234o = iArr2;
        }
        this.f6234o[i10] = i11;
        this.f6235p++;
        ((AbstractList) this).modCount++;
    }

    public static z l() {
        return f6233q;
    }

    private void s(int i10) {
        if (i10 < 0 || i10 >= this.f6235p) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6235p;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: C */
    public Integer remove(int i10) {
        int i11;
        d();
        s(i10);
        int[] iArr = this.f6234o;
        int i12 = iArr[i10];
        if (i10 < this.f6235p - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f6235p--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: D */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(E(i10, num.intValue()));
    }

    public int E(int i10, int i11) {
        d();
        s(i10);
        int[] iArr = this.f6234o;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        d();
        a0.a(collection);
        if (collection instanceof z) {
            z zVar = (z) collection;
            int i10 = zVar.f6235p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6235p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                int[] iArr = this.f6234o;
                if (i12 > iArr.length) {
                    this.f6234o = Arrays.copyOf(iArr, i12);
                }
                System.arraycopy(zVar.f6234o, 0, this.f6234o, this.f6235p, zVar.f6235p);
                this.f6235p = i12;
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
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f6235p != zVar.f6235p) {
                return false;
            }
            int[] iArr = zVar.f6234o;
            for (int i10 = 0; i10 < this.f6235p; i10++) {
                if (this.f6234o[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public void add(int i10, Integer num) {
        k(i10, num.intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h */
    public boolean add(Integer num) {
        r(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6235p; i11++) {
            i10 = (i10 * 31) + this.f6234o[i11];
        }
        return i10;
    }

    @Override // com.google.protobuf.a0.i
    /* renamed from: i */
    public a0.i<Integer> i2(int i10) {
        if (i10 >= this.f6235p) {
            return new z(Arrays.copyOf(this.f6234o, i10), this.f6235p);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6234o[i10] == intValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.protobuf.a0.g
    public void r(int i10) {
        d();
        int i11 = this.f6235p;
        int[] iArr = this.f6234o;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f6234o = iArr2;
        }
        int[] iArr3 = this.f6234o;
        int i12 = this.f6235p;
        this.f6235p = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6234o;
        System.arraycopy(iArr, i11, iArr, i10, this.f6235p - i11);
        this.f6235p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6235p;
    }

    @Override // com.google.protobuf.a0.g
    public int u(int i10) {
        s(i10);
        return this.f6234o[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Integer get(int i10) {
        return Integer.valueOf(u(i10));
    }
}
