package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: n  reason: collision with root package name */
    private final y f826n;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public b0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(this, getContext());
        y yVar = new y(this);
        this.f826n = yVar;
        yVar.m(attributeSet, i10);
    }
}
