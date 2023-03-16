package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class cf extends j {

    /* renamed from: p  reason: collision with root package name */
    private final Callable f3778p;

    public cf(String str, Callable callable) {
        super("internal.appMetadata");
        this.f3778p = callable;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        try {
            return b7.b(this.f3778p.call());
        } catch (Exception unused) {
            return q.f4079c;
        }
    }
}
