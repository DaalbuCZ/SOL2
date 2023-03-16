package o3;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.f;
/* loaded from: classes.dex */
public interface f {

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: o3.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0175a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList<C0176a> f11948a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: o3.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0176a {

                /* renamed from: a  reason: collision with root package name */
                private final Handler f11949a;

                /* renamed from: b  reason: collision with root package name */
                private final a f11950b;

                /* renamed from: c  reason: collision with root package name */
                private boolean f11951c;

                public C0176a(Handler handler, a aVar) {
                    this.f11949a = handler;
                    this.f11950b = aVar;
                }

                public void d() {
                    this.f11951c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0176a c0176a, int i10, long j10, long j11) {
                c0176a.f11950b.c0(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                p3.a.e(handler);
                p3.a.e(aVar);
                e(aVar);
                this.f11948a.add(new C0176a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                Iterator<C0176a> it = this.f11948a.iterator();
                while (it.hasNext()) {
                    final C0176a next = it.next();
                    if (!next.f11951c) {
                        next.f11949a.post(new Runnable() { // from class: o3.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.a.C0175a.d(f.a.C0175a.C0176a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0176a> it = this.f11948a.iterator();
                while (it.hasNext()) {
                    C0176a next = it.next();
                    if (next.f11950b == aVar) {
                        next.d();
                        this.f11948a.remove(next);
                    }
                }
            }
        }

        void c0(int i10, long j10, long j11);
    }

    p0 a();

    void d(a aVar);

    long f();

    long g();

    void i(Handler handler, a aVar);
}
