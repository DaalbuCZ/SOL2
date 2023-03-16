package r9;
/* loaded from: classes.dex */
public final class i2<T> extends kotlinx.coroutines.internal.c0<T> {

    /* renamed from: q  reason: collision with root package name */
    private ThreadLocal<y8.l<b9.g, Object>> f13124q;

    @Override // kotlinx.coroutines.internal.c0, r9.a
    protected void D0(Object obj) {
        y8.l<b9.g, Object> lVar = this.f13124q.get();
        if (lVar != null) {
            kotlinx.coroutines.internal.i0.a(lVar.a(), lVar.b());
            this.f13124q.set(null);
        }
        Object a10 = z.a(obj, this.f10910p);
        b9.d<T> dVar = this.f10910p;
        b9.g b10 = dVar.b();
        Object c10 = kotlinx.coroutines.internal.i0.c(b10, null);
        i2<?> f10 = c10 != kotlinx.coroutines.internal.i0.f10926a ? c0.f(dVar, b10, c10) : null;
        try {
            this.f10910p.l(a10);
            y8.s sVar = y8.s.f17099a;
        } finally {
            if (f10 == null || f10.I0()) {
                kotlinx.coroutines.internal.i0.a(b10, c10);
            }
        }
    }

    public final boolean I0() {
        if (this.f13124q.get() == null) {
            return false;
        }
        this.f13124q.set(null);
        return true;
    }

    public final void J0(b9.g gVar, Object obj) {
        this.f13124q.set(y8.p.a(gVar, obj));
    }
}
