package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class f extends c<Boolean> implements a0.a, RandomAccess, b1 {

    /* renamed from: q  reason: collision with root package name */
    private static final f f5951q;

    /* renamed from: o  reason: collision with root package name */
    private boolean[] f5952o;

    /* renamed from: p  reason: collision with root package name */
    private int f5953p;

    static {
        f fVar = new f(new boolean[0], 0);
        f5951q = fVar;
        fVar.m();
    }

    f() {
        this(new boolean[10], 0);
    }

    private f(boolean[] zArr, int i10) {
        this.f5952o = zArr;
        this.f5953p = i10;
    }

    private String C(int i10) {
        return "Index:" + i10 + ", Size:" + this.f5953p;
    }

    private void k(int i10, boolean z10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f5953p)) {
            throw new IndexOutOfBoundsException(C(i10));
        }
        boolean[] zArr = this.f5952o;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f5952o, i10, zArr2, i10 + 1, this.f5953p - i10);
            this.f5952o = zArr2;
        }
        this.f5952o[i10] = z10;
        this.f5953p++;
        ((AbstractList) this).modCount++;
    }

    private void s(int i10) {
        if (i10 < 0 || i10 >= this.f5953p) {
            throw new IndexOutOfBoundsException(C(i10));
        }
    }

    @Override // com.google.protobuf.a0.i
    /* renamed from: D */
    public a0.a i(int i10) {
        if (i10 >= this.f5953p) {
            return new f(Arrays.copyOf(this.f5952o, i10), this.f5953p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: E */
    public Boolean remove(int i10) {
        int i11;
        d();
        s(i10);
        boolean[] zArr = this.f5952o;
        boolean z10 = zArr[i10];
        if (i10 < this.f5953p - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f5953p--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(G(i10, bool.booleanValue()));
    }

    public boolean G(int i10, boolean z10) {
        d();
        s(i10);
        boolean[] zArr = this.f5952o;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        d();
        a0.a(collection);
        if (collection instanceof f) {
            f fVar = (f) collection;
            int i10 = fVar.f5953p;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f5953p;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                boolean[] zArr = this.f5952o;
                if (i12 > zArr.length) {
                    this.f5952o = Arrays.copyOf(zArr, i12);
                }
                System.arraycopy(fVar.f5952o, 0, this.f5952o, this.f5953p, fVar.f5953p);
                this.f5953p = i12;
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
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f5953p != fVar.f5953p) {
                return false;
            }
            boolean[] zArr = fVar.f5952o;
            for (int i10 = 0; i10 < this.f5953p; i10++) {
                if (this.f5952o[i10] != zArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public void add(int i10, Boolean bool) {
        k(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h */
    public boolean add(Boolean bool) {
        l(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5953p; i11++) {
            i10 = (i10 * 31) + a0.c(this.f5952o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f5952o[i10] == booleanValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public void l(boolean z10) {
        d();
        int i10 = this.f5953p;
        boolean[] zArr = this.f5952o;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f5952o = zArr2;
        }
        boolean[] zArr3 = this.f5952o;
        int i11 = this.f5953p;
        this.f5953p = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f5952o;
        System.arraycopy(zArr, i11, zArr, i10, this.f5953p - i11);
        this.f5953p -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5953p;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Boolean get(int i10) {
        return Boolean.valueOf(x(i10));
    }

    public boolean x(int i10) {
        s(i10);
        return this.f5952o[i10];
    }
}
