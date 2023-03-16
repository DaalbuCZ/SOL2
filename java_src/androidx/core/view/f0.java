package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f1647a;

    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f1648a;

        /* renamed from: b  reason: collision with root package name */
        private final View f1649b;

        a(Window window, View view) {
            this.f1648a = window;
            this.f1649b = view;
        }

        protected void c(int i10) {
            View decorView = this.f1648a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            this.f1648a.addFlags(i10);
        }

        protected void e(int i10) {
            View decorView = this.f1648a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f1648a.clearFlags(i10);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.f0.e
        public void b(boolean z10) {
            if (!z10) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.f0.e
        public void a(boolean z10) {
            if (!z10) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final f0 f1650a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f1651b;

        /* renamed from: c  reason: collision with root package name */
        private final m.g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f1652c;

        /* renamed from: d  reason: collision with root package name */
        protected Window f1653d;

        d(Window window, f0 f0Var) {
            this(window.getInsetsController(), f0Var);
            this.f1653d = window;
        }

        d(WindowInsetsController windowInsetsController, f0 f0Var) {
            this.f1652c = new m.g<>();
            this.f1651b = windowInsetsController;
            this.f1650a = f0Var;
        }

        @Override // androidx.core.view.f0.e
        public void a(boolean z10) {
            if (z10) {
                if (this.f1653d != null) {
                    c(16);
                }
                this.f1651b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f1653d != null) {
                d(16);
            }
            this.f1651b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.f0.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f1653d != null) {
                    c(8192);
                }
                this.f1651b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f1653d != null) {
                d(8192);
            }
            this.f1651b.setSystemBarsAppearance(0, 8);
        }

        protected void c(int i10) {
            View decorView = this.f1653d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            View decorView = this.f1653d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
        }
    }

    public f0(Window window, View view) {
        e aVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f1647a = new d(window, this);
            return;
        }
        if (i10 >= 26) {
            aVar = new c(window, view);
        } else if (i10 >= 23) {
            aVar = new b(window, view);
        } else if (i10 < 20) {
            this.f1647a = new e();
            return;
        } else {
            aVar = new a(window, view);
        }
        this.f1647a = aVar;
    }

    public void a(boolean z10) {
        this.f1647a.a(z10);
    }

    public void b(boolean z10) {
        this.f1647a.b(z10);
    }
}
