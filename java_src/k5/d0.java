package k5;

import i6.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0<T> implements i6.b<T>, i6.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final a.InterfaceC0126a<Object> f10628c = b0.f10612a;

    /* renamed from: d  reason: collision with root package name */
    private static final i6.b<Object> f10629d = c0.f10627a;

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0126a<T> f10630a;

    /* renamed from: b  reason: collision with root package name */
    private volatile i6.b<T> f10631b;

    private d0(a.InterfaceC0126a<T> interfaceC0126a, i6.b<T> bVar) {
        this.f10630a = interfaceC0126a;
        this.f10631b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> d0<T> e() {
        return new d0<>(f10628c, f10629d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(i6.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0126a interfaceC0126a, a.InterfaceC0126a interfaceC0126a2, i6.b bVar) {
        interfaceC0126a.a(bVar);
        interfaceC0126a2.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> d0<T> i(i6.b<T> bVar) {
        return new d0<>(null, bVar);
    }

    @Override // i6.a
    public void a(final a.InterfaceC0126a<T> interfaceC0126a) {
        i6.b<T> bVar;
        i6.b<T> bVar2 = this.f10631b;
        i6.b<Object> bVar3 = f10629d;
        if (bVar2 != bVar3) {
            interfaceC0126a.a(bVar2);
            return;
        }
        i6.b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f10631b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                final a.InterfaceC0126a<T> interfaceC0126a2 = this.f10630a;
                this.f10630a = new a.InterfaceC0126a() { // from class: k5.a0
                    @Override // i6.a.InterfaceC0126a
                    public final void a(i6.b bVar5) {
                        d0.h(a.InterfaceC0126a.this, interfaceC0126a, bVar5);
                    }
                };
            }
        }
        if (bVar4 != null) {
            interfaceC0126a.a(bVar);
        }
    }

    @Override // i6.b
    public T get() {
        return this.f10631b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(i6.b<T> bVar) {
        a.InterfaceC0126a<T> interfaceC0126a;
        if (this.f10631b != f10629d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0126a = this.f10630a;
            this.f10630a = null;
            this.f10631b = bVar;
        }
        interfaceC0126a.a(bVar);
    }
}
