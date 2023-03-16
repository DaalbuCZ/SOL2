package d;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import h.b;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0090a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f6285a;

        public C0090a(int i10, int i11) {
            super(i10, i11);
            this.f6285a = 0;
            this.f6285a = 8388627;
        }

        public C0090a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6285a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.f3067t);
            this.f6285a = obtainStyledAttributes.getInt(c.j.f3072u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0090a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6285a = 0;
        }

        public C0090a(C0090a c0090a) {
            super((ViewGroup.MarginLayoutParams) c0090a);
            this.f6285a = 0;
            this.f6285a = c0090a.f6285a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(CharSequence charSequence);

    public abstract h.b u(b.a aVar);
}
