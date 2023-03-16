package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class u9 extends r7 implements RandomAccess, v9 {

    /* renamed from: p  reason: collision with root package name */
    private static final u9 f4238p;

    /* renamed from: q  reason: collision with root package name */
    public static final v9 f4239q;

    /* renamed from: o  reason: collision with root package name */
    private final List f4240o;

    static {
        u9 u9Var = new u9(10);
        f4238p = u9Var;
        u9Var.b();
        f4239q = u9Var;
    }

    public u9() {
        this(10);
    }

    public u9(int i10) {
        this.f4240o = new ArrayList(i10);
    }

    private u9(ArrayList arrayList) {
        this.f4240o = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h8 ? ((h8) obj).G(p9.f4067b) : p9.g((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        d();
        this.f4240o.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        d();
        if (collection instanceof v9) {
            collection = ((v9) collection).f();
        }
        boolean addAll = this.f4240o.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f4240o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final v9 e() {
        return c() ? new wb(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final List f() {
        return Collections.unmodifiableList(this.f4240o);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public final String get(int i10) {
        Object obj = this.f4240o.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h8) {
            h8 h8Var = (h8) obj;
            String G = h8Var.G(p9.f4067b);
            if (h8Var.x()) {
                this.f4240o.set(i10, G);
            }
            return G;
        }
        byte[] bArr = (byte[]) obj;
        String g10 = p9.g(bArr);
        if (p9.h(bArr)) {
            this.f4240o.set(i10, g10);
        }
        return g10;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final /* bridge */ /* synthetic */ o9 j(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f4240o);
            return new u9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final void p(h8 h8Var) {
        d();
        this.f4240o.add(h8Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        Object remove = this.f4240o.remove(i10);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        d();
        return h(this.f4240o.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4240o.size();
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final Object t(int i10) {
        return this.f4240o.get(i10);
    }
}
