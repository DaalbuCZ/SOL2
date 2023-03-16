package b4;

import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import t4.i;
import x3.a;
import x3.e;
import y3.j;
import z3.s;
import z3.u;
import z3.v;
/* loaded from: classes.dex */
public final class d extends x3.e<v> implements u {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g<e> f2762k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.AbstractC0235a<e, v> f2763l;

    /* renamed from: m  reason: collision with root package name */
    private static final x3.a<v> f2764m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f2765n = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f2762k = gVar;
        c cVar = new c();
        f2763l = cVar;
        f2764m = new x3.a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, v vVar) {
        super(context, f2764m, vVar, e.a.f16328c);
    }

    @Override // z3.u
    public final i<Void> a(final s sVar) {
        c.a a10 = com.google.android.gms.common.api.internal.c.a();
        a10.d(j4.d.f10388a);
        a10.c(false);
        a10.b(new j() { // from class: b4.b
            @Override // y3.j
            public final void a(Object obj, Object obj2) {
                s sVar2 = s.this;
                int i10 = d.f2765n;
                ((a) ((e) obj).D()).m0(sVar2);
                ((t4.j) obj2).c(null);
            }
        });
        return c(a10.a());
    }
}
