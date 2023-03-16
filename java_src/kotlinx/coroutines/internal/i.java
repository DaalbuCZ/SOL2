package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import r9.a1;
import r9.g2;
import r9.i2;
import r9.p1;
import y8.m;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private static final e0 f10924a = new e0("UNDEFINED");

    /* renamed from: b */
    public static final e0 f10925b = new e0("REUSABLE_CLAIMED");

    public static final /* synthetic */ e0 a() {
        return f10924a;
    }

    public static final <T> void b(b9.d<? super T> dVar, Object obj, j9.l<? super Throwable, y8.s> lVar) {
        boolean z10;
        if (!(dVar instanceof h)) {
            dVar.l(obj);
            return;
        }
        h hVar = (h) dVar;
        Object b10 = r9.z.b(obj, lVar);
        if (hVar.f10920q.W(hVar.b())) {
            hVar.f10922s = b10;
            hVar.f13168p = 1;
            hVar.f10920q.b(hVar.b(), hVar);
            return;
        }
        r9.n0.a();
        a1 a10 = g2.f13116a.a();
        if (a10.e0()) {
            hVar.f10922s = b10;
            hVar.f13168p = 1;
            a10.a0(hVar);
            return;
        }
        a10.c0(true);
        try {
            p1 p1Var = (p1) hVar.b().c(p1.f13154l);
            if (p1Var == null || p1Var.a()) {
                z10 = false;
            } else {
                CancellationException G = p1Var.G();
                hVar.a(b10, G);
                m.a aVar = y8.m.f17093n;
                hVar.l(y8.m.a(y8.n.a(G)));
                z10 = true;
            }
            if (!z10) {
                b9.d<T> dVar2 = hVar.f10921r;
                Object obj2 = hVar.f10923t;
                b9.g b11 = dVar2.b();
                Object c10 = i0.c(b11, obj2);
                i2<?> f10 = c10 != i0.f10926a ? r9.c0.f(dVar2, b11, c10) : null;
                hVar.f10921r.l(obj);
                y8.s sVar = y8.s.f17099a;
                if (f10 == null || f10.I0()) {
                    i0.a(b11, c10);
                }
            }
            do {
            } while (a10.g0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(b9.d dVar, Object obj, j9.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
