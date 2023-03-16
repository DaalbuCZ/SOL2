package t9;

import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.r;
import r9.o0;
/* loaded from: classes.dex */
public final class j<E> extends s implements q<E> {

    /* renamed from: q  reason: collision with root package name */
    public final Throwable f14852q;

    @Override // t9.s
    public void C() {
    }

    @Override // t9.s
    public e0 E(r.b bVar) {
        return r9.m.f13141a;
    }

    @Override // t9.q
    /* renamed from: G */
    public j<E> g() {
        return this;
    }

    @Override // t9.s
    /* renamed from: H */
    public j<E> D() {
        return this;
    }

    public final Throwable I() {
        Throwable th = this.f14852q;
        return th == null ? new k("Channel was closed") : th;
    }

    public final Throwable J() {
        Throwable th = this.f14852q;
        return th == null ? new l("Channel was closed") : th;
    }

    @Override // t9.q
    public void b(E e10) {
    }

    @Override // t9.q
    public e0 h(E e10, r.b bVar) {
        return r9.m.f13141a;
    }

    @Override // kotlinx.coroutines.internal.r
    public String toString() {
        return "Closed@" + o0.b(this) + '[' + this.f14852q + ']';
    }
}
