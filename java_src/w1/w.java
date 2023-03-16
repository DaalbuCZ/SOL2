package w1;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.u;
import w1.w;
/* loaded from: classes.dex */
public interface w {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f15966a;

        /* renamed from: b  reason: collision with root package name */
        public final u.b f15967b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0230a> f15968c;

        /* renamed from: w1.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C0230a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f15969a;

            /* renamed from: b  reason: collision with root package name */
            public w f15970b;

            public C0230a(Handler handler, w wVar) {
                this.f15969a = handler;
                this.f15970b = wVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0230a> copyOnWriteArrayList, int i10, u.b bVar) {
            this.f15968c = copyOnWriteArrayList;
            this.f15966a = i10;
            this.f15967b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(w wVar) {
            wVar.a0(this.f15966a, this.f15967b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(w wVar) {
            wVar.f0(this.f15966a, this.f15967b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(w wVar) {
            wVar.P(this.f15966a, this.f15967b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(w wVar, int i10) {
            wVar.k0(this.f15966a, this.f15967b);
            wVar.C(this.f15966a, this.f15967b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(w wVar, Exception exc) {
            wVar.I(this.f15966a, this.f15967b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(w wVar) {
            wVar.G(this.f15966a, this.f15967b);
        }

        public void g(Handler handler, w wVar) {
            p3.a.e(handler);
            p3.a.e(wVar);
            this.f15968c.add(new C0230a(handler, wVar));
        }

        public void h() {
            Iterator<C0230a> it = this.f15968c.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                final w wVar = next.f15970b;
                p3.m0.J0(next.f15969a, new Runnable() { // from class: w1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.n(wVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0230a> it = this.f15968c.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                final w wVar = next.f15970b;
                p3.m0.J0(next.f15969a, new Runnable() { // from class: w1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.o(wVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0230a> it = this.f15968c.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                final w wVar = next.f15970b;
                p3.m0.J0(next.f15969a, new Runnable() { // from class: w1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.p(wVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C0230a> it = this.f15968c.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                final w wVar = next.f15970b;
                p3.m0.J0(next.f15969a, new Runnable() { // from class: w1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.q(wVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0230a> it = this.f15968c.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                final w wVar = next.f15970b;
                p3.m0.J0(next.f15969a, new Runnable() { // from class: w1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.r(wVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0230a> it = this.f15968c.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                final w wVar = next.f15970b;
                p3.m0.J0(next.f15969a, new Runnable() { // from class: w1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.s(wVar);
                    }
                });
            }
        }

        public void t(w wVar) {
            Iterator<C0230a> it = this.f15968c.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                if (next.f15970b == wVar) {
                    this.f15968c.remove(next);
                }
            }
        }

        public a u(int i10, u.b bVar) {
            return new a(this.f15968c, i10, bVar);
        }
    }

    void C(int i10, u.b bVar, int i11);

    void G(int i10, u.b bVar);

    void I(int i10, u.b bVar, Exception exc);

    void P(int i10, u.b bVar);

    void a0(int i10, u.b bVar);

    void f0(int i10, u.b bVar);

    @Deprecated
    void k0(int i10, u.b bVar);
}
