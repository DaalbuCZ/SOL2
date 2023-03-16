package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class j3 extends w2 {

    /* renamed from: q  reason: collision with root package name */
    public static final h.a<j3> f13510q = i3.f13478a;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13511o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f13512p;

    public j3() {
        this.f13511o = false;
        this.f13512p = false;
    }

    public j3(boolean z10) {
        this.f13511o = true;
        this.f13512p = z10;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j3 e(Bundle bundle) {
        p3.a.a(bundle.getInt(c(0), -1) == 3);
        return bundle.getBoolean(c(1), false) ? new j3(bundle.getBoolean(c(2), false)) : new j3();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j3) {
            j3 j3Var = (j3) obj;
            return this.f13512p == j3Var.f13512p && this.f13511o == j3Var.f13511o;
        }
        return false;
    }

    public int hashCode() {
        return a5.i.b(Boolean.valueOf(this.f13511o), Boolean.valueOf(this.f13512p));
    }
}
