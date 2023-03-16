package com.google.android.gms.internal.measurement;

import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
final class m7 implements k7 {
    @CheckForNull

    /* renamed from: n  reason: collision with root package name */
    volatile k7 f3974n;

    /* renamed from: o  reason: collision with root package name */
    volatile boolean f3975o;
    @CheckForNull

    /* renamed from: p  reason: collision with root package name */
    Object f3976p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m7(k7 k7Var) {
        Objects.requireNonNull(k7Var);
        this.f3974n = k7Var;
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final Object a() {
        if (!this.f3975o) {
            synchronized (this) {
                if (!this.f3975o) {
                    k7 k7Var = this.f3974n;
                    k7Var.getClass();
                    Object a10 = k7Var.a();
                    this.f3976p = a10;
                    this.f3975o = true;
                    this.f3974n = null;
                    return a10;
                }
            }
        }
        return this.f3976p;
    }

    public final String toString() {
        Object obj = this.f3974n;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f3976p + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
