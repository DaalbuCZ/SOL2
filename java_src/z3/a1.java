package z3;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class a1 extends m0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f17310g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, null);
        this.f17310g = cVar;
    }

    @Override // z3.m0
    protected final void f(w3.b bVar) {
        if (this.f17310g.t() && c.h0(this.f17310g)) {
            c.d0(this.f17310g, 16);
            return;
        }
        this.f17310g.C.a(bVar);
        this.f17310g.L(bVar);
    }

    @Override // z3.m0
    protected final boolean g() {
        this.f17310g.C.a(w3.b.f16057r);
        return true;
    }
}
