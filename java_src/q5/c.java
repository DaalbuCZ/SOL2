package q5;

import android.os.Process;
/* loaded from: classes.dex */
public abstract class c implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
