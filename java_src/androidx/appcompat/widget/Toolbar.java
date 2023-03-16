package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import d.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private o0 G;
    private int H;
    private int I;
    private int J;
    private CharSequence K;
    private CharSequence L;
    private ColorStateList M;
    private ColorStateList N;
    private boolean O;
    private boolean P;
    private final ArrayList<View> Q;
    private final ArrayList<View> R;
    private final int[] S;
    f T;
    private final ActionMenuView.e U;
    private x0 V;
    private androidx.appcompat.widget.c W;

    /* renamed from: a0  reason: collision with root package name */
    private d f761a0;

    /* renamed from: b0  reason: collision with root package name */
    private j.a f762b0;

    /* renamed from: c0  reason: collision with root package name */
    private e.a f763c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f764d0;

    /* renamed from: e0  reason: collision with root package name */
    private final Runnable f765e0;

    /* renamed from: n  reason: collision with root package name */
    private ActionMenuView f766n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f767o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f768p;

    /* renamed from: q  reason: collision with root package name */
    private ImageButton f769q;

    /* renamed from: r  reason: collision with root package name */
    private ImageView f770r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f771s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f772t;

    /* renamed from: u  reason: collision with root package name */
    ImageButton f773u;

    /* renamed from: v  reason: collision with root package name */
    View f774v;

    /* renamed from: w  reason: collision with root package name */
    private Context f775w;

    /* renamed from: x  reason: collision with root package name */
    private int f776x;

    /* renamed from: y  reason: collision with root package name */
    private int f777y;

    /* renamed from: z  reason: collision with root package name */
    private int f778z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.T;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.j {

        /* renamed from: n  reason: collision with root package name */
        androidx.appcompat.view.menu.e f782n;

        /* renamed from: o  reason: collision with root package name */
        androidx.appcompat.view.menu.g f783o;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f782n;
            if (eVar2 != null && (gVar = this.f783o) != null) {
                eVar2.f(gVar);
            }
            this.f782n = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z10) {
            if (this.f783o != null) {
                androidx.appcompat.view.menu.e eVar = this.f782n;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f782n.getItem(i10) == this.f783o) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                i(this.f782n, this.f783o);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f774v;
            if (view instanceof h.c) {
                ((h.c) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f774v);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f773u);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f774v = null;
            toolbar3.a();
            this.f783o = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f773u.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f773u);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f773u);
            }
            Toolbar.this.f774v = gVar.getActionView();
            this.f783o = gVar;
            ViewParent parent2 = Toolbar.this.f774v.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f774v);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f6285a = 8388611 | (toolbar4.A & 112);
                generateDefaultLayoutParams.f785b = 2;
                toolbar4.f774v.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f774v);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f774v;
            if (view instanceof h.c) {
                ((h.c) view).c();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0090a {

        /* renamed from: b  reason: collision with root package name */
        int f785b;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f785b = 0;
            this.f6285a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f785b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f785b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f785b = 0;
            a(marginLayoutParams);
        }

        public e(e eVar) {
            super((a.C0090a) eVar);
            this.f785b = 0;
            this.f785b = eVar.f785b;
        }

        public e(a.C0090a c0090a) {
            super(c0090a);
            this.f785b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends s.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        int f786p;

        /* renamed from: q  reason: collision with root package name */
        boolean f787q;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f786p = parcel.readInt();
            this.f787q = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f786p);
            parcel.writeInt(this.f787q ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.J = 8388627;
        this.Q = new ArrayList<>();
        this.R = new ArrayList<>();
        this.S = new int[2];
        this.U = new a();
        this.f765e0 = new b();
        Context context2 = getContext();
        int[] iArr = c.j.W2;
        w0 u10 = w0.u(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.u.F(this, context, iArr, attributeSet, u10.q(), i10, 0);
        this.f777y = u10.m(c.j.f3096y3, 0);
        this.f778z = u10.m(c.j.f3051p3, 0);
        this.J = u10.k(c.j.X2, this.J);
        this.A = u10.k(c.j.Y2, 48);
        int d10 = u10.d(c.j.f3066s3, 0);
        int i11 = c.j.f3091x3;
        d10 = u10.r(i11) ? u10.d(i11, d10) : d10;
        this.F = d10;
        this.E = d10;
        this.D = d10;
        this.C = d10;
        int d11 = u10.d(c.j.f3081v3, -1);
        if (d11 >= 0) {
            this.C = d11;
        }
        int d12 = u10.d(c.j.f3076u3, -1);
        if (d12 >= 0) {
            this.D = d12;
        }
        int d13 = u10.d(c.j.f3086w3, -1);
        if (d13 >= 0) {
            this.E = d13;
        }
        int d14 = u10.d(c.j.f3071t3, -1);
        if (d14 >= 0) {
            this.F = d14;
        }
        this.B = u10.e(c.j.f3021j3, -1);
        int d15 = u10.d(c.j.f3001f3, Integer.MIN_VALUE);
        int d16 = u10.d(c.j.f2981b3, Integer.MIN_VALUE);
        int e10 = u10.e(c.j.f2991d3, 0);
        int e11 = u10.e(c.j.f2996e3, 0);
        h();
        this.G.e(e10, e11);
        if (d15 != Integer.MIN_VALUE || d16 != Integer.MIN_VALUE) {
            this.G.g(d15, d16);
        }
        this.H = u10.d(c.j.f3006g3, Integer.MIN_VALUE);
        this.I = u10.d(c.j.f2986c3, Integer.MIN_VALUE);
        this.f771s = u10.f(c.j.f2976a3);
        this.f772t = u10.o(c.j.Z2);
        CharSequence o10 = u10.o(c.j.f3061r3);
        if (!TextUtils.isEmpty(o10)) {
            setTitle(o10);
        }
        CharSequence o11 = u10.o(c.j.f3046o3);
        if (!TextUtils.isEmpty(o11)) {
            setSubtitle(o11);
        }
        this.f775w = getContext();
        setPopupTheme(u10.m(c.j.f3041n3, 0));
        Drawable f10 = u10.f(c.j.f3036m3);
        if (f10 != null) {
            setNavigationIcon(f10);
        }
        CharSequence o12 = u10.o(c.j.f3031l3);
        if (!TextUtils.isEmpty(o12)) {
            setNavigationContentDescription(o12);
        }
        Drawable f11 = u10.f(c.j.f3011h3);
        if (f11 != null) {
            setLogo(f11);
        }
        CharSequence o13 = u10.o(c.j.f3016i3);
        if (!TextUtils.isEmpty(o13)) {
            setLogoDescription(o13);
        }
        int i12 = c.j.f3101z3;
        if (u10.r(i12)) {
            setTitleTextColor(u10.c(i12));
        }
        int i13 = c.j.f3056q3;
        if (u10.r(i13)) {
            setSubtitleTextColor(u10.c(i13));
        }
        int i14 = c.j.f3026k3;
        if (u10.r(i14)) {
            x(u10.m(i14, 0));
        }
        u10.v();
    }

    private int B(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.f765e0);
        post(this.f765e0);
    }

    private boolean L() {
        if (this.f764d0) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.u.n(this) == 1;
        int childCount = getChildCount();
        int a10 = androidx.core.view.d.a(i10, androidx.core.view.u.n(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f785b == 0 && M(childAt) && p(eVar.f6285a) == a10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f785b == 0 && M(childAt2) && p(eVar2.f6285a) == a10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f785b = 1;
        if (!z10 || this.f774v == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.R.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new h.g(getContext());
    }

    private void h() {
        if (this.G == null) {
            this.G = new o0();
        }
    }

    private void i() {
        if (this.f770r == null) {
            this.f770r = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f766n.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f766n.getMenu();
            if (this.f761a0 == null) {
                this.f761a0 = new d();
            }
            this.f766n.setExpandedActionViewsExclusive(true);
            eVar.c(this.f761a0, this.f775w);
        }
    }

    private void k() {
        if (this.f766n == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f766n = actionMenuView;
            actionMenuView.setPopupTheme(this.f776x);
            this.f766n.setOnMenuItemClickListener(this.U);
            this.f766n.M(this.f762b0, this.f763c0);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6285a = 8388613 | (this.A & 112);
            this.f766n.setLayoutParams(generateDefaultLayoutParams);
            c(this.f766n, false);
        }
    }

    private void l() {
        if (this.f769q == null) {
            this.f769q = new m(getContext(), null, c.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6285a = 8388611 | (this.A & 112);
            this.f769q.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int n10 = androidx.core.view.u.n(this);
        int a10 = androidx.core.view.d.a(i10, n10) & 7;
        return (a10 == 1 || a10 == 3 || a10 == 5) ? a10 : n10 == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(eVar.f6285a);
        if (r10 != 48) {
            if (r10 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.J & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.g.b(marginLayoutParams) + androidx.core.view.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.R.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f766n;
        return actionMenuView != null && actionMenuView.H();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f785b != 2 && childAt != this.f766n) {
                removeViewAt(childCount);
                this.R.add(childAt);
            }
        }
    }

    public void H(int i10, int i11) {
        h();
        this.G.g(i10, i11);
    }

    public void I(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f766n == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e L = this.f766n.L();
        if (L == eVar) {
            return;
        }
        if (L != null) {
            L.O(this.W);
            L.O(this.f761a0);
        }
        if (this.f761a0 == null) {
            this.f761a0 = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f775w);
            eVar.c(this.f761a0, this.f775w);
        } else {
            cVar.d(this.f775w, null);
            this.f761a0.d(this.f775w, null);
            cVar.f(true);
            this.f761a0.f(true);
        }
        this.f766n.setPopupTheme(this.f776x);
        this.f766n.setPresenter(cVar);
        this.W = cVar;
    }

    public void J(Context context, int i10) {
        this.f778z = i10;
        TextView textView = this.f768p;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void K(Context context, int i10) {
        this.f777y = i10;
        TextView textView = this.f767o;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f766n;
        return actionMenuView != null && actionMenuView.N();
    }

    void a() {
        for (int size = this.R.size() - 1; size >= 0; size--) {
            addView(this.R.get(size));
        }
        this.R.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f766n) != null && actionMenuView.I();
    }

    public void e() {
        d dVar = this.f761a0;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f783o;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f766n;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f773u == null) {
            m mVar = new m(getContext(), null, c.a.toolbarNavigationButtonStyle);
            this.f773u = mVar;
            mVar.setImageDrawable(this.f771s);
            this.f773u.setContentDescription(this.f772t);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6285a = 8388611 | (this.A & 112);
            generateDefaultLayoutParams.f785b = 2;
            this.f773u.setLayoutParams(generateDefaultLayoutParams);
            this.f773u.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f773u;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f773u;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.G;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.I;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.G;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.G;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.G;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.H;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e L;
        ActionMenuView actionMenuView = this.f766n;
        return actionMenuView != null && (L = actionMenuView.L()) != null && L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.I, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.u.n(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.u.n(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.H, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f770r;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f770r;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f766n.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f769q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f769q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.W;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f766n.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f775w;
    }

    public int getPopupTheme() {
        return this.f776x;
    }

    public CharSequence getSubtitle() {
        return this.L;
    }

    final TextView getSubtitleTextView() {
        return this.f768p;
    }

    public CharSequence getTitle() {
        return this.K;
    }

    public int getTitleMarginBottom() {
        return this.F;
    }

    public int getTitleMarginEnd() {
        return this.D;
    }

    public int getTitleMarginStart() {
        return this.C;
    }

    public int getTitleMarginTop() {
        return this.E;
    }

    final TextView getTitleTextView() {
        return this.f767o;
    }

    public d0 getWrapper() {
        if (this.V == null) {
            this.V = new x0(this, true);
        }
        return this.V;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0090a ? new e((a.C0090a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f765e0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.P = false;
        }
        if (!this.P) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.P = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.P = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.S;
        boolean b10 = c1.b(this);
        int i19 = !b10 ? 1 : 0;
        if (M(this.f769q)) {
            E(this.f769q, i10, 0, i11, 0, this.B);
            i12 = this.f769q.getMeasuredWidth() + s(this.f769q);
            i13 = Math.max(0, this.f769q.getMeasuredHeight() + t(this.f769q));
            i14 = View.combineMeasuredStates(0, this.f769q.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (M(this.f773u)) {
            E(this.f773u, i10, 0, i11, 0, this.B);
            i12 = this.f773u.getMeasuredWidth() + s(this.f773u);
            i13 = Math.max(i13, this.f773u.getMeasuredHeight() + t(this.f773u));
            i14 = View.combineMeasuredStates(i14, this.f773u.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (M(this.f766n)) {
            E(this.f766n, i10, max, i11, 0, this.B);
            i15 = this.f766n.getMeasuredWidth() + s(this.f766n);
            i13 = Math.max(i13, this.f766n.getMeasuredHeight() + t(this.f766n));
            i14 = View.combineMeasuredStates(i14, this.f766n.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (M(this.f774v)) {
            max2 += D(this.f774v, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f774v.getMeasuredHeight() + t(this.f774v));
            i14 = View.combineMeasuredStates(i14, this.f774v.getMeasuredState());
        }
        if (M(this.f770r)) {
            max2 += D(this.f770r, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f770r.getMeasuredHeight() + t(this.f770r));
            i14 = View.combineMeasuredStates(i14, this.f770r.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f785b == 0 && M(childAt)) {
                max2 += D(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.E + this.F;
        int i22 = this.C + this.D;
        if (M(this.f767o)) {
            D(this.f767o, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f767o.getMeasuredWidth() + s(this.f767o);
            i16 = this.f767o.getMeasuredHeight() + t(this.f767o);
            i17 = View.combineMeasuredStates(i14, this.f767o.getMeasuredState());
            i18 = measuredWidth;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (M(this.f768p)) {
            i18 = Math.max(i18, D(this.f768p, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.f768p.getMeasuredHeight() + t(this.f768p);
            i17 = View.combineMeasuredStates(i17, this.f768p.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i17), L() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i13, i16) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f766n;
        androidx.appcompat.view.menu.e L = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = gVar.f786p;
        if (i10 != 0 && this.f761a0 != null && L != null && (findItem = L.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f787q) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i10);
        }
        h();
        this.G.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f761a0;
        if (dVar != null && (gVar = dVar.f783o) != null) {
            gVar2.f786p = gVar.getItemId();
        }
        gVar2.f787q = A();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.O = false;
        }
        if (!this.O) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.O = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.O = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f773u;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(e.a.d(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f773u.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f773u;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f771s);
        }
    }

    public void setCollapsible(boolean z10) {
        this.f764d0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.I) {
            this.I = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.H) {
            this.H = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(e.a.d(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f770r)) {
                c(this.f770r, true);
            }
        } else {
            ImageView imageView = this.f770r;
            if (imageView != null && y(imageView)) {
                removeView(this.f770r);
                this.R.remove(this.f770r);
            }
        }
        ImageView imageView2 = this.f770r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f770r;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f769q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(e.a.d(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f769q)) {
                c(this.f769q, true);
            }
        } else {
            ImageButton imageButton = this.f769q;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f769q);
                this.R.remove(this.f769q);
            }
        }
        ImageButton imageButton2 = this.f769q;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f769q.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.T = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f766n.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f776x != i10) {
            this.f776x = i10;
            if (i10 == 0) {
                this.f775w = getContext();
            } else {
                this.f775w = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f768p;
            if (textView != null && y(textView)) {
                removeView(this.f768p);
                this.R.remove(this.f768p);
            }
        } else {
            if (this.f768p == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f768p = zVar;
                zVar.setSingleLine();
                this.f768p.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f778z;
                if (i10 != 0) {
                    this.f768p.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    this.f768p.setTextColor(colorStateList);
                }
            }
            if (!y(this.f768p)) {
                c(this.f768p, true);
            }
        }
        TextView textView2 = this.f768p;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.L = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        TextView textView = this.f768p;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f767o;
            if (textView != null && y(textView)) {
                removeView(this.f767o);
                this.R.remove(this.f767o);
            }
        } else {
            if (this.f767o == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f767o = zVar;
                zVar.setSingleLine();
                this.f767o.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f777y;
                if (i10 != 0) {
                    this.f767o.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.f767o.setTextColor(colorStateList);
                }
            }
            if (!y(this.f767o)) {
                c(this.f767o, true);
            }
        }
        TextView textView2 = this.f767o;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.F = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        TextView textView = this.f767o;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.f761a0;
        return (dVar == null || dVar.f783o == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f766n;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f766n;
        return actionMenuView != null && actionMenuView.G();
    }
}
