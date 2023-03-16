package t9;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.e0;
import r9.n0;
/* loaded from: classes.dex */
public class d<E> extends t9.a<E> {

    /* renamed from: e  reason: collision with root package name */
    private final int f14836e;

    /* renamed from: f  reason: collision with root package name */
    private final e f14837f;

    /* renamed from: g  reason: collision with root package name */
    private final ReentrantLock f14838g;

    /* renamed from: h  reason: collision with root package name */
    private Object[] f14839h;

    /* renamed from: i  reason: collision with root package name */
    private int f14840i;
    private volatile /* synthetic */ int size;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14841a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            f14841a = iArr;
        }
    }

    public d(int i10, e eVar, j9.l<? super E, y8.s> lVar) {
        super(lVar);
        this.f14836e = i10;
        this.f14837f = eVar;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        this.f14838g = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i10, 8)];
        z8.e.e(objArr, b.f14826a, 0, 0, 6, null);
        this.f14839h = objArr;
        this.size = 0;
    }

    private final void x(int i10, E e10) {
        if (i10 < this.f14836e) {
            y(i10);
            Object[] objArr = this.f14839h;
            objArr[(this.f14840i + i10) % objArr.length] = e10;
            return;
        }
        if (n0.a()) {
            if (!(this.f14837f == e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f14839h;
        int i11 = this.f14840i;
        objArr2[i11 % objArr2.length] = null;
        objArr2[(i10 + i11) % objArr2.length] = e10;
        this.f14840i = (i11 + 1) % objArr2.length;
    }

    private final void y(int i10) {
        Object[] objArr = this.f14839h;
        if (i10 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f14836e);
            Object[] objArr2 = new Object[min];
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr3 = this.f14839h;
                objArr2[i11] = objArr3[(this.f14840i + i11) % objArr3.length];
            }
            z8.e.d(objArr2, b.f14826a, i10, min);
            this.f14839h = objArr2;
            this.f14840i = 0;
        }
    }

    private final e0 z(int i10) {
        if (i10 < this.f14836e) {
            this.size = i10 + 1;
            return null;
        }
        int i11 = a.f14841a[this.f14837f.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return null;
                }
                throw new y8.k();
            }
            return b.f14827b;
        }
        return b.f14828c;
    }

    @Override // t9.c
    protected String c() {
        return "(buffer:capacity=" + this.f14836e + ",size=" + this.size + ')';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.c
    public Object i(E e10) {
        q<E> l10;
        e0 h10;
        ReentrantLock reentrantLock = this.f14838g;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            j<?> d10 = d();
            if (d10 != null) {
                return d10;
            }
            e0 z10 = z(i10);
            if (z10 != null) {
                return z10;
            }
            if (i10 == 0) {
                do {
                    l10 = l();
                    if (l10 != null) {
                        if (l10 instanceof j) {
                            this.size = i10;
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
                this.size = i10;
                y8.s sVar = y8.s.f17099a;
                reentrantLock.unlock();
                l10.b(e10);
                return l10.g();
            }
            x(i10, e10);
            return b.f14827b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.a
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f14838g;
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
        return this.size == 0;
    }

    @Override // t9.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f14838g;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object d10 = d();
                if (d10 == null) {
                    d10 = b.f14829d;
                }
                return d10;
            }
            Object[] objArr = this.f14839h;
            int i11 = this.f14840i;
            Object obj = objArr[i11];
            s sVar = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object obj2 = b.f14829d;
            if (i10 == this.f14836e) {
                s sVar2 = null;
                while (true) {
                    s m10 = m();
                    if (m10 == null) {
                        sVar = sVar2;
                        break;
                    }
                    k9.k.b(m10);
                    e0 E = m10.E(null);
                    if (E != null) {
                        if (n0.a()) {
                            if (!(E == r9.m.f13141a)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m10.D();
                        r6 = true;
                        sVar = m10;
                    } else {
                        m10.F();
                        sVar2 = m10;
                    }
                }
            }
            if (obj2 != b.f14829d && !(obj2 instanceof j)) {
                this.size = i10;
                Object[] objArr2 = this.f14839h;
                objArr2[(this.f14840i + i10) % objArr2.length] = obj2;
            }
            this.f14840i = (this.f14840i + 1) % this.f14839h.length;
            y8.s sVar3 = y8.s.f17099a;
            if (r6) {
                k9.k.b(sVar);
                sVar.C();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
