package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes.dex */
final class f6 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g6 f3847a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(g6 g6Var, Handler handler) {
        super(null);
        this.f3847a = g6Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f3847a.f();
    }
}
