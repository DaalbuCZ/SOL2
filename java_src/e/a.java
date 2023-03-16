package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import androidx.core.content.res.c;
import java.util.WeakHashMap;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f6623a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0094a>> f6624b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f6625c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0094a {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f6626a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f6627b;

        C0094a(ColorStateList colorStateList, Configuration configuration) {
            this.f6626a = colorStateList;
            this.f6627b = configuration;
        }
    }

    private static void a(Context context, int i10, ColorStateList colorStateList) {
        synchronized (f6625c) {
            WeakHashMap<Context, SparseArray<C0094a>> weakHashMap = f6624b;
            SparseArray<C0094a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i10, new C0094a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i10) {
        C0094a c0094a;
        synchronized (f6625c) {
            SparseArray<C0094a> sparseArray = f6624b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0094a = sparseArray.get(i10)) != null) {
                if (c0094a.f6627b.equals(context.getResources().getConfiguration())) {
                    return c0094a.f6626a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i10);
        }
        ColorStateList b10 = b(context, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList f10 = f(context, i10);
        if (f10 != null) {
            a(context, i10, f10);
            return f10;
        }
        return androidx.core.content.a.e(context, i10);
    }

    public static Drawable d(Context context, int i10) {
        return m0.h().j(context, i10);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f6623a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static ColorStateList f(Context context, int i10) {
        if (g(context, i10)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return c.a(resources, resources.getXml(i10), context.getTheme());
        } catch (Exception e10) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean g(Context context, int i10) {
        Resources resources = context.getResources();
        TypedValue e10 = e();
        resources.getValue(i10, e10, true);
        int i11 = e10.type;
        return i11 >= 28 && i11 <= 31;
    }
}
