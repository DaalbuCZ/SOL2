package h;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.a0;
import androidx.core.view.b0;
import androidx.core.view.c0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f7631c;

    /* renamed from: d  reason: collision with root package name */
    b0 f7632d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7633e;

    /* renamed from: b  reason: collision with root package name */
    private long f7630b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final c0 f7634f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<a0> f7629a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends c0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7635a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f7636b = 0;

        a() {
        }

        @Override // androidx.core.view.b0
        public void b(View view) {
            int i10 = this.f7636b + 1;
            this.f7636b = i10;
            if (i10 == h.this.f7629a.size()) {
                b0 b0Var = h.this.f7632d;
                if (b0Var != null) {
                    b0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.c0, androidx.core.view.b0
        public void c(View view) {
            if (this.f7635a) {
                return;
            }
            this.f7635a = true;
            b0 b0Var = h.this.f7632d;
            if (b0Var != null) {
                b0Var.c(null);
            }
        }

        void d() {
            this.f7636b = 0;
            this.f7635a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f7633e) {
            Iterator<a0> it = this.f7629a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f7633e = false;
        }
    }

    void b() {
        this.f7633e = false;
    }

    public h c(a0 a0Var) {
        if (!this.f7633e) {
            this.f7629a.add(a0Var);
        }
        return this;
    }

    public h d(a0 a0Var, a0 a0Var2) {
        this.f7629a.add(a0Var);
        a0Var2.j(a0Var.d());
        this.f7629a.add(a0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f7633e) {
            this.f7630b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f7633e) {
            this.f7631c = interpolator;
        }
        return this;
    }

    public h g(b0 b0Var) {
        if (!this.f7633e) {
            this.f7632d = b0Var;
        }
        return this;
    }

    public void h() {
        if (this.f7633e) {
            return;
        }
        Iterator<a0> it = this.f7629a.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            long j10 = this.f7630b;
            if (j10 >= 0) {
                next.f(j10);
            }
            Interpolator interpolator = this.f7631c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f7632d != null) {
                next.h(this.f7634f);
            }
            next.l();
        }
        this.f7633e = true;
    }
}
