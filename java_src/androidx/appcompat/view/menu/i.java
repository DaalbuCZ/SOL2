package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.u;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f629a;

    /* renamed from: b  reason: collision with root package name */
    private final e f630b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f631c;

    /* renamed from: d  reason: collision with root package name */
    private final int f632d;

    /* renamed from: e  reason: collision with root package name */
    private final int f633e;

    /* renamed from: f  reason: collision with root package name */
    private View f634f;

    /* renamed from: g  reason: collision with root package name */
    private int f635g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f636h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f637i;

    /* renamed from: j  reason: collision with root package name */
    private h f638j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f639k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f640l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f635g = 8388611;
        this.f640l = new a();
        this.f629a = context;
        this.f630b = eVar;
        this.f634f = view;
        this.f631c = z10;
        this.f632d = i10;
        this.f633e = i11;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f629a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        h bVar = Math.min(point.x, point.y) >= this.f629a.getResources().getDimensionPixelSize(c.d.abc_cascading_menus_min_smallest_width) ? new b(this.f629a, this.f634f, this.f632d, this.f633e, this.f631c) : new l(this.f629a, this.f630b, this.f634f, this.f632d, this.f633e, this.f631c);
        bVar.l(this.f630b);
        bVar.u(this.f640l);
        bVar.p(this.f634f);
        bVar.k(this.f637i);
        bVar.r(this.f636h);
        bVar.s(this.f635g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.v(z11);
        if (z10) {
            if ((androidx.core.view.d.a(this.f635g, u.n(this.f634f)) & 7) == 5) {
                i10 -= this.f634f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f629a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.a();
    }

    public void b() {
        if (d()) {
            this.f638j.dismiss();
        }
    }

    public h c() {
        if (this.f638j == null) {
            this.f638j = a();
        }
        return this.f638j;
    }

    public boolean d() {
        h hVar = this.f638j;
        return hVar != null && hVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f638j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f639k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f634f = view;
    }

    public void g(boolean z10) {
        this.f636h = z10;
        h hVar = this.f638j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f635g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f639k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f637i = aVar;
        h hVar = this.f638j;
        if (hVar != null) {
            hVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f634f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f634f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
