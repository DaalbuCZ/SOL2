package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d0.b;
import d0.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f2299d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2300e = new Object();

    /* renamed from: c  reason: collision with root package name */
    final Context f2303c;

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends d0.a<?>>> f2302b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f2301a = new HashMap();

    a(Context context) {
        this.f2303c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2299d == null) {
            synchronized (f2300e) {
                if (f2299d == null) {
                    f2299d = new a(context);
                }
            }
        }
        return f2299d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        try {
            try {
                e0.a.c("Startup");
                Bundle bundle = this.f2303c.getPackageManager().getProviderInfo(new ComponentName(this.f2303c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f2303c.getString(b.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (d0.a.class.isAssignableFrom(cls)) {
                                this.f2302b.add(cls);
                                b(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                e0.a.f();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
            throw new c(e10);
        }
    }

    <T> T b(Class<? extends d0.a<?>> cls, Set<Class<?>> set) {
        T t10;
        synchronized (f2300e) {
            if (e0.a.h()) {
                e0.a.c(cls.getSimpleName());
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (this.f2301a.containsKey(cls)) {
                t10 = (T) this.f2301a.get(cls);
            } else {
                set.add(cls);
                try {
                    d0.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends d0.a<?>>> a10 = newInstance.a();
                    if (!a10.isEmpty()) {
                        for (Class<? extends d0.a<?>> cls2 : a10) {
                            if (!this.f2301a.containsKey(cls2)) {
                                b(cls2, set);
                            }
                        }
                    }
                    t10 = (T) newInstance.b(this.f2303c);
                    set.remove(cls);
                    this.f2301a.put(cls, t10);
                } catch (Throwable th) {
                    throw new c(th);
                }
            }
            e0.a.f();
        }
        return t10;
    }
}
