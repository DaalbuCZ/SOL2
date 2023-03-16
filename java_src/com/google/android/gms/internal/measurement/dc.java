package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class dc extends j {

    /* renamed from: p  reason: collision with root package name */
    private final ed f3811p;

    public dc(String str, ed edVar) {
        super("internal.remoteConfig");
        this.f3811p = edVar;
        this.f3918o.put("getValue", new cb(this, "getValue", edVar));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        return q.f4079c;
    }
}
