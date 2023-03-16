package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Map;
import x3.a;
/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ w3.b f3622n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ p f3623o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(p pVar, w3.b bVar) {
        this.f3623o = pVar;
        this.f3622n = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        y3.b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        p pVar = this.f3623o;
        map = pVar.f3629f.f3579y;
        bVar = pVar.f3625b;
        m mVar = (m) map.get(bVar);
        if (mVar == null) {
            return;
        }
        if (!this.f3622n.C()) {
            mVar.H(this.f3622n, null);
            return;
        }
        this.f3623o.f3628e = true;
        fVar = this.f3623o.f3624a;
        if (fVar.n()) {
            this.f3623o.h();
            return;
        }
        try {
            p pVar2 = this.f3623o;
            fVar3 = pVar2.f3624a;
            fVar4 = pVar2.f3624a;
            fVar3.o(null, fVar4.c());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f3623o.f3624a;
            fVar2.e("Failed to get service from broker.");
            mVar.H(new w3.b(10), null);
        }
    }
}
