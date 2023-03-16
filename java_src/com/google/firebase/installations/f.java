package com.google.firebase.installations;

import t4.j;
/* loaded from: classes.dex */
class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final j<String> f5425a;

    public f(j<String> jVar) {
        this.f5425a = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(l6.d dVar) {
        if (dVar.l() || dVar.k() || dVar.i()) {
            this.f5425a.e(dVar.d());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
