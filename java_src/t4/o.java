package t4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class o<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f14746a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(n nVar) {
    }

    @Override // t4.c
    public final void a() {
        this.f14746a.countDown();
    }

    @Override // t4.f
    public final void b(T t10) {
        this.f14746a.countDown();
    }

    @Override // t4.e
    public final void c(Exception exc) {
        this.f14746a.countDown();
    }

    public final void d() {
        this.f14746a.await();
    }

    public final boolean e(long j10, TimeUnit timeUnit) {
        return this.f14746a.await(j10, timeUnit);
    }
}
