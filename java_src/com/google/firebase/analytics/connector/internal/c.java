package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import i5.a;
import o4.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements a.InterfaceC0177a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f5259a;

    public c(d dVar) {
        this.f5259a = dVar;
    }

    @Override // p4.u
    public final void a(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (this.f5259a.f5260a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.c(str2));
            bVar = this.f5259a.f5261b;
            bVar.a(2, bundle2);
        }
    }
}
