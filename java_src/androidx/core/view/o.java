package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private int f1659a;

    /* renamed from: b  reason: collision with root package name */
    private int f1660b;

    public o(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1659a | this.f1660b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f1660b = i10;
        } else {
            this.f1659a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f1660b = 0;
        } else {
            this.f1659a = 0;
        }
    }
}
