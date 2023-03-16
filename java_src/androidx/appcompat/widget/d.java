package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public class d extends AutoCompleteTextView implements androidx.core.view.s {

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f842p = {16843126};

    /* renamed from: n  reason: collision with root package name */
    private final e f843n;

    /* renamed from: o  reason: collision with root package name */
    private final y f844o;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.autoCompleteTextViewStyle);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        w0 u10 = w0.u(getContext(), attributeSet, f842p, i10, 0);
        if (u10.r(0)) {
            setDropDownBackgroundDrawable(u10.f(0));
        }
        u10.v();
        e eVar = new e(this);
        this.f843n = eVar;
        eVar.e(attributeSet, i10);
        y yVar = new y(this);
        this.f844o = yVar;
        yVar.m(attributeSet, i10);
        yVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f843n;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f844o;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // androidx.core.view.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f843n;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f843n;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f843n;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f843n;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.m(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(e.a.d(getContext(), i10));
    }

    @Override // androidx.core.view.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f843n;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f843n;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y yVar = this.f844o;
        if (yVar != null) {
            yVar.q(context, i10);
        }
    }
}
