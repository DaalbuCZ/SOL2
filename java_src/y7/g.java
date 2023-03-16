package y7;

import android.os.Handler;
import android.os.Looper;
import y7.c;
/* loaded from: classes.dex */
public class g implements c.d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f17083a = w8.a.a(Looper.getMainLooper());

    @Override // y7.c.d
    public void a(Runnable runnable) {
        this.f17083a.post(runnable);
    }
}
