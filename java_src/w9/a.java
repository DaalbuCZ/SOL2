package w9;

import b9.d;
import c9.c;
import j9.l;
import j9.p;
import kotlinx.coroutines.internal.i;
import y8.m;
import y8.n;
import y8.s;
/* loaded from: classes.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        m.a aVar = m.f17093n;
        dVar.l(m.a(n.a(th)));
        throw th;
    }

    public static final void b(d<? super s> dVar, d<?> dVar2) {
        d b10;
        try {
            b10 = c.b(dVar);
            m.a aVar = m.f17093n;
            i.c(b10, m.a(s.f17099a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, l<? super Throwable, s> lVar) {
        d a10;
        d b10;
        try {
            a10 = c.a(pVar, r10, dVar);
            b10 = c.b(a10);
            m.a aVar = m.f17093n;
            i.b(b10, m.a(s.f17099a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
