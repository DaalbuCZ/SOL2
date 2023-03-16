package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g6 implements l6 {

    /* renamed from: h  reason: collision with root package name */
    private static final Map f3856h = new m.a();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f3857i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f3858a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f3859b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f3860c;

    /* renamed from: d  reason: collision with root package name */
    private final ContentObserver f3861d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f3862e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Map f3863f;

    /* renamed from: g  reason: collision with root package name */
    private final List f3864g;

    private g6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        f6 f6Var = new f6(this, null);
        this.f3861d = f6Var;
        this.f3862e = new Object();
        this.f3864g = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f3858a = contentResolver;
        this.f3859b = uri;
        this.f3860c = runnable;
        contentResolver.registerContentObserver(uri, false, f6Var);
    }

    public static g6 b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        g6 g6Var;
        synchronized (g6.class) {
            Map map = f3856h;
            g6Var = (g6) map.get(uri);
            if (g6Var == null) {
                try {
                    g6 g6Var2 = new g6(contentResolver, uri, runnable);
                    try {
                        map.put(uri, g6Var2);
                    } catch (SecurityException unused) {
                    }
                    g6Var = g6Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return g6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        synchronized (g6.class) {
            for (g6 g6Var : f3856h.values()) {
                g6Var.f3858a.unregisterContentObserver(g6Var.f3861d);
            }
            f3856h.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) c().get(str);
    }

    public final Map c() {
        Map map;
        Map map2 = this.f3863f;
        if (map2 == null) {
            synchronized (this.f3862e) {
                map2 = this.f3863f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) j6.a(new k6() { // from class: com.google.android.gms.internal.measurement.e6
                            @Override // com.google.android.gms.internal.measurement.k6
                            public final Object a() {
                                return g6.this.d();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f3863f = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map d() {
        Cursor query = this.f3858a.query(this.f3859b, f3857i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new m.a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            return aVar;
        } finally {
            query.close();
        }
    }

    public final void f() {
        synchronized (this.f3862e) {
            this.f3863f = null;
            this.f3860c.run();
        }
        synchronized (this) {
            for (h6 h6Var : this.f3864g) {
                h6Var.a();
            }
        }
    }
}
