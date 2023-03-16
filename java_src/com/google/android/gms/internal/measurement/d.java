package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class d implements Iterator {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Iterator f3779n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ Iterator f3780o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(f fVar, Iterator it, Iterator it2) {
        this.f3779n = it;
        this.f3780o = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3779n.hasNext()) {
            return true;
        }
        return this.f3780o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f3779n.hasNext()) {
            return new u(((Integer) this.f3779n.next()).toString());
        }
        if (this.f3780o.hasNext()) {
            return new u((String) this.f3780o.next());
        }
        throw new NoSuchElementException();
    }
}
