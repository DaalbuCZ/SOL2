package k7;

import f7.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f10689d;

    /* renamed from: b  reason: collision with root package name */
    private final Object f10690b = d();

    /* renamed from: c  reason: collision with root package name */
    private final Field f10691c = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f10689d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // k7.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f10690b != null && this.f10691c != null) {
            try {
                f10689d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f10690b, accessibleObject, Long.valueOf(((Long) f10689d.getMethod("objectFieldOffset", Field.class).invoke(this.f10690b, this.f10691c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
