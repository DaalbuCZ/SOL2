package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class s<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10962a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public s(boolean z10) {
        this._cur = new t(8, z10);
    }

    public final boolean a(E e10) {
        while (true) {
            t tVar = (t) this._cur;
            int a10 = tVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                androidx.concurrent.futures.b.a(f10962a, this, tVar, tVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            t tVar = (t) this._cur;
            if (tVar.d()) {
                return;
            }
            androidx.concurrent.futures.b.a(f10962a, this, tVar, tVar.i());
        }
    }

    public final int c() {
        return ((t) this._cur).f();
    }

    public final E d() {
        while (true) {
            t tVar = (t) this._cur;
            E e10 = (E) tVar.j();
            if (e10 != t.f10966h) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f10962a, this, tVar, tVar.i());
        }
    }
}
