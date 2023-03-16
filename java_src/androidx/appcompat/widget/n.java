package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f953a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f954b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f955c;

    /* renamed from: d  reason: collision with root package name */
    private u0 f956d;

    public n(ImageView imageView) {
        this.f953a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f956d == null) {
            this.f956d = new u0();
        }
        u0 u0Var = this.f956d;
        u0Var.a();
        ColorStateList a10 = androidx.core.widget.e.a(this.f953a);
        if (a10 != null) {
            u0Var.f1025d = true;
            u0Var.f1022a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.e.b(this.f953a);
        if (b10 != null) {
            u0Var.f1024c = true;
            u0Var.f1023b = b10;
        }
        if (u0Var.f1025d || u0Var.f1024c) {
            j.i(drawable, u0Var, this.f953a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f954b != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f953a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            u0 u0Var = this.f955c;
            if (u0Var != null) {
                j.i(drawable, u0Var, this.f953a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f954b;
            if (u0Var2 != null) {
                j.i(drawable, u0Var2, this.f953a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        u0 u0Var = this.f955c;
        if (u0Var != null) {
            return u0Var.f1022a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        u0 u0Var = this.f955c;
        if (u0Var != null) {
            return u0Var.f1023b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f953a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i10) {
        int m10;
        Context context = this.f953a.getContext();
        int[] iArr = c.j.R;
        w0 u10 = w0.u(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f953a;
        androidx.core.view.u.F(imageView, imageView.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        try {
            Drawable drawable = this.f953a.getDrawable();
            if (drawable == null && (m10 = u10.m(c.j.S, -1)) != -1 && (drawable = e.a.d(this.f953a.getContext(), m10)) != null) {
                this.f953a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            int i11 = c.j.T;
            if (u10.r(i11)) {
                androidx.core.widget.e.c(this.f953a, u10.c(i11));
            }
            int i12 = c.j.U;
            if (u10.r(i12)) {
                androidx.core.widget.e.d(this.f953a, e0.d(u10.j(i12, -1), null));
            }
        } finally {
            u10.v();
        }
    }

    public void g(int i10) {
        if (i10 != 0) {
            Drawable d10 = e.a.d(this.f953a.getContext(), i10);
            if (d10 != null) {
                e0.b(d10);
            }
            this.f953a.setImageDrawable(d10);
        } else {
            this.f953a.setImageDrawable(null);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f955c == null) {
            this.f955c = new u0();
        }
        u0 u0Var = this.f955c;
        u0Var.f1022a = colorStateList;
        u0Var.f1025d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f955c == null) {
            this.f955c = new u0();
        }
        u0 u0Var = this.f955c;
        u0Var.f1023b = mode;
        u0Var.f1024c = true;
        b();
    }
}
