package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 implements Comparator {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ j f3760n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ z4 f3761o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(j jVar, z4 z4Var) {
        this.f3760n = jVar;
        this.f3761o = z4Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        j jVar = this.f3760n;
        z4 z4Var = this.f3761o;
        if (qVar instanceof v) {
            return !(qVar2 instanceof v) ? 1 : 0;
        } else if (qVar2 instanceof v) {
            return -1;
        } else {
            return jVar == null ? qVar.g().compareTo(qVar2.g()) : (int) a6.a(jVar.a(z4Var, Arrays.asList(qVar, qVar2)).f().doubleValue());
        }
    }
}
