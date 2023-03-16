package com.google.android.gms.internal.measurement;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* loaded from: classes.dex */
final class vb implements Iterator, j$.util.Iterator {

    /* renamed from: n  reason: collision with root package name */
    final Iterator f4259n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ wb f4260o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vb(wb wbVar) {
        v9 v9Var;
        this.f4260o = wbVar;
        v9Var = wbVar.f4275n;
        this.f4259n = v9Var.iterator();
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f4259n.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4259n.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
