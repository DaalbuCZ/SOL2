package u9;

import j9.p;
import y8.s;
/* loaded from: classes.dex */
final class f<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<c<? super T>, b9.d<? super s>, Object> f15486a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super c<? super T>, ? super b9.d<? super s>, ? extends Object> pVar) {
        this.f15486a = pVar;
    }

    @Override // u9.a
    public Object b(c<? super T> cVar, b9.d<? super s> dVar) {
        Object k10 = this.f15486a.k(cVar, dVar);
        return k10 == c9.b.c() ? k10 : s.f17099a;
    }
}
