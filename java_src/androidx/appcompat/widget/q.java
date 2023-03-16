package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
class q extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f991b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f992a;

    static {
        f991b = Build.VERSION.SDK_INT < 21;
    }

    public q(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        w0 u10 = w0.u(context, attributeSet, c.j.f2980b2, i10, i11);
        int i12 = c.j.f2990d2;
        if (u10.r(i12)) {
            b(u10.a(i12, false));
        }
        setBackgroundDrawable(u10.f(c.j.f2985c2));
        u10.v();
    }

    private void b(boolean z10) {
        if (f991b) {
            this.f992a = z10;
        } else {
            androidx.core.widget.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f991b && this.f992a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f991b && this.f992a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f991b && this.f992a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
