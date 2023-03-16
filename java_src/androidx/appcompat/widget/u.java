package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
public class u extends SeekBar {

    /* renamed from: n  reason: collision with root package name */
    private final v f1021n;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.seekBarStyle);
    }

    public u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(this, getContext());
        v vVar = new v(this);
        this.f1021n = vVar;
        vVar.c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1021n.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1021n.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1021n.g(canvas);
    }
}
