package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
final class n7 implements Serializable, k7 {

    /* renamed from: n  reason: collision with root package name */
    final Object f4028n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n7(Object obj) {
        this.f4028n = obj;
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final Object a() {
        return this.f4028n;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof n7) {
            Object obj2 = this.f4028n;
            Object obj3 = ((n7) obj).f4028n;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4028n});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f4028n + ")";
    }
}
