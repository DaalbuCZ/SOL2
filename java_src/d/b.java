package d;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.b1;
import androidx.core.app.r;
import h.b;
/* loaded from: classes.dex */
public class b extends androidx.fragment.app.d implements c, r.a {
    private d E;
    private Resources F;

    private boolean E(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(int i10) {
    }

    public void B(r rVar) {
    }

    @Deprecated
    public void C() {
    }

    public boolean D() {
        Intent e10 = e();
        if (e10 != null) {
            if (!G(e10)) {
                F(e10);
                return true;
            }
            r k10 = r.k(this);
            z(k10);
            B(k10);
            k10.l();
            try {
                androidx.core.app.b.o(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    public void F(Intent intent) {
        androidx.core.app.i.e(this, intent);
    }

    public boolean G(Intent intent) {
        return androidx.core.app.i.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(x().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a y10 = y();
        if (getWindow().hasFeature(0)) {
            if (y10 == null || !y10.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // d.c
    public h.b d(b.a aVar) {
        return null;
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a y10 = y();
        if (keyCode == 82 && y10 != null && y10.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.r.a
    public Intent e() {
        return androidx.core.app.i.a(this);
    }

    @Override // d.c
    public void f(h.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) x().i(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return x().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.F == null && b1.b()) {
            this.F = new b1(this, super.getResources());
        }
        Resources resources = this.F;
        return resources == null ? super.getResources() : resources;
    }

    @Override // d.c
    public void h(h.b bVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        x().o();
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.F != null) {
            this.F.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        x().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        d x10 = x();
        x10.n();
        x10.q(bundle);
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        x().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (E(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a y10 = y();
        if (menuItem.getItemId() != 16908332 || y10 == null || (y10.j() & 4) == 0) {
            return false;
        }
        return D();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        x().s(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        x().t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        x().u(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStart() {
        super.onStart();
        x().v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        super.onStop();
        x().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        x().E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a y10 = y();
        if (getWindow().hasFeature(0)) {
            if (y10 == null || !y10.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        x().A(i10);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        x().B(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        x().D(i10);
    }

    @Override // androidx.fragment.app.d
    public void w() {
        x().o();
    }

    public d x() {
        if (this.E == null) {
            this.E = d.g(this, this);
        }
        return this.E;
    }

    public a y() {
        return x().m();
    }

    public void z(r rVar) {
        rVar.g(this);
    }
}
