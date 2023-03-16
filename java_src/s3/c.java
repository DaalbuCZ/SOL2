package s3;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class c extends Thread {

    /* renamed from: n  reason: collision with root package name */
    private final WeakReference<a> f13986n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13987o;

    /* renamed from: p  reason: collision with root package name */
    final CountDownLatch f13988p = new CountDownLatch(1);

    /* renamed from: q  reason: collision with root package name */
    boolean f13989q = false;

    public c(a aVar, long j10) {
        this.f13986n = new WeakReference<>(aVar);
        this.f13987o = j10;
        start();
    }

    private final void a() {
        a aVar = this.f13986n.get();
        if (aVar != null) {
            aVar.c();
            this.f13989q = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f13988p.await(this.f13987o, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
