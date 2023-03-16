package r5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import r5.i;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final d f13056a;

    /* renamed from: b  reason: collision with root package name */
    private final q5.i f13057b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13058c;

    /* renamed from: d  reason: collision with root package name */
    private final a f13059d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    private final a f13060e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicMarkableReference<String> f13061f = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicMarkableReference<b> f13062a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<Callable<Void>> f13063b = new AtomicReference<>(null);

        /* renamed from: c  reason: collision with root package name */
        private final boolean f13064c;

        public a(boolean z10) {
            this.f13064c = z10;
            this.f13062a = new AtomicMarkableReference<>(new b(64, z10 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() {
            this.f13063b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable<Void> callable = new Callable() { // from class: r5.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c10;
                    c10 = i.a.this.c();
                    return c10;
                }
            };
            if (this.f13063b.compareAndSet(null, callable)) {
                i.this.f13057b.h(callable);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f13062a.isMarked()) {
                    map = this.f13062a.getReference().a();
                    AtomicMarkableReference<b> atomicMarkableReference = this.f13062a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                i.this.f13056a.l(i.this.f13058c, map, this.f13064c);
            }
        }

        public Map<String, String> b() {
            return this.f13062a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (this.f13062a.getReference().d(str, str2)) {
                    AtomicMarkableReference<b> atomicMarkableReference = this.f13062a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                }
                return false;
            }
        }
    }

    public i(String str, v5.f fVar, q5.i iVar) {
        this.f13058c = str;
        this.f13056a = new d(fVar);
        this.f13057b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h() {
        k();
        return null;
    }

    public static i i(String str, v5.f fVar, q5.i iVar) {
        d dVar = new d(fVar);
        i iVar2 = new i(str, fVar, iVar);
        iVar2.f13059d.f13062a.getReference().e(dVar.g(str, false));
        iVar2.f13060e.f13062a.getReference().e(dVar.g(str, true));
        iVar2.f13061f.set(dVar.h(str), false);
        return iVar2;
    }

    public static String j(String str, v5.f fVar) {
        return new d(fVar).h(str);
    }

    private void k() {
        boolean z10;
        String str;
        synchronized (this.f13061f) {
            z10 = false;
            if (this.f13061f.isMarked()) {
                str = g();
                this.f13061f.set(str, false);
                z10 = true;
            } else {
                str = null;
            }
        }
        if (z10) {
            this.f13056a.m(this.f13058c, str);
        }
    }

    public Map<String, String> e() {
        return this.f13059d.b();
    }

    public Map<String, String> f() {
        return this.f13060e.b();
    }

    public String g() {
        return this.f13061f.getReference();
    }

    public boolean l(String str, String str2) {
        return this.f13059d.f(str, str2);
    }

    public boolean m(String str, String str2) {
        return this.f13060e.f(str, str2);
    }

    public void n(String str) {
        String c10 = b.c(str, 1024);
        synchronized (this.f13061f) {
            if (q5.h.B(c10, this.f13061f.getReference())) {
                return;
            }
            this.f13061f.set(c10, true);
            this.f13057b.h(new Callable() { // from class: r5.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object h10;
                    h10 = i.this.h();
                    return h10;
                }
            });
        }
    }
}
