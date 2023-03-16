package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import d.a;
/* loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: w  reason: collision with root package name */
    private static final Interpolator f971w = new DecelerateInterpolator();

    /* renamed from: n  reason: collision with root package name */
    Runnable f972n;

    /* renamed from: o  reason: collision with root package name */
    private c f973o;

    /* renamed from: p  reason: collision with root package name */
    i0 f974p;

    /* renamed from: q  reason: collision with root package name */
    private Spinner f975q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f976r;

    /* renamed from: s  reason: collision with root package name */
    int f977s;

    /* renamed from: t  reason: collision with root package name */
    int f978t;

    /* renamed from: u  reason: collision with root package name */
    private int f979u;

    /* renamed from: v  reason: collision with root package name */
    private int f980v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f981n;

        a(View view) {
            this.f981n = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.smoothScrollTo(this.f981n.getLeft() - ((p0.this.getWidth() - this.f981n.getWidth()) / 2), 0);
            p0.this.f972n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f974p.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) p0.this.f974p.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f974p.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = p0.this.f974p.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: n  reason: collision with root package name */
        private final int[] f985n;

        /* renamed from: o  reason: collision with root package name */
        private a.c f986o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f987p;

        /* renamed from: q  reason: collision with root package name */
        private ImageView f988q;

        /* renamed from: r  reason: collision with root package name */
        private View f989r;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r6, d.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.p0.this = r5
                int r5 = c.a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f985n = r1
                r4.f986o = r7
                androidx.appcompat.widget.w0 r5 = androidx.appcompat.widget.w0.u(r6, r0, r1, r5, r3)
                boolean r6 = r5.r(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.f(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.v()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.d.<init>(androidx.appcompat.widget.p0, android.content.Context, d.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f986o = cVar;
            c();
        }

        public a.c b() {
            return this.f986o;
        }

        public void c() {
            a.c cVar = this.f986o;
            View b10 = cVar.b();
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f989r = b10;
                TextView textView = this.f987p;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f988q;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f988q.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f989r;
            if (view != null) {
                removeView(view);
                this.f989r = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f988q == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f988q = oVar;
                }
                this.f988q.setImageDrawable(c10);
                this.f988q.setVisibility(0);
            } else {
                ImageView imageView2 = this.f988q;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f988q.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f987p == null) {
                    z zVar = new z(getContext(), null, c.a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f987p = zVar;
                }
                this.f987p.setText(d10);
                this.f987p.setVisibility(0);
            } else {
                TextView textView2 = this.f987p;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f987p.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f988q;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            y0.a(this, z10 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (p0.this.f977s > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = p0.this.f977s;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, c.a.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f975q;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f975q == null) {
            this.f975q = b();
        }
        removeView(this.f974p);
        addView(this.f975q, new ViewGroup.LayoutParams(-2, -1));
        if (this.f975q.getAdapter() == null) {
            this.f975q.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f972n;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f972n = null;
        }
        this.f975q.setSelection(this.f980v);
    }

    private boolean f() {
        if (d()) {
            removeView(this.f975q);
            addView(this.f974p, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f975q.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void a(int i10) {
        View childAt = this.f974p.getChildAt(i10);
        Runnable runnable = this.f972n;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f972n = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f979u));
        } else {
            dVar.setFocusable(true);
            if (this.f973o == null) {
                this.f973o = new c();
            }
            dVar.setOnClickListener(this.f973o);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f972n;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h.a b10 = h.a.b(getContext());
        setContentHeight(b10.f());
        this.f978t = b10.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f972n;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = true;
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f974p.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.f977s = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f977s = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.f977s, this.f978t);
        }
        this.f977s = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f979u, 1073741824);
        if (z11 || !this.f976r) {
            z10 = false;
        }
        if (z10) {
            this.f974p.measure(0, makeMeasureSpec);
            if (this.f974p.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z11 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f980v);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z11) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f976r = z10;
    }

    public void setContentHeight(int i10) {
        this.f979u = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f980v = i10;
        int childCount = this.f974p.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f974p.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f975q;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
