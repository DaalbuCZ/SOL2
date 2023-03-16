package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* loaded from: classes.dex */
public class g extends CheckBox implements androidx.core.widget.j, androidx.core.view.s {

    /* renamed from: n  reason: collision with root package name */
    private final i f872n;

    /* renamed from: o  reason: collision with root package name */
    private final e f873o;

    /* renamed from: p  reason: collision with root package name */
    private final y f874p;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.checkboxStyle);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        i iVar = new i(this);
        this.f872n = iVar;
        iVar.e(attributeSet, i10);
        e eVar = new e(this);
        this.f873o = eVar;
        eVar.e(attributeSet, i10);
        y yVar = new y(this);
        this.f874p = yVar;
        yVar.m(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f873o;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f874p;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f872n;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f873o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f873o;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f872n;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f872n;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f873o;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f873o;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(e.a.d(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f872n;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // androidx.core.view.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f873o;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f873o;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f872n;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f872n;
        if (iVar != null) {
            iVar.h(mode);
        }
    }
}
