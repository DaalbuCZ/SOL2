package q0;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k0.j;
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12518f = j.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final u0.a f12519a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f12520b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f12521c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<o0.a<T>> f12522d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f12523e;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ List f12524n;

        a(List list) {
            this.f12524n = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (o0.a aVar : this.f12524n) {
                aVar.a(d.this.f12523e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, u0.a aVar) {
        this.f12520b = context.getApplicationContext();
        this.f12519a = aVar;
    }

    public void a(o0.a<T> aVar) {
        synchronized (this.f12521c) {
            if (this.f12522d.add(aVar)) {
                if (this.f12522d.size() == 1) {
                    this.f12523e = b();
                    j.c().a(f12518f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f12523e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f12523e);
            }
        }
    }

    public abstract T b();

    public void c(o0.a<T> aVar) {
        synchronized (this.f12521c) {
            if (this.f12522d.remove(aVar) && this.f12522d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t10) {
        synchronized (this.f12521c) {
            T t11 = this.f12523e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f12523e = t10;
                this.f12519a.a().execute(new a(new ArrayList(this.f12522d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
