package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class f3 extends d5 {

    /* renamed from: c  reason: collision with root package name */
    private char f4512c;

    /* renamed from: d  reason: collision with root package name */
    private long f4513d;

    /* renamed from: e  reason: collision with root package name */
    private String f4514e;

    /* renamed from: f  reason: collision with root package name */
    private final d3 f4515f;

    /* renamed from: g  reason: collision with root package name */
    private final d3 f4516g;

    /* renamed from: h  reason: collision with root package name */
    private final d3 f4517h;

    /* renamed from: i  reason: collision with root package name */
    private final d3 f4518i;

    /* renamed from: j  reason: collision with root package name */
    private final d3 f4519j;

    /* renamed from: k  reason: collision with root package name */
    private final d3 f4520k;

    /* renamed from: l  reason: collision with root package name */
    private final d3 f4521l;

    /* renamed from: m  reason: collision with root package name */
    private final d3 f4522m;

    /* renamed from: n  reason: collision with root package name */
    private final d3 f4523n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f3(j4 j4Var) {
        super(j4Var);
        this.f4512c = (char) 0;
        this.f4513d = -1L;
        this.f4515f = new d3(this, 6, false, false);
        this.f4516g = new d3(this, 6, true, false);
        this.f4517h = new d3(this, 6, false, true);
        this.f4518i = new d3(this, 5, false, false);
        this.f4519j = new d3(this, 5, true, false);
        this.f4520k = new d3(this, 5, false, true);
        this.f4521l = new d3(this, 4, false, false);
        this.f4522m = new d3(this, 3, false, false);
        this.f4523n = new d3(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String B = B(z10, obj);
        String B2 = B(z10, obj2);
        String B3 = B(z10, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(B2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(B2);
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    static String B(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (z10) {
                Long l10 = (Long) obj;
                if (Math.abs(l10.longValue()) < 100) {
                    return obj.toString();
                }
                String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
                String valueOf = String.valueOf(Math.abs(l10.longValue()));
                long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
                long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
                return str2 + round + "..." + str2 + round2;
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof e3)) {
                    return z10 ? "-" : obj.toString();
                }
                str = ((e3) obj).f4497a;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
            String G = G(j4.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(G)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb.toString();
        }
    }

    private static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new e3(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String C() {
        String str;
        synchronized (this) {
            if (this.f4514e == null) {
                this.f4514e = this.f4438a.Q() != null ? this.f4438a.Q() : this.f4438a.z().w();
            }
            z3.o.i(this.f4514e);
            str = this.f4514e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(C(), i10)) {
            Log.println(i10, C(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        z3.o.i(str);
        h4 G = this.f4438a.G();
        if (G == null) {
            Log.println(6, C(), "Scheduler not set. Not logging error/warn");
        } else if (!G.n()) {
            Log.println(6, C(), "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i10 >= 9) {
                i10 = 8;
            }
            G.z(new c3(this, i10, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    protected final boolean j() {
        return false;
    }

    public final d3 q() {
        return this.f4522m;
    }

    public final d3 r() {
        return this.f4515f;
    }

    public final d3 s() {
        return this.f4517h;
    }

    public final d3 t() {
        return this.f4516g;
    }

    public final d3 u() {
        return this.f4521l;
    }

    public final d3 v() {
        return this.f4523n;
    }

    public final d3 w() {
        return this.f4518i;
    }

    public final d3 x() {
        return this.f4520k;
    }

    public final d3 y() {
        return this.f4519j;
    }
}
