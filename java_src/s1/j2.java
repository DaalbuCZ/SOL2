package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class j2 extends w2 {

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<j2> f13508p = i2.f13477a;

    /* renamed from: o  reason: collision with root package name */
    private final float f13509o;

    public j2() {
        this.f13509o = -1.0f;
    }

    public j2(float f10) {
        p3.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f13509o = f10;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j2 e(Bundle bundle) {
        p3.a.a(bundle.getInt(c(0), -1) == 1);
        float f10 = bundle.getFloat(c(1), -1.0f);
        return f10 == -1.0f ? new j2() : new j2(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j2) && this.f13509o == ((j2) obj).f13509o;
    }

    public int hashCode() {
        return a5.i.b(Float.valueOf(this.f13509o));
    }
}
