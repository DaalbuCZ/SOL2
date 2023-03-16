package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class wa {

    /* renamed from: c  reason: collision with root package name */
    private static final wa f4272c = new wa();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f4274b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final ab f4273a = new ga();

    private wa() {
    }

    public static wa a() {
        return f4272c;
    }

    public final za b(Class cls) {
        p9.f(cls, "messageType");
        za zaVar = (za) this.f4274b.get(cls);
        if (zaVar == null) {
            zaVar = this.f4273a.a(cls);
            p9.f(cls, "messageType");
            p9.f(zaVar, "schema");
            za zaVar2 = (za) this.f4274b.putIfAbsent(cls, zaVar);
            if (zaVar2 != null) {
                return zaVar2;
            }
        }
        return zaVar;
    }
}
