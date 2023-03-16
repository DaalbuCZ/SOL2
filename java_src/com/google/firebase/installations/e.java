package com.google.firebase.installations;

import t4.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f5423a;

    /* renamed from: b  reason: collision with root package name */
    private final j<g> f5424b;

    public e(i iVar, j<g> jVar) {
        this.f5423a = iVar;
        this.f5424b = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(l6.d dVar) {
        if (!dVar.k() || this.f5423a.f(dVar)) {
            return false;
        }
        this.f5424b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f5424b.d(exc);
        return true;
    }
}
