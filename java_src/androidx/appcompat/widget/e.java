package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f845a;

    /* renamed from: d  reason: collision with root package name */
    private u0 f848d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f849e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f850f;

    /* renamed from: c  reason: collision with root package name */
    private int f847c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final j f846b = j.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f845a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f850f == null) {
            this.f850f = new u0();
        }
        u0 u0Var = this.f850f;
        u0Var.a();
        ColorStateList k10 = androidx.core.view.u.k(this.f845a);
        if (k10 != null) {
            u0Var.f1025d = true;
            u0Var.f1022a = k10;
        }
        PorterDuff.Mode l10 = androidx.core.view.u.l(this.f845a);
        if (l10 != null) {
            u0Var.f1024c = true;
            u0Var.f1023b = l10;
        }
        if (u0Var.f1025d || u0Var.f1024c) {
            j.i(drawable, u0Var, this.f845a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f848d != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f845a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            u0 u0Var = this.f849e;
            if (u0Var != null) {
                j.i(background, u0Var, this.f845a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f848d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.f845a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        u0 u0Var = this.f849e;
        if (u0Var != null) {
            return u0Var.f1022a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        u0 u0Var = this.f849e;
        if (u0Var != null) {
            return u0Var.f1023b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f845a.getContext();
        int[] iArr = c.j.D3;
        w0 u10 = w0.u(context, attributeSet, iArr, i10, 0);
        View view = this.f845a;
        androidx.core.view.u.F(view, view.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        try {
            int i11 = c.j.E3;
            if (u10.r(i11)) {
                this.f847c = u10.m(i11, -1);
                ColorStateList f10 = this.f846b.f(this.f845a.getContext(), this.f847c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = c.j.F3;
            if (u10.r(i12)) {
                androidx.core.view.u.J(this.f845a, u10.c(i12));
            }
            int i13 = c.j.G3;
            if (u10.r(i13)) {
                androidx.core.view.u.K(this.f845a, e0.d(u10.j(i13, -1), null));
            }
        } finally {
            u10.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f847c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10) {
        this.f847c = i10;
        j jVar = this.f846b;
        h(jVar != null ? jVar.f(this.f845a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f848d == null) {
                this.f848d = new u0();
            }
            u0 u0Var = this.f848d;
            u0Var.f1022a = colorStateList;
            u0Var.f1025d = true;
        } else {
            this.f848d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f849e == null) {
            this.f849e = new u0();
        }
        u0 u0Var = this.f849e;
        u0Var.f1022a = colorStateList;
        u0Var.f1025d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f849e == null) {
            this.f849e = new u0();
        }
        u0 u0Var = this.f849e;
        u0Var.f1023b = mode;
        u0Var.f1024c = true;
        b();
    }
}
