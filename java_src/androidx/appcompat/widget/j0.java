package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class j0 implements i.e {
    private static Method T;
    private static Method U;
    private static Method V;
    private boolean A;
    int B;
    private View C;
    private int D;
    private DataSetObserver E;
    private View F;
    private Drawable G;
    private AdapterView.OnItemClickListener H;
    private AdapterView.OnItemSelectedListener I;
    final g J;
    private final f K;
    private final e L;
    private final c M;
    private Runnable N;
    final Handler O;
    private final Rect P;
    private Rect Q;
    private boolean R;
    PopupWindow S;

    /* renamed from: n  reason: collision with root package name */
    private Context f918n;

    /* renamed from: o  reason: collision with root package name */
    private ListAdapter f919o;

    /* renamed from: p  reason: collision with root package name */
    f0 f920p;

    /* renamed from: q  reason: collision with root package name */
    private int f921q;

    /* renamed from: r  reason: collision with root package name */
    private int f922r;

    /* renamed from: s  reason: collision with root package name */
    private int f923s;

    /* renamed from: t  reason: collision with root package name */
    private int f924t;

    /* renamed from: u  reason: collision with root package name */
    private int f925u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f926v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f927w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f928x;

    /* renamed from: y  reason: collision with root package name */
    private int f929y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f930z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t10 = j0.this.t();
            if (t10 == null || t10.getWindowToken() == null) {
                return;
            }
            j0.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            f0 f0Var;
            if (i10 == -1 || (f0Var = j0.this.f920p) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.c()) {
                j0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || j0.this.w() || j0.this.S.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.O.removeCallbacks(j0Var.J);
            j0.this.J.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.S) != null && popupWindow.isShowing() && x10 >= 0 && x10 < j0.this.S.getWidth() && y10 >= 0 && y10 < j0.this.S.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.O.postDelayed(j0Var.J, 250L);
                return false;
            } else if (action == 1) {
                j0 j0Var2 = j0.this;
                j0Var2.O.removeCallbacks(j0Var2.J);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f920p;
            if (f0Var == null || !androidx.core.view.u.v(f0Var) || j0.this.f920p.getCount() <= j0.this.f920p.getChildCount()) {
                return;
            }
            int childCount = j0.this.f920p.getChildCount();
            j0 j0Var = j0.this;
            if (childCount <= j0Var.B) {
                j0Var.S.setInputMethodMode(2);
                j0.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                T = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                V = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                U = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f921q = -2;
        this.f922r = -2;
        this.f925u = 1002;
        this.f929y = 0;
        this.f930z = false;
        this.A = false;
        this.B = Integer.MAX_VALUE;
        this.D = 0;
        this.J = new g();
        this.K = new f();
        this.L = new e();
        this.M = new c();
        this.P = new Rect();
        this.f918n = context;
        this.O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.f3044o1, i10, i11);
        this.f923s = obtainStyledAttributes.getDimensionPixelOffset(c.j.f3049p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(c.j.f3054q1, 0);
        this.f924t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f926v = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i10, i11);
        this.S = qVar;
        qVar.setInputMethodMode(1);
    }

    private void J(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.S.setIsClippedToScreen(z10);
            return;
        }
        Method method = T;
        if (method != null) {
            try {
                method.invoke(this.S, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = U;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.S, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.S.getMaxAvailableHeight(view, i10);
        }
        return this.S.getMaxAvailableHeight(view, i10, z10);
    }

    private void y() {
        View view = this.C;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.C);
            }
        }
    }

    public void A(int i10) {
        this.S.setAnimationStyle(i10);
    }

    public void B(int i10) {
        Drawable background = this.S.getBackground();
        if (background == null) {
            M(i10);
            return;
        }
        background.getPadding(this.P);
        Rect rect = this.P;
        this.f922r = rect.left + rect.right + i10;
    }

    public void C(int i10) {
        this.f929y = i10;
    }

    public void D(Rect rect) {
        this.Q = rect != null ? new Rect(rect) : null;
    }

    public void E(int i10) {
        this.S.setInputMethodMode(i10);
    }

    public void F(boolean z10) {
        this.R = z10;
        this.S.setFocusable(z10);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.S.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.H = onItemClickListener;
    }

    public void I(boolean z10) {
        this.f928x = true;
        this.f927w = z10;
    }

    public void K(int i10) {
        this.D = i10;
    }

    public void L(int i10) {
        f0 f0Var = this.f920p;
        if (!c() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i10);
        if (f0Var.getChoiceMode() != 0) {
            f0Var.setItemChecked(i10, true);
        }
    }

    public void M(int i10) {
        this.f922r = i10;
    }

    @Override // i.e
    public void a() {
        int q10 = q();
        boolean w10 = w();
        androidx.core.widget.h.b(this.S, this.f925u);
        boolean z10 = true;
        if (this.S.isShowing()) {
            if (androidx.core.view.u.v(t())) {
                int i10 = this.f922r;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = t().getWidth();
                }
                int i11 = this.f921q;
                if (i11 == -1) {
                    if (!w10) {
                        q10 = -1;
                    }
                    if (w10) {
                        this.S.setWidth(this.f922r == -1 ? -1 : 0);
                        this.S.setHeight(0);
                    } else {
                        this.S.setWidth(this.f922r == -1 ? -1 : 0);
                        this.S.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    q10 = i11;
                }
                PopupWindow popupWindow = this.S;
                if (this.A || this.f930z) {
                    z10 = false;
                }
                popupWindow.setOutsideTouchable(z10);
                this.S.update(t(), this.f923s, this.f924t, i10 < 0 ? -1 : i10, q10 < 0 ? -1 : q10);
                return;
            }
            return;
        }
        int i12 = this.f922r;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = t().getWidth();
        }
        int i13 = this.f921q;
        if (i13 == -1) {
            q10 = -1;
        } else if (i13 != -2) {
            q10 = i13;
        }
        this.S.setWidth(i12);
        this.S.setHeight(q10);
        J(true);
        this.S.setOutsideTouchable((this.A || this.f930z) ? false : true);
        this.S.setTouchInterceptor(this.K);
        if (this.f928x) {
            androidx.core.widget.h.a(this.S, this.f927w);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = V;
            if (method != null) {
                try {
                    method.invoke(this.S, this.Q);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.S.setEpicenterBounds(this.Q);
        }
        androidx.core.widget.h.c(this.S, t(), this.f923s, this.f924t, this.f929y);
        this.f920p.setSelection(-1);
        if (!this.R || this.f920p.isInTouchMode()) {
            r();
        }
        if (this.R) {
            return;
        }
        this.O.post(this.M);
    }

    @Override // i.e
    public boolean c() {
        return this.S.isShowing();
    }

    public int d() {
        return this.f923s;
    }

    @Override // i.e
    public void dismiss() {
        this.S.dismiss();
        y();
        this.S.setContentView(null);
        this.f920p = null;
        this.O.removeCallbacks(this.J);
    }

    public Drawable f() {
        return this.S.getBackground();
    }

    @Override // i.e
    public ListView g() {
        return this.f920p;
    }

    public void i(Drawable drawable) {
        this.S.setBackgroundDrawable(drawable);
    }

    public void j(int i10) {
        this.f924t = i10;
        this.f926v = true;
    }

    public void l(int i10) {
        this.f923s = i10;
    }

    public int n() {
        if (this.f926v) {
            return this.f924t;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.E;
        if (dataSetObserver == null) {
            this.E = new d();
        } else {
            ListAdapter listAdapter2 = this.f919o;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f919o = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        f0 f0Var = this.f920p;
        if (f0Var != null) {
            f0Var.setAdapter(this.f919o);
        }
    }

    public void r() {
        f0 f0Var = this.f920p;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    f0 s(Context context, boolean z10) {
        return new f0(context, z10);
    }

    public View t() {
        return this.F;
    }

    public int v() {
        return this.f922r;
    }

    public boolean w() {
        return this.S.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.R;
    }

    public void z(View view) {
        this.F = view;
    }
}
