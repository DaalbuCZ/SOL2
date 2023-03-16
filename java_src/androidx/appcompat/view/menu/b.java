package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import androidx.core.view.u;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int O = c.g.abc_cascading_menu_item_layout;
    private View B;
    View C;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private boolean J;
    private j.a K;
    ViewTreeObserver L;
    private PopupWindow.OnDismissListener M;
    boolean N;

    /* renamed from: o  reason: collision with root package name */
    private final Context f532o;

    /* renamed from: p  reason: collision with root package name */
    private final int f533p;

    /* renamed from: q  reason: collision with root package name */
    private final int f534q;

    /* renamed from: r  reason: collision with root package name */
    private final int f535r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f536s;

    /* renamed from: t  reason: collision with root package name */
    final Handler f537t;

    /* renamed from: u  reason: collision with root package name */
    private final List<e> f538u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    final List<d> f539v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f540w = new a();

    /* renamed from: x  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f541x = new View$OnAttachStateChangeListenerC0010b();

    /* renamed from: y  reason: collision with root package name */
    private final k0 f542y = new c();

    /* renamed from: z  reason: collision with root package name */
    private int f543z = 0;
    private int A = 0;
    private boolean I = false;
    private int D = D();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.c() || b.this.f539v.size() <= 0 || b.this.f539v.get(0).f551a.x()) {
                return;
            }
            View view = b.this.C;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            for (d dVar : b.this.f539v) {
                dVar.f551a.a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0010b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0010b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.L;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.L = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.L.removeGlobalOnLayoutListener(bVar.f540w);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements k0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ d f547n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ MenuItem f548o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ e f549p;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f547n = dVar;
                this.f548o = menuItem;
                this.f549p = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f547n;
                if (dVar != null) {
                    b.this.N = true;
                    dVar.f552b.e(false);
                    b.this.N = false;
                }
                if (this.f548o.isEnabled() && this.f548o.hasSubMenu()) {
                    this.f549p.L(this.f548o, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void b(e eVar, MenuItem menuItem) {
            b.this.f537t.removeCallbacksAndMessages(null);
            int size = b.this.f539v.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f539v.get(i10).f552b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f537t.postAtTime(new a(i11 < b.this.f539v.size() ? b.this.f539v.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void e(e eVar, MenuItem menuItem) {
            b.this.f537t.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final l0 f551a;

        /* renamed from: b  reason: collision with root package name */
        public final e f552b;

        /* renamed from: c  reason: collision with root package name */
        public final int f553c;

        public d(l0 l0Var, e eVar, int i10) {
            this.f551a = l0Var;
            this.f552b = eVar;
            this.f553c = i10;
        }

        public ListView a() {
            return this.f551a.g();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f532o = context;
        this.B = view;
        this.f534q = i10;
        this.f535r = i11;
        this.f536s = z10;
        Resources resources = context.getResources();
        this.f533p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.d.abc_config_prefDialogWidth));
        this.f537t = new Handler();
    }

    private int A(e eVar) {
        int size = this.f539v.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f539v.get(i10).f552b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i10;
        int firstVisiblePosition;
        MenuItem B = B(dVar.f552b, eVar);
        if (B == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (B == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return u.n(this.B) == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List<d> list = this.f539v;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.C.getWindowVisibleDisplayFrame(rect);
        return this.D == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f532o);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f536s, O);
        if (!c() && this.I) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(h.x(eVar));
        }
        int o10 = h.o(dVar2, null, this.f532o, this.f533p);
        l0 z10 = z();
        z10.p(dVar2);
        z10.B(o10);
        z10.C(this.A);
        if (this.f539v.size() > 0) {
            List<d> list = this.f539v;
            dVar = list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z10.Q(false);
            z10.N(null);
            int E = E(o10);
            boolean z11 = E == 1;
            this.D = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z10.z(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.B.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.A & 7) == 5) {
                    iArr[0] = iArr[0] + this.B.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.A & 5) == 5) {
                if (!z11) {
                    o10 = view.getWidth();
                    i12 = i10 - o10;
                }
                i12 = i10 + o10;
            } else {
                if (z11) {
                    o10 = view.getWidth();
                    i12 = i10 + o10;
                }
                i12 = i10 - o10;
            }
            z10.l(i12);
            z10.I(true);
            z10.j(i11);
        } else {
            if (this.E) {
                z10.l(this.G);
            }
            if (this.F) {
                z10.j(this.H);
            }
            z10.D(n());
        }
        this.f539v.add(new d(z10, eVar, this.D));
        z10.a();
        ListView g10 = z10.g();
        g10.setOnKeyListener(this);
        if (dVar == null && this.J && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(c.g.abc_popup_menu_header_item_layout, (ViewGroup) g10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            g10.addHeaderView(frameLayout, null, false);
            z10.a();
        }
    }

    private l0 z() {
        l0 l0Var = new l0(this.f532o, null, this.f534q, this.f535r);
        l0Var.P(this.f542y);
        l0Var.H(this);
        l0Var.G(this);
        l0Var.z(this.B);
        l0Var.C(this.A);
        l0Var.F(true);
        l0Var.E(2);
        return l0Var;
    }

    @Override // i.e
    public void a() {
        if (c()) {
            return;
        }
        for (e eVar : this.f538u) {
            F(eVar);
        }
        this.f538u.clear();
        View view = this.B;
        this.C = view;
        if (view != null) {
            boolean z10 = this.L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.L = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f540w);
            }
            this.C.addOnAttachStateChangeListener(this.f541x);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int A = A(eVar);
        if (A < 0) {
            return;
        }
        int i10 = A + 1;
        if (i10 < this.f539v.size()) {
            this.f539v.get(i10).f552b.e(false);
        }
        d remove = this.f539v.remove(A);
        remove.f552b.O(this);
        if (this.N) {
            remove.f551a.O(null);
            remove.f551a.A(0);
        }
        remove.f551a.dismiss();
        int size = this.f539v.size();
        this.D = size > 0 ? this.f539v.get(size - 1).f553c : D();
        if (size != 0) {
            if (z10) {
                this.f539v.get(0).f552b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.K;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.L.removeGlobalOnLayoutListener(this.f540w);
            }
            this.L = null;
        }
        this.C.removeOnAttachStateChangeListener(this.f541x);
        this.M.onDismiss();
    }

    @Override // i.e
    public boolean c() {
        return this.f539v.size() > 0 && this.f539v.get(0).f551a.c();
    }

    @Override // i.e
    public void dismiss() {
        int size = this.f539v.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f539v.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f551a.c()) {
                    dVar.f551a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.f539v) {
            if (mVar == dVar.f552b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            l(mVar);
            j.a aVar = this.K;
            if (aVar != null) {
                aVar.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        for (d dVar : this.f539v) {
            h.y(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // i.e
    public ListView g() {
        if (this.f539v.isEmpty()) {
            return null;
        }
        List<d> list = this.f539v;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.K = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f532o);
        if (c()) {
            F(eVar);
        } else {
            this.f538u.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f539v.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f539v.get(i10);
            if (!dVar.f551a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f552b.e(false);
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
        if (this.B != view) {
            this.B = view;
            this.A = androidx.core.view.d.a(this.f543z, u.n(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.I = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f543z != i10) {
            this.f543z = i10;
            this.A = androidx.core.view.d.a(i10, u.n(this.B));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.E = true;
        this.G = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.M = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.J = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.F = true;
        this.H = i10;
    }
}
