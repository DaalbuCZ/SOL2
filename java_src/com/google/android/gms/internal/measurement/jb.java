package com.google.android.gms.internal.measurement;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class jb implements Iterator, j$.util.Iterator {

    /* renamed from: n  reason: collision with root package name */
    private int f3930n = -1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3931o;

    /* renamed from: p  reason: collision with root package name */
    private Iterator f3932p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ nb f3933q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ jb(nb nbVar, ib ibVar) {
        this.f3933q = nbVar;
    }

    private final Iterator b() {
        Map map;
        if (this.f3932p == null) {
            map = this.f3933q.f4031p;
            this.f3932p = map.entrySet().iterator();
        }
        return this.f3932p;
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
        List list;
        Map map;
        int i10 = this.f3930n + 1;
        list = this.f3933q.f4030o;
        if (i10 >= list.size()) {
            map = this.f3933q.f4031p;
            return !map.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f3931o = true;
        int i10 = this.f3930n + 1;
        this.f3930n = i10;
        list = this.f3933q.f4030o;
        if (i10 < list.size()) {
            list2 = this.f3933q.f4030o;
            next = list2.get(this.f3930n);
        } else {
            next = b().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        List list;
        if (!this.f3931o) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f3931o = false;
        this.f3933q.n();
        int i10 = this.f3930n;
        list = this.f3933q.f4030o;
        if (i10 >= list.size()) {
            b().remove();
            return;
        }
        nb nbVar = this.f3933q;
        int i11 = this.f3930n;
        this.f3930n = i11 - 1;
        nbVar.l(i11);
    }
}
