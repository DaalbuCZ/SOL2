package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j$.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f2465a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final y8.g f2466b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends k9.l implements j9.a<Boolean> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ClassLoader f2467o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ClassLoader classLoader) {
            super(0);
            this.f2467o = classLoader;
        }

        @Override // j9.a
        /* renamed from: a */
        public final Boolean d() {
            l lVar = l.f2465a;
            Class l10 = lVar.l(this.f2467o);
            boolean z10 = false;
            Method method = l10.getMethod("getBounds", new Class[0]);
            Method method2 = l10.getMethod("getType", new Class[0]);
            Method method3 = l10.getMethod("getState", new Class[0]);
            k9.k.d(method, "getBoundsMethod");
            if (lVar.k(method, k9.s.b(Rect.class)) && lVar.o(method)) {
                k9.k.d(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (lVar.k(method2, k9.s.b(cls)) && lVar.o(method2)) {
                    k9.k.d(method3, "getStateMethod");
                    if (lVar.k(method3, k9.s.b(cls)) && lVar.o(method3)) {
                        z10 = true;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends k9.l implements j9.a<Boolean> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ClassLoader f2468o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f2468o = classLoader;
        }

        @Override // j9.a
        /* renamed from: a */
        public final Boolean d() {
            l lVar = l.f2465a;
            boolean z10 = false;
            Method method = lVar.t(this.f2468o).getMethod("getWindowLayoutComponent", new Class[0]);
            Class v10 = lVar.v(this.f2468o);
            k9.k.d(method, "getWindowLayoutComponentMethod");
            if (lVar.o(method)) {
                k9.k.d(v10, "windowLayoutComponentClass");
                if (lVar.j(method, v10)) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends k9.l implements j9.a<Boolean> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ClassLoader f2469o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClassLoader classLoader) {
            super(0);
            this.f2469o = classLoader;
        }

        @Override // j9.a
        /* renamed from: a */
        public final Boolean d() {
            l lVar = l.f2465a;
            Class v10 = lVar.v(this.f2469o);
            boolean z10 = false;
            Method method = v10.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method method2 = v10.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            k9.k.d(method, "addListenerMethod");
            if (lVar.o(method)) {
                k9.k.d(method2, "removeListenerMethod");
                if (lVar.o(method2)) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends k9.l implements j9.a<Boolean> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ClassLoader f2470o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ClassLoader classLoader) {
            super(0);
            this.f2470o = classLoader;
        }

        @Override // j9.a
        /* renamed from: a */
        public final Boolean d() {
            l lVar = l.f2465a;
            boolean z10 = false;
            Method declaredMethod = lVar.u(this.f2470o).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class t10 = lVar.t(this.f2470o);
            k9.k.d(declaredMethod, "getWindowExtensionsMethod");
            k9.k.d(t10, "windowExtensionsClass");
            if (lVar.j(declaredMethod, t10) && lVar.o(declaredMethod)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes.dex */
    static final class e extends k9.l implements j9.a<WindowLayoutComponent> {

        /* renamed from: o  reason: collision with root package name */
        public static final e f2471o = new e();

        e() {
            super(0);
        }

        @Override // j9.a
        /* renamed from: a */
        public final WindowLayoutComponent d() {
            ClassLoader classLoader = l.class.getClassLoader();
            if (classLoader != null && l.f2465a.i(classLoader)) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                }
            }
            return null;
        }
    }

    static {
        y8.g a10;
        a10 = y8.i.a(e.f2471o);
        f2466b = a10;
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 && r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(Method method, o9.b<?> bVar) {
        return j(method, i9.a.a(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean n(ClassLoader classLoader) {
        return s(new a(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean p(ClassLoader classLoader) {
        return s(new b(classLoader));
    }

    private final boolean q(ClassLoader classLoader) {
        return s(new c(classLoader));
    }

    private final boolean r(ClassLoader classLoader) {
        return s(new d(classLoader));
    }

    private final boolean s(j9.a<Boolean> aVar) {
        try {
            return aVar.d().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) f2466b.getValue();
    }
}
