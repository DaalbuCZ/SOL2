package r9;

import b9.g;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public interface p1 extends g.b {

    /* renamed from: l  reason: collision with root package name */
    public static final b f13154l = b.f13155n;

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(p1 p1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            p1Var.N(cancellationException);
        }

        public static <R> R b(p1 p1Var, R r10, j9.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(p1Var, r10, pVar);
        }

        public static <E extends g.b> E c(p1 p1Var, g.c<E> cVar) {
            return (E) g.b.a.b(p1Var, cVar);
        }

        public static /* synthetic */ y0 d(p1 p1Var, boolean z10, boolean z11, j9.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return p1Var.O(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static b9.g e(p1 p1Var, g.c<?> cVar) {
            return g.b.a.c(p1Var, cVar);
        }

        public static b9.g f(p1 p1Var, b9.g gVar) {
            return g.b.a.d(p1Var, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<p1> {

        /* renamed from: n  reason: collision with root package name */
        static final /* synthetic */ b f13155n = new b();

        private b() {
        }
    }

    CancellationException G();

    void N(CancellationException cancellationException);

    y0 O(boolean z10, boolean z11, j9.l<? super Throwable, y8.s> lVar);

    boolean a();

    q k(s sVar);

    boolean start();
}
