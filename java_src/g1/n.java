package g1;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class n implements Executor {

    /* renamed from: n  reason: collision with root package name */
    private final Executor f7437n;

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final Runnable f7438n;

        a(Runnable runnable) {
            this.f7438n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7438n.run();
            } catch (Exception e10) {
                k1.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.f7437n = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7437n.execute(new a(runnable));
    }
}
