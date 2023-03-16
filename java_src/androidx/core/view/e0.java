package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f1612b;

    /* renamed from: a  reason: collision with root package name */
    private final l f1613a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f1614a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f1615b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f1616c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f1617d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f1614a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f1615b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f1616c = declaredField3;
                declaredField3.setAccessible(true);
                f1617d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static e0 a(View view) {
            if (f1617d && view.isAttachedToWindow()) {
                try {
                    Object obj = f1614a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f1615b.get(obj);
                        Rect rect2 = (Rect) f1616c.get(obj);
                        if (rect != null && rect2 != null) {
                            e0 a10 = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            a10.q(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f1618a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f1618a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : i10 >= 20 ? new c() : new f();
        }

        public b(e0 e0Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f1618a = i10 >= 30 ? new e(e0Var) : i10 >= 29 ? new d(e0Var) : i10 >= 20 ? new c(e0Var) : new f(e0Var);
        }

        public e0 a() {
            return this.f1618a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.b bVar) {
            this.f1618a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f1618a.f(bVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f1619e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f1620f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f1621g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f1622h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f1623c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b f1624d;

        c() {
            this.f1623c = h();
        }

        c(e0 e0Var) {
            super(e0Var);
            this.f1623c = e0Var.s();
        }

        private static WindowInsets h() {
            if (!f1620f) {
                try {
                    f1619e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f1620f = true;
            }
            Field field = f1619e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f1622h) {
                try {
                    f1621g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f1622h = true;
            }
            Constructor<WindowInsets> constructor = f1621g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.e0.f
        e0 b() {
            a();
            e0 t10 = e0.t(this.f1623c);
            t10.o(this.f1627b);
            t10.r(this.f1624d);
            return t10;
        }

        @Override // androidx.core.view.e0.f
        void d(androidx.core.graphics.b bVar) {
            this.f1624d = bVar;
        }

        @Override // androidx.core.view.e0.f
        void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f1623c;
            if (windowInsets != null) {
                this.f1623c = windowInsets.replaceSystemWindowInsets(bVar.f1394a, bVar.f1395b, bVar.f1396c, bVar.f1397d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f1625c;

        d() {
            this.f1625c = new WindowInsets.Builder();
        }

        d(e0 e0Var) {
            super(e0Var);
            WindowInsets s10 = e0Var.s();
            this.f1625c = s10 != null ? new WindowInsets.Builder(s10) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.e0.f
        e0 b() {
            a();
            e0 t10 = e0.t(this.f1625c.build());
            t10.o(this.f1627b);
            return t10;
        }

        @Override // androidx.core.view.e0.f
        void c(androidx.core.graphics.b bVar) {
            this.f1625c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.e0.f
        void d(androidx.core.graphics.b bVar) {
            this.f1625c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.e0.f
        void e(androidx.core.graphics.b bVar) {
            this.f1625c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.e0.f
        void f(androidx.core.graphics.b bVar) {
            this.f1625c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.e0.f
        void g(androidx.core.graphics.b bVar) {
            this.f1625c.setTappableElementInsets(bVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(e0 e0Var) {
            super(e0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final e0 f1626a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.b[] f1627b;

        f() {
            this(new e0((e0) null));
        }

        f(e0 e0Var) {
            this.f1626a = e0Var;
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f1627b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.a(1)];
                androidx.core.graphics.b bVar2 = this.f1627b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f1626a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f1626a.f(1);
                }
                f(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f1627b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f1627b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f1627b[m.a(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        e0 b() {
            a();
            return this.f1626a;
        }

        void c(androidx.core.graphics.b bVar) {
        }

        void d(androidx.core.graphics.b bVar) {
        }

        void e(androidx.core.graphics.b bVar) {
        }

        void f(androidx.core.graphics.b bVar) {
        }

        void g(androidx.core.graphics.b bVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f1628h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f1629i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f1630j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f1631k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f1632l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f1633c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b[] f1634d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.b f1635e;

        /* renamed from: f  reason: collision with root package name */
        private e0 f1636f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.b f1637g;

        g(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var);
            this.f1635e = null;
            this.f1633c = windowInsets;
        }

        g(e0 e0Var, g gVar) {
            this(e0Var, new WindowInsets(gVar.f1633c));
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b t(int i10, boolean z10) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f1393e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, u(i11, z10));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b v() {
            e0 e0Var = this.f1636f;
            return e0Var != null ? e0Var.g() : androidx.core.graphics.b.f1393e;
        }

        private androidx.core.graphics.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f1628h) {
                    x();
                }
                Method method = f1629i;
                if (method != null && f1630j != null && f1631k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f1631k.get(f1632l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f1629i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1630j = cls;
                f1631k = cls.getDeclaredField("mVisibleInsets");
                f1632l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1631k.setAccessible(true);
                f1632l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f1628h = true;
        }

        @Override // androidx.core.view.e0.l
        void d(View view) {
            androidx.core.graphics.b w10 = w(view);
            if (w10 == null) {
                w10 = androidx.core.graphics.b.f1393e;
            }
            q(w10);
        }

        @Override // androidx.core.view.e0.l
        void e(e0 e0Var) {
            e0Var.q(this.f1636f);
            e0Var.p(this.f1637g);
        }

        @Override // androidx.core.view.e0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1637g, ((g) obj).f1637g);
            }
            return false;
        }

        @Override // androidx.core.view.e0.l
        public androidx.core.graphics.b g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.e0.l
        final androidx.core.graphics.b k() {
            if (this.f1635e == null) {
                this.f1635e = androidx.core.graphics.b.b(this.f1633c.getSystemWindowInsetLeft(), this.f1633c.getSystemWindowInsetTop(), this.f1633c.getSystemWindowInsetRight(), this.f1633c.getSystemWindowInsetBottom());
            }
            return this.f1635e;
        }

        @Override // androidx.core.view.e0.l
        e0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(e0.t(this.f1633c));
            bVar.c(e0.m(k(), i10, i11, i12, i13));
            bVar.b(e0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.e0.l
        boolean o() {
            return this.f1633c.isRound();
        }

        @Override // androidx.core.view.e0.l
        public void p(androidx.core.graphics.b[] bVarArr) {
            this.f1634d = bVarArr;
        }

        @Override // androidx.core.view.e0.l
        void q(androidx.core.graphics.b bVar) {
            this.f1637g = bVar;
        }

        @Override // androidx.core.view.e0.l
        void r(e0 e0Var) {
            this.f1636f = e0Var;
        }

        protected androidx.core.graphics.b u(int i10, boolean z10) {
            androidx.core.graphics.b g10;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.b.b(0, Math.max(v().f1395b, k().f1395b), 0, 0) : androidx.core.graphics.b.b(0, k().f1395b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.b v10 = v();
                    androidx.core.graphics.b i12 = i();
                    return androidx.core.graphics.b.b(Math.max(v10.f1394a, i12.f1394a), 0, Math.max(v10.f1396c, i12.f1396c), Math.max(v10.f1397d, i12.f1397d));
                }
                androidx.core.graphics.b k10 = k();
                e0 e0Var = this.f1636f;
                g10 = e0Var != null ? e0Var.g() : null;
                int i13 = k10.f1397d;
                if (g10 != null) {
                    i13 = Math.min(i13, g10.f1397d);
                }
                return androidx.core.graphics.b.b(k10.f1394a, 0, k10.f1396c, i13);
            } else if (i10 != 8) {
                if (i10 != 16) {
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                return androidx.core.graphics.b.f1393e;
                            }
                            e0 e0Var2 = this.f1636f;
                            androidx.core.view.c e10 = e0Var2 != null ? e0Var2.e() : f();
                            return e10 != null ? androidx.core.graphics.b.b(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.b.f1393e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                androidx.core.graphics.b[] bVarArr = this.f1634d;
                g10 = bVarArr != null ? bVarArr[m.a(8)] : null;
                if (g10 != null) {
                    return g10;
                }
                androidx.core.graphics.b k11 = k();
                androidx.core.graphics.b v11 = v();
                int i14 = k11.f1397d;
                if (i14 > v11.f1397d) {
                    return androidx.core.graphics.b.b(0, 0, 0, i14);
                }
                androidx.core.graphics.b bVar = this.f1637g;
                return (bVar == null || bVar.equals(androidx.core.graphics.b.f1393e) || (i11 = this.f1637g.f1397d) <= v11.f1397d) ? androidx.core.graphics.b.f1393e : androidx.core.graphics.b.b(0, 0, 0, i11);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.b f1638m;

        h(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
            this.f1638m = null;
        }

        h(e0 e0Var, h hVar) {
            super(e0Var, hVar);
            this.f1638m = null;
            this.f1638m = hVar.f1638m;
        }

        @Override // androidx.core.view.e0.l
        e0 b() {
            return e0.t(this.f1633c.consumeStableInsets());
        }

        @Override // androidx.core.view.e0.l
        e0 c() {
            return e0.t(this.f1633c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.e0.l
        final androidx.core.graphics.b i() {
            if (this.f1638m == null) {
                this.f1638m = androidx.core.graphics.b.b(this.f1633c.getStableInsetLeft(), this.f1633c.getStableInsetTop(), this.f1633c.getStableInsetRight(), this.f1633c.getStableInsetBottom());
            }
            return this.f1638m;
        }

        @Override // androidx.core.view.e0.l
        boolean n() {
            return this.f1633c.isConsumed();
        }

        @Override // androidx.core.view.e0.l
        public void s(androidx.core.graphics.b bVar) {
            this.f1638m = bVar;
        }
    }

    /* loaded from: classes.dex */
    private static class i extends h {
        i(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        i(e0 e0Var, i iVar) {
            super(e0Var, iVar);
        }

        @Override // androidx.core.view.e0.l
        e0 a() {
            return e0.t(this.f1633c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.e0.g, androidx.core.view.e0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.f1633c, iVar.f1633c) && Objects.equals(this.f1637g, iVar.f1637g);
            }
            return false;
        }

        @Override // androidx.core.view.e0.l
        androidx.core.view.c f() {
            return androidx.core.view.c.e(this.f1633c.getDisplayCutout());
        }

        @Override // androidx.core.view.e0.l
        public int hashCode() {
            return this.f1633c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.b f1639n;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.b f1640o;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.b f1641p;

        j(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
            this.f1639n = null;
            this.f1640o = null;
            this.f1641p = null;
        }

        j(e0 e0Var, j jVar) {
            super(e0Var, jVar);
            this.f1639n = null;
            this.f1640o = null;
            this.f1641p = null;
        }

        @Override // androidx.core.view.e0.l
        androidx.core.graphics.b h() {
            if (this.f1640o == null) {
                this.f1640o = androidx.core.graphics.b.d(this.f1633c.getMandatorySystemGestureInsets());
            }
            return this.f1640o;
        }

        @Override // androidx.core.view.e0.l
        androidx.core.graphics.b j() {
            if (this.f1639n == null) {
                this.f1639n = androidx.core.graphics.b.d(this.f1633c.getSystemGestureInsets());
            }
            return this.f1639n;
        }

        @Override // androidx.core.view.e0.l
        androidx.core.graphics.b l() {
            if (this.f1641p == null) {
                this.f1641p = androidx.core.graphics.b.d(this.f1633c.getTappableElementInsets());
            }
            return this.f1641p;
        }

        @Override // androidx.core.view.e0.g, androidx.core.view.e0.l
        e0 m(int i10, int i11, int i12, int i13) {
            return e0.t(this.f1633c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.e0.h, androidx.core.view.e0.l
        public void s(androidx.core.graphics.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final e0 f1642q = e0.t(WindowInsets.CONSUMED);

        k(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        k(e0 e0Var, k kVar) {
            super(e0Var, kVar);
        }

        @Override // androidx.core.view.e0.g, androidx.core.view.e0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.e0.g, androidx.core.view.e0.l
        public androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.d(this.f1633c.getInsets(n.a(i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        static final e0 f1643b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final e0 f1644a;

        l(e0 e0Var) {
            this.f1644a = e0Var;
        }

        e0 a() {
            return this.f1644a;
        }

        e0 b() {
            return this.f1644a;
        }

        e0 c() {
            return this.f1644a;
        }

        void d(View view) {
        }

        void e(e0 e0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return o() == lVar.o() && n() == lVar.n() && androidx.core.util.d.a(k(), lVar.k()) && androidx.core.util.d.a(i(), lVar.i()) && androidx.core.util.d.a(f(), lVar.f());
            }
            return false;
        }

        androidx.core.view.c f() {
            return null;
        }

        androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.f1393e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.d.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f1393e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f1393e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        e0 m(int i10, int i11, int i12, int i13) {
            return f1643b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(androidx.core.graphics.b[] bVarArr) {
        }

        void q(androidx.core.graphics.b bVar) {
        }

        void r(e0 e0Var) {
        }

        public void s(androidx.core.graphics.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        static int a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            if (i10 != 16) {
                                if (i10 != 32) {
                                    if (i10 != 64) {
                                        if (i10 != 128) {
                                            if (i10 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        f1612b = Build.VERSION.SDK_INT >= 30 ? k.f1642q : l.f1643b;
    }

    private e0(WindowInsets windowInsets) {
        l gVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i10 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i10 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i10 >= 21) {
            gVar = new h(this, windowInsets);
        } else if (i10 < 20) {
            this.f1613a = new l(this);
            return;
        } else {
            gVar = new g(this, windowInsets);
        }
        this.f1613a = gVar;
    }

    public e0(e0 e0Var) {
        if (e0Var == null) {
            this.f1613a = new l(this);
            return;
        }
        l lVar = e0Var.f1613a;
        int i10 = Build.VERSION.SDK_INT;
        this.f1613a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? (i10 < 21 || !(lVar instanceof h)) ? (i10 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.b m(androidx.core.graphics.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f1394a - i10);
        int max2 = Math.max(0, bVar.f1395b - i11);
        int max3 = Math.max(0, bVar.f1396c - i12);
        int max4 = Math.max(0, bVar.f1397d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : androidx.core.graphics.b.b(max, max2, max3, max4);
    }

    public static e0 t(WindowInsets windowInsets) {
        return u(windowInsets, null);
    }

    public static e0 u(WindowInsets windowInsets, View view) {
        e0 e0Var = new e0((WindowInsets) androidx.core.util.e.b(windowInsets));
        if (view != null && u.v(view)) {
            e0Var.q(u.p(view));
            e0Var.d(view.getRootView());
        }
        return e0Var;
    }

    @Deprecated
    public e0 a() {
        return this.f1613a.a();
    }

    @Deprecated
    public e0 b() {
        return this.f1613a.b();
    }

    @Deprecated
    public e0 c() {
        return this.f1613a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f1613a.d(view);
    }

    public androidx.core.view.c e() {
        return this.f1613a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return androidx.core.util.d.a(this.f1613a, ((e0) obj).f1613a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i10) {
        return this.f1613a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f1613a.i();
    }

    @Deprecated
    public int h() {
        return this.f1613a.k().f1397d;
    }

    public int hashCode() {
        l lVar = this.f1613a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f1613a.k().f1394a;
    }

    @Deprecated
    public int j() {
        return this.f1613a.k().f1396c;
    }

    @Deprecated
    public int k() {
        return this.f1613a.k().f1395b;
    }

    public e0 l(int i10, int i11, int i12, int i13) {
        return this.f1613a.m(i10, i11, i12, i13);
    }

    @Deprecated
    public e0 n(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.b.b(i10, i11, i12, i13)).a();
    }

    void o(androidx.core.graphics.b[] bVarArr) {
        this.f1613a.p(bVarArr);
    }

    void p(androidx.core.graphics.b bVar) {
        this.f1613a.q(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(e0 e0Var) {
        this.f1613a.r(e0Var);
    }

    void r(androidx.core.graphics.b bVar) {
        this.f1613a.s(bVar);
    }

    public WindowInsets s() {
        l lVar = this.f1613a;
        if (lVar instanceof g) {
            return ((g) lVar).f1633c;
        }
        return null;
    }
}
