package o0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import k0.j;
import p0.c;
import p0.e;
import p0.f;
import p0.g;
import p0.h;
import s0.p;
/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f11817d = j.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    private final c f11818a;

    /* renamed from: b  reason: collision with root package name */
    private final p0.c<?>[] f11819b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f11820c;

    public d(Context context, u0.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11818a = cVar;
        this.f11819b = new p0.c[]{new p0.a(applicationContext, aVar), new p0.b(applicationContext, aVar), new h(applicationContext, aVar), new p0.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f11820c = new Object();
    }

    @Override // p0.c.a
    public void a(List<String> list) {
        synchronized (this.f11820c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    j.c().a(f11817d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f11818a;
            if (cVar != null) {
                cVar.e(arrayList);
            }
        }
    }

    @Override // p0.c.a
    public void b(List<String> list) {
        synchronized (this.f11820c) {
            c cVar = this.f11818a;
            if (cVar != null) {
                cVar.d(list);
            }
        }
    }

    public boolean c(String str) {
        p0.c<?>[] cVarArr;
        synchronized (this.f11820c) {
            for (p0.c<?> cVar : this.f11819b) {
                if (cVar.d(str)) {
                    j.c().a(f11817d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f11820c) {
            for (p0.c<?> cVar : this.f11819b) {
                cVar.g(null);
            }
            for (p0.c<?> cVar2 : this.f11819b) {
                cVar2.e(iterable);
            }
            for (p0.c<?> cVar3 : this.f11819b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f11820c) {
            for (p0.c<?> cVar : this.f11819b) {
                cVar.f();
            }
        }
    }
}
