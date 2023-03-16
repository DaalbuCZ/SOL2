package j$.util.concurrent;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final int f9681a;

    /* renamed from: b  reason: collision with root package name */
    final Object f9682b;

    /* renamed from: c  reason: collision with root package name */
    volatile Object f9683c;

    /* renamed from: d  reason: collision with root package name */
    volatile l f9684d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i10, Object obj, Object obj2, l lVar) {
        this.f9681a = i10;
        this.f9682b = obj;
        this.f9683c = obj2;
        this.f9684d = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l a(int i10, Object obj) {
        Object obj2;
        l lVar = this;
        do {
            if (lVar.f9681a == i10 && ((obj2 = lVar.f9682b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f9684d;
        } while (lVar != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f9682b) || key.equals(obj2)) && (value == (obj3 = this.f9683c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9682b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9683c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f9682b.hashCode() ^ this.f9683c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f9682b + "=" + this.f9683c;
    }
}
