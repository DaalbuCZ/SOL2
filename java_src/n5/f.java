package n5;

import android.util.Log;
/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    static final f f11759c = new f("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    private final String f11760a;

    /* renamed from: b  reason: collision with root package name */
    private int f11761b = 4;

    public f(String str) {
        this.f11760a = str;
    }

    private boolean a(int i10) {
        return this.f11761b <= i10 || Log.isLoggable(this.f11760a, i10);
    }

    public static f f() {
        return f11759c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f11760a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f11760a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f11760a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f11760a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f11760a, str, th);
        }
    }
}
