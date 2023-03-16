package com.google.android.gms.common.api.internal;
/* loaded from: classes.dex */
public final class w extends t<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final y3.f<?> f3644c;

    public w(y3.f<?> fVar, t4.j<Boolean> jVar) {
        super(4, jVar);
        this.f3644c = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final /* bridge */ /* synthetic */ void d(e eVar, boolean z10) {
    }

    @Override // y3.r
    public final boolean f(m<?> mVar) {
        if (mVar.x().get(this.f3644c) == null) {
            return false;
        }
        throw null;
    }

    @Override // y3.r
    public final w3.d[] g(m<?> mVar) {
        if (mVar.x().get(this.f3644c) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void h(m<?> mVar) {
        if (mVar.x().remove(this.f3644c) == null) {
            this.f3640b.e(Boolean.FALSE);
        } else {
            mVar.v();
            throw null;
        }
    }
}
