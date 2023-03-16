package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.d3;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f5250a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FirebaseAnalytics firebaseAnalytics) {
        this.f5250a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        d3 d3Var;
        d3Var = this.f5250a.f5242a;
        return d3Var.A();
    }
}
