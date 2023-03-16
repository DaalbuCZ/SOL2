package com.google.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class r1 extends AbstractList<String> implements h0, RandomAccess {

    /* renamed from: n  reason: collision with root package name */
    private final h0 f6076n;

    /* loaded from: classes.dex */
    class a implements ListIterator<String>, Iterator {

        /* renamed from: n  reason: collision with root package name */
        ListIterator<String> f6077n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f6078o;

        a(int i10) {
            this.f6078o = i10;
            this.f6077n = r1.this.f6076n.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        /* renamed from: c */
        public String next() {
            return this.f6077n.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public String previous() {
            return this.f6077n.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f6077n.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f6077n.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f6077n.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f6077n.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    class b implements java.util.Iterator<String>, Iterator {

        /* renamed from: n  reason: collision with root package name */
        java.util.Iterator<String> f6080n;

        b() {
            this.f6080n = r1.this.f6076n.iterator();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f6080n.next();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f6080n.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r1(h0 h0Var) {
        this.f6076n = h0Var;
    }

    @Override // com.google.protobuf.h0
    public List<?> A() {
        return this.f6076n.A();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public String get(int i10) {
        return (String) this.f6076n.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.protobuf.h0
    public void q(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6076n.size();
    }

    @Override // com.google.protobuf.h0
    public h0 w() {
        return this;
    }

    @Override // com.google.protobuf.h0
    public Object z(int i10) {
        return this.f6076n.z(i10);
    }
}
