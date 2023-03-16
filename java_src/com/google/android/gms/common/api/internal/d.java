package com.google.android.gms.common.api.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements t4.d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t4.j f3592a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f3593b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, t4.j jVar) {
        this.f3593b = eVar;
        this.f3592a = jVar;
    }

    @Override // t4.d
    public final void a(t4.i iVar) {
        Map map;
        map = this.f3593b.f3596b;
        map.remove(this.f3592a);
    }
}
