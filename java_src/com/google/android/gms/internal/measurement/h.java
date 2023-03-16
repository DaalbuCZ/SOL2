package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class h implements q {

    /* renamed from: n  reason: collision with root package name */
    private final q f3876n;

    /* renamed from: o  reason: collision with root package name */
    private final String f3877o;

    public h() {
        throw null;
    }

    public h(String str) {
        this.f3876n = q.f4079c;
        this.f3877o = str;
    }

    public h(String str, q qVar) {
        this.f3876n = qVar;
        this.f3877o = str;
    }

    public final q a() {
        return this.f3876n;
    }

    public final String b() {
        return this.f3877o;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        return new h(this.f3877o, this.f3876n.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f3877o.equals(hVar.f3877o) && this.f3876n.equals(hVar.f3876n);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return (this.f3877o.hashCode() * 31) + this.f3876n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
