package l0;

import android.os.Handler;
import android.os.Looper;
import k0.q;
/* loaded from: classes.dex */
public class a implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f11034a = androidx.core.os.d.a(Looper.getMainLooper());

    @Override // k0.q
    public void a(long j10, Runnable runnable) {
        this.f11034a.postDelayed(runnable, j10);
    }

    @Override // k0.q
    public void b(Runnable runnable) {
        this.f11034a.removeCallbacks(runnable);
    }
}
