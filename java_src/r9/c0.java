package r9;

import b9.g;
/* loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends k9.l implements j9.p<b9.g, g.b, b9.g> {

        /* renamed from: o  reason: collision with root package name */
        public static final a f13101o = new a();

        a() {
            super(2);
        }

        @Override // j9.p
        /* renamed from: a */
        public final b9.g k(b9.g gVar, g.b bVar) {
            return bVar instanceof a0 ? gVar.j(((a0) bVar).t()) : gVar.j(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends k9.l implements j9.p<b9.g, g.b, b9.g> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ k9.r<b9.g> f13102o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f13103p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k9.r<b9.g> rVar, boolean z10) {
            super(2);
            this.f13102o = rVar;
            this.f13103p = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, b9.g] */
        @Override // j9.p
        /* renamed from: a */
        public final b9.g k(b9.g gVar, g.b bVar) {
            if (bVar instanceof a0) {
                g.b c10 = this.f13102o.f10900n.c(bVar.getKey());
                if (c10 != null) {
                    k9.r<b9.g> rVar = this.f13102o;
                    rVar.f10900n = rVar.f10900n.B(bVar.getKey());
                    return gVar.j(((a0) bVar).f(c10));
                }
                a0 a0Var = (a0) bVar;
                if (this.f13103p) {
                    a0Var = a0Var.t();
                }
                return gVar.j(a0Var);
            }
            return gVar.j(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends k9.l implements j9.p<Boolean, g.b, Boolean> {

        /* renamed from: o  reason: collision with root package name */
        public static final c f13104o = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof a0));
        }

        @Override // j9.p
        public /* bridge */ /* synthetic */ Boolean k(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final b9.g a(b9.g gVar, b9.g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (c10 || c11) {
            k9.r rVar = new k9.r();
            rVar.f10900n = gVar2;
            b9.h hVar = b9.h.f2971n;
            b9.g gVar3 = (b9.g) gVar.S(hVar, new b(rVar, z10));
            if (c11) {
                rVar.f10900n = ((b9.g) rVar.f10900n).S(hVar, a.f13101o);
            }
            return gVar3.j((b9.g) rVar.f10900n);
        }
        return gVar.j(gVar2);
    }

    public static final String b(b9.g gVar) {
        h0 h0Var;
        if (n0.c() && (h0Var = (h0) gVar.c(h0.f13118p)) != null) {
            i0 i0Var = (i0) gVar.c(i0.f13122p);
            String str = (i0Var == null || (str = i0Var.b()) == null) ? "coroutine" : "coroutine";
            return str + '#' + h0Var.b();
        }
        return null;
    }

    private static final boolean c(b9.g gVar) {
        return ((Boolean) gVar.S(Boolean.FALSE, c.f13104o)).booleanValue();
    }

    public static final b9.g d(j0 j0Var, b9.g gVar) {
        b9.g a10 = a(j0Var.d(), gVar, true);
        b9.g j10 = n0.c() ? a10.j(new h0(n0.b().incrementAndGet())) : a10;
        return (a10 == x0.a() || a10.c(b9.e.f2968b) != null) ? j10 : j10.j(x0.a());
    }

    public static final i2<?> e(d9.e eVar) {
        while (!(eVar instanceof t0) && (eVar = eVar.h()) != null) {
            if (eVar instanceof i2) {
                return (i2) eVar;
            }
        }
        return null;
    }

    public static final i2<?> f(b9.d<?> dVar, b9.g gVar, Object obj) {
        if (dVar instanceof d9.e) {
            if (gVar.c(j2.f13126n) != null) {
                i2<?> e10 = e((d9.e) dVar);
                if (e10 != null) {
                    e10.J0(gVar, obj);
                }
                return e10;
            }
            return null;
        }
        return null;
    }
}
