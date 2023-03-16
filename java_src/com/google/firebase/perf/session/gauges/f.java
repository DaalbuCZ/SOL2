package com.google.firebase.perf.session.gauges;

import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements i6.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f5774a = new f();

    private /* synthetic */ f() {
    }

    @Override // i6.b
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
