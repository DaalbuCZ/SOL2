package j$.util.stream;
/* loaded from: classes2.dex */
class K3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f9846a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f9847b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K3(Runnable runnable, Runnable runnable2) {
        this.f9846a = runnable;
        this.f9847b = runnable2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f9846a.run();
            this.f9847b.run();
        } catch (Throwable th) {
            try {
                this.f9847b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
