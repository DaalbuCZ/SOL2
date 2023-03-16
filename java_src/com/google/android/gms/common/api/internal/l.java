package com.google.android.gms.common.api.internal;

import android.os.Handler;
import z3.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements c.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f3606a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m mVar) {
        this.f3606a = mVar;
    }

    @Override // z3.c.e
    public final void a() {
        Handler handler;
        handler = this.f3606a.f3619m.C;
        handler.post(new k(this));
    }
}
