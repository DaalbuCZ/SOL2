package q0;

import android.content.Context;
/* loaded from: classes.dex */
public class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f12533e;

    /* renamed from: a  reason: collision with root package name */
    private a f12534a;

    /* renamed from: b  reason: collision with root package name */
    private b f12535b;

    /* renamed from: c  reason: collision with root package name */
    private e f12536c;

    /* renamed from: d  reason: collision with root package name */
    private f f12537d;

    private g(Context context, u0.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f12534a = new a(applicationContext, aVar);
        this.f12535b = new b(applicationContext, aVar);
        this.f12536c = new e(applicationContext, aVar);
        this.f12537d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, u0.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f12533e == null) {
                f12533e = new g(context, aVar);
            }
            gVar = f12533e;
        }
        return gVar;
    }

    public a a() {
        return this.f12534a;
    }

    public b b() {
        return this.f12535b;
    }

    public e d() {
        return this.f12536c;
    }

    public f e() {
        return this.f12537d;
    }
}
