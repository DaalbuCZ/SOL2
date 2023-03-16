package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class x {

    /* renamed from: c  reason: collision with root package name */
    private static final u6.a f5713c = u6.a.e();

    /* renamed from: d  reason: collision with root package name */
    private static x f5714d;

    /* renamed from: a  reason: collision with root package name */
    private volatile SharedPreferences f5715a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f5716b;

    public x(ExecutorService executorService) {
        this.f5716b = executorService;
    }

    private Context d() {
        try {
            f5.e.n();
            return f5.e.n().l();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized x f() {
        x xVar;
        synchronized (x.class) {
            if (f5714d == null) {
                f5714d = new x(Executors.newSingleThreadExecutor());
            }
            xVar = f5714d;
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Context context) {
        if (this.f5715a != null || context == null) {
            return;
        }
        this.f5715a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public void b(String str) {
        if (str == null) {
            f5713c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f5715a.edit().remove(str).apply();
        }
    }

    public a7.g<Boolean> c(String str) {
        if (str == null) {
            f5713c.a("Key is null when getting boolean value on device cache.");
        } else {
            if (this.f5715a == null) {
                j(d());
                if (this.f5715a == null) {
                    return a7.g.a();
                }
            }
            if (!this.f5715a.contains(str)) {
                return a7.g.a();
            }
            try {
                return a7.g.e(Boolean.valueOf(this.f5715a.getBoolean(str, false)));
            } catch (ClassCastException e10) {
                f5713c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            }
        }
        return a7.g.a();
    }

    public a7.g<Float> e(String str) {
        if (str == null) {
            f5713c.a("Key is null when getting float value on device cache.");
        } else {
            if (this.f5715a == null) {
                j(d());
                if (this.f5715a == null) {
                    return a7.g.a();
                }
            }
            if (!this.f5715a.contains(str)) {
                return a7.g.a();
            }
            try {
                return a7.g.e(Float.valueOf(this.f5715a.getFloat(str, 0.0f)));
            } catch (ClassCastException e10) {
                f5713c.b("Key %s from sharedPreferences has type other than float: %s", str, e10.getMessage());
            }
        }
        return a7.g.a();
    }

    public a7.g<Long> g(String str) {
        if (str == null) {
            f5713c.a("Key is null when getting long value on device cache.");
        } else {
            if (this.f5715a == null) {
                j(d());
                if (this.f5715a == null) {
                    return a7.g.a();
                }
            }
            if (!this.f5715a.contains(str)) {
                return a7.g.a();
            }
            try {
                return a7.g.e(Long.valueOf(this.f5715a.getLong(str, 0L)));
            } catch (ClassCastException e10) {
                f5713c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            }
        }
        return a7.g.a();
    }

    public a7.g<String> h(String str) {
        if (str == null) {
            f5713c.a("Key is null when getting String value on device cache.");
        } else {
            if (this.f5715a == null) {
                j(d());
                if (this.f5715a == null) {
                    return a7.g.a();
                }
            }
            if (!this.f5715a.contains(str)) {
                return a7.g.a();
            }
            try {
                return a7.g.e(this.f5715a.getString(str, ""));
            } catch (ClassCastException e10) {
                f5713c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            }
        }
        return a7.g.a();
    }

    public synchronized void j(final Context context) {
        if (this.f5715a == null && context != null) {
            this.f5716b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.i(context);
                }
            });
        }
    }

    public boolean k(String str, float f10) {
        if (str == null) {
            f5713c.a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f5715a == null) {
            j(d());
            if (this.f5715a == null) {
                return false;
            }
        }
        this.f5715a.edit().putFloat(str, f10).apply();
        return true;
    }

    public boolean l(String str, long j10) {
        if (str == null) {
            f5713c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f5715a == null) {
            j(d());
            if (this.f5715a == null) {
                return false;
            }
        }
        this.f5715a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean m(String str, String str2) {
        if (str == null) {
            f5713c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f5715a == null) {
            j(d());
            if (this.f5715a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f5715a.edit().remove(str).apply();
            return true;
        }
        this.f5715a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean n(String str, boolean z10) {
        if (str == null) {
            f5713c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f5715a == null) {
            j(d());
            if (this.f5715a == null) {
                return false;
            }
        }
        this.f5715a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
