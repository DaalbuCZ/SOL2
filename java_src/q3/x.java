package q3;

import android.os.Handler;
import android.os.SystemClock;
import p3.m0;
import q3.x;
import s1.m1;
/* loaded from: classes.dex */
public interface x {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f12689a;

        /* renamed from: b  reason: collision with root package name */
        private final x f12690b;

        public a(Handler handler, x xVar) {
            this.f12689a = xVar != null ? (Handler) p3.a.e(handler) : null;
            this.f12690b = xVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((x) m0.j(this.f12690b)).g(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((x) m0.j(this.f12690b)).e(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(v1.e eVar) {
            eVar.c();
            ((x) m0.j(this.f12690b)).t(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((x) m0.j(this.f12690b)).v(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(v1.e eVar) {
            ((x) m0.j(this.f12690b)).z(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(m1 m1Var, v1.i iVar) {
            ((x) m0.j(this.f12690b)).C(m1Var);
            ((x) m0.j(this.f12690b)).w(m1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((x) m0.j(this.f12690b)).f(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((x) m0.j(this.f12690b)).y(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((x) m0.j(this.f12690b)).m(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(z zVar) {
            ((x) m0.j(this.f12690b)).o(zVar);
        }

        public void A(final Object obj) {
            if (this.f12689a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f12689a.post(new Runnable() { // from class: q3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.y(exc);
                    }
                });
            }
        }

        public void D(final z zVar) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.z(zVar);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.r(str);
                    }
                });
            }
        }

        public void m(final v1.e eVar) {
            eVar.c();
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.s(eVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.t(i10, j10);
                    }
                });
            }
        }

        public void o(final v1.e eVar) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.u(eVar);
                    }
                });
            }
        }

        public void p(final m1 m1Var, final v1.i iVar) {
            Handler handler = this.f12689a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q3.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.v(m1Var, iVar);
                    }
                });
            }
        }
    }

    @Deprecated
    void C(m1 m1Var);

    void e(String str);

    void f(Object obj, long j10);

    void g(String str, long j10, long j11);

    void m(Exception exc);

    void o(z zVar);

    void t(v1.e eVar);

    void v(int i10, long j10);

    void w(m1 m1Var, v1.i iVar);

    void y(long j10, int i10);

    void z(v1.e eVar);
}
