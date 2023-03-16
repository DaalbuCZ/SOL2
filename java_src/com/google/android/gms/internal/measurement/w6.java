package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w6 extends d7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w6(z6 z6Var, String str, Boolean bool, boolean z10) {
        super(z6Var, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.d7
    @Nullable
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (b6.f3728c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (b6.f3729d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String c10 = super.c();
        Log.e("PhenotypeFlag", "Invalid boolean value for " + c10 + ": " + ((String) obj));
        return null;
    }
}
