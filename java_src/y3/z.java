package y3;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import x3.a;
import x3.f;
import z3.k0;
/* loaded from: classes.dex */
public final class z extends r4.d implements f.a, f.b {

    /* renamed from: h  reason: collision with root package name */
    private static final a.AbstractC0235a<? extends q4.f, q4.a> f17011h = q4.e.f12710c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f17012a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f17013b;

    /* renamed from: c  reason: collision with root package name */
    private final a.AbstractC0235a<? extends q4.f, q4.a> f17014c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Scope> f17015d;

    /* renamed from: e  reason: collision with root package name */
    private final z3.d f17016e;

    /* renamed from: f  reason: collision with root package name */
    private q4.f f17017f;

    /* renamed from: g  reason: collision with root package name */
    private y f17018g;

    public z(Context context, Handler handler, z3.d dVar) {
        a.AbstractC0235a<? extends q4.f, q4.a> abstractC0235a = f17011h;
        this.f17012a = context;
        this.f17013b = handler;
        this.f17016e = (z3.d) z3.o.j(dVar, "ClientSettings must not be null");
        this.f17015d = dVar.e();
        this.f17014c = abstractC0235a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void o0(z zVar, r4.l lVar) {
        w3.b k10 = lVar.k();
        if (k10.C()) {
            k0 k0Var = (k0) z3.o.i(lVar.s());
            k10 = k0Var.k();
            if (k10.C()) {
                zVar.f17018g.c(k0Var.s(), zVar.f17015d);
                zVar.f17017f.m();
            }
            String valueOf = String.valueOf(k10);
            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
        }
        zVar.f17018g.b(k10);
        zVar.f17017f.m();
    }

    @Override // y3.c
    public final void a(int i10) {
        this.f17017f.m();
    }

    @Override // y3.h
    public final void e(w3.b bVar) {
        this.f17018g.b(bVar);
    }

    @Override // y3.c
    public final void f(Bundle bundle) {
        this.f17017f.b(this);
    }

    public final void p0(y yVar) {
        q4.f fVar = this.f17017f;
        if (fVar != null) {
            fVar.m();
        }
        this.f17016e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0235a<? extends q4.f, q4.a> abstractC0235a = this.f17014c;
        Context context = this.f17012a;
        Looper looper = this.f17013b.getLooper();
        z3.d dVar = this.f17016e;
        this.f17017f = abstractC0235a.a(context, looper, dVar, dVar.f(), this, this);
        this.f17018g = yVar;
        Set<Scope> set = this.f17015d;
        if (set == null || set.isEmpty()) {
            this.f17013b.post(new w(this));
        } else {
            this.f17017f.p();
        }
    }

    public final void q0() {
        q4.f fVar = this.f17017f;
        if (fVar != null) {
            fVar.m();
        }
    }

    @Override // r4.f
    public final void w(r4.l lVar) {
        this.f17013b.post(new x(this, lVar));
    }
}
