package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.l0;
import androidx.core.view.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int I = c.g.abc_popup_menu_item_layout;
    View A;
    private j.a B;
    ViewTreeObserver C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean H;

    /* renamed from: o  reason: collision with root package name */
    private final Context f642o;

    /* renamed from: p  reason: collision with root package name */
    private final e f643p;

    /* renamed from: q  reason: collision with root package name */
    private final d f644q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f645r;

    /* renamed from: s  reason: collision with root package name */
    private final int f646s;

    /* renamed from: t  reason: collision with root package name */
    private final int f647t;

    /* renamed from: u  reason: collision with root package name */
    private final int f648u;

    /* renamed from: v  reason: collision with root package name */
    final l0 f649v;

    /* renamed from: y  reason: collision with root package name */
    private PopupWindow.OnDismissListener f652y;

    /* renamed from: z  reason: collision with root package name */
    private View f653z;

    /* renamed from: w  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f650w = new a();

    /* renamed from: x  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f651x = new b();
    private int G = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.c() || l.this.f649v.x()) {
                return;
            }
            View view = l.this.A;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f649v.a();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.C = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.C.removeGlobalOnLayoutListener(lVar.f650w);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f642o = context;
        this.f643p = eVar;
        this.f645r = z10;
        this.f644q = new d(eVar, LayoutInflater.from(context), z10, I);
        this.f647t = i10;
        this.f648u = i11;
        Resources resources = context.getResources();
        this.f646s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.d.abc_config_prefDialogWidth));
        this.f653z = view;
        this.f649v = new l0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.D || (view = this.f653z) == null) {
            return false;
        }
        this.A = view;
        this.f649v.G(this);
        this.f649v.H(this);
        this.f649v.F(true);
        View view2 = this.A;
        boolean z10 = this.C == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.C = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f650w);
        }
        view2.addOnAttachStateChangeListener(this.f651x);
        this.f649v.z(view2);
        this.f649v.C(this.G);
        if (!this.E) {
            this.F = h.o(this.f644q, null, this.f642o, this.f646s);
            this.E = true;
        }
        this.f649v.B(this.F);
        this.f649v.E(2);
        this.f649v.D(n());
        this.f649v.a();
        ListView g10 = this.f649v.g();
        g10.setOnKeyListener(this);
        if (this.H && this.f643p.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f642o).inflate(c.g.abc_popup_menu_header_item_layout, (ViewGroup) g10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f643p.x());
            }
            frameLayout.setEnabled(false);
            g10.addHeaderView(frameLayout, null, false);
        }
        this.f649v.p(this.f644q);
        this.f649v.a();
        return true;
    }

    @Override // i.e
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f643p) {
            return;
        }
        dismiss();
        j.a aVar = this.B;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // i.e
    public boolean c() {
        return !this.D && this.f649v.c();
    }

    @Override // i.e
    public void dismiss() {
        if (c()) {
            this.f649v.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f642o, mVar, this.A, this.f645r, this.f647t, this.f648u);
            iVar.j(this.B);
            iVar.g(h.x(mVar));
            iVar.i(this.f652y);
            this.f652y = null;
            this.f643p.e(false);
            int d10 = this.f649v.d();
            int n10 = this.f649v.n();
            if ((Gravity.getAbsoluteGravity(this.G, u.n(this.f653z)) & 7) == 5) {
                d10 += this.f653z.getWidth();
            }
            if (iVar.n(d10, n10)) {
                j.a aVar = this.B;
                if (aVar != null) {
                    aVar.c(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        this.E = false;
        d dVar = this.f644q;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // i.e
    public ListView g() {
        return this.f649v.g();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.B = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.D = true;
        this.f643p.close();
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.C = this.A.getViewTreeObserver();
            }
            this.C.removeGlobalOnLayoutListener(this.f650w);
            this.C = null;
        }
        this.A.removeOnAttachStateChangeListener(this.f651x);
        PopupWindow.OnDismissListener onDismissListener = this.f652y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f653z = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f644q.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.G = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f649v.l(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f652y = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.H = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f649v.j(i10);
    }
}
