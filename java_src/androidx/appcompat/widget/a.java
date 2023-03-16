package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: n  reason: collision with root package name */
    protected final C0011a f793n;

    /* renamed from: o  reason: collision with root package name */
    protected final Context f794o;

    /* renamed from: p  reason: collision with root package name */
    protected ActionMenuView f795p;

    /* renamed from: q  reason: collision with root package name */
    protected c f796q;

    /* renamed from: r  reason: collision with root package name */
    protected int f797r;

    /* renamed from: s  reason: collision with root package name */
    protected androidx.core.view.a0 f798s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f799t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f800u;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0011a implements androidx.core.view.b0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f801a = false;

        /* renamed from: b  reason: collision with root package name */
        int f802b;

        protected C0011a() {
        }

        @Override // androidx.core.view.b0
        public void a(View view) {
            this.f801a = true;
        }

        @Override // androidx.core.view.b0
        public void b(View view) {
            if (this.f801a) {
                return;
            }
            a aVar = a.this;
            aVar.f798s = null;
            a.super.setVisibility(this.f802b);
        }

        @Override // androidx.core.view.b0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f801a = false;
        }

        public C0011a d(androidx.core.view.a0 a0Var, int i10) {
            a.this.f798s = a0Var;
            this.f802b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f793n = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(c.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f794o = context;
        } else {
            this.f794o = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.a0 f(int i10, long j10) {
        androidx.core.view.a0 b10;
        androidx.core.view.a0 a0Var = this.f798s;
        if (a0Var != null) {
            a0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b10 = androidx.core.view.u.b(this).b(1.0f);
        } else {
            b10 = androidx.core.view.u.b(this).b(0.0f);
        }
        b10.f(j10);
        b10.h(this.f793n.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.f798s != null ? this.f793n.f802b : getVisibility();
    }

    public int getContentHeight() {
        return this.f797r;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, c.j.f2972a, c.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(c.j.f3017j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f796q;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f800u = false;
        }
        if (!this.f800u) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f800u = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f800u = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f799t = false;
        }
        if (!this.f799t) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f799t = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f799t = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f797r = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.a0 a0Var = this.f798s;
            if (a0Var != null) {
                a0Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
