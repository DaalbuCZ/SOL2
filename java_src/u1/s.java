package u1;

import android.os.Handler;
import p3.m0;
import s1.m1;
import u1.s;
/* loaded from: classes.dex */
public interface s {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f15028a;

        /* renamed from: b  reason: collision with root package name */
        private final s f15029b;

        public a(Handler handler, s sVar) {
            this.f15028a = sVar != null ? (Handler) p3.a.e(handler) : null;
            this.f15029b = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((s) m0.j(this.f15029b)).u(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((s) m0.j(this.f15029b)).l(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((s) m0.j(this.f15029b)).c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((s) m0.j(this.f15029b)).r(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((s) m0.j(this.f15029b)).q(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(v1.e eVar) {
            eVar.c();
            ((s) m0.j(this.f15029b)).n(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(v1.e eVar) {
            ((s) m0.j(this.f15029b)).i(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(m1 m1Var, v1.i iVar) {
            ((s) m0.j(this.f15029b)).p(m1Var);
            ((s) m0.j(this.f15029b)).s(m1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((s) m0.j(this.f15029b)).k(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((s) m0.j(this.f15029b)).b(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.y(j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.z(z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.A(i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.t(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.u(str);
                    }
                });
            }
        }

        public void o(final v1.e eVar) {
            eVar.c();
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.v(eVar);
                    }
                });
            }
        }

        public void p(final v1.e eVar) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.w(eVar);
                    }
                });
            }
        }

        public void q(final m1 m1Var, final v1.i iVar) {
            Handler handler = this.f15028a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.x(m1Var, iVar);
                    }
                });
            }
        }
    }

    void b(boolean z10);

    void c(Exception exc);

    void i(v1.e eVar);

    void k(long j10);

    void l(Exception exc);

    void n(v1.e eVar);

    @Deprecated
    void p(m1 m1Var);

    void q(String str);

    void r(String str, long j10, long j11);

    void s(m1 m1Var, v1.i iVar);

    void u(int i10, long j10, long j11);
}
