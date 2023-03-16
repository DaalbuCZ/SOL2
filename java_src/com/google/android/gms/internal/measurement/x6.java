package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x6 extends d7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x6(z6 z6Var, String str, Double d10, boolean z10) {
        super(z6Var, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.d7
    @Nullable
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = super.c();
            Log.e("PhenotypeFlag", "Invalid double value for " + c10 + ": " + ((String) obj));
            return null;
        }
    }
}
