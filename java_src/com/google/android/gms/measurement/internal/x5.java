package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x5 implements h9 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i6 f5179a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x5(i6 i6Var) {
        this.f5179a = i6Var;
    }

    @Override // com.google.android.gms.measurement.internal.h9
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f5179a.r("auto", "_err", bundle);
        } else {
            this.f5179a.t("auto", "_err", bundle, str);
        }
    }
}
