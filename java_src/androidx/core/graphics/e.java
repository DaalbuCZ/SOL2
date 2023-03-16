package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class e extends j {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f1432b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f1433c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f1434d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f1435e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f1436f = false;

    private static boolean l(Object obj, String str, int i10, boolean z10) {
        o();
        try {
            return ((Boolean) f1434d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface m(Object obj) {
        o();
        try {
            Object newInstance = Array.newInstance(f1432b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1435e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File n(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void o() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1436f) {
            return;
        }
        f1436f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f1433c = constructor;
        f1432b = cls;
        f1434d = method2;
        f1435e = method;
    }

    private static Object p() {
        o();
        try {
            return f1433c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.j
    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] a10;
        Object p10 = p();
        for (e.d dVar : cVar.a()) {
            File e10 = k.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!k.c(e10, resources, dVar.b())) {
                    return null;
                }
                if (!l(p10, e10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return m(p10);
    }

    @Override // androidx.core.graphics.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
        g.b i11 = i(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(i11.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File n10 = n(openFileDescriptor);
            if (n10 != null && n10.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(n10);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d10 = super.d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d10;
        } catch (IOException unused) {
            return null;
        }
    }
}
