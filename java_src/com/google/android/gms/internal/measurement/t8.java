package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class t8 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4191a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4192b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t8(Object obj, int i10) {
        this.f4191a = obj;
        this.f4192b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t8) {
            t8 t8Var = (t8) obj;
            return this.f4191a == t8Var.f4191a && this.f4192b == t8Var.f4192b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f4191a) * 65535) + this.f4192b;
    }
}
