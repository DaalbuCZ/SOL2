package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class bf extends j {

    /* renamed from: p  reason: collision with root package name */
    private final ze f3756p;

    public bf(ze zeVar) {
        super("internal.logger");
        this.f3756p = zeVar;
        this.f3918o.put("log", new af(this, false, true));
        this.f3918o.put("silent", new fe(this, "silent"));
        ((j) this.f3918o.get("silent")).v("log", new af(this, true, true));
        this.f3918o.put("unmonitored", new ye(this, "unmonitored"));
        ((j) this.f3918o.get("unmonitored")).v("log", new af(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        return q.f4079c;
    }
}
