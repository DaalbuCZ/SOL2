package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x8 implements h9 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a9 f5190a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x8(a9 a9Var) {
        this.f5190a = a9Var;
    }

    @Override // com.google.android.gms.measurement.internal.h9
    public final void a(String str, String str2, Bundle bundle) {
        j4 j4Var;
        j4 j4Var2;
        if (!TextUtils.isEmpty(str)) {
            this.f5190a.b().z(new w8(this, str, "_err", bundle));
            return;
        }
        a9 a9Var = this.f5190a;
        j4Var = a9Var.f4394l;
        if (j4Var != null) {
            j4Var2 = a9Var.f4394l;
            j4Var2.d().r().b("AppId not known when logging event", "_err");
        }
    }
}
