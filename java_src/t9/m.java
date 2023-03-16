package t9;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.m0;
import kotlinx.coroutines.internal.y;
import r9.n0;
/* loaded from: classes.dex */
public class m<E> extends a<E> {

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantLock f14853e;

    /* renamed from: f  reason: collision with root package name */
    private Object f14854f;

    public m(j9.l<? super E, y8.s> lVar) {
        super(lVar);
        this.f14853e = new ReentrantLock();
        this.f14854f = b.f14826a;
    }

    private final m0 x(Object obj) {
        j9.l<E, y8.s> lVar;
        Object obj2 = this.f14854f;
        m0 m0Var = null;
        if (obj2 != b.f14826a && (lVar = this.f14833b) != null) {
            m0Var = y.d(lVar, obj2, null, 2, null);
        }
        this.f14854f = obj;
        return m0Var;
    }

    @Override // t9.c
    protected String c() {
        ReentrantLock reentrantLock = this.f14853e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f14854f + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.c
    public Object i(E e10) {
        q<E> l10;
        e0 h10;
        ReentrantLock reentrantLock = this.f14853e;
        reentrantLock.lock();
        try {
            j<?> d10 = d();
            if (d10 != null) {
                return d10;
            }
            if (this.f14854f == b.f14826a) {
                do {
                    l10 = l();
                    if (l10 != null) {
                        if (l10 instanceof j) {
                            return l10;
                        }
                        k9.k.b(l10);
                        h10 = l10.h(e10, null);
                    }
                } while (h10 == null);
                if (n0.a()) {
                    if (!(h10 == r9.m.f13141a)) {
                        throw new AssertionError();
                    }
                }
                y8.s sVar = y8.s.f17099a;
                reentrantLock.unlock();
                l10.b(e10);
                return l10.g();
            }
            m0 x10 = x(e10);
            if (x10 == null) {
                return b.f14827b;
            }
            throw x10;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.a
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f14853e;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // t9.a
    protected final boolean r() {
        return false;
    }

    @Override // t9.a
    protected final boolean s() {
        ReentrantLock reentrantLock = this.f14853e;
        reentrantLock.lock();
        try {
            return this.f14854f == b.f14826a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // t9.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f14853e;
        reentrantLock.lock();
        try {
            Object obj = this.f14854f;
            e0 e0Var = b.f14826a;
            if (obj != e0Var) {
                this.f14854f = e0Var;
                y8.s sVar = y8.s.f17099a;
                return obj;
            }
            Object d10 = d();
            if (d10 == null) {
                d10 = b.f14829d;
            }
            return d10;
        } finally {
            reentrantLock.unlock();
        }
    }
}
