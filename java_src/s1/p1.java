package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class p1 extends w2 {

    /* renamed from: q  reason: collision with root package name */
    public static final h.a<p1> f13657q = o1.f13647a;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13658o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f13659p;

    public p1() {
        this.f13658o = false;
        this.f13659p = false;
    }

    public p1(boolean z10) {
        this.f13658o = true;
        this.f13659p = z10;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p1 e(Bundle bundle) {
        p3.a.a(bundle.getInt(c(0), -1) == 0);
        return bundle.getBoolean(c(1), false) ? new p1(bundle.getBoolean(c(2), false)) : new p1();
    }

    public boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            return this.f13659p == p1Var.f13659p && this.f13658o == p1Var.f13658o;
        }
        return false;
    }

    public int hashCode() {
        return a5.i.b(Boolean.valueOf(this.f13658o), Boolean.valueOf(this.f13659p));
    }
}
