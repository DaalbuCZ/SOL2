package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.j;
/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: n  reason: collision with root package name */
    private e f597n;

    /* renamed from: o  reason: collision with root package name */
    private androidx.appcompat.app.a f598o;

    /* renamed from: p  reason: collision with root package name */
    c f599p;

    /* renamed from: q  reason: collision with root package name */
    private j.a f600q;

    public f(e eVar) {
        this.f597n = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f598o;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f597n) {
            a();
        }
        j.a aVar = this.f600q;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f600q;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f597n;
        a.C0009a c0009a = new a.C0009a(eVar.u());
        c cVar = new c(c0009a.b(), c.g.abc_list_menu_item_layout);
        this.f599p = cVar;
        cVar.k(this);
        this.f597n.b(this.f599p);
        c0009a.c(this.f599p.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            c0009a.d(y10);
        } else {
            c0009a.e(eVar.w()).h(eVar.x());
        }
        c0009a.f(this);
        androidx.appcompat.app.a a10 = c0009a.a();
        this.f598o = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f598o.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f598o.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f597n.L((g) this.f599p.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f599p.b(this.f597n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f598o.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f598o.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f597n.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f597n.performShortcut(i10, keyEvent, 0);
    }
}
