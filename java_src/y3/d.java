package y3;

import android.app.Activity;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f16966a;

    public d(Activity activity) {
        z3.o.j(activity, "Activity must not be null");
        this.f16966a = activity;
    }

    public final Activity a() {
        return (Activity) this.f16966a;
    }

    public final androidx.fragment.app.d b() {
        return (androidx.fragment.app.d) this.f16966a;
    }

    public final boolean c() {
        return this.f16966a instanceof Activity;
    }

    public final boolean d() {
        return this.f16966a instanceof androidx.fragment.app.d;
    }
}