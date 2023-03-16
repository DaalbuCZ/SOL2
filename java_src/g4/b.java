package g4;

import android.os.IBinder;
import g4.a;
import java.lang.reflect.Field;
import z3.o;
/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0114a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7540a;

    private b(Object obj) {
        this.f7540a = obj;
    }

    public static <T> T f(a aVar) {
        if (aVar instanceof b) {
            return (T) ((b) aVar).f7540a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        o.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    public static <T> a m0(T t10) {
        return new b(t10);
    }
}
