package w9;

import b9.d;
import b9.g;
import d9.h;
import j9.p;
import k9.u;
import kotlinx.coroutines.internal.i0;
import y8.m;
import y8.n;
/* loaded from: classes.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        Object a10;
        Object c10;
        d a11 = h.a(dVar);
        try {
            g b10 = dVar.b();
            Object c11 = i0.c(b10, null);
            a10 = ((p) u.a(pVar, 2)).k(r10, a11);
            i0.a(b10, c11);
            c10 = c9.d.c();
        } catch (Throwable th) {
            m.a aVar = m.f17093n;
            a10 = n.a(th);
        }
        if (a10 != c10) {
            m.a aVar2 = m.f17093n;
            a11.l(m.a(a10));
        }
    }
}
