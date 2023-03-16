package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import i5.a;
import o4.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements a.InterfaceC0177a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f5264a;

    public e(f fVar) {
        this.f5264a = fVar;
    }

    @Override // p4.u
    public final void a(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (str == null || !b.h(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        bVar = this.f5264a.f5265a;
        bVar.a(3, bundle2);
    }
}
