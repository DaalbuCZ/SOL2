package r9;

import y8.m;
/* loaded from: classes.dex */
public final class v0 {
    public static final <T> void a(u0<? super T> u0Var, int i10) {
        if (n0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        b9.d<? super T> c10 = u0Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(c10 instanceof kotlinx.coroutines.internal.h) || b(i10) != b(u0Var.f13168p)) {
            d(u0Var, c10, z10);
            return;
        }
        d0 d0Var = ((kotlinx.coroutines.internal.h) c10).f10920q;
        b9.g b10 = c10.b();
        if (d0Var.W(b10)) {
            d0Var.b(b10, u0Var);
        } else {
            e(u0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(u0<? super T> u0Var, b9.d<? super T> dVar, boolean z10) {
        Object f10;
        Object k10 = u0Var.k();
        Throwable d10 = u0Var.d(k10);
        if (d10 != null) {
            m.a aVar = y8.m.f17093n;
            f10 = y8.n.a(d10);
        } else {
            m.a aVar2 = y8.m.f17093n;
            f10 = u0Var.f(k10);
        }
        Object a10 = y8.m.a(f10);
        if (!z10) {
            dVar.l(a10);
            return;
        }
        kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) dVar;
        b9.d<T> dVar2 = hVar.f10921r;
        Object obj = hVar.f10923t;
        b9.g b10 = dVar2.b();
        Object c10 = kotlinx.coroutines.internal.i0.c(b10, obj);
        i2<?> f11 = c10 != kotlinx.coroutines.internal.i0.f10926a ? c0.f(dVar2, b10, c10) : null;
        try {
            hVar.f10921r.l(a10);
            y8.s sVar = y8.s.f17099a;
        } finally {
            if (f11 == null || f11.I0()) {
                kotlinx.coroutines.internal.i0.a(b10, c10);
            }
        }
    }

    private static final void e(u0<?> u0Var) {
        a1 a10 = g2.f13116a.a();
        if (a10.e0()) {
            a10.a0(u0Var);
            return;
        }
        a10.c0(true);
        try {
            d(u0Var, u0Var.c(), true);
            do {
            } while (a10.g0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
