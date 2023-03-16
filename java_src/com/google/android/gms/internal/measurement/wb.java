package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class wb extends AbstractList implements RandomAccess, v9 {

    /* renamed from: n  reason: collision with root package name */
    private final v9 f4275n;

    public wb(v9 v9Var) {
        this.f4275n = v9Var;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final v9 e() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final List f() {
        return this.f4275n.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((u9) this.f4275n).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new vb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new ub(this, i10);
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final void p(h8 h8Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4275n.size();
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final Object t(int i10) {
        return this.f4275n.t(i10);
    }
}
