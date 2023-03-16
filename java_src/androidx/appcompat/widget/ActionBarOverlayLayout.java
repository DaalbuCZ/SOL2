package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.e0;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, androidx.core.view.n, androidx.core.view.l, androidx.core.view.m {
    static final int[] S = {c.a.actionBarSize, 16842841};
    private final Rect A;
    private final Rect B;
    private final Rect C;
    private final Rect D;
    private final Rect E;
    private final Rect F;
    private final Rect G;
    private androidx.core.view.e0 H;
    private androidx.core.view.e0 I;
    private androidx.core.view.e0 J;
    private androidx.core.view.e0 K;
    private d L;
    private OverScroller M;
    ViewPropertyAnimator N;
    final AnimatorListenerAdapter O;
    private final Runnable P;
    private final Runnable Q;
    private final androidx.core.view.o R;

    /* renamed from: n  reason: collision with root package name */
    private int f673n;

    /* renamed from: o  reason: collision with root package name */
    private int f674o;

    /* renamed from: p  reason: collision with root package name */
    private ContentFrameLayout f675p;

    /* renamed from: q  reason: collision with root package name */
    ActionBarContainer f676q;

    /* renamed from: r  reason: collision with root package name */
    private d0 f677r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f678s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f679t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f680u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f681v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f682w;

    /* renamed from: x  reason: collision with root package name */
    boolean f683x;

    /* renamed from: y  reason: collision with root package name */
    private int f684y;

    /* renamed from: z  reason: collision with root package name */
    private int f685z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = null;
            actionBarOverlayLayout.f683x = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = null;
            actionBarOverlayLayout.f683x = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = actionBarOverlayLayout.f676q.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.O);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = actionBarOverlayLayout.f676q.animate().translationY(-ActionBarOverlayLayout.this.f676q.getHeight()).setListener(ActionBarOverlayLayout.this.O);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(int i10);

        void d();

        void e(boolean z10);

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f674o = 0;
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        androidx.core.view.e0 e0Var = androidx.core.view.e0.f1612b;
        this.H = e0Var;
        this.I = e0Var;
        this.J = e0Var;
        this.K = e0Var;
        this.O = new a();
        this.P = new b();
        this.Q = new c();
        v(context);
        this.R = new androidx.core.view.o(this);
    }

    private void A() {
        u();
        this.P.run();
    }

    private boolean B(float f10) {
        this.M.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.M.getFinalY() > this.f676q.getHeight();
    }

    private void p() {
        u();
        this.Q.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private d0 t(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(S);
        this.f673n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f678s = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f679t = context.getApplicationInfo().targetSdkVersion < 19;
        this.M = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.Q, 600L);
    }

    private void y() {
        u();
        postDelayed(this.P, 600L);
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, j.a aVar) {
        z();
        this.f677r.a(menu, aVar);
    }

    @Override // androidx.core.view.l
    public void b(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public boolean c() {
        z();
        return this.f677r.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.c0
    public void d() {
        z();
        this.f677r.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f678s == null || this.f679t) {
            return;
        }
        int bottom = this.f676q.getVisibility() == 0 ? (int) (this.f676q.getBottom() + this.f676q.getTranslationY() + 0.5f) : 0;
        this.f678s.setBounds(0, bottom, getWidth(), this.f678s.getIntrinsicHeight() + bottom);
        this.f678s.draw(canvas);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        z();
        return this.f677r.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        z();
        return this.f677r.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q10 = q(this.f676q, rect, true, true, false, true);
        this.D.set(rect);
        c1.a(this, this.D, this.A);
        if (!this.E.equals(this.D)) {
            this.E.set(this.D);
            q10 = true;
        }
        if (!this.B.equals(this.A)) {
            this.B.set(this.A);
            q10 = true;
        }
        if (q10) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean g() {
        z();
        return this.f677r.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f676q;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.R.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f677r.getTitle();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean h() {
        z();
        return this.f677r.h();
    }

    @Override // androidx.core.view.l
    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.l
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void k(int i10) {
        z();
        if (i10 == 2) {
            this.f677r.t();
        } else if (i10 == 5) {
            this.f677r.u();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void l() {
        z();
        this.f677r.i();
    }

    @Override // androidx.core.view.m
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.l
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.l
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.e0 t10 = androidx.core.view.e0.t(windowInsets);
        boolean q10 = q(this.f676q, new Rect(t10.i(), t10.k(), t10.j(), t10.h()), true, true, false, true);
        androidx.core.view.u.c(this, t10, this.A);
        Rect rect = this.A;
        androidx.core.view.e0 l10 = t10.l(rect.left, rect.top, rect.right, rect.bottom);
        this.H = l10;
        boolean z10 = true;
        if (!this.I.equals(l10)) {
            this.I = this.H;
            q10 = true;
        }
        if (this.B.equals(this.A)) {
            z10 = q10;
        } else {
            this.B.set(this.A);
        }
        if (z10) {
            requestLayout();
        }
        return t10.a().c().b().s();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.u.E(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        androidx.core.view.e0 a10;
        z();
        measureChildWithMargins(this.f676q, i10, 0, i11, 0);
        e eVar = (e) this.f676q.getLayoutParams();
        int max = Math.max(0, this.f676q.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f676q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f676q.getMeasuredState());
        boolean z10 = (androidx.core.view.u.s(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f673n;
            if (this.f681v && this.f676q.getTabContainer() != null) {
                measuredHeight += this.f673n;
            }
        } else {
            measuredHeight = this.f676q.getVisibility() != 8 ? this.f676q.getMeasuredHeight() : 0;
        }
        this.C.set(this.A);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            this.J = this.H;
        } else {
            this.F.set(this.D);
        }
        if (!this.f680u && !z10) {
            Rect rect = this.C;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i12 >= 21) {
                a10 = this.J.l(0, measuredHeight, 0, 0);
                this.J = a10;
            }
        } else if (i12 >= 21) {
            a10 = new e0.b(this.J).c(androidx.core.graphics.b.b(this.J.i(), this.J.k() + measuredHeight, this.J.j(), this.J.h() + 0)).a();
            this.J = a10;
        } else {
            Rect rect2 = this.F;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.f675p, this.C, true, true, true, true);
        if (i12 >= 21 && !this.K.equals(this.J)) {
            androidx.core.view.e0 e0Var = this.J;
            this.K = e0Var;
            androidx.core.view.u.d(this.f675p, e0Var);
        } else if (i12 < 21 && !this.G.equals(this.F)) {
            this.G.set(this.F);
            this.f675p.a(this.F);
        }
        measureChildWithMargins(this.f675p, i10, 0, i11, 0);
        e eVar2 = (e) this.f675p.getLayoutParams();
        int max3 = Math.max(max, this.f675p.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f675p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f675p.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.n
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (this.f682w && z10) {
            if (B(f11)) {
                p();
            } else {
                A();
            }
            this.f683x = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.n
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.n
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.n
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f684y + i11;
        this.f684y = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.n
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.R.b(view, view2, i10);
        this.f684y = getActionBarHideOffset();
        u();
        d dVar = this.L;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.n
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f676q.getVisibility() != 0) {
            return false;
        }
        return this.f682w;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.n
    public void onStopNestedScroll(View view) {
        if (this.f682w && !this.f683x) {
            if (this.f684y <= this.f676q.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.L;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i10);
        }
        z();
        int i11 = this.f685z ^ i10;
        this.f685z = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.L;
        if (dVar != null) {
            dVar.e(!z11);
            if (z10 || !z11) {
                this.L.a();
            } else {
                this.L.f();
            }
        }
        if ((i11 & 256) == 0 || this.L == null) {
            return;
        }
        androidx.core.view.u.E(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f674o = i10;
        d dVar = this.L;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f676q.setTranslationY(-Math.max(0, Math.min(i10, this.f676q.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.L = dVar;
        if (getWindowToken() != null) {
            this.L.c(this.f674o);
            int i10 = this.f685z;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.u.E(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f681v = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f682w) {
            this.f682w = z10;
            if (z10) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        z();
        this.f677r.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f677r.setIcon(drawable);
    }

    public void setLogo(int i10) {
        z();
        this.f677r.q(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f680u = z10;
        this.f679t = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f677r.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f677r.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
        ViewPropertyAnimator viewPropertyAnimator = this.N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f680u;
    }

    void z() {
        if (this.f675p == null) {
            this.f675p = (ContentFrameLayout) findViewById(c.f.action_bar_activity_content);
            this.f676q = (ActionBarContainer) findViewById(c.f.action_bar_container);
            this.f677r = t(findViewById(c.f.action_bar));
        }
    }
}
