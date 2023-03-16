package y0;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class c2 implements y1 {

    /* renamed from: a  reason: collision with root package name */
    private Handler f16472a = new Handler(Looper.getMainLooper());

    @Override // y0.y1
    public void a(Runnable runnable) {
        this.f16472a.post(runnable);
    }
}
