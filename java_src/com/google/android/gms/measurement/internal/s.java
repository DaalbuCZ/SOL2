package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* loaded from: classes.dex */
final class s implements Iterator, j$.util.Iterator {

    /* renamed from: n  reason: collision with root package name */
    final Iterator f4964n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ t f4965o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar) {
        Bundle bundle;
        this.f4965o = tVar;
        bundle = tVar.f5003n;
        this.f4964n = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: b */
    public final String next() {
        return (String) this.f4964n.next();
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
        return this.f4964n.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
