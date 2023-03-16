package h;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import h.b;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: p  reason: collision with root package name */
    private Context f7581p;

    /* renamed from: q  reason: collision with root package name */
    private ActionBarContextView f7582q;

    /* renamed from: r  reason: collision with root package name */
    private b.a f7583r;

    /* renamed from: s  reason: collision with root package name */
    private WeakReference<View> f7584s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f7585t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7586u;

    /* renamed from: v  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f7587v;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f7581p = context;
        this.f7582q = actionBarContextView;
        this.f7583r = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f7587v = S;
        S.R(this);
        this.f7586u = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f7583r.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f7582q.l();
    }

    @Override // h.b
    public void c() {
        if (this.f7585t) {
            return;
        }
        this.f7585t = true;
        this.f7582q.sendAccessibilityEvent(32);
        this.f7583r.d(this);
    }

    @Override // h.b
    public View d() {
        WeakReference<View> weakReference = this.f7584s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // h.b
    public Menu e() {
        return this.f7587v;
    }

    @Override // h.b
    public MenuInflater f() {
        return new g(this.f7582q.getContext());
    }

    @Override // h.b
    public CharSequence g() {
        return this.f7582q.getSubtitle();
    }

    @Override // h.b
    public CharSequence i() {
        return this.f7582q.getTitle();
    }

    @Override // h.b
    public void k() {
        this.f7583r.c(this, this.f7587v);
    }

    @Override // h.b
    public boolean l() {
        return this.f7582q.j();
    }

    @Override // h.b
    public void m(View view) {
        this.f7582q.setCustomView(view);
        this.f7584s = view != null ? new WeakReference<>(view) : null;
    }

    @Override // h.b
    public void n(int i10) {
        o(this.f7581p.getString(i10));
    }

    @Override // h.b
    public void o(CharSequence charSequence) {
        this.f7582q.setSubtitle(charSequence);
    }

    @Override // h.b
    public void q(int i10) {
        r(this.f7581p.getString(i10));
    }

    @Override // h.b
    public void r(CharSequence charSequence) {
        this.f7582q.setTitle(charSequence);
    }

    @Override // h.b
    public void s(boolean z10) {
        super.s(z10);
        this.f7582q.setTitleOptional(z10);
    }
}
