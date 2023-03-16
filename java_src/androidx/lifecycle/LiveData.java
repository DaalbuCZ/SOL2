package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    static final Object f2066j = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f2067a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private k.b<p<? super T>, LiveData<T>.b> f2068b = new k.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f2069c = 0;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f2070d;

    /* renamed from: e  reason: collision with root package name */
    volatile Object f2071e;

    /* renamed from: f  reason: collision with root package name */
    private int f2072f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2073g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2074h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f2075i;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.b implements g {

        /* renamed from: r  reason: collision with root package name */
        final i f2076r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ LiveData f2077s;

        @Override // androidx.lifecycle.g
        public void d(i iVar, e.b bVar) {
            if (this.f2076r.a().b() == e.c.DESTROYED) {
                this.f2077s.g(this.f2079n);
            } else {
                h(j());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void i() {
            this.f2076r.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean j() {
            return this.f2076r.a().b().e(e.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2067a) {
                obj = LiveData.this.f2071e;
                LiveData.this.f2071e = LiveData.f2066j;
            }
            LiveData.this.h(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b {

        /* renamed from: n  reason: collision with root package name */
        final p<? super T> f2079n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2080o;

        /* renamed from: p  reason: collision with root package name */
        int f2081p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ LiveData f2082q;

        void h(boolean z10) {
            if (z10 == this.f2080o) {
                return;
            }
            this.f2080o = z10;
            LiveData liveData = this.f2082q;
            int i10 = liveData.f2069c;
            boolean z11 = i10 == 0;
            liveData.f2069c = i10 + (z10 ? 1 : -1);
            if (z11 && z10) {
                liveData.d();
            }
            LiveData liveData2 = this.f2082q;
            if (liveData2.f2069c == 0 && !this.f2080o) {
                liveData2.e();
            }
            if (this.f2080o) {
                this.f2082q.c(this);
            }
        }

        void i() {
        }

        abstract boolean j();
    }

    public LiveData() {
        Object obj = f2066j;
        this.f2071e = obj;
        this.f2075i = new a();
        this.f2070d = obj;
        this.f2072f = -1;
    }

    static void a(String str) {
        if (j.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f2080o) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int i10 = bVar.f2081p;
            int i11 = this.f2072f;
            if (i10 >= i11) {
                return;
            }
            bVar.f2081p = i11;
            bVar.f2079n.a((Object) this.f2070d);
        }
    }

    void c(LiveData<T>.b bVar) {
        if (this.f2073g) {
            this.f2074h = true;
            return;
        }
        this.f2073g = true;
        do {
            this.f2074h = false;
            if (bVar == null) {
                k.b<p<? super T>, LiveData<T>.b>.d h10 = this.f2068b.h();
                while (h10.hasNext()) {
                    b((b) h10.next().getValue());
                    if (this.f2074h) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.f2074h);
        this.f2073g = false;
    }

    protected void d() {
    }

    protected void e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(T t10) {
        boolean z10;
        synchronized (this.f2067a) {
            z10 = this.f2071e == f2066j;
            this.f2071e = t10;
        }
        if (z10) {
            j.a.e().c(this.f2075i);
        }
    }

    public void g(p<? super T> pVar) {
        a("removeObserver");
        LiveData<T>.b v10 = this.f2068b.v(pVar);
        if (v10 == null) {
            return;
        }
        v10.i();
        v10.h(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(T t10) {
        a("setValue");
        this.f2072f++;
        this.f2070d = t10;
        c(null);
    }
}
