package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r9.o0;
/* loaded from: classes.dex */
public class r {

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f10957n = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next");

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f10958o = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_prev");

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10959p = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes.dex */
    public static abstract class a extends kotlinx.coroutines.internal.c<r> {

        /* renamed from: b  reason: collision with root package name */
        public final r f10960b;

        /* renamed from: c  reason: collision with root package name */
        public r f10961c;

        public a(r rVar) {
            this.f10960b = rVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h */
        public void d(r rVar, Object obj) {
            boolean z10 = obj == null;
            r rVar2 = z10 ? this.f10960b : this.f10961c;
            if (rVar2 != null && androidx.concurrent.futures.b.a(r.f10957n, rVar, this, rVar2) && z10) {
                r rVar3 = this.f10960b;
                r rVar4 = this.f10961c;
                k9.k.b(rVar4);
                rVar3.r(rVar4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z {
    }

    private final a0 A() {
        a0 a0Var = (a0) this._removedRef;
        if (a0Var == null) {
            a0 a0Var2 = new a0(this);
            f10959p.lazySet(this, a0Var2);
            return a0Var2;
        }
        return a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (androidx.concurrent.futures.b.a(kotlinx.coroutines.internal.r.f10957n, r3, r2, ((kotlinx.coroutines.internal.a0) r4).f10906a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.r p(kotlinx.coroutines.internal.z r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.r r0 = (kotlinx.coroutines.internal.r) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.r.f10958o
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.x()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.z
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.z r0 = (kotlinx.coroutines.internal.z) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.z r4 = (kotlinx.coroutines.internal.z) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.a0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.r.f10957n
            kotlinx.coroutines.internal.a0 r4 = (kotlinx.coroutines.internal.a0) r4
            kotlinx.coroutines.internal.r r4 = r4.f10906a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.r r2 = (kotlinx.coroutines.internal.r) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.r r3 = (kotlinx.coroutines.internal.r) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.r.p(kotlinx.coroutines.internal.z):kotlinx.coroutines.internal.r");
    }

    private final r q(r rVar) {
        while (rVar.x()) {
            rVar = (r) rVar._prev;
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(r rVar) {
        r rVar2;
        do {
            rVar2 = (r) rVar._prev;
            if (s() != rVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f10958o, rVar, rVar2, this));
        if (x()) {
            rVar.p(null);
        }
    }

    public final int B(r rVar, r rVar2, a aVar) {
        f10958o.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10957n;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        aVar.f10961c = rVar2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, rVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final boolean n(r rVar, r rVar2) {
        f10958o.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10957n;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, rVar2, rVar)) {
            rVar.r(rVar2);
            return true;
        }
        return false;
    }

    public final boolean o(r rVar) {
        f10958o.lazySet(rVar, this);
        f10957n.lazySet(rVar, this);
        while (s() == this) {
            if (androidx.concurrent.futures.b.a(f10957n, this, this, rVar)) {
                rVar.r(this);
                return true;
            }
        }
        return false;
    }

    public final Object s() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof z)) {
                return obj;
            }
            ((z) obj).c(this);
        }
    }

    public final r t() {
        return q.b(s());
    }

    public String toString() {
        return new k9.o(this) { // from class: kotlinx.coroutines.internal.r.c
            @Override // o9.e
            public Object get() {
                return o0.a(this.f10880o);
            }
        } + '@' + o0.b(this);
    }

    public final r u() {
        r p10 = p(null);
        return p10 == null ? q((r) this._prev) : p10;
    }

    public final void v() {
        ((a0) s()).f10906a.w();
    }

    public final void w() {
        r rVar = this;
        while (true) {
            Object s10 = rVar.s();
            if (!(s10 instanceof a0)) {
                rVar.p(null);
                return;
            }
            rVar = ((a0) s10).f10906a;
        }
    }

    public boolean x() {
        return s() instanceof a0;
    }

    public boolean y() {
        return z() == null;
    }

    public final r z() {
        Object s10;
        r rVar;
        do {
            s10 = s();
            if (s10 instanceof a0) {
                return ((a0) s10).f10906a;
            }
            if (s10 == this) {
                return (r) s10;
            }
            rVar = (r) s10;
        } while (!androidx.concurrent.futures.b.a(f10957n, this, s10, rVar.A()));
        rVar.p(null);
        return null;
    }
}
