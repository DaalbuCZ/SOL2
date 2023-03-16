package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private b f3757a;

    /* renamed from: b  reason: collision with root package name */
    private b f3758b;

    /* renamed from: c  reason: collision with root package name */
    private final List f3759c;

    public c() {
        this.f3757a = new b("", 0L, null);
        this.f3758b = new b("", 0L, null);
        this.f3759c = new ArrayList();
    }

    public c(b bVar) {
        this.f3757a = bVar;
        this.f3758b = bVar.clone();
        this.f3759c = new ArrayList();
    }

    public final b a() {
        return this.f3757a;
    }

    public final b b() {
        return this.f3758b;
    }

    public final List c() {
        return this.f3759c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.f3757a.clone());
        for (b bVar : this.f3759c) {
            cVar.f3759c.add(bVar.clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.f3757a = bVar;
        this.f3758b = bVar.clone();
        this.f3759c.clear();
    }

    public final void e(String str, long j10, Map map) {
        this.f3759c.add(new b(str, j10, map));
    }

    public final void f(b bVar) {
        this.f3758b = bVar;
    }
}
