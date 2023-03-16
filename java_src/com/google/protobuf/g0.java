package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class g0 extends c<String> implements h0, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final g0 f5963p;

    /* renamed from: q  reason: collision with root package name */
    public static final h0 f5964q;

    /* renamed from: o  reason: collision with root package name */
    private final List<Object> f5965o;

    static {
        g0 g0Var = new g0();
        f5963p = g0Var;
        g0Var.m();
        f5964q = g0Var;
    }

    public g0() {
        this(10);
    }

    public g0(int i10) {
        this(new ArrayList(i10));
    }

    private g0(ArrayList<Object> arrayList) {
        this.f5965o = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h ? ((h) obj).N() : a0.j((byte[]) obj);
    }

    @Override // com.google.protobuf.h0
    public List<?> A() {
        return Collections.unmodifiableList(this.f5965o);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.a0.i
    public /* bridge */ /* synthetic */ boolean B() {
        return super.B();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof h0) {
            collection = ((h0) collection).A();
        }
        boolean addAll = this.f5965o.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.f5965o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public void add(int i10, String str) {
        d();
        this.f5965o.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public String get(int i10) {
        Object obj = this.f5965o.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String N = hVar.N();
            if (hVar.C()) {
                this.f5965o.set(i10, N);
            }
            return N;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = a0.j(bArr);
        if (a0.g(bArr)) {
            this.f5965o.set(i10, j10);
        }
        return j10;
    }

    @Override // com.google.protobuf.a0.i
    /* renamed from: l */
    public g0 i(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f5965o);
            return new g0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.h0
    public void q(h hVar) {
        d();
        this.f5965o.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: s */
    public String remove(int i10) {
        d();
        Object remove = this.f5965o.remove(i10);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5965o.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public String set(int i10, String str) {
        d();
        return h(this.f5965o.set(i10, str));
    }

    @Override // com.google.protobuf.h0
    public h0 w() {
        return B() ? new r1(this) : this;
    }

    @Override // com.google.protobuf.h0
    public Object z(int i10) {
        return this.f5965o.get(i10);
    }
}
