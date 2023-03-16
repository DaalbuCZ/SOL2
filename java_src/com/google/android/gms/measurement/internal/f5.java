package com.google.android.gms.measurement.internal;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f5 implements p4.g {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j4 f4528a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f5(g5 g5Var, j4 j4Var) {
        this.f4528a = j4Var;
    }

    @Override // p4.g
    public final boolean a() {
        return this.f4528a.q() && Log.isLoggable(this.f4528a.d().C(), 3);
    }
}
