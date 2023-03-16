package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
final class g7 extends i7 {

    /* renamed from: n  reason: collision with root package name */
    static final g7 f3865n = new g7();

    private g7() {
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final boolean b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
