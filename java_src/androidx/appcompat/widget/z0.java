package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* loaded from: classes.dex */
class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: w  reason: collision with root package name */
    private static z0 f1106w;

    /* renamed from: x  reason: collision with root package name */
    private static z0 f1107x;

    /* renamed from: n  reason: collision with root package name */
    private final View f1108n;

    /* renamed from: o  reason: collision with root package name */
    private final CharSequence f1109o;

    /* renamed from: p  reason: collision with root package name */
    private final int f1110p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f1111q = new a();

    /* renamed from: r  reason: collision with root package name */
    private final Runnable f1112r = new b();

    /* renamed from: s  reason: collision with root package name */
    private int f1113s;

    /* renamed from: t  reason: collision with root package name */
    private int f1114t;

    /* renamed from: u  reason: collision with root package name */
    private a1 f1115u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1116v;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.g(false);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.c();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f1108n = view;
        this.f1109o = charSequence;
        this.f1110p = androidx.core.view.w.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1108n.removeCallbacks(this.f1111q);
    }

    private void b() {
        this.f1113s = Integer.MAX_VALUE;
        this.f1114t = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1108n.postDelayed(this.f1111q, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(z0 z0Var) {
        z0 z0Var2 = f1106w;
        if (z0Var2 != null) {
            z0Var2.a();
        }
        f1106w = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        z0 z0Var = f1106w;
        if (z0Var != null && z0Var.f1108n == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new z0(view, charSequence);
            return;
        }
        z0 z0Var2 = f1107x;
        if (z0Var2 != null && z0Var2.f1108n == view) {
            z0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1113s) > this.f1110p || Math.abs(y10 - this.f1114t) > this.f1110p) {
            this.f1113s = x10;
            this.f1114t = y10;
            return true;
        }
        return false;
    }

    void c() {
        if (f1107x == this) {
            f1107x = null;
            a1 a1Var = this.f1115u;
            if (a1Var != null) {
                a1Var.c();
                this.f1115u = null;
                b();
                this.f1108n.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1106w == this) {
            e(null);
        }
        this.f1108n.removeCallbacks(this.f1112r);
    }

    void g(boolean z10) {
        long longPressTimeout;
        if (androidx.core.view.u.v(this.f1108n)) {
            e(null);
            z0 z0Var = f1107x;
            if (z0Var != null) {
                z0Var.c();
            }
            f1107x = this;
            this.f1116v = z10;
            a1 a1Var = new a1(this.f1108n.getContext());
            this.f1115u = a1Var;
            a1Var.e(this.f1108n, this.f1113s, this.f1114t, this.f1116v, this.f1109o);
            this.f1108n.addOnAttachStateChangeListener(this);
            if (this.f1116v) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((androidx.core.view.u.s(this.f1108n) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1108n.removeCallbacks(this.f1112r);
            this.f1108n.postDelayed(this.f1112r, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1115u == null || !this.f1116v) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1108n.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.f1108n.isEnabled() && this.f1115u == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1113s = view.getWidth() / 2;
        this.f1114t = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
