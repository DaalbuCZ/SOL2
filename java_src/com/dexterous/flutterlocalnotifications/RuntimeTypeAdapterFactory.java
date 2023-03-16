package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import f7.e;
import f7.k;
import f7.n;
import f7.o;
import f7.p;
import f7.w;
import f7.x;
import h7.l;
import java.util.LinkedHashMap;
import java.util.Map;
@Keep
/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements x {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    /* loaded from: classes.dex */
    class a extends w<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f3322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f3323b;

        a(Map map, Map map2) {
            this.f3322a = map;
            this.f3323b = map2;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [R, java.lang.Object] */
        @Override // f7.w
        public R c(n7.a aVar) {
            k a10 = l.a(aVar);
            k F = a10.g().F(RuntimeTypeAdapterFactory.this.typeFieldName);
            if (F == null) {
                throw new o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            String k10 = F.k();
            w wVar = (w) this.f3322a.get(k10);
            if (wVar != null) {
                return wVar.a(a10);
            }
            throw new o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + k10 + "; did you forget to register a subtype?");
        }

        @Override // f7.w
        public void e(n7.c cVar, R r10) {
            Class<?> cls = r10.getClass();
            String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
            w wVar = (w) this.f3323b.get(cls);
            if (wVar == null) {
                throw new o("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
            n g10 = wVar.d(r10).g();
            if (g10.E(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                throw new o("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            n nVar = new n();
            nVar.C(RuntimeTypeAdapterFactory.this.typeFieldName, new p(str));
            for (Map.Entry<String, k> entry : g10.D()) {
                nVar.C(entry.getKey(), entry.getValue());
            }
            l.b(nVar, cVar);
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // f7.x
    public <R> w<R> create(e eVar, m7.a<R> aVar) {
        if (aVar.c() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            w<T> l10 = eVar.l(this, m7.a.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), l10);
            linkedHashMap2.put(entry.getValue(), l10);
        }
        return new a(linkedHashMap, linkedHashMap2).b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }
}
