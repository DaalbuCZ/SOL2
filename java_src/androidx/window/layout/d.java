package androidx.window.layout;

import android.view.DisplayCutout;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2438a = new d();

    private d() {
    }

    public final int a(DisplayCutout displayCutout) {
        k9.k.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        k9.k.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        k9.k.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        k9.k.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
