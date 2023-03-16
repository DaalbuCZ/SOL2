package com.google.android.gms.internal.measurement;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hb implements Map.Entry, Comparable {

    /* renamed from: n  reason: collision with root package name */
    private final Comparable f3884n;

    /* renamed from: o  reason: collision with root package name */
    private Object f3885o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ nb f3886p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hb(nb nbVar, Comparable comparable, Object obj) {
        this.f3886p = nbVar;
        this.f3884n = comparable;
        this.f3885o = obj;
    }

    private static final boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3884n.compareTo(((hb) obj).f3884n);
    }

    public final Comparable e() {
        return this.f3884n;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return g(this.f3884n, entry.getKey()) && g(this.f3885o, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f3884n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3885o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f3884n;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3885o;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3886p.n();
        Object obj2 = this.f3885o;
        this.f3885o = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3884n);
        String valueOf2 = String.valueOf(this.f3885o);
        return valueOf + "=" + valueOf2;
    }
}
