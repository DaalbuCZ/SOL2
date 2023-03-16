package s1;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u2.b0;
import u2.p0;
import u2.u;
import w1.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    private final t1.t1 f13385a;

    /* renamed from: e  reason: collision with root package name */
    private final d f13389e;

    /* renamed from: f  reason: collision with root package name */
    private final b0.a f13390f;

    /* renamed from: g  reason: collision with root package name */
    private final w.a f13391g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<c, b> f13392h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<c> f13393i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13395k;

    /* renamed from: l  reason: collision with root package name */
    private o3.p0 f13396l;

    /* renamed from: j  reason: collision with root package name */
    private u2.p0 f13394j = new p0.a(0);

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<u2.r, c> f13387c = new IdentityHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Object, c> f13388d = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f13386b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a implements u2.b0, w1.w {

        /* renamed from: a  reason: collision with root package name */
        private final c f13397a;

        /* renamed from: b  reason: collision with root package name */
        private b0.a f13398b;

        /* renamed from: c  reason: collision with root package name */
        private w.a f13399c;

        public a(c cVar) {
            this.f13398b = g2.this.f13390f;
            this.f13399c = g2.this.f13391g;
            this.f13397a = cVar;
        }

        private boolean b(int i10, u.b bVar) {
            u.b bVar2;
            if (bVar != null) {
                bVar2 = g2.n(this.f13397a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int r10 = g2.r(this.f13397a, i10);
            b0.a aVar = this.f13398b;
            if (aVar.f15161a != r10 || !p3.m0.c(aVar.f15162b, bVar2)) {
                this.f13398b = g2.this.f13390f.F(r10, bVar2, 0L);
            }
            w.a aVar2 = this.f13399c;
            if (aVar2.f15966a == r10 && p3.m0.c(aVar2.f15967b, bVar2)) {
                return true;
            }
            this.f13399c = g2.this.f13391g.u(r10, bVar2);
            return true;
        }

        @Override // w1.w
        public void C(int i10, u.b bVar, int i11) {
            if (b(i10, bVar)) {
                this.f13399c.k(i11);
            }
        }

        @Override // w1.w
        public void G(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f13399c.m();
            }
        }

        @Override // w1.w
        public void I(int i10, u.b bVar, Exception exc) {
            if (b(i10, bVar)) {
                this.f13399c.l(exc);
            }
        }

        @Override // w1.w
        public void P(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f13399c.j();
            }
        }

        @Override // u2.b0
        public void Q(int i10, u.b bVar, u2.q qVar) {
            if (b(i10, bVar)) {
                this.f13398b.E(qVar);
            }
        }

        @Override // u2.b0
        public void T(int i10, u.b bVar, u2.q qVar) {
            if (b(i10, bVar)) {
                this.f13398b.j(qVar);
            }
        }

        @Override // u2.b0
        public void U(int i10, u.b bVar, u2.n nVar, u2.q qVar) {
            if (b(i10, bVar)) {
                this.f13398b.B(nVar, qVar);
            }
        }

        @Override // u2.b0
        public void V(int i10, u.b bVar, u2.n nVar, u2.q qVar) {
            if (b(i10, bVar)) {
                this.f13398b.v(nVar, qVar);
            }
        }

        @Override // u2.b0
        public void Y(int i10, u.b bVar, u2.n nVar, u2.q qVar) {
            if (b(i10, bVar)) {
                this.f13398b.s(nVar, qVar);
            }
        }

        @Override // w1.w
        public void a0(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f13399c.h();
            }
        }

        @Override // w1.w
        public void f0(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f13399c.i();
            }
        }

        @Override // w1.w
        public /* synthetic */ void k0(int i10, u.b bVar) {
            w1.p.a(this, i10, bVar);
        }

        @Override // u2.b0
        public void m0(int i10, u.b bVar, u2.n nVar, u2.q qVar, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                this.f13398b.y(nVar, qVar, iOException, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final u2.u f13401a;

        /* renamed from: b  reason: collision with root package name */
        public final u.c f13402b;

        /* renamed from: c  reason: collision with root package name */
        public final a f13403c;

        public b(u2.u uVar, u.c cVar, a aVar) {
            this.f13401a = uVar;
            this.f13402b = cVar;
            this.f13403c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements e2 {

        /* renamed from: a  reason: collision with root package name */
        public final u2.p f13404a;

        /* renamed from: d  reason: collision with root package name */
        public int f13407d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f13408e;

        /* renamed from: c  reason: collision with root package name */
        public final List<u.b> f13406c = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f13405b = new Object();

        public c(u2.u uVar, boolean z10) {
            this.f13404a = new u2.p(uVar, z10);
        }

        @Override // s1.e2
        public Object a() {
            return this.f13405b;
        }

        @Override // s1.e2
        public l3 b() {
            return this.f13404a.Q();
        }

        public void c(int i10) {
            this.f13407d = i10;
            this.f13408e = false;
            this.f13406c.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void c();
    }

    public g2(d dVar, t1.a aVar, Handler handler, t1.t1 t1Var) {
        this.f13385a = t1Var;
        this.f13389e = dVar;
        b0.a aVar2 = new b0.a();
        this.f13390f = aVar2;
        w.a aVar3 = new w.a();
        this.f13391g = aVar3;
        this.f13392h = new HashMap<>();
        this.f13393i = new HashSet();
        aVar2.g(handler, aVar);
        aVar3.g(handler, aVar);
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f13386b.remove(i12);
            this.f13388d.remove(remove.f13405b);
            g(i12, -remove.f13404a.Q().t());
            remove.f13408e = true;
            if (this.f13395k) {
                u(remove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f13386b.size()) {
            this.f13386b.get(i10).f13407d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f13392h.get(cVar);
        if (bVar != null) {
            bVar.f13401a.k(bVar.f13402b);
        }
    }

    private void k() {
        Iterator<c> it = this.f13393i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f13406c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f13393i.add(cVar);
        b bVar = this.f13392h.get(cVar);
        if (bVar != null) {
            bVar.f13401a.d(bVar.f13402b);
        }
    }

    private static Object m(Object obj) {
        return s1.a.A(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u.b n(c cVar, u.b bVar) {
        for (int i10 = 0; i10 < cVar.f13406c.size(); i10++) {
            if (cVar.f13406c.get(i10).f15359d == bVar.f15359d) {
                return bVar.c(p(cVar, bVar.f15356a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return s1.a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return s1.a.D(cVar.f13405b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(c cVar, int i10) {
        return i10 + cVar.f13407d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(u2.u uVar, l3 l3Var) {
        this.f13389e.c();
    }

    private void u(c cVar) {
        if (cVar.f13408e && cVar.f13406c.isEmpty()) {
            b bVar = (b) p3.a.e(this.f13392h.remove(cVar));
            bVar.f13401a.c(bVar.f13402b);
            bVar.f13401a.e(bVar.f13403c);
            bVar.f13401a.q(bVar.f13403c);
            this.f13393i.remove(cVar);
        }
    }

    private void x(c cVar) {
        u2.p pVar = cVar.f13404a;
        u.c cVar2 = new u.c() { // from class: s1.f2
            @Override // u2.u.c
            public final void a(u2.u uVar, l3 l3Var) {
                g2.this.t(uVar, l3Var);
            }
        };
        a aVar = new a(cVar);
        this.f13392h.put(cVar, new b(pVar, cVar2, aVar));
        pVar.l(p3.m0.y(), aVar);
        pVar.p(p3.m0.y(), aVar);
        pVar.h(cVar2, this.f13396l, this.f13385a);
    }

    public l3 A(int i10, int i11, u2.p0 p0Var) {
        p3.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f13394j = p0Var;
        B(i10, i11);
        return i();
    }

    public l3 C(List<c> list, u2.p0 p0Var) {
        B(0, this.f13386b.size());
        return f(this.f13386b.size(), list, p0Var);
    }

    public l3 D(u2.p0 p0Var) {
        int q10 = q();
        if (p0Var.a() != q10) {
            p0Var = p0Var.h().d(0, q10);
        }
        this.f13394j = p0Var;
        return i();
    }

    public l3 f(int i10, List<c> list, u2.p0 p0Var) {
        int i11;
        if (!list.isEmpty()) {
            this.f13394j = p0Var;
            for (int i12 = i10; i12 < list.size() + i10; i12++) {
                c cVar = list.get(i12 - i10);
                if (i12 > 0) {
                    c cVar2 = this.f13386b.get(i12 - 1);
                    i11 = cVar2.f13407d + cVar2.f13404a.Q().t();
                } else {
                    i11 = 0;
                }
                cVar.c(i11);
                g(i12, cVar.f13404a.Q().t());
                this.f13386b.add(i12, cVar);
                this.f13388d.put(cVar.f13405b, cVar);
                if (this.f13395k) {
                    x(cVar);
                    if (this.f13387c.isEmpty()) {
                        this.f13393i.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public u2.r h(u.b bVar, o3.b bVar2, long j10) {
        Object o10 = o(bVar.f15356a);
        u.b c10 = bVar.c(m(bVar.f15356a));
        c cVar = (c) p3.a.e(this.f13388d.get(o10));
        l(cVar);
        cVar.f13406c.add(c10);
        u2.o n10 = cVar.f13404a.n(c10, bVar2, j10);
        this.f13387c.put(n10, cVar);
        k();
        return n10;
    }

    public l3 i() {
        if (this.f13386b.isEmpty()) {
            return l3.f13539n;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13386b.size(); i11++) {
            c cVar = this.f13386b.get(i11);
            cVar.f13407d = i10;
            i10 += cVar.f13404a.Q().t();
        }
        return new u2(this.f13386b, this.f13394j);
    }

    public int q() {
        return this.f13386b.size();
    }

    public boolean s() {
        return this.f13395k;
    }

    public l3 v(int i10, int i11, int i12, u2.p0 p0Var) {
        p3.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f13394j = p0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f13386b.get(min).f13407d;
        p3.m0.z0(this.f13386b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f13386b.get(min);
            cVar.f13407d = i13;
            i13 += cVar.f13404a.Q().t();
            min++;
        }
        return i();
    }

    public void w(o3.p0 p0Var) {
        p3.a.f(!this.f13395k);
        this.f13396l = p0Var;
        for (int i10 = 0; i10 < this.f13386b.size(); i10++) {
            c cVar = this.f13386b.get(i10);
            x(cVar);
            this.f13393i.add(cVar);
        }
        this.f13395k = true;
    }

    public void y() {
        for (b bVar : this.f13392h.values()) {
            try {
                bVar.f13401a.c(bVar.f13402b);
            } catch (RuntimeException e10) {
                p3.r.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f13401a.e(bVar.f13403c);
            bVar.f13401a.q(bVar.f13403c);
        }
        this.f13392h.clear();
        this.f13393i.clear();
        this.f13395k = false;
    }

    public void z(u2.r rVar) {
        c cVar = (c) p3.a.e(this.f13387c.remove(rVar));
        cVar.f13404a.b(rVar);
        cVar.f13406c.remove(((u2.o) rVar).f15316n);
        if (!this.f13387c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
