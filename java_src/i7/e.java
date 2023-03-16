package i7;

import f7.r;
import f7.w;
import f7.x;
/* loaded from: classes.dex */
public final class e implements x {

    /* renamed from: n  reason: collision with root package name */
    private final h7.c f8362n;

    public e(h7.c cVar) {
        this.f8362n = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w<?> a(h7.c cVar, f7.e eVar, m7.a<?> aVar, g7.b bVar) {
        w<?> lVar;
        Object a10 = cVar.a(m7.a.a(bVar.value())).a();
        if (a10 instanceof w) {
            lVar = (w) a10;
        } else if (a10 instanceof x) {
            lVar = ((x) a10).create(eVar, aVar);
        } else {
            boolean z10 = a10 instanceof r;
            if (!z10 && !(a10 instanceof f7.j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z10 ? (r) a10 : null, a10 instanceof f7.j ? (f7.j) a10 : null, eVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.b();
    }

    @Override // f7.x
    public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
        g7.b bVar = (g7.b) aVar.c().getAnnotation(g7.b.class);
        if (bVar == null) {
            return null;
        }
        return (w<T>) a(this.f8362n, eVar, aVar, bVar);
    }
}
