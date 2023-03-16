package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.e;
import androidx.lifecycle.e;
import androidx.lifecycle.s;
/* loaded from: classes.dex */
public class g extends Activity implements androidx.lifecycle.i, e.a {

    /* renamed from: n  reason: collision with root package name */
    private m.g<Class<Object>, Object> f1178n = new m.g<>();

    /* renamed from: o  reason: collision with root package name */
    private androidx.lifecycle.j f1179o = new androidx.lifecycle.j(this);

    @Override // androidx.core.view.e.a
    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.e.d(decorView, keyEvent)) {
            return androidx.core.view.e.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.e.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f1179o.j(e.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
