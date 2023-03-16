package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class a implements o.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f8164a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8165b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8166c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f8167d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f8168e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f8169f;

    /* renamed from: g  reason: collision with root package name */
    private char f8170g;

    /* renamed from: i  reason: collision with root package name */
    private char f8172i;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f8174k;

    /* renamed from: l  reason: collision with root package name */
    private Context f8175l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f8176m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f8177n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f8178o;

    /* renamed from: h  reason: collision with root package name */
    private int f8171h = 4096;

    /* renamed from: j  reason: collision with root package name */
    private int f8173j = 4096;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f8179p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f8180q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8181r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8182s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f8183t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f8175l = context;
        this.f8164a = i11;
        this.f8165b = i10;
        this.f8166c = i13;
        this.f8167d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f8174k;
        if (drawable != null) {
            if (this.f8181r || this.f8182s) {
                Drawable p10 = androidx.core.graphics.drawable.a.p(drawable);
                this.f8174k = p10;
                Drawable mutate = p10.mutate();
                this.f8174k = mutate;
                if (this.f8181r) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f8179p);
                }
                if (this.f8182s) {
                    androidx.core.graphics.drawable.a.o(this.f8174k, this.f8180q);
                }
            }
        }
    }

    @Override // o.b
    public o.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // o.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // o.b, android.view.MenuItem
    /* renamed from: d */
    public o.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // o.b, android.view.MenuItem
    /* renamed from: e */
    public o.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // o.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // o.b, android.view.MenuItem
    /* renamed from: f */
    public o.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f8173j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f8172i;
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f8177n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f8165b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f8174k;
    }

    @Override // o.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8179p;
    }

    @Override // o.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8180q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f8169f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f8164a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f8171h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f8170g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f8166c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f8167d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8168e;
        return charSequence != null ? charSequence : this.f8167d;
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8178o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // o.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f8183t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f8183t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f8183t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f8183t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f8172i = Character.toLowerCase(c10);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f8172i = Character.toLowerCase(c10);
        this.f8173j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f8183t = (z10 ? 1 : 0) | (this.f8183t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f8183t = (z10 ? 2 : 0) | (this.f8183t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public o.b setContentDescription(CharSequence charSequence) {
        this.f8177n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f8183t = (z10 ? 16 : 0) | (this.f8183t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f8174k = androidx.core.content.a.f(this.f8175l, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f8174k = drawable;
        c();
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8179p = colorStateList;
        this.f8181r = true;
        c();
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8180q = mode;
        this.f8182s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f8169f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f8170g = c10;
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f8170g = c10;
        this.f8171h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8176m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f8170g = c10;
        this.f8172i = Character.toLowerCase(c11);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f8170g = c10;
        this.f8171h = KeyEvent.normalizeMetaState(i10);
        this.f8172i = Character.toLowerCase(c11);
        this.f8173j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f8167d = this.f8175l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8167d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8168e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public o.b setTooltipText(CharSequence charSequence) {
        this.f8178o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f8183t = (this.f8183t & 8) | (z10 ? 0 : 8);
        return this;
    }
}
