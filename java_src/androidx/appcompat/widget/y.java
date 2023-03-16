package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1085a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f1086b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f1087c;

    /* renamed from: d  reason: collision with root package name */
    private u0 f1088d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f1089e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f1090f;

    /* renamed from: g  reason: collision with root package name */
    private u0 f1091g;

    /* renamed from: h  reason: collision with root package name */
    private u0 f1092h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f1093i;

    /* renamed from: j  reason: collision with root package name */
    private int f1094j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1095k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1096l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1097m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f1100c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1098a = i10;
            this.f1099b = i11;
            this.f1100c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        public void h(int i10) {
        }

        @Override // androidx.core.content.res.h.e
        public void i(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1098a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1099b & 2) != 0);
            }
            y.this.n(this.f1100c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(TextView textView) {
        this.f1085a = textView;
        this.f1093i = new a0(textView);
    }

    private void A(int i10, float f10) {
        this.f1093i.y(i10, f10);
    }

    private void B(Context context, w0 w0Var) {
        String n10;
        Typeface create;
        Typeface typeface;
        this.f1094j = w0Var.j(c.j.M2, this.f1094j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int j10 = w0Var.j(c.j.R2, -1);
            this.f1095k = j10;
            if (j10 != -1) {
                this.f1094j = (this.f1094j & 2) | 0;
            }
        }
        int i11 = c.j.Q2;
        if (!w0Var.r(i11) && !w0Var.r(c.j.S2)) {
            int i12 = c.j.L2;
            if (w0Var.r(i12)) {
                this.f1097m = false;
                int j11 = w0Var.j(i12, 1);
                if (j11 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (j11 == 2) {
                    typeface = Typeface.SERIF;
                } else if (j11 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1096l = typeface;
                return;
            }
            return;
        }
        this.f1096l = null;
        int i13 = c.j.S2;
        if (w0Var.r(i13)) {
            i11 = i13;
        }
        int i14 = this.f1095k;
        int i15 = this.f1094j;
        if (!context.isRestricted()) {
            try {
                Typeface i16 = w0Var.i(i11, this.f1094j, new a(i14, i15, new WeakReference(this.f1085a)));
                if (i16 != null) {
                    if (i10 >= 28 && this.f1095k != -1) {
                        i16 = Typeface.create(Typeface.create(i16, 0), this.f1095k, (this.f1094j & 2) != 0);
                    }
                    this.f1096l = i16;
                }
                this.f1097m = this.f1096l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1096l != null || (n10 = w0Var.n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1095k == -1) {
            create = Typeface.create(n10, this.f1094j);
        } else {
            create = Typeface.create(Typeface.create(n10, 0), this.f1095k, (this.f1094j & 2) != 0);
        }
        this.f1096l = create;
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        j.i(drawable, u0Var, this.f1085a.getDrawableState());
    }

    private static u0 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 != null) {
            u0 u0Var = new u0();
            u0Var.f1025d = true;
            u0Var.f1022a = f10;
            return u0Var;
        }
        return null;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1085a.getCompoundDrawablesRelative();
            TextView textView = this.f1085a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (i10 >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1085a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f1085a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1085a.getCompoundDrawables();
            TextView textView3 = this.f1085a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void y() {
        u0 u0Var = this.f1092h;
        this.f1086b = u0Var;
        this.f1087c = u0Var;
        this.f1088d = u0Var;
        this.f1089e = u0Var;
        this.f1090f = u0Var;
        this.f1091g = u0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1086b != null || this.f1087c != null || this.f1088d != null || this.f1089e != null) {
            Drawable[] compoundDrawables = this.f1085a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1086b);
            a(compoundDrawables[1], this.f1087c);
            a(compoundDrawables[2], this.f1088d);
            a(compoundDrawables[3], this.f1089e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1090f == null && this.f1091g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1085a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1090f);
            a(compoundDrawablesRelative[2], this.f1091g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f1093i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f1093i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f1093i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f1093i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f1093i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f1093i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        u0 u0Var = this.f1092h;
        if (u0Var != null) {
            return u0Var.f1022a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        u0 u0Var = this.f1092h;
        if (u0Var != null) {
            return u0Var.f1023b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f1093i.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[ADDED_TO_REGION] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1097m) {
            this.f1096l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1094j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.f1730a) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String n10;
        ColorStateList c10;
        w0 s10 = w0.s(context, i10, c.j.J2);
        int i11 = c.j.U2;
        if (s10.r(i11)) {
            r(s10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = c.j.N2;
            if (s10.r(i13) && (c10 = s10.c(i13)) != null) {
                this.f1085a.setTextColor(c10);
            }
        }
        int i14 = c.j.K2;
        if (s10.r(i14) && s10.e(i14, -1) == 0) {
            this.f1085a.setTextSize(0, 0.0f);
        }
        B(context, s10);
        if (i12 >= 26) {
            int i15 = c.j.T2;
            if (s10.r(i15) && (n10 = s10.n(i15)) != null) {
                this.f1085a.setFontVariationSettings(n10);
            }
        }
        s10.v();
        Typeface typeface = this.f1096l;
        if (typeface != null) {
            this.f1085a.setTypeface(typeface, this.f1094j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f1085a.setAllCaps(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i10, int i11, int i12, int i13) {
        this.f1093i.u(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int[] iArr, int i10) {
        this.f1093i.v(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        this.f1093i.w(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ColorStateList colorStateList) {
        if (this.f1092h == null) {
            this.f1092h = new u0();
        }
        u0 u0Var = this.f1092h;
        u0Var.f1022a = colorStateList;
        u0Var.f1025d = colorStateList != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(PorterDuff.Mode mode) {
        if (this.f1092h == null) {
            this.f1092h = new u0();
        }
        u0 u0Var = this.f1092h;
        u0Var.f1023b = mode;
        u0Var.f1024c = mode != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(int i10, float f10) {
        if (androidx.core.widget.b.f1730a || l()) {
            return;
        }
        A(i10, f10);
    }
}
