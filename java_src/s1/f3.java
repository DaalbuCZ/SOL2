package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class f3 extends w2 {

    /* renamed from: q  reason: collision with root package name */
    public static final h.a<f3> f13378q = e3.f13361a;

    /* renamed from: o  reason: collision with root package name */
    private final int f13379o;

    /* renamed from: p  reason: collision with root package name */
    private final float f13380p;

    public f3(int i10) {
        p3.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f13379o = i10;
        this.f13380p = -1.0f;
    }

    public f3(int i10, float f10) {
        boolean z10 = true;
        p3.a.b(i10 > 0, "maxStars must be a positive integer");
        p3.a.b((f10 < 0.0f || f10 > ((float) i10)) ? false : z10, "starRating is out of range [0, maxStars]");
        this.f13379o = i10;
        this.f13380p = f10;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f3 e(Bundle bundle) {
        p3.a.a(bundle.getInt(c(0), -1) == 2);
        int i10 = bundle.getInt(c(1), 5);
        float f10 = bundle.getFloat(c(2), -1.0f);
        return f10 == -1.0f ? new f3(i10) : new f3(i10, f10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            return this.f13379o == f3Var.f13379o && this.f13380p == f3Var.f13380p;
        }
        return false;
    }

    public int hashCode() {
        return a5.i.b(Integer.valueOf(this.f13379o), Float.valueOf(this.f13380p));
    }
}
