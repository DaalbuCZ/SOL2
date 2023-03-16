package com.google.android.gms.common.api.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final y3.b<?> f3620a;

    /* renamed from: b  reason: collision with root package name */
    private final w3.d f3621b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(y3.b bVar, w3.d dVar, y3.n nVar) {
        this.f3620a = bVar;
        this.f3621b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (z3.n.a(this.f3620a, nVar.f3620a) && z3.n.a(this.f3621b, nVar.f3621b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return z3.n.b(this.f3620a, this.f3621b);
    }

    public final String toString() {
        return z3.n.c(this).a("key", this.f3620a).a("feature", this.f3621b).toString();
    }
}
