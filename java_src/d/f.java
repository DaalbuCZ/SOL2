package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e;
import h.b;
/* loaded from: classes.dex */
public class f extends Dialog implements c {

    /* renamed from: n  reason: collision with root package name */
    private d f6359n;

    /* renamed from: o  reason: collision with root package name */
    private final e.a f6360o;

    /* loaded from: classes.dex */
    class a implements e.a {
        a() {
        }

        @Override // androidx.core.view.e.a
        public boolean c(KeyEvent keyEvent) {
            return f.this.c(keyEvent);
        }
    }

    public f(Context context, int i10) {
        super(context, b(context, i10));
        this.f6360o = new a();
        d a10 = a();
        a10.D(b(context, i10));
        a10.q(null);
    }

    private static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(c.a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    public d a() {
        if (this.f6359n == null) {
            this.f6359n = d.h(this, this);
        }
        return this.f6359n;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d.c
    public h.b d(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.e.e(this.f6360o, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i10) {
        return a().z(i10);
    }

    @Override // d.c
    public void f(h.b bVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().i(i10);
    }

    @Override // d.c
    public void h(h.b bVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().A(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().E(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().E(charSequence);
    }
}
