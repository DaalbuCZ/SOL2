package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
/* loaded from: classes.dex */
public final class g implements o.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f601a;

    /* renamed from: b  reason: collision with root package name */
    private final int f602b;

    /* renamed from: c  reason: collision with root package name */
    private final int f603c;

    /* renamed from: d  reason: collision with root package name */
    private final int f604d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f605e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f606f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f607g;

    /* renamed from: h  reason: collision with root package name */
    private char f608h;

    /* renamed from: j  reason: collision with root package name */
    private char f610j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f612l;

    /* renamed from: n  reason: collision with root package name */
    e f614n;

    /* renamed from: o  reason: collision with root package name */
    private m f615o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f616p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f617q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f618r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f619s;

    /* renamed from: z  reason: collision with root package name */
    private int f626z;

    /* renamed from: i  reason: collision with root package name */
    private int f609i = 4096;

    /* renamed from: k  reason: collision with root package name */
    private int f611k = 4096;

    /* renamed from: m  reason: collision with root package name */
    private int f613m = 0;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f620t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f621u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f622v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f623w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f624x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f625y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.InterfaceC0034b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0034b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f614n.J(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f626z = 0;
        this.f614n = eVar;
        this.f601a = i11;
        this.f602b = i10;
        this.f603c = i12;
        this.f604d = i13;
        this.f605e = charSequence;
        this.f626z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f624x && (this.f622v || this.f623w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.f622v) {
                androidx.core.graphics.drawable.a.n(drawable, this.f620t);
            }
            if (this.f623w) {
                androidx.core.graphics.drawable.a.o(drawable, this.f621u);
            }
            this.f624x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f614n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f626z & 4) == 4;
    }

    @Override // o.b
    public o.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f614n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // o.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f614n.I(this);
    }

    @Override // o.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f626z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f614n.f(this);
        }
        return false;
    }

    @Override // o.b, android.view.MenuItem
    public boolean expandActionView() {
        if (j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f614n.k(this);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f604d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        return this.f614n.G() ? this.f610j : this.f608h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.A = d10;
            return d10;
        }
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f611k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f610j;
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f618r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f602b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f612l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f613m != 0) {
            Drawable d10 = e.a.d(this.f614n.u(), this.f613m);
            this.f613m = 0;
            this.f612l = d10;
            return e(d10);
        }
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f620t;
    }

    @Override // o.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f621u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f607g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f601a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // o.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f609i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f608h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f603c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f615o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f605e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f606f;
        if (charSequence == null) {
            charSequence = this.f605e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f619s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f614n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f614n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(c.h.abc_prepend_shortcut_label));
        }
        int i11 = this.f614n.G() ? this.f611k : this.f609i;
        d(sb, i11, 65536, resources.getString(c.h.abc_menu_meta_shortcut_label));
        d(sb, i11, 4096, resources.getString(c.h.abc_menu_ctrl_shortcut_label));
        d(sb, i11, 2, resources.getString(c.h.abc_menu_alt_shortcut_label));
        d(sb, i11, 1, resources.getString(c.h.abc_menu_shift_shortcut_label));
        d(sb, i11, 4, resources.getString(c.h.abc_menu_sym_shortcut_label));
        d(sb, i11, 8, resources.getString(c.h.abc_menu_function_shortcut_label));
        if (g10 == '\b') {
            i10 = c.h.abc_menu_delete_shortcut_label;
        } else if (g10 == '\n') {
            i10 = c.h.abc_menu_enter_shortcut_label;
        } else if (g10 != ' ') {
            sb.append(g10);
            return sb.toString();
        } else {
            i10 = c.h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i10));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f615o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // o.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f625y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f625y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f625y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f625y & 8) == 0 : (this.f625y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f626z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f617q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f614n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f616p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f607g != null) {
                try {
                    this.f614n.u().startActivity(this.f607g);
                    return true;
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            androidx.core.view.b bVar = this.B;
            return bVar != null && bVar.e();
        }
        return true;
    }

    public boolean l() {
        return (this.f625y & 32) == 32;
    }

    public boolean m() {
        return (this.f625y & 4) != 0;
    }

    public boolean n() {
        return (this.f626z & 1) == 1;
    }

    public boolean o() {
        return (this.f626z & 2) == 2;
    }

    @Override // o.b, android.view.MenuItem
    /* renamed from: p */
    public o.b setActionView(int i10) {
        Context u10 = this.f614n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // o.b, android.view.MenuItem
    /* renamed from: q */
    public o.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f601a) > 0) {
            view.setId(i10);
        }
        this.f614n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f614n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f625y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f625y = i11;
        if (i10 != i11) {
            this.f614n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f610j == c10) {
            return this;
        }
        this.f610j = Character.toLowerCase(c10);
        this.f614n.K(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f610j == c10 && this.f611k == i10) {
            return this;
        }
        this.f610j = Character.toLowerCase(c10);
        this.f611k = KeyEvent.normalizeMetaState(i10);
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f625y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f625y = i11;
        if (i10 != i11) {
            this.f614n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f625y & 4) != 0) {
            this.f614n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public o.b setContentDescription(CharSequence charSequence) {
        this.f618r = charSequence;
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f625y = z10 ? this.f625y | 16 : this.f625y & (-17);
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f612l = null;
        this.f613m = i10;
        this.f624x = true;
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f613m = 0;
        this.f612l = drawable;
        this.f624x = true;
        this.f614n.K(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f620t = colorStateList;
        this.f622v = true;
        this.f624x = true;
        this.f614n.K(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f621u = mode;
        this.f623w = true;
        this.f624x = true;
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f607g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f608h == c10) {
            return this;
        }
        this.f608h = c10;
        this.f614n.K(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f608h == c10 && this.f609i == i10) {
            return this;
        }
        this.f608h = c10;
        this.f609i = KeyEvent.normalizeMetaState(i10);
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f617q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f608h = c10;
        this.f610j = Character.toLowerCase(c11);
        this.f614n.K(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f608h = c10;
        this.f609i = KeyEvent.normalizeMetaState(i10);
        this.f610j = Character.toLowerCase(c11);
        this.f611k = KeyEvent.normalizeMetaState(i11);
        this.f614n.K(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f626z = i10;
        this.f614n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f614n.u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f605e = charSequence;
        this.f614n.K(false);
        m mVar = this.f615o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f606f = charSequence;
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public o.b setTooltipText(CharSequence charSequence) {
        this.f619s = charSequence;
        this.f614n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f614n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f625y = (z10 ? 4 : 0) | (this.f625y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f605e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f625y = z10 ? this.f625y | 32 : this.f625y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // o.b, android.view.MenuItem
    /* renamed from: w */
    public o.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f615o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f625y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f625y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f614n.A();
    }
}
