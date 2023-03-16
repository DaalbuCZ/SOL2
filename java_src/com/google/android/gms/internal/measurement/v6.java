package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v6 extends d7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v6(z6 z6Var, String str, Long l10, boolean z10) {
        super(z6Var, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.d7
    @Nullable
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = super.c();
            Log.e("PhenotypeFlag", "Invalid long value for " + c10 + ": " + ((String) obj));
            return null;
        }
    }
}
