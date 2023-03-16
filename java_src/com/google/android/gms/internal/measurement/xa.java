package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class xa extends r7 implements RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    private static final xa f4292q;

    /* renamed from: o  reason: collision with root package name */
    private Object[] f4293o;

    /* renamed from: p  reason: collision with root package name */
    private int f4294p;

    static {
        xa xaVar = new xa(new Object[0], 0);
        f4292q = xaVar;
        xaVar.b();
    }

    private xa(Object[] objArr, int i10) {
        this.f4293o = objArr;
        this.f4294p = i10;
    }

    public static xa g() {
        return f4292q;
    }

    private final String h(int i10) {
        int i11 = this.f4294p;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4294p) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f4294p)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f4293o;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f4293o, i10, objArr2, i10 + 1, this.f4294p - i10);
            this.f4293o = objArr2;
        }
        this.f4293o[i10] = obj;
        this.f4294p++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i10 = this.f4294p;
        Object[] objArr = this.f4293o;
        if (i10 == objArr.length) {
            this.f4293o = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4293o;
        int i11 = this.f4294p;
        this.f4294p = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return this.f4293o[i10];
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final /* bridge */ /* synthetic */ o9 j(int i10) {
        if (i10 >= this.f4294p) {
            return new xa(Arrays.copyOf(this.f4293o, i10), this.f4294p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        d();
        k(i10);
        Object[] objArr = this.f4293o;
        Object obj = objArr[i10];
        if (i10 < this.f4294p - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f4294p--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        k(i10);
        Object[] objArr = this.f4293o;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4294p;
    }
}
