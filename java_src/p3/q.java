package p3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p3.l;
/* loaded from: classes.dex */
public final class q<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d f12325a;

    /* renamed from: b  reason: collision with root package name */
    private final n f12326b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f12327c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f12328d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<Runnable> f12329e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<Runnable> f12330f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12331g;

    /* loaded from: classes.dex */
    public interface a<T> {
        void c(T t10);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(T t10, l lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f12332a;

        /* renamed from: b  reason: collision with root package name */
        private l.b f12333b = new l.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f12334c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f12335d;

        public c(T t10) {
            this.f12332a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f12335d) {
                return;
            }
            if (i10 != -1) {
                this.f12333b.a(i10);
            }
            this.f12334c = true;
            aVar.c(this.f12332a);
        }

        public void b(b<T> bVar) {
            if (this.f12335d || !this.f12334c) {
                return;
            }
            l e10 = this.f12333b.e();
            this.f12333b = new l.b();
            this.f12334c = false;
            bVar.a(this.f12332a, e10);
        }

        public void c(b<T> bVar) {
            this.f12335d = true;
            if (this.f12334c) {
                bVar.a(this.f12332a, this.f12333b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f12332a.equals(((c) obj).f12332a);
        }

        public int hashCode() {
            return this.f12332a.hashCode();
        }
    }

    public q(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f12325a = dVar;
        this.f12328d = copyOnWriteArraySet;
        this.f12327c = bVar;
        this.f12329e = new ArrayDeque<>();
        this.f12330f = new ArrayDeque<>();
        this.f12326b = dVar.c(looper, new Handler.Callback() { // from class: p3.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g10;
                g10 = q.this.g(message);
                return g10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f12328d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f12327c);
            if (this.f12326b.b(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        if (this.f12331g) {
            return;
        }
        p3.a.e(t10);
        this.f12328d.add(new c<>(t10));
    }

    public q<T> d(Looper looper, d dVar, b<T> bVar) {
        return new q<>(this.f12328d, looper, dVar, bVar);
    }

    public q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f12325a, bVar);
    }

    public void f() {
        if (this.f12330f.isEmpty()) {
            return;
        }
        if (!this.f12326b.b(0)) {
            n nVar = this.f12326b;
            nVar.a(nVar.k(0));
        }
        boolean z10 = !this.f12329e.isEmpty();
        this.f12329e.addAll(this.f12330f);
        this.f12330f.clear();
        if (z10) {
            return;
        }
        while (!this.f12329e.isEmpty()) {
            this.f12329e.peekFirst().run();
            this.f12329e.removeFirst();
        }
    }

    public void i(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f12328d);
        this.f12330f.add(new Runnable() { // from class: p3.p
            @Override // java.lang.Runnable
            public final void run() {
                q.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        Iterator<c<T>> it = this.f12328d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f12327c);
        }
        this.f12328d.clear();
        this.f12331g = true;
    }

    public void k(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }
}
