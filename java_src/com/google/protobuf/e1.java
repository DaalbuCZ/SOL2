package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1<E> extends c<E> implements RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    private static final e1<Object> f5948q;

    /* renamed from: o  reason: collision with root package name */
    private E[] f5949o;

    /* renamed from: p  reason: collision with root package name */
    private int f5950p;

    static {
        e1<Object> e1Var = new e1<>(new Object[0], 0);
        f5948q = e1Var;
        e1Var.m();
    }

    private e1(E[] eArr, int i10) {
        this.f5949o = eArr;
        this.f5950p = i10;
    }

    private static <E> E[] g(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> e1<E> h() {
        return (e1<E>) f5948q;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f5950p) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f5950p;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f5950p)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        E[] eArr = this.f5949o;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) g(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f5949o, 0, eArr2, 0, i10);
            System.arraycopy(this.f5949o, i10, eArr2, i10 + 1, this.f5950p - i10);
            this.f5949o = eArr2;
        }
        this.f5949o[i10] = e10;
        this.f5950p++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        d();
        int i10 = this.f5950p;
        E[] eArr = this.f5949o;
        if (i10 == eArr.length) {
            this.f5949o = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f5949o;
        int i11 = this.f5950p;
        this.f5950p = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        k(i10);
        return this.f5949o[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        d();
        k(i10);
        E[] eArr = this.f5949o;
        E e10 = eArr[i10];
        if (i10 < this.f5950p - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f5950p--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // com.google.protobuf.a0.i
    /* renamed from: s */
    public e1<E> i(int i10) {
        if (i10 >= this.f5950p) {
            return new e1<>(Arrays.copyOf(this.f5949o, i10), this.f5950p);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        d();
        k(i10);
        E[] eArr = this.f5949o;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5950p;
    }
}
