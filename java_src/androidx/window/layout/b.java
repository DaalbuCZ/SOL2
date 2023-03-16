package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2436a = new b();

    private b() {
    }

    public final Rect a(Activity activity) {
        k9.k.e(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        k9.k.d(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
