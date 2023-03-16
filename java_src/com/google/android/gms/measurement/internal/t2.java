package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f5006h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f5007a;

    /* renamed from: b  reason: collision with root package name */
    private final r2 f5008b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5009c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5010d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f5011e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f5012f = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile Object f5013g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ t2(String str, Object obj, Object obj2, r2 r2Var, p4.d dVar) {
        this.f5007a = str;
        this.f5009c = obj;
        this.f5010d = obj2;
        this.f5008b = r2Var;
    }

    public final Object a(Object obj) {
        synchronized (this.f5011e) {
        }
        if (obj != null) {
            return obj;
        }
        if (s2.f4968a == null) {
            return this.f5009c;
        }
        synchronized (f5006h) {
            if (c.a()) {
                return this.f5013g == null ? this.f5009c : this.f5013g;
            }
            try {
                for (t2 t2Var : u2.b()) {
                    if (c.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object obj2 = null;
                    try {
                        r2 r2Var = t2Var.f5008b;
                        if (r2Var != null) {
                            obj2 = r2Var.a();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f5006h) {
                        t2Var.f5013g = obj2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            r2 r2Var2 = this.f5008b;
            if (r2Var2 == null) {
                return this.f5009c;
            }
            try {
                return r2Var2.a();
            } catch (IllegalStateException unused3) {
                return this.f5009c;
            } catch (SecurityException unused4) {
                return this.f5009c;
            }
        }
    }

    public final String b() {
        return this.f5007a;
    }
}
