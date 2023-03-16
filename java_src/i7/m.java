package i7;

import f7.w;
import i7.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m<T> extends w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f7.e f8405a;

    /* renamed from: b  reason: collision with root package name */
    private final w<T> f8406b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f8407c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(f7.e eVar, w<T> wVar, Type type) {
        this.f8405a = eVar;
        this.f8406b = wVar;
        this.f8407c = type;
    }

    private Type f(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // f7.w
    public T c(n7.a aVar) {
        return this.f8406b.c(aVar);
    }

    @Override // f7.w
    public void e(n7.c cVar, T t10) {
        w<T> wVar = this.f8406b;
        Type f10 = f(this.f8407c, t10);
        if (f10 != this.f8407c) {
            wVar = this.f8405a.k(m7.a.b(f10));
            if (wVar instanceof k.b) {
                w<T> wVar2 = this.f8406b;
                if (!(wVar2 instanceof k.b)) {
                    wVar = wVar2;
                }
            }
        }
        wVar.e(cVar, t10);
    }
}
