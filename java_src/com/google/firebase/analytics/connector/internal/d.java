package com.google.firebase.analytics.connector.internal;

import i5.a;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    final Set f5260a;

    /* renamed from: b  reason: collision with root package name */
    private final a.b f5261b;

    /* renamed from: c  reason: collision with root package name */
    private final o4.a f5262c;

    /* renamed from: d  reason: collision with root package name */
    private final c f5263d;

    public d(o4.a aVar, a.b bVar) {
        this.f5261b = bVar;
        this.f5262c = aVar;
        c cVar = new c(this);
        this.f5263d = cVar;
        aVar.f(cVar);
        this.f5260a = new HashSet();
    }
}
