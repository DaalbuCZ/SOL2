package e5;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public interface a<V> extends Future<V> {
    void e(Runnable runnable, Executor executor);
}
