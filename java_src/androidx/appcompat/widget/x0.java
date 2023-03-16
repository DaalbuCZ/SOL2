package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public class x0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1063a;

    /* renamed from: b  reason: collision with root package name */
    private int f1064b;

    /* renamed from: c  reason: collision with root package name */
    private View f1065c;

    /* renamed from: d  reason: collision with root package name */
    private View f1066d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1067e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1068f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1069g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1070h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1071i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1072j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1073k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1074l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1075m;

    /* renamed from: n  reason: collision with root package name */
    private c f1076n;

    /* renamed from: o  reason: collision with root package name */
    private int f1077o;

    /* renamed from: p  reason: collision with root package name */
    private int f1078p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1079q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: n  reason: collision with root package name */
        final i.a f1080n;

        a() {
            this.f1080n = new i.a(x0.this.f1063a.getContext(), 0, 16908332, 0, 0, x0.this.f1071i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f1074l;
            if (callback == null || !x0Var.f1075m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1080n);
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.c0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1082a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1083b;

        b(int i10) {
            this.f1083b = i10;
        }

        @Override // androidx.core.view.c0, androidx.core.view.b0
        public void a(View view) {
            this.f1082a = true;
        }

        @Override // androidx.core.view.b0
        public void b(View view) {
            if (this.f1082a) {
                return;
            }
            x0.this.f1063a.setVisibility(this.f1083b);
        }

        @Override // androidx.core.view.c0, androidx.core.view.b0
        public void c(View view) {
            x0.this.f1063a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, c.h.abc_action_bar_up_description, c.e.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1077o = 0;
        this.f1078p = 0;
        this.f1063a = toolbar;
        this.f1071i = toolbar.getTitle();
        this.f1072j = toolbar.getSubtitle();
        this.f1070h = this.f1071i != null;
        this.f1069g = toolbar.getNavigationIcon();
        w0 u10 = w0.u(toolbar.getContext(), null, c.j.f2972a, c.a.actionBarStyle, 0);
        this.f1079q = u10.f(c.j.f3027l);
        if (z10) {
            CharSequence o10 = u10.o(c.j.f3057r);
            if (!TextUtils.isEmpty(o10)) {
                E(o10);
            }
            CharSequence o11 = u10.o(c.j.f3047p);
            if (!TextUtils.isEmpty(o11)) {
                D(o11);
            }
            Drawable f10 = u10.f(c.j.f3037n);
            if (f10 != null) {
                z(f10);
            }
            Drawable f11 = u10.f(c.j.f3032m);
            if (f11 != null) {
                setIcon(f11);
            }
            if (this.f1069g == null && (drawable = this.f1079q) != null) {
                C(drawable);
            }
            o(u10.j(c.j.f3007h, 0));
            int m10 = u10.m(c.j.f3002g, 0);
            if (m10 != 0) {
                x(LayoutInflater.from(this.f1063a.getContext()).inflate(m10, (ViewGroup) this.f1063a, false));
                o(this.f1064b | 16);
            }
            int l10 = u10.l(c.j.f3017j, 0);
            if (l10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1063a.getLayoutParams();
                layoutParams.height = l10;
                this.f1063a.setLayoutParams(layoutParams);
            }
            int d10 = u10.d(c.j.f2997f, -1);
            int d11 = u10.d(c.j.f2992e, -1);
            if (d10 >= 0 || d11 >= 0) {
                this.f1063a.H(Math.max(d10, 0), Math.max(d11, 0));
            }
            int m11 = u10.m(c.j.f3062s, 0);
            if (m11 != 0) {
                Toolbar toolbar2 = this.f1063a;
                toolbar2.K(toolbar2.getContext(), m11);
            }
            int m12 = u10.m(c.j.f3052q, 0);
            if (m12 != 0) {
                Toolbar toolbar3 = this.f1063a;
                toolbar3.J(toolbar3.getContext(), m12);
            }
            int m13 = u10.m(c.j.f3042o, 0);
            if (m13 != 0) {
                this.f1063a.setPopupTheme(m13);
            }
        } else {
            this.f1064b = w();
        }
        u10.v();
        y(i10);
        this.f1073k = this.f1063a.getNavigationContentDescription();
        this.f1063a.setNavigationOnClickListener(new a());
    }

    private void F(CharSequence charSequence) {
        this.f1071i = charSequence;
        if ((this.f1064b & 8) != 0) {
            this.f1063a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.f1064b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1073k)) {
                this.f1063a.setNavigationContentDescription(this.f1078p);
            } else {
                this.f1063a.setNavigationContentDescription(this.f1073k);
            }
        }
    }

    private void H() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1064b & 4) != 0) {
            toolbar = this.f1063a;
            drawable = this.f1069g;
            if (drawable == null) {
                drawable = this.f1079q;
            }
        } else {
            toolbar = this.f1063a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f1064b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1068f) == null) {
            drawable = this.f1067e;
        }
        this.f1063a.setLogo(drawable);
    }

    private int w() {
        if (this.f1063a.getNavigationIcon() != null) {
            this.f1079q = this.f1063a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public void A(int i10) {
        B(i10 == 0 ? null : b().getString(i10));
    }

    public void B(CharSequence charSequence) {
        this.f1073k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.f1069g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.f1072j = charSequence;
        if ((this.f1064b & 8) != 0) {
            this.f1063a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.f1070h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, j.a aVar) {
        if (this.f1076n == null) {
            c cVar = new c(this.f1063a.getContext());
            this.f1076n = cVar;
            cVar.p(c.f.action_menu_presenter);
        }
        this.f1076n.k(aVar);
        this.f1063a.I((androidx.appcompat.view.menu.e) menu, this.f1076n);
    }

    @Override // androidx.appcompat.widget.d0
    public Context b() {
        return this.f1063a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        return this.f1063a.A();
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.f1063a.e();
    }

    @Override // androidx.appcompat.widget.d0
    public void d() {
        this.f1075m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.f1063a.z();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.f1063a.w();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        return this.f1063a.N();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.f1063a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean h() {
        return this.f1063a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public void i() {
        this.f1063a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public void j(int i10) {
        this.f1063a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.d0
    public void k(p0 p0Var) {
        View view = this.f1065c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1063a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1065c);
            }
        }
        this.f1065c = p0Var;
        if (p0Var == null || this.f1077o != 2) {
            return;
        }
        this.f1063a.addView(p0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1065c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f6285a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup l() {
        return this.f1063a;
    }

    @Override // androidx.appcompat.widget.d0
    public void m(boolean z10) {
    }

    @Override // androidx.appcompat.widget.d0
    public boolean n() {
        return this.f1063a.v();
    }

    @Override // androidx.appcompat.widget.d0
    public void o(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1064b ^ i10;
        this.f1064b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1063a.setTitle(this.f1071i);
                    toolbar = this.f1063a;
                    charSequence = this.f1072j;
                } else {
                    charSequence = null;
                    this.f1063a.setTitle((CharSequence) null);
                    toolbar = this.f1063a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1066d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1063a.addView(view);
            } else {
                this.f1063a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.d0
    public int p() {
        return this.f1064b;
    }

    @Override // androidx.appcompat.widget.d0
    public void q(int i10) {
        z(i10 != 0 ? e.a.d(b(), i10) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public int r() {
        return this.f1077o;
    }

    @Override // androidx.appcompat.widget.d0
    public androidx.core.view.a0 s(int i10, long j10) {
        return androidx.core.view.u.b(this.f1063a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? e.a.d(b(), i10) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.f1067e = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.f1074l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1070h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void v(boolean z10) {
        this.f1063a.setCollapsible(z10);
    }

    public void x(View view) {
        View view2 = this.f1066d;
        if (view2 != null && (this.f1064b & 16) != 0) {
            this.f1063a.removeView(view2);
        }
        this.f1066d = view;
        if (view == null || (this.f1064b & 16) == 0) {
            return;
        }
        this.f1063a.addView(view);
    }

    public void y(int i10) {
        if (i10 == this.f1078p) {
            return;
        }
        this.f1078p = i10;
        if (TextUtils.isEmpty(this.f1063a.getNavigationContentDescription())) {
            A(this.f1078p);
        }
    }

    public void z(Drawable drawable) {
        this.f1068f = drawable;
        I();
    }
}
