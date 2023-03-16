package com.google.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class e0 extends f0 {

    /* renamed from: f  reason: collision with root package name */
    private final s0 f5945f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: n  reason: collision with root package name */
        private Map.Entry<K, e0> f5946n;

        private b(Map.Entry<K, e0> entry) {
            this.f5946n = entry;
        }

        public e0 a() {
            return this.f5946n.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f5946n.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            e0 value = this.f5946n.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof s0) {
                return this.f5946n.getValue().d((s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: n  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f5947n;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f5947n = it;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f5947n.next();
            return next.getValue() instanceof e0 ? new b(next) : next;
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
        public boolean hasNext() {
            return this.f5947n.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f5947n.remove();
        }
    }

    @Override // com.google.protobuf.f0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public s0 f() {
        return c(this.f5945f);
    }

    @Override // com.google.protobuf.f0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
