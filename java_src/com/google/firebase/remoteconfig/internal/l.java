package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
/* loaded from: classes.dex */
public class l {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f5879e = Charset.forName("UTF-8");

    /* renamed from: f  reason: collision with root package name */
    static final Pattern f5880f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g  reason: collision with root package name */
    static final Pattern f5881g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    private final Set<d4.d<String, e>> f5882a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5883b;

    /* renamed from: c  reason: collision with root package name */
    private final d f5884c;

    /* renamed from: d  reason: collision with root package name */
    private final d f5885d;

    public l(Executor executor, d dVar, d dVar2) {
        this.f5883b = executor;
        this.f5884c = dVar;
        this.f5885d = dVar2;
    }

    private void c(final String str, final e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f5882a) {
            for (final d4.d<String, e> dVar : this.f5882a) {
                this.f5883b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        d4.d.this.a(str, eVar);
                    }
                });
            }
        }
    }

    private static e e(d dVar) {
        return dVar.f();
    }

    private static Set<String> f(d dVar) {
        HashSet hashSet = new HashSet();
        e e10 = e(dVar);
        if (e10 == null) {
            return hashSet;
        }
        Iterator<String> keys = e10.d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String g(d dVar, String str) {
        e e10 = e(dVar);
        if (e10 == null) {
            return null;
        }
        try {
            return e10.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(d4.d<String, e> dVar) {
        synchronized (this.f5882a) {
            this.f5882a.add(dVar);
        }
    }

    public Map<String, d7.k> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f5884c));
        hashSet.addAll(f(this.f5885d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public d7.k h(String str) {
        String g10 = g(this.f5884c, str);
        if (g10 != null) {
            c(str, e(this.f5884c));
            return new p(g10, 2);
        }
        String g11 = g(this.f5885d, str);
        if (g11 != null) {
            return new p(g11, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new p("", 0);
    }
}
