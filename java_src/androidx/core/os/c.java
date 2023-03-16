package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: n  reason: collision with root package name */
        private final Handler f1451n;

        a(Handler handler) {
            this.f1451n = (Handler) androidx.core.util.e.b(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f1451n.post((Runnable) androidx.core.util.e.b(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f1451n + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
