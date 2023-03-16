package u6;

import java.util.Locale;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f15465c;

    /* renamed from: a  reason: collision with root package name */
    private final c f15466a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15467b;

    private a() {
        this(null);
    }

    public a(c cVar) {
        this.f15467b = false;
        this.f15466a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f15465c == null) {
            synchronized (a.class) {
                if (f15465c == null) {
                    f15465c = new a();
                }
            }
        }
        return f15465c;
    }

    public void a(String str) {
        if (this.f15467b) {
            this.f15466a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f15467b) {
            this.f15466a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f15467b) {
            this.f15466a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f15467b) {
            this.f15466a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f15467b) {
            this.f15466a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f15467b) {
            this.f15466a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f15467b;
    }

    public void i(boolean z10) {
        this.f15467b = z10;
    }

    public void j(String str) {
        if (this.f15467b) {
            this.f15466a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f15467b) {
            this.f15466a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
