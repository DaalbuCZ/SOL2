package w1;

import android.net.Uri;
import b5.s0;
import java.util.Map;
import o3.l;
import o3.u;
import s1.u1;
import w1.h;
/* loaded from: classes.dex */
public final class l implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f15928a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private u1.f f15929b;

    /* renamed from: c  reason: collision with root package name */
    private y f15930c;

    /* renamed from: d  reason: collision with root package name */
    private l.a f15931d;

    /* renamed from: e  reason: collision with root package name */
    private String f15932e;

    private y b(u1.f fVar) {
        l.a aVar = this.f15931d;
        if (aVar == null) {
            aVar = new u.b().e(this.f15932e);
        }
        Uri uri = fVar.f13798c;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), fVar.f13803h, aVar);
        s0<Map.Entry<String, String>> it = fVar.f13800e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            l0Var.e(next.getKey(), next.getValue());
        }
        h a10 = new h.b().e(fVar.f13796a, k0.f15924d).b(fVar.f13801f).c(fVar.f13802g).d(d5.d.k(fVar.f13805j)).a(l0Var);
        a10.G(0, fVar.c());
        return a10;
    }

    @Override // w1.b0
    public y a(u1 u1Var) {
        y yVar;
        p3.a.e(u1Var.f13763o);
        u1.f fVar = u1Var.f13763o.f13829c;
        if (fVar == null || p3.m0.f12306a < 18) {
            return y.f15971a;
        }
        synchronized (this.f15928a) {
            if (!p3.m0.c(fVar, this.f15929b)) {
                this.f15929b = fVar;
                this.f15930c = b(fVar);
            }
            yVar = (y) p3.a.e(this.f15930c);
        }
        return yVar;
    }
}
