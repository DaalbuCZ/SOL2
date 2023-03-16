package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t2 extends k1 {

    /* renamed from: a  reason: collision with root package name */
    private final p4.u f4185a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(p4.u uVar) {
        this.f4185a = uVar;
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final int d() {
        return System.identityHashCode(this.f4185a);
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final void n(String str, String str2, Bundle bundle, long j10) {
        this.f4185a.a(str, str2, bundle, j10);
    }
}
