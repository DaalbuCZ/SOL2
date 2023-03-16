package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Iterator f3954n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Iterator it) {
        this.f3954n = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3954n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new u((String) this.f3954n.next());
    }
}
