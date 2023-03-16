package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
final class l7 implements Serializable, k7 {

    /* renamed from: n  reason: collision with root package name */
    final k7 f3958n;

    /* renamed from: o  reason: collision with root package name */
    volatile transient boolean f3959o;
    @CheckForNull

    /* renamed from: p  reason: collision with root package name */
    transient Object f3960p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7(k7 k7Var) {
        Objects.requireNonNull(k7Var);
        this.f3958n = k7Var;
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final Object a() {
        if (!this.f3959o) {
            synchronized (this) {
                if (!this.f3959o) {
                    Object a10 = this.f3958n.a();
                    this.f3960p = a10;
                    this.f3959o = true;
                    return a10;
                }
            }
        }
        return this.f3960p;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f3959o) {
            obj = "<supplier that returned " + this.f3960p + ">";
        } else {
            obj = this.f3958n;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
