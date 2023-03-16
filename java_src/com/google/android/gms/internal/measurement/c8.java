package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class c8 {

    /* renamed from: a  reason: collision with root package name */
    final Map f3769a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f3769a.put(str, callable);
    }
}
