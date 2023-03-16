package u2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s1.l3;
import t1.t1;
import u2.b0;
import u2.u;
import w1.w;
/* loaded from: classes.dex */
public abstract class a implements u {

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList<u.c> f15150n = new ArrayList<>(1);

    /* renamed from: o  reason: collision with root package name */
    private final HashSet<u.c> f15151o = new HashSet<>(1);

    /* renamed from: p  reason: collision with root package name */
    private final b0.a f15152p = new b0.a();

    /* renamed from: q  reason: collision with root package name */
    private final w.a f15153q = new w.a();

    /* renamed from: r  reason: collision with root package name */
    private Looper f15154r;

    /* renamed from: s  reason: collision with root package name */
    private l3 f15155s;

    /* renamed from: t  reason: collision with root package name */
    private t1 f15156t;

    /* JADX INFO: Access modifiers changed from: protected */
    public final t1 A() {
        return (t1) p3.a.h(this.f15156t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B() {
        return !this.f15151o.isEmpty();
    }

    protected abstract void C(o3.p0 p0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(l3 l3Var) {
        this.f15155s = l3Var;
        Iterator<u.c> it = this.f15150n.iterator();
        while (it.hasNext()) {
            it.next().a(this, l3Var);
        }
    }

    protected abstract void E();

    @Override // u2.u
    public final void c(u.c cVar) {
        this.f15150n.remove(cVar);
        if (!this.f15150n.isEmpty()) {
            k(cVar);
            return;
        }
        this.f15154r = null;
        this.f15155s = null;
        this.f15156t = null;
        this.f15151o.clear();
        E();
    }

    @Override // u2.u
    public final void d(u.c cVar) {
        p3.a.e(this.f15154r);
        boolean isEmpty = this.f15151o.isEmpty();
        this.f15151o.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    @Override // u2.u
    public final void e(b0 b0Var) {
        this.f15152p.C(b0Var);
    }

    @Override // u2.u
    public /* synthetic */ boolean g() {
        return t.b(this);
    }

    @Override // u2.u
    public final void h(u.c cVar, o3.p0 p0Var, t1 t1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f15154r;
        p3.a.a(looper == null || looper == myLooper);
        this.f15156t = t1Var;
        l3 l3Var = this.f15155s;
        this.f15150n.add(cVar);
        if (this.f15154r == null) {
            this.f15154r = myLooper;
            this.f15151o.add(cVar);
            C(p0Var);
        } else if (l3Var != null) {
            d(cVar);
            cVar.a(this, l3Var);
        }
    }

    @Override // u2.u
    public /* synthetic */ l3 i() {
        return t.a(this);
    }

    @Override // u2.u
    public final void k(u.c cVar) {
        boolean z10 = !this.f15151o.isEmpty();
        this.f15151o.remove(cVar);
        if (z10 && this.f15151o.isEmpty()) {
            y();
        }
    }

    @Override // u2.u
    public final void l(Handler handler, b0 b0Var) {
        p3.a.e(handler);
        p3.a.e(b0Var);
        this.f15152p.g(handler, b0Var);
    }

    @Override // u2.u
    public final void p(Handler handler, w1.w wVar) {
        p3.a.e(handler);
        p3.a.e(wVar);
        this.f15153q.g(handler, wVar);
    }

    @Override // u2.u
    public final void q(w1.w wVar) {
        this.f15153q.t(wVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final w.a s(int i10, u.b bVar) {
        return this.f15153q.u(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final w.a t(u.b bVar) {
        return this.f15153q.u(0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a v(int i10, u.b bVar, long j10) {
        return this.f15152p.F(i10, bVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a w(u.b bVar) {
        return this.f15152p.F(0, bVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a x(u.b bVar, long j10) {
        p3.a.e(bVar);
        return this.f15152p.F(0, bVar, j10);
    }

    protected void y() {
    }

    protected void z() {
    }
}
