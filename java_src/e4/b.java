package e4;

import android.os.Process;
/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final Runnable f6769n;

    public b(Runnable runnable, int i10) {
        this.f6769n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f6769n.run();
    }
}
