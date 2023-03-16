package j$.util.concurrent;

import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final Object f9678a;

    /* renamed from: b  reason: collision with root package name */
    Object f9679b;

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap f9680c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f9678a = obj;
        this.f9679b = obj2;
        this.f9680c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f9678a) || key.equals(obj2)) && (value == (obj3 = this.f9679b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f9678a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f9679b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f9678a.hashCode() ^ this.f9679b.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Objects.requireNonNull(obj);
        Object obj2 = this.f9679b;
        this.f9679b = obj;
        this.f9680c.put(this.f9678a, obj);
        return obj2;
    }

    public String toString() {
        return this.f9678a + "=" + this.f9679b;
    }
}
