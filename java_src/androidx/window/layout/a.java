package androidx.window.layout;

import android.app.Activity;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2435a = new a();

    private a() {
    }

    public final boolean a(Activity activity) {
        k9.k.e(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
