package w8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public interface a {
        boolean a(View view);
    }

    public static boolean c(View view) {
        return i(view, g.f16154a);
    }

    public static int d(int i10) {
        return Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : i10;
    }

    public static Activity e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean f(View view, final Class<? extends View>[] clsArr) {
        return i(view, new a() { // from class: w8.f
            @Override // w8.h.a
            public final boolean a(View view2) {
                boolean h10;
                h10 = h.h(clsArr, view2);
                return h10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean h(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(View view, a aVar) {
        if (view == null) {
            return false;
        }
        if (aVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (i(viewGroup.getChildAt(i10), aVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
