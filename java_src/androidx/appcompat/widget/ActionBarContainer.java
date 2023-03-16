package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: n  reason: collision with root package name */
    private boolean f656n;

    /* renamed from: o  reason: collision with root package name */
    private View f657o;

    /* renamed from: p  reason: collision with root package name */
    private View f658p;

    /* renamed from: q  reason: collision with root package name */
    private View f659q;

    /* renamed from: r  reason: collision with root package name */
    Drawable f660r;

    /* renamed from: s  reason: collision with root package name */
    Drawable f661s;

    /* renamed from: t  reason: collision with root package name */
    Drawable f662t;

    /* renamed from: u  reason: collision with root package name */
    boolean f663u;

    /* renamed from: v  reason: collision with root package name */
    boolean f664v;

    /* renamed from: w  reason: collision with root package name */
    private int f665w;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.u.I(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.f2972a);
        this.f660r = obtainStyledAttributes.getDrawable(c.j.f2977b);
        this.f661s = obtainStyledAttributes.getDrawable(c.j.f2987d);
        this.f665w = obtainStyledAttributes.getDimensionPixelSize(c.j.f3017j, -1);
        boolean z10 = true;
        if (getId() == c.f.split_action_bar) {
            this.f663u = true;
            this.f662t = obtainStyledAttributes.getDrawable(c.j.f2982c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f663u ? this.f660r != null || this.f661s != null : this.f662t != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f660r;
        if (drawable != null && drawable.isStateful()) {
            this.f660r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f661s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f661s.setState(getDrawableState());
        }
        Drawable drawable3 = this.f662t;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f662t.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f657o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f660r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f661s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f662t;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f658p = findViewById(c.f.action_bar);
        this.f659q = findViewById(c.f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f656n || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f657o;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i10, (measuredHeight - view2.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f663u) {
            Drawable drawable3 = this.f662t;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f660r != null) {
                if (this.f658p.getVisibility() == 0) {
                    drawable2 = this.f660r;
                    left = this.f658p.getLeft();
                    top = this.f658p.getTop();
                    right = this.f658p.getRight();
                    view = this.f658p;
                } else {
                    View view3 = this.f659q;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f660r.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f660r;
                        left = this.f659q.getLeft();
                        top = this.f659q.getTop();
                        right = this.f659q.getRight();
                        view = this.f659q;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f664v = z13;
            if (z13 && (drawable = this.f661s) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f658p
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f665w
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f658p
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f657o
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f658p
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f658p
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f659q
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f659q
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f657o
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f660r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f660r);
        }
        this.f660r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f658p;
            if (view != null) {
                this.f660r.setBounds(view.getLeft(), this.f658p.getTop(), this.f658p.getRight(), this.f658p.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f663u ? this.f660r != null || this.f661s != null : this.f662t != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f662t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f662t);
        }
        this.f662t = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f663u && (drawable2 = this.f662t) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f663u ? !(this.f660r != null || this.f661s != null) : this.f662t == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f661s;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f661s);
        }
        this.f661s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f664v && (drawable2 = this.f661s) != null) {
                drawable2.setBounds(this.f657o.getLeft(), this.f657o.getTop(), this.f657o.getRight(), this.f657o.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f663u ? this.f660r != null || this.f661s != null : this.f662t != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f657o;
        if (view != null) {
            removeView(view);
        }
        this.f657o = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f656n = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f660r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f661s;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f662t;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f660r && !this.f663u) || (drawable == this.f661s && this.f664v) || ((drawable == this.f662t && this.f663u) || super.verifyDrawable(drawable));
    }
}
