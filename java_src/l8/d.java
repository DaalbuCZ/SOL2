package l8;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l8.c;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final l8.c f11198a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11199b;

    /* renamed from: c  reason: collision with root package name */
    private final l f11200c;

    /* renamed from: d  reason: collision with root package name */
    private final c.InterfaceC0159c f11201d;

    /* loaded from: classes.dex */
    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0160d f11202a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<b> f11203b = new AtomicReference<>(null);

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            final AtomicBoolean f11205a;

            private a() {
                this.f11205a = new AtomicBoolean(false);
            }

            @Override // l8.d.b
            public void a(Object obj) {
                if (this.f11205a.get() || c.this.f11203b.get() != this) {
                    return;
                }
                d.this.f11198a.d(d.this.f11199b, d.this.f11200c.b(obj));
            }

            @Override // l8.d.b
            public void b(String str, String str2, Object obj) {
                if (this.f11205a.get() || c.this.f11203b.get() != this) {
                    return;
                }
                d.this.f11198a.d(d.this.f11199b, d.this.f11200c.d(str, str2, obj));
            }

            @Override // l8.d.b
            public void c() {
                if (this.f11205a.getAndSet(true) || c.this.f11203b.get() != this) {
                    return;
                }
                d.this.f11198a.d(d.this.f11199b, null);
            }
        }

        c(InterfaceC0160d interfaceC0160d) {
            this.f11202a = interfaceC0160d;
        }

        private void c(Object obj, c.b bVar) {
            ByteBuffer d10;
            if (this.f11203b.getAndSet(null) != null) {
                try {
                    this.f11202a.b(obj);
                    bVar.a(d.this.f11200c.b(null));
                    return;
                } catch (RuntimeException e10) {
                    x7.b.c("EventChannel#" + d.this.f11199b, "Failed to close event stream", e10);
                    d10 = d.this.f11200c.d("error", e10.getMessage(), null);
                }
            } else {
                d10 = d.this.f11200c.d("error", "No active stream to cancel", null);
            }
            bVar.a(d10);
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f11203b.getAndSet(aVar) != null) {
                try {
                    this.f11202a.b(null);
                } catch (RuntimeException e10) {
                    x7.b.c("EventChannel#" + d.this.f11199b, "Failed to close existing event stream", e10);
                }
            }
            try {
                this.f11202a.a(obj, aVar);
                bVar.a(d.this.f11200c.b(null));
            } catch (RuntimeException e11) {
                this.f11203b.set(null);
                x7.b.c("EventChannel#" + d.this.f11199b, "Failed to open event stream", e11);
                bVar.a(d.this.f11200c.d("error", e11.getMessage(), null));
            }
        }

        @Override // l8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j e10 = d.this.f11200c.e(byteBuffer);
            if (e10.f11211a.equals("listen")) {
                d(e10.f11212b, bVar);
            } else if (e10.f11211a.equals("cancel")) {
                c(e10.f11212b, bVar);
            } else {
                bVar.a(null);
            }
        }
    }

    /* renamed from: l8.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0160d {
        void a(Object obj, b bVar);

        void b(Object obj);
    }

    public d(l8.c cVar, String str) {
        this(cVar, str, s.f11226b);
    }

    public d(l8.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public d(l8.c cVar, String str, l lVar, c.InterfaceC0159c interfaceC0159c) {
        this.f11198a = cVar;
        this.f11199b = str;
        this.f11200c = lVar;
        this.f11201d = interfaceC0159c;
    }

    public void d(InterfaceC0160d interfaceC0160d) {
        if (this.f11201d != null) {
            this.f11198a.c(this.f11199b, interfaceC0160d != null ? new c(interfaceC0160d) : null, this.f11201d);
        } else {
            this.f11198a.f(this.f11199b, interfaceC0160d != null ? new c(interfaceC0160d) : null);
        }
    }
}
