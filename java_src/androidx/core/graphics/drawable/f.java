package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f1428a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f1429b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f1430c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f1431d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f1430c = null;
        this.f1431d = d.f1420t;
        if (fVar != null) {
            this.f1428a = fVar.f1428a;
            this.f1429b = fVar.f1429b;
            this.f1430c = fVar.f1430c;
            this.f1431d = fVar.f1431d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f1429b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f1428a;
        Drawable.ConstantState constantState = this.f1429b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
