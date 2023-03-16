package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import x3.a;
/* loaded from: classes.dex */
public final class v<ResultT> extends y3.r {

    /* renamed from: b  reason: collision with root package name */
    private final c<a.b, ResultT> f3641b;

    /* renamed from: c  reason: collision with root package name */
    private final t4.j<ResultT> f3642c;

    /* renamed from: d  reason: collision with root package name */
    private final y3.k f3643d;

    public v(int i10, c<a.b, ResultT> cVar, t4.j<ResultT> jVar, y3.k kVar) {
        super(i10);
        this.f3642c = jVar;
        this.f3641b = cVar;
        this.f3643d = kVar;
        if (i10 == 2 && cVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a(Status status) {
        this.f3642c.d(this.f3643d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void b(Exception exc) {
        this.f3642c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void c(m<?> mVar) {
        try {
            this.f3641b.b(mVar.v(), this.f3642c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(x.e(e11));
        } catch (RuntimeException e12) {
            this.f3642c.d(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void d(e eVar, boolean z10) {
        eVar.b(this.f3642c, z10);
    }

    @Override // y3.r
    public final boolean f(m<?> mVar) {
        return this.f3641b.c();
    }

    @Override // y3.r
    public final w3.d[] g(m<?> mVar) {
        return this.f3641b.e();
    }
}
