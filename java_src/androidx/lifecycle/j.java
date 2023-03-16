package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class j extends e {

    /* renamed from: b  reason: collision with root package name */
    private k.a<h, a> f2103b;

    /* renamed from: c  reason: collision with root package name */
    private e.c f2104c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<i> f2105d;

    /* renamed from: e  reason: collision with root package name */
    private int f2106e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2107f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2108g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<e.c> f2109h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f2110i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        e.c f2111a;

        /* renamed from: b  reason: collision with root package name */
        g f2112b;

        a(h hVar, e.c cVar) {
            this.f2112b = m.f(hVar);
            this.f2111a = cVar;
        }

        void a(i iVar, e.b bVar) {
            e.c g10 = bVar.g();
            this.f2111a = j.k(this.f2111a, g10);
            this.f2112b.d(iVar, bVar);
            this.f2111a = g10;
        }
    }

    public j(i iVar) {
        this(iVar, true);
    }

    private j(i iVar, boolean z10) {
        this.f2103b = new k.a<>();
        this.f2106e = 0;
        this.f2107f = false;
        this.f2108g = false;
        this.f2109h = new ArrayList<>();
        this.f2105d = new WeakReference<>(iVar);
        this.f2104c = e.c.INITIALIZED;
        this.f2110i = z10;
    }

    private void d(i iVar) {
        Iterator<Map.Entry<h, a>> descendingIterator = this.f2103b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f2108g) {
            Map.Entry<h, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f2111a.compareTo(this.f2104c) > 0 && !this.f2108g && this.f2103b.contains(next.getKey())) {
                e.b e10 = e.b.e(value.f2111a);
                if (e10 == null) {
                    throw new IllegalStateException("no event down from " + value.f2111a);
                }
                n(e10.g());
                value.a(iVar, e10);
                m();
            }
        }
    }

    private e.c e(h hVar) {
        Map.Entry<h, a> x10 = this.f2103b.x(hVar);
        e.c cVar = null;
        e.c cVar2 = x10 != null ? x10.getValue().f2111a : null;
        if (!this.f2109h.isEmpty()) {
            ArrayList<e.c> arrayList = this.f2109h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.f2104c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.f2110i || j.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(i iVar) {
        k.b<h, a>.d h10 = this.f2103b.h();
        while (h10.hasNext() && !this.f2108g) {
            Map.Entry next = h10.next();
            a aVar = (a) next.getValue();
            while (aVar.f2111a.compareTo(this.f2104c) < 0 && !this.f2108g && this.f2103b.contains(next.getKey())) {
                n(aVar.f2111a);
                e.b h11 = e.b.h(aVar.f2111a);
                if (h11 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f2111a);
                }
                aVar.a(iVar, h11);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f2103b.size() == 0) {
            return true;
        }
        e.c cVar = this.f2103b.d().getValue().f2111a;
        e.c cVar2 = this.f2103b.k().getValue().f2111a;
        return cVar == cVar2 && this.f2104c == cVar2;
    }

    static e.c k(e.c cVar, e.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(e.c cVar) {
        if (this.f2104c == cVar) {
            return;
        }
        this.f2104c = cVar;
        if (this.f2107f || this.f2106e != 0) {
            this.f2108g = true;
            return;
        }
        this.f2107f = true;
        p();
        this.f2107f = false;
    }

    private void m() {
        ArrayList<e.c> arrayList = this.f2109h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(e.c cVar) {
        this.f2109h.add(cVar);
    }

    private void p() {
        i iVar = this.f2105d.get();
        if (iVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i10 = i();
            this.f2108g = false;
            if (i10) {
                return;
            }
            if (this.f2104c.compareTo(this.f2103b.d().getValue().f2111a) < 0) {
                d(iVar);
            }
            Map.Entry<h, a> k10 = this.f2103b.k();
            if (!this.f2108g && k10 != null && this.f2104c.compareTo(k10.getValue().f2111a) > 0) {
                g(iVar);
            }
        }
    }

    @Override // androidx.lifecycle.e
    public void a(h hVar) {
        i iVar;
        f("addObserver");
        e.c cVar = this.f2104c;
        e.c cVar2 = e.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = e.c.INITIALIZED;
        }
        a aVar = new a(hVar, cVar2);
        if (this.f2103b.s(hVar, aVar) == null && (iVar = this.f2105d.get()) != null) {
            boolean z10 = this.f2106e != 0 || this.f2107f;
            e.c e10 = e(hVar);
            this.f2106e++;
            while (aVar.f2111a.compareTo(e10) < 0 && this.f2103b.contains(hVar)) {
                n(aVar.f2111a);
                e.b h10 = e.b.h(aVar.f2111a);
                if (h10 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f2111a);
                }
                aVar.a(iVar, h10);
                m();
                e10 = e(hVar);
            }
            if (!z10) {
                p();
            }
            this.f2106e--;
        }
    }

    @Override // androidx.lifecycle.e
    public e.c b() {
        return this.f2104c;
    }

    @Override // androidx.lifecycle.e
    public void c(h hVar) {
        f("removeObserver");
        this.f2103b.v(hVar);
    }

    public void h(e.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.g());
    }

    @Deprecated
    public void j(e.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(e.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
