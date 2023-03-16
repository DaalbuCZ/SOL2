package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.a;
/* loaded from: classes.dex */
final class h implements a.InterfaceC0077a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f3601a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(b bVar) {
        this.f3601a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0077a
    public final void a(boolean z10) {
        Handler handler;
        Handler handler2;
        b bVar = this.f3601a;
        handler = bVar.C;
        handler2 = bVar.C;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
