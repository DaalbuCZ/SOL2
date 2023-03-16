package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class gc extends IllegalArgumentException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public gc(int i10, int i11) {
        super("Unpaired surrogate at index " + i10 + " of " + i11);
    }
}
