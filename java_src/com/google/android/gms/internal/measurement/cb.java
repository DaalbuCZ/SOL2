package com.google.android.gms.internal.measurement;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class cb extends j {

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ ed f3774p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(dc dcVar, String str, ed edVar) {
        super("getValue");
        this.f3774p = edVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        a6.h("getValue", 2, list);
        q b10 = z4Var.b((q) list.get(0));
        q b11 = z4Var.b((q) list.get(1));
        String a10 = this.f3774p.a(b10.g());
        return a10 != null ? new u(a10) : b11;
    }
}
