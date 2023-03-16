package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class e7 implements l6 {

    /* renamed from: b  reason: collision with root package name */
    private static final Map f3820b = new m.a();

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f3821a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e7 b(Context context, String str, Runnable runnable) {
        e7 e7Var;
        if (c6.b()) {
            throw null;
        }
        synchronized (e7.class) {
            e7Var = (e7) f3820b.get(null);
            if (e7Var == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return e7Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        synchronized (e7.class) {
            Map map = f3820b;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((e7) it.next()).f3821a;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final Object a(String str) {
        throw null;
    }
}
