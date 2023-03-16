package d;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* loaded from: classes.dex */
class h {

    /* renamed from: a  reason: collision with root package name */
    private static Field f6371a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6372b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f6373c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6374d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f6375e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f6376f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f6377g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f6378h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else if (i10 >= 23) {
            c(resources);
        } else if (i10 >= 21) {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        if (!f6372b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f6371a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f6372b = true;
        }
        Field field = f6371a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!f6372b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f6371a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f6372b = true;
        }
        Object obj = null;
        Field field = f6371a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f6378h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f6377g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f6378h = true;
        }
        Field field = f6377g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f6372b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f6371a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f6372b = true;
        }
        Field field2 = f6371a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(Object obj) {
        if (!f6374d) {
            try {
                f6373c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f6374d = true;
        }
        Class<?> cls = f6373c;
        if (cls == null) {
            return;
        }
        if (!f6376f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f6375e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f6376f = true;
        }
        Field field = f6375e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
