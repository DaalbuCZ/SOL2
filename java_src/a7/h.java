package a7;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: n  reason: collision with root package name */
    private final Handler f241n = new Handler(Looper.getMainLooper());

    /* renamed from: o  reason: collision with root package name */
    private final AtomicReference<View> f242o;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f243p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f244q;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f242o = new AtomicReference<>(view);
        this.f243p = runnable;
        this.f244q = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f242o.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f241n.post(this.f243p);
        this.f241n.postAtFrontOfQueue(this.f244q);
        return true;
    }
}
