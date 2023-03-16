package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private final j f2129a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2130b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f2131c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final j f2132n;

        /* renamed from: o  reason: collision with root package name */
        final e.b f2133o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f2134p = false;

        a(j jVar, e.b bVar) {
            this.f2132n = jVar;
            this.f2133o = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2134p) {
                return;
            }
            this.f2132n.h(this.f2133o);
            this.f2134p = true;
        }
    }

    public t(i iVar) {
        this.f2129a = new j(iVar);
    }

    private void f(e.b bVar) {
        a aVar = this.f2131c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f2129a, bVar);
        this.f2131c = aVar2;
        this.f2130b.postAtFrontOfQueue(aVar2);
    }

    public e a() {
        return this.f2129a;
    }

    public void b() {
        f(e.b.ON_START);
    }

    public void c() {
        f(e.b.ON_CREATE);
    }

    public void d() {
        f(e.b.ON_STOP);
        f(e.b.ON_DESTROY);
    }

    public void e() {
        f(e.b.ON_START);
    }
}
