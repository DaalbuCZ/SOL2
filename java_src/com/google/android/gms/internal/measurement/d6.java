package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
final class d6 extends a7 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3793a;

    /* renamed from: b  reason: collision with root package name */
    private final k7 f3794b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6(Context context, @Nullable k7 k7Var) {
        Objects.requireNonNull(context, "Null context");
        this.f3793a = context;
        this.f3794b = k7Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.a7
    public final Context a() {
        return this.f3793a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.a7
    @Nullable
    public final k7 b() {
        return this.f3794b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a7) {
            a7 a7Var = (a7) obj;
            if (this.f3793a.equals(a7Var.a())) {
                k7 k7Var = this.f3794b;
                k7 b10 = a7Var.b();
                if (k7Var != null ? k7Var.equals(b10) : b10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3793a.hashCode() ^ 1000003) * 1000003;
        k7 k7Var = this.f3794b;
        return hashCode ^ (k7Var == null ? 0 : k7Var.hashCode());
    }

    public final String toString() {
        String obj = this.f3793a.toString();
        String valueOf = String.valueOf(this.f3794b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
