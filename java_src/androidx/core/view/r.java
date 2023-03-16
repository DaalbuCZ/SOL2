package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: n  reason: collision with root package name */
    private final View f1661n;

    /* renamed from: o  reason: collision with root package name */
    private ViewTreeObserver f1662o;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f1663p;

    private r(View view, Runnable runnable) {
        this.f1661n = view;
        this.f1662o = view.getViewTreeObserver();
        this.f1663p = runnable;
    }

    public static r a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        r rVar = new r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }

    public void b() {
        (this.f1662o.isAlive() ? this.f1662o : this.f1661n.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1661n.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1663p.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1662o = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
