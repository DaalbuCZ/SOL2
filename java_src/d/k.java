package d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import androidx.core.view.a0;
import androidx.core.view.b0;
import androidx.core.view.c0;
import androidx.core.view.u;
import d.a;
import h.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class k extends d.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* renamed from: a  reason: collision with root package name */
    Context f6393a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6394b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f6395c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f6396d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f6397e;

    /* renamed from: f  reason: collision with root package name */
    d0 f6398f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f6399g;

    /* renamed from: h  reason: collision with root package name */
    View f6400h;

    /* renamed from: i  reason: collision with root package name */
    p0 f6401i;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6404l;

    /* renamed from: m  reason: collision with root package name */
    d f6405m;

    /* renamed from: n  reason: collision with root package name */
    h.b f6406n;

    /* renamed from: o  reason: collision with root package name */
    b.a f6407o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6408p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6410r;

    /* renamed from: u  reason: collision with root package name */
    boolean f6413u;

    /* renamed from: v  reason: collision with root package name */
    boolean f6414v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6415w;

    /* renamed from: y  reason: collision with root package name */
    h.h f6417y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6418z;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Object> f6402j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f6403k = -1;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<a.b> f6409q = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    private int f6411s = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f6412t = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6416x = true;
    final b0 B = new a();
    final b0 C = new b();
    final androidx.core.view.d0 D = new c();

    /* loaded from: classes.dex */
    class a extends c0 {
        a() {
        }

        @Override // androidx.core.view.b0
        public void b(View view) {
            View view2;
            k kVar = k.this;
            if (kVar.f6412t && (view2 = kVar.f6400h) != null) {
                view2.setTranslationY(0.0f);
                k.this.f6397e.setTranslationY(0.0f);
            }
            k.this.f6397e.setVisibility(8);
            k.this.f6397e.setTransitioning(false);
            k kVar2 = k.this;
            kVar2.f6417y = null;
            kVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = k.this.f6396d;
            if (actionBarOverlayLayout != null) {
                u.E(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends c0 {
        b() {
        }

        @Override // androidx.core.view.b0
        public void b(View view) {
            k kVar = k.this;
            kVar.f6417y = null;
            kVar.f6397e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements androidx.core.view.d0 {
        c() {
        }

        @Override // androidx.core.view.d0
        public void a(View view) {
            ((View) k.this.f6397e.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends h.b implements e.a {

        /* renamed from: p  reason: collision with root package name */
        private final Context f6422p;

        /* renamed from: q  reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f6423q;

        /* renamed from: r  reason: collision with root package name */
        private b.a f6424r;

        /* renamed from: s  reason: collision with root package name */
        private WeakReference<View> f6425s;

        public d(Context context, b.a aVar) {
            this.f6422p = context;
            this.f6424r = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f6423q = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f6424r;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f6424r == null) {
                return;
            }
            k();
            k.this.f6399g.l();
        }

        @Override // h.b
        public void c() {
            k kVar = k.this;
            if (kVar.f6405m != this) {
                return;
            }
            if (k.w(kVar.f6413u, kVar.f6414v, false)) {
                this.f6424r.d(this);
            } else {
                k kVar2 = k.this;
                kVar2.f6406n = this;
                kVar2.f6407o = this.f6424r;
            }
            this.f6424r = null;
            k.this.v(false);
            k.this.f6399g.g();
            k.this.f6398f.l().sendAccessibilityEvent(32);
            k kVar3 = k.this;
            kVar3.f6396d.setHideOnContentScrollEnabled(kVar3.A);
            k.this.f6405m = null;
        }

        @Override // h.b
        public View d() {
            WeakReference<View> weakReference = this.f6425s;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // h.b
        public Menu e() {
            return this.f6423q;
        }

        @Override // h.b
        public MenuInflater f() {
            return new h.g(this.f6422p);
        }

        @Override // h.b
        public CharSequence g() {
            return k.this.f6399g.getSubtitle();
        }

        @Override // h.b
        public CharSequence i() {
            return k.this.f6399g.getTitle();
        }

        @Override // h.b
        public void k() {
            if (k.this.f6405m != this) {
                return;
            }
            this.f6423q.d0();
            try {
                this.f6424r.c(this, this.f6423q);
            } finally {
                this.f6423q.c0();
            }
        }

        @Override // h.b
        public boolean l() {
            return k.this.f6399g.j();
        }

        @Override // h.b
        public void m(View view) {
            k.this.f6399g.setCustomView(view);
            this.f6425s = new WeakReference<>(view);
        }

        @Override // h.b
        public void n(int i10) {
            o(k.this.f6393a.getResources().getString(i10));
        }

        @Override // h.b
        public void o(CharSequence charSequence) {
            k.this.f6399g.setSubtitle(charSequence);
        }

        @Override // h.b
        public void q(int i10) {
            r(k.this.f6393a.getResources().getString(i10));
        }

        @Override // h.b
        public void r(CharSequence charSequence) {
            k.this.f6399g.setTitle(charSequence);
        }

        @Override // h.b
        public void s(boolean z10) {
            super.s(z10);
            k.this.f6399g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f6423q.d0();
            try {
                return this.f6424r.b(this, this.f6423q);
            } finally {
                this.f6423q.c0();
            }
        }
    }

    public k(Activity activity, boolean z10) {
        this.f6395c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z10) {
            return;
        }
        this.f6400h = decorView.findViewById(16908290);
    }

    public k(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }

    private d0 A(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.f6415w) {
            this.f6415w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6396d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(c.f.decor_content_parent);
        this.f6396d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f6398f = A(view.findViewById(c.f.action_bar));
        this.f6399g = (ActionBarContextView) view.findViewById(c.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(c.f.action_bar_container);
        this.f6397e = actionBarContainer;
        d0 d0Var = this.f6398f;
        if (d0Var == null || this.f6399g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f6393a = d0Var.b();
        boolean z10 = (this.f6398f.p() & 4) != 0;
        if (z10) {
            this.f6404l = true;
        }
        h.a b10 = h.a.b(this.f6393a);
        J(b10.a() || z10);
        H(b10.g());
        TypedArray obtainStyledAttributes = this.f6393a.obtainStyledAttributes(null, c.j.f2972a, c.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(c.j.f3022k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(c.j.f3012i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z10) {
        this.f6410r = z10;
        if (z10) {
            this.f6397e.setTabContainer(null);
            this.f6398f.k(this.f6401i);
        } else {
            this.f6398f.k(null);
            this.f6397e.setTabContainer(this.f6401i);
        }
        boolean z11 = true;
        boolean z12 = B() == 2;
        p0 p0Var = this.f6401i;
        if (p0Var != null) {
            if (z12) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6396d;
                if (actionBarOverlayLayout != null) {
                    u.E(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f6398f.v(!this.f6410r && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6396d;
        if (this.f6410r || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    private boolean K() {
        return u.w(this.f6397e);
    }

    private void L() {
        if (this.f6415w) {
            return;
        }
        this.f6415w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6396d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z10) {
        if (w(this.f6413u, this.f6414v, this.f6415w)) {
            if (this.f6416x) {
                return;
            }
            this.f6416x = true;
            z(z10);
        } else if (this.f6416x) {
            this.f6416x = false;
            y(z10);
        }
    }

    static boolean w(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    public int B() {
        return this.f6398f.r();
    }

    public void E(boolean z10) {
        F(z10 ? 4 : 0, 4);
    }

    public void F(int i10, int i11) {
        int p10 = this.f6398f.p();
        if ((i11 & 4) != 0) {
            this.f6404l = true;
        }
        this.f6398f.o((i10 & i11) | ((~i11) & p10));
    }

    public void G(float f10) {
        u.L(this.f6397e, f10);
    }

    public void I(boolean z10) {
        if (z10 && !this.f6396d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f6396d.setHideOnContentScrollEnabled(z10);
    }

    public void J(boolean z10) {
        this.f6398f.m(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f6414v) {
            this.f6414v = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        h.h hVar = this.f6417y;
        if (hVar != null) {
            hVar.a();
            this.f6417y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i10) {
        this.f6411s = i10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z10) {
        this.f6412t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (this.f6414v) {
            return;
        }
        this.f6414v = true;
        M(true);
    }

    @Override // d.a
    public boolean h() {
        d0 d0Var = this.f6398f;
        if (d0Var == null || !d0Var.n()) {
            return false;
        }
        this.f6398f.collapseActionView();
        return true;
    }

    @Override // d.a
    public void i(boolean z10) {
        if (z10 == this.f6408p) {
            return;
        }
        this.f6408p = z10;
        int size = this.f6409q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6409q.get(i10).a(z10);
        }
    }

    @Override // d.a
    public int j() {
        return this.f6398f.p();
    }

    @Override // d.a
    public Context k() {
        if (this.f6394b == null) {
            TypedValue typedValue = new TypedValue();
            this.f6393a.getTheme().resolveAttribute(c.a.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f6394b = new ContextThemeWrapper(this.f6393a, i10);
            } else {
                this.f6394b = this.f6393a;
            }
        }
        return this.f6394b;
    }

    @Override // d.a
    public void m(Configuration configuration) {
        H(h.a.b(this.f6393a).g());
    }

    @Override // d.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f6405m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // d.a
    public void r(boolean z10) {
        if (this.f6404l) {
            return;
        }
        E(z10);
    }

    @Override // d.a
    public void s(boolean z10) {
        h.h hVar;
        this.f6418z = z10;
        if (z10 || (hVar = this.f6417y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // d.a
    public void t(CharSequence charSequence) {
        this.f6398f.setWindowTitle(charSequence);
    }

    @Override // d.a
    public h.b u(b.a aVar) {
        d dVar = this.f6405m;
        if (dVar != null) {
            dVar.c();
        }
        this.f6396d.setHideOnContentScrollEnabled(false);
        this.f6399g.k();
        d dVar2 = new d(this.f6399g.getContext(), aVar);
        if (dVar2.t()) {
            this.f6405m = dVar2;
            dVar2.k();
            this.f6399g.h(dVar2);
            v(true);
            this.f6399g.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    public void v(boolean z10) {
        a0 s10;
        a0 f10;
        if (z10) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z10) {
                this.f6398f.j(4);
                this.f6399g.setVisibility(0);
                return;
            }
            this.f6398f.j(0);
            this.f6399g.setVisibility(8);
            return;
        }
        if (z10) {
            f10 = this.f6398f.s(4, 100L);
            s10 = this.f6399g.f(0, 200L);
        } else {
            s10 = this.f6398f.s(0, 200L);
            f10 = this.f6399g.f(8, 100L);
        }
        h.h hVar = new h.h();
        hVar.d(f10, s10);
        hVar.h();
    }

    void x() {
        b.a aVar = this.f6407o;
        if (aVar != null) {
            aVar.d(this.f6406n);
            this.f6406n = null;
            this.f6407o = null;
        }
    }

    public void y(boolean z10) {
        View view;
        int[] iArr;
        h.h hVar = this.f6417y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f6411s != 0 || (!this.f6418z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f6397e.setAlpha(1.0f);
        this.f6397e.setTransitioning(true);
        h.h hVar2 = new h.h();
        float f10 = -this.f6397e.getHeight();
        if (z10) {
            this.f6397e.getLocationInWindow(new int[]{0, 0});
            f10 -= iArr[1];
        }
        a0 m10 = u.b(this.f6397e).m(f10);
        m10.k(this.D);
        hVar2.c(m10);
        if (this.f6412t && (view = this.f6400h) != null) {
            hVar2.c(u.b(view).m(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f6417y = hVar2;
        hVar2.h();
    }

    public void z(boolean z10) {
        View view;
        View view2;
        int[] iArr;
        h.h hVar = this.f6417y;
        if (hVar != null) {
            hVar.a();
        }
        this.f6397e.setVisibility(0);
        if (this.f6411s == 0 && (this.f6418z || z10)) {
            this.f6397e.setTranslationY(0.0f);
            float f10 = -this.f6397e.getHeight();
            if (z10) {
                this.f6397e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            this.f6397e.setTranslationY(f10);
            h.h hVar2 = new h.h();
            a0 m10 = u.b(this.f6397e).m(0.0f);
            m10.k(this.D);
            hVar2.c(m10);
            if (this.f6412t && (view2 = this.f6400h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(u.b(this.f6400h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f6417y = hVar2;
            hVar2.h();
        } else {
            this.f6397e.setAlpha(1.0f);
            this.f6397e.setTranslationY(0.0f);
            if (this.f6412t && (view = this.f6400h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6396d;
        if (actionBarOverlayLayout != null) {
            u.E(actionBarOverlayLayout);
        }
    }
}
