package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1026d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1027e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1028f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1029g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1030h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1031i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(SeekBar seekBar) {
        super(seekBar);
        this.f1028f = null;
        this.f1029g = null;
        this.f1030h = false;
        this.f1031i = false;
        this.f1026d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1027e;
        if (drawable != null) {
            if (this.f1030h || this.f1031i) {
                Drawable p10 = androidx.core.graphics.drawable.a.p(drawable.mutate());
                this.f1027e = p10;
                if (this.f1030h) {
                    androidx.core.graphics.drawable.a.n(p10, this.f1028f);
                }
                if (this.f1031i) {
                    androidx.core.graphics.drawable.a.o(this.f1027e, this.f1029g);
                }
                if (this.f1027e.isStateful()) {
                    this.f1027e.setState(this.f1026d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.r
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1026d.getContext();
        int[] iArr = c.j.V;
        w0 u10 = w0.u(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1026d;
        androidx.core.view.u.F(seekBar, seekBar.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        Drawable g10 = u10.g(c.j.W);
        if (g10 != null) {
            this.f1026d.setThumb(g10);
        }
        j(u10.f(c.j.X));
        int i11 = c.j.Z;
        if (u10.r(i11)) {
            this.f1029g = e0.d(u10.j(i11, -1), this.f1029g);
            this.f1031i = true;
        }
        int i12 = c.j.Y;
        if (u10.r(i12)) {
            this.f1028f = u10.c(i12);
            this.f1030h = true;
        }
        u10.v();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1027e != null) {
            int max = this.f1026d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1027e.getIntrinsicWidth();
                int intrinsicHeight = this.f1027e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1027e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1026d.getWidth() - this.f1026d.getPaddingLeft()) - this.f1026d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1026d.getPaddingLeft(), this.f1026d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1027e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1027e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1026d.getDrawableState())) {
            this.f1026d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1027e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1027e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1027e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1026d);
            androidx.core.graphics.drawable.a.l(drawable, androidx.core.view.u.n(this.f1026d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1026d.getDrawableState());
            }
            f();
        }
        this.f1026d.invalidate();
    }
}
