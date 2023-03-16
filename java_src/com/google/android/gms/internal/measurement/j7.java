package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
final class j7 extends i7 {

    /* renamed from: n  reason: collision with root package name */
    private final Object f3922n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j7(Object obj) {
        this.f3922n = obj;
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final Object a() {
        return this.f3922n;
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof j7) {
            return this.f3922n.equals(((j7) obj).f3922n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3922n.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f3922n + ")";
    }
}
