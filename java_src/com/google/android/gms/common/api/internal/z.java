package com.google.android.gms.common.api.internal;

import android.app.Dialog;
/* loaded from: classes.dex */
final class z extends y3.p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f3648a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f3649b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(a0 a0Var, Dialog dialog) {
        this.f3649b = a0Var;
        this.f3648a = dialog;
    }

    @Override // y3.p
    public final void a() {
        this.f3649b.f3567o.o();
        if (this.f3648a.isShowing()) {
            this.f3648a.dismiss();
        }
    }
}
