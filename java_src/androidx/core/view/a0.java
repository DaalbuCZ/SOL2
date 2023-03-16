package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f1560a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f1561b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f1562c = null;

    /* renamed from: d  reason: collision with root package name */
    int f1563d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f1564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1565b;

        a(b0 b0Var, View view) {
            this.f1564a = b0Var;
            this.f1565b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1564a.a(this.f1565b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1564a.b(this.f1565b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1564a.c(this.f1565b);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* loaded from: classes.dex */
    static class c implements b0 {

        /* renamed from: a  reason: collision with root package name */
        a0 f1567a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1568b;

        c(a0 a0Var) {
            this.f1567a = a0Var;
        }

        @Override // androidx.core.view.b0
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            b0 b0Var = tag instanceof b0 ? (b0) tag : null;
            if (b0Var != null) {
                b0Var.a(view);
            }
        }

        @Override // androidx.core.view.b0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i10 = this.f1567a.f1563d;
            if (i10 > -1) {
                view.setLayerType(i10, null);
                this.f1567a.f1563d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f1568b) {
                a0 a0Var = this.f1567a;
                Runnable runnable = a0Var.f1562c;
                if (runnable != null) {
                    a0Var.f1562c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                b0 b0Var = tag instanceof b0 ? (b0) tag : null;
                if (b0Var != null) {
                    b0Var.b(view);
                }
                this.f1568b = true;
            }
        }

        @Override // androidx.core.view.b0
        public void c(View view) {
            this.f1568b = false;
            if (this.f1567a.f1563d > -1) {
                view.setLayerType(2, null);
            }
            a0 a0Var = this.f1567a;
            Runnable runnable = a0Var.f1561b;
            if (runnable != null) {
                a0Var.f1561b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            b0 b0Var = tag instanceof b0 ? (b0) tag : null;
            if (b0Var != null) {
                b0Var.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(View view) {
        this.f1560a = new WeakReference<>(view);
    }

    private void i(View view, b0 b0Var) {
        if (b0Var != null) {
            view.animate().setListener(new a(b0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public a0 b(float f10) {
        View view = this.f1560a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f1560a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f1560a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public a0 f(long j10) {
        View view = this.f1560a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public a0 g(Interpolator interpolator) {
        View view = this.f1560a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public a0 h(b0 b0Var) {
        View view = this.f1560a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, b0Var);
                b0Var = new c(this);
            }
            i(view, b0Var);
        }
        return this;
    }

    public a0 j(long j10) {
        View view = this.f1560a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public a0 k(final d0 d0Var) {
        final View view = this.f1560a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b.a(view.animate(), d0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d0.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f1560a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public a0 m(float f10) {
        View view = this.f1560a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
