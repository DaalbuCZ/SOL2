package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements g {

    /* renamed from: o  reason: collision with root package name */
    private static int f398o;

    /* renamed from: p  reason: collision with root package name */
    private static Field f399p;

    /* renamed from: q  reason: collision with root package name */
    private static Field f400q;

    /* renamed from: r  reason: collision with root package name */
    private static Field f401r;

    /* renamed from: n  reason: collision with root package name */
    private Activity f402n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f402n = activity;
    }

    private static void h() {
        try {
            f398o = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f400q = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f401r = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f399p = declaredField3;
            declaredField3.setAccessible(true);
            f398o = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        if (bVar != e.b.ON_DESTROY) {
            return;
        }
        if (f398o == 0) {
            h();
        }
        if (f398o == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f402n.getSystemService("input_method");
            try {
                Object obj = f399p.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f400q.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f401r.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
