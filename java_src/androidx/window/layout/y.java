package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class y implements x {

    /* renamed from: a  reason: collision with root package name */
    public static final y f2509a = new y();

    /* renamed from: b  reason: collision with root package name */
    private static final String f2510b;

    static {
        String simpleName = y.class.getSimpleName();
        k9.k.d(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f2510b = simpleName;
    }

    private y() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout f(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
            Log.w(f2510b, e10);
        }
        return null;
    }

    private final int g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void i(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    public w a(Activity activity) {
        k9.k.e(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        return new w(i10 >= 30 ? b.f2436a.a(activity) : i10 >= 29 ? e(activity) : i10 >= 28 ? d(activity) : i10 >= 24 ? c(activity) : b(activity));
    }

    public final Rect b(Activity activity) {
        int i10;
        k9.k.e(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        k9.k.d(defaultDisplay, "defaultDisplay");
        Point h10 = h(defaultDisplay);
        Rect rect = new Rect();
        int i11 = h10.x;
        if (i11 == 0 || (i10 = h10.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i11;
            rect.bottom = i10;
        }
        return rect;
    }

    public final Rect c(Activity activity) {
        k9.k.e(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!a.f2435a.a(activity)) {
            k9.k.d(defaultDisplay, "defaultDisplay");
            Point h10 = h(defaultDisplay);
            int g10 = g(activity);
            int i10 = rect.bottom;
            if (i10 + g10 == h10.y) {
                rect.bottom = i10 + g10;
            } else {
                int i11 = rect.right;
                if (i11 + g10 == h10.x) {
                    rect.right = i11 + g10;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect d(Activity activity) {
        DisplayCutout f10;
        Rect rect;
        k9.k.e(activity, "activity");
        Rect rect2 = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f2435a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = (Rect) invoke;
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = (Rect) invoke2;
            }
            rect2.set(rect);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
            Log.w(f2510b, e10);
            i(activity, rect2);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        c cVar = c.f2437a;
        k9.k.d(defaultDisplay, "currentDisplay");
        cVar.a(defaultDisplay, point);
        a aVar = a.f2435a;
        if (!aVar.a(activity)) {
            int g10 = g(activity);
            int i10 = rect2.bottom;
            if (i10 + g10 == point.y) {
                rect2.bottom = i10 + g10;
            } else {
                int i11 = rect2.right;
                if (i11 + g10 == point.x) {
                    rect2.right = i11 + g10;
                } else if (rect2.left == g10) {
                    rect2.left = 0;
                }
            }
        }
        if ((rect2.width() < point.x || rect2.height() < point.y) && !aVar.a(activity) && (f10 = f(defaultDisplay)) != null) {
            int i12 = rect2.left;
            d dVar = d.f2438a;
            if (i12 == dVar.b(f10)) {
                rect2.left = 0;
            }
            if (point.x - rect2.right == dVar.c(f10)) {
                rect2.right += dVar.c(f10);
            }
            if (rect2.top == dVar.d(f10)) {
                rect2.top = 0;
            }
            if (point.y - rect2.bottom == dVar.a(f10)) {
                rect2.bottom += dVar.a(f10);
            }
        }
        return rect2;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect e(Activity activity) {
        k9.k.e(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
            Log.w(f2510b, e10);
            return d(activity);
        }
    }

    public final Point h(Display display) {
        k9.k.e(display, "display");
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            c.f2437a.a(display, point);
        } else {
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                Log.w(f2510b, e10);
            }
        }
        return point;
    }
}
