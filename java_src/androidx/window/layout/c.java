package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2437a = new c();

    private c() {
    }

    public final void a(Display display, Point point) {
        k9.k.e(display, "display");
        k9.k.e(point, "point");
        display.getRealSize(point);
    }
}
