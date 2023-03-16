package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: c  reason: collision with root package name */
    private static final d1 f5934c = new d1();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, h1<?>> f5936b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final i1 f5935a = new k0();

    private d1() {
    }

    public static d1 a() {
        return f5934c;
    }

    public <T> void b(T t10, g1 g1Var, p pVar) {
        e(t10).e(t10, g1Var, pVar);
    }

    public h1<?> c(Class<?> cls, h1<?> h1Var) {
        a0.b(cls, "messageType");
        a0.b(h1Var, "schema");
        return this.f5936b.putIfAbsent(cls, h1Var);
    }

    public <T> h1<T> d(Class<T> cls) {
        a0.b(cls, "messageType");
        h1<T> h1Var = (h1<T>) this.f5936b.get(cls);
        if (h1Var == null) {
            h1<T> a10 = this.f5935a.a(cls);
            h1<T> h1Var2 = (h1<T>) c(cls, a10);
            return h1Var2 != null ? h1Var2 : a10;
        }
        return h1Var;
    }

    public <T> h1<T> e(T t10) {
        return d(t10.getClass());
    }
}
