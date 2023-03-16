package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final y f3566n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ b0 f3567o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(b0 b0Var, y yVar) {
        this.f3567o = b0Var;
        this.f3566n = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3567o.f3581o) {
            w3.b b10 = this.f3566n.b();
            if (b10.x()) {
                b0 b0Var = this.f3567o;
                b0Var.f3560n.startActivityForResult(GoogleApiActivity.a(b0Var.b(), (PendingIntent) z3.o.i(b10.v()), this.f3566n.a(), false), 1);
                return;
            }
            b0 b0Var2 = this.f3567o;
            if (b0Var2.f3584r.b(b0Var2.b(), b10.k(), null) != null) {
                b0 b0Var3 = this.f3567o;
                b0Var3.f3584r.v(b0Var3.b(), this.f3567o.f3560n, b10.k(), 2, this.f3567o);
            } else if (b10.k() != 18) {
                this.f3567o.l(b10, this.f3566n.a());
            } else {
                b0 b0Var4 = this.f3567o;
                Dialog q10 = b0Var4.f3584r.q(b0Var4.b(), this.f3567o);
                b0 b0Var5 = this.f3567o;
                b0Var5.f3584r.r(b0Var5.b().getApplicationContext(), new z(this, q10));
            }
        }
    }
}
