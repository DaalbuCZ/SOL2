package com.google.android.gms.internal.measurement;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;
/* loaded from: classes.dex */
final class ub implements ListIterator, Iterator {

    /* renamed from: n  reason: collision with root package name */
    final ListIterator f4243n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ int f4244o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ wb f4245p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ub(wb wbVar, int i10) {
        v9 v9Var;
        this.f4245p = wbVar;
        this.f4244o = i10;
        v9Var = wbVar.f4275n;
        this.f4243n = v9Var.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
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
    public final boolean hasNext() {
        return this.f4243n.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4243n.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4243n.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4243n.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f4243n.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4243n.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
