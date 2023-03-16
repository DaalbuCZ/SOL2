package d;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import androidx.core.view.e;
import androidx.core.view.e0;
import androidx.core.view.u;
import androidx.lifecycle.e;
import h.b;
import h.f;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends d.d implements e.a, LayoutInflater.Factory2 {

    /* renamed from: n0  reason: collision with root package name */
    private static final m.g<String, Integer> f6289n0 = new m.g<>();

    /* renamed from: o0  reason: collision with root package name */
    private static final boolean f6290o0;

    /* renamed from: p0  reason: collision with root package name */
    private static final int[] f6291p0;

    /* renamed from: q0  reason: collision with root package name */
    private static final boolean f6292q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final boolean f6293r0;

    /* renamed from: s0  reason: collision with root package name */
    private static boolean f6294s0;
    private t A;
    h.b B;
    ActionBarContextView C;
    PopupWindow D;
    Runnable E;
    a0 F;
    private boolean G;
    private boolean H;
    ViewGroup I;
    private TextView J;
    private View K;
    private boolean L;
    private boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q;
    boolean R;
    private boolean S;
    private s[] T;
    private s U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f6295a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f6296b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f6297c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f6298d0;

    /* renamed from: e0  reason: collision with root package name */
    private l f6299e0;

    /* renamed from: f0  reason: collision with root package name */
    private l f6300f0;

    /* renamed from: g0  reason: collision with root package name */
    boolean f6301g0;

    /* renamed from: h0  reason: collision with root package name */
    int f6302h0;

    /* renamed from: i0  reason: collision with root package name */
    private final Runnable f6303i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f6304j0;

    /* renamed from: k0  reason: collision with root package name */
    private Rect f6305k0;

    /* renamed from: l0  reason: collision with root package name */
    private Rect f6306l0;

    /* renamed from: m0  reason: collision with root package name */
    private d.g f6307m0;

    /* renamed from: q  reason: collision with root package name */
    final Object f6308q;

    /* renamed from: r  reason: collision with root package name */
    final Context f6309r;

    /* renamed from: s  reason: collision with root package name */
    Window f6310s;

    /* renamed from: t  reason: collision with root package name */
    private j f6311t;

    /* renamed from: u  reason: collision with root package name */
    final d.c f6312u;

    /* renamed from: v  reason: collision with root package name */
    d.a f6313v;

    /* renamed from: w  reason: collision with root package name */
    MenuInflater f6314w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f6315x;

    /* renamed from: y  reason: collision with root package name */
    private c0 f6316y;

    /* renamed from: z  reason: collision with root package name */
    private h f6317z;

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f6318a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f6318a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f6318a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f6318a.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.f6302h0 & 1) != 0) {
                eVar.U(0);
            }
            e eVar2 = e.this;
            if ((eVar2.f6302h0 & 4096) != 0) {
                eVar2.U(108);
            }
            e eVar3 = e.this;
            eVar3.f6301g0 = false;
            eVar3.f6302h0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements androidx.core.view.p {
        c() {
        }

        @Override // androidx.core.view.p
        public e0 a(View view, e0 e0Var) {
            int k10 = e0Var.k();
            int L0 = e.this.L0(e0Var, null);
            if (k10 != L0) {
                e0Var = e0Var.n(e0Var.i(), L0, e0Var.j(), e0Var.h());
            }
            return u.z(view, e0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = e.this.L0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0091e implements ContentFrameLayout.a {
        C0091e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.S();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a extends androidx.core.view.c0 {
            a() {
            }

            @Override // androidx.core.view.b0
            public void b(View view) {
                e.this.C.setAlpha(1.0f);
                e.this.F.h(null);
                e.this.F = null;
            }

            @Override // androidx.core.view.c0, androidx.core.view.b0
            public void c(View view) {
                e.this.C.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.D.showAtLocation(eVar.C, 55, 0, 0);
            e.this.V();
            if (!e.this.D0()) {
                e.this.C.setAlpha(1.0f);
                e.this.C.setVisibility(0);
                return;
            }
            e.this.C.setAlpha(0.0f);
            e eVar2 = e.this;
            eVar2.F = u.b(eVar2.C).b(1.0f);
            e.this.F.h(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends androidx.core.view.c0 {
        g() {
        }

        @Override // androidx.core.view.b0
        public void b(View view) {
            e.this.C.setAlpha(1.0f);
            e.this.F.h(null);
            e.this.F = null;
        }

        @Override // androidx.core.view.c0, androidx.core.view.b0
        public void c(View view) {
            e.this.C.setVisibility(0);
            e.this.C.sendAccessibilityEvent(32);
            if (e.this.C.getParent() instanceof View) {
                u.E((View) e.this.C.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            e.this.L(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02 = e.this.f0();
            if (f02 != null) {
                f02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f6327a;

        /* loaded from: classes.dex */
        class a extends androidx.core.view.c0 {
            a() {
            }

            @Override // androidx.core.view.b0
            public void b(View view) {
                e.this.C.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.D;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.C.getParent() instanceof View) {
                    u.E((View) e.this.C.getParent());
                }
                e.this.C.removeAllViews();
                e.this.F.h(null);
                e eVar2 = e.this;
                eVar2.F = null;
                u.E(eVar2.I);
            }
        }

        public i(b.a aVar) {
            this.f6327a = aVar;
        }

        @Override // h.b.a
        public boolean a(h.b bVar, MenuItem menuItem) {
            return this.f6327a.a(bVar, menuItem);
        }

        @Override // h.b.a
        public boolean b(h.b bVar, Menu menu) {
            return this.f6327a.b(bVar, menu);
        }

        @Override // h.b.a
        public boolean c(h.b bVar, Menu menu) {
            u.E(e.this.I);
            return this.f6327a.c(bVar, menu);
        }

        @Override // h.b.a
        public void d(h.b bVar) {
            this.f6327a.d(bVar);
            e eVar = e.this;
            if (eVar.D != null) {
                eVar.f6310s.getDecorView().removeCallbacks(e.this.E);
            }
            e eVar2 = e.this;
            if (eVar2.C != null) {
                eVar2.V();
                e eVar3 = e.this;
                eVar3.F = u.b(eVar3.C).b(0.0f);
                e.this.F.h(new a());
            }
            e eVar4 = e.this;
            d.c cVar = eVar4.f6312u;
            if (cVar != null) {
                cVar.h(eVar4.B);
            }
            e eVar5 = e.this;
            eVar5.B = null;
            u.E(eVar5.I);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends h.i {
        j(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.f6309r, callback);
            h.b F0 = e.this.F0(aVar);
            if (F0 != null) {
                return aVar.e(F0);
            }
            return null;
        }

        @Override // h.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // h.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // h.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // h.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            e.this.u0(i10);
            return true;
        }

        @Override // h.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            e.this.v0(i10);
        }

        @Override // h.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // h.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s d02 = e.this.d0(0, true);
            if (d02 == null || (eVar = d02.f6348j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // h.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return e.this.m0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // h.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (e.this.m0() && i10 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f6331c;

        k(Context context) {
            super();
            this.f6331c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // d.e.l
        IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // d.e.l
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f6331c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // d.e.l
        public void d() {
            e.this.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f6333a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f6333a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f6309r.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f6333a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f6333a == null) {
                this.f6333a = new a();
            }
            e.this.f6309r.registerReceiver(this.f6333a, b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final d.j f6336c;

        m(d.j jVar) {
            super();
            this.f6336c = jVar;
        }

        @Override // d.e.l
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // d.e.l
        public int c() {
            return this.f6336c.d() ? 2 : 1;
        }

        @Override // d.e.l
        public void d() {
            e.this.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                e.this.N(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(e.a.d(getContext(), i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class s {

        /* renamed from: a  reason: collision with root package name */
        int f6339a;

        /* renamed from: b  reason: collision with root package name */
        int f6340b;

        /* renamed from: c  reason: collision with root package name */
        int f6341c;

        /* renamed from: d  reason: collision with root package name */
        int f6342d;

        /* renamed from: e  reason: collision with root package name */
        int f6343e;

        /* renamed from: f  reason: collision with root package name */
        int f6344f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f6345g;

        /* renamed from: h  reason: collision with root package name */
        View f6346h;

        /* renamed from: i  reason: collision with root package name */
        View f6347i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f6348j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f6349k;

        /* renamed from: l  reason: collision with root package name */
        Context f6350l;

        /* renamed from: m  reason: collision with root package name */
        boolean f6351m;

        /* renamed from: n  reason: collision with root package name */
        boolean f6352n;

        /* renamed from: o  reason: collision with root package name */
        boolean f6353o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f6354p;

        /* renamed from: q  reason: collision with root package name */
        boolean f6355q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f6356r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f6357s;

        s(int i10) {
            this.f6339a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f6348j == null) {
                return null;
            }
            if (this.f6349k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f6350l, c.g.abc_list_menu_item_layout);
                this.f6349k = cVar;
                cVar.k(aVar);
                this.f6348j.b(this.f6349k);
            }
            return this.f6349k.c(this.f6345g);
        }

        public boolean b() {
            if (this.f6346h == null) {
                return false;
            }
            return this.f6347i != null || this.f6349k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f6348j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f6349k);
            }
            this.f6348j = eVar;
            if (eVar == null || (cVar = this.f6349k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(c.a.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(c.a.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = c.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i11, true);
            h.d dVar = new h.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f6350l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(c.j.f3098z0);
            this.f6340b = obtainStyledAttributes.getResourceId(c.j.C0, 0);
            this.f6344f = obtainStyledAttributes.getResourceId(c.j.B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class t implements j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            e eVar2 = e.this;
            if (z11) {
                eVar = D;
            }
            s Y = eVar2.Y(eVar);
            if (Y != null) {
                if (!z11) {
                    e.this.O(Y, z10);
                    return;
                }
                e.this.K(Y.f6339a, Y, D);
                e.this.O(Y, true);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02;
            if (eVar == eVar.D()) {
                e eVar2 = e.this;
                if (!eVar2.N || (f02 = eVar2.f0()) == null || e.this.Z) {
                    return true;
                }
                f02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 < 21;
        f6290o0 = z10;
        f6291p0 = new int[]{16842836};
        f6292q0 = !"robolectric".equals(Build.FINGERPRINT);
        f6293r0 = i10 >= 17;
        if (!z10 || f6294s0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f6294s0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Activity activity, d.c cVar) {
        this(activity, null, cVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Dialog dialog, d.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    private e(Context context, Window window, d.c cVar, Object obj) {
        m.g<String, Integer> gVar;
        Integer num;
        d.b I0;
        this.F = null;
        this.G = true;
        this.f6295a0 = -100;
        this.f6303i0 = new b();
        this.f6309r = context;
        this.f6312u = cVar;
        this.f6308q = obj;
        if (this.f6295a0 == -100 && (obj instanceof Dialog) && (I0 = I0()) != null) {
            this.f6295a0 = I0.x().k();
        }
        if (this.f6295a0 == -100 && (num = (gVar = f6289n0).get(obj.getClass().getName())) != null) {
            this.f6295a0 = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            I(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean A0(s sVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.Z) {
            return false;
        }
        if (sVar.f6351m) {
            return true;
        }
        s sVar2 = this.U;
        if (sVar2 != null && sVar2 != sVar) {
            O(sVar2, false);
        }
        Window.Callback f02 = f0();
        if (f02 != null) {
            sVar.f6347i = f02.onCreatePanelView(sVar.f6339a);
        }
        int i10 = sVar.f6339a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (c0Var3 = this.f6316y) != null) {
            c0Var3.d();
        }
        if (sVar.f6347i == null) {
            if (z10) {
                y0();
            }
            androidx.appcompat.view.menu.e eVar = sVar.f6348j;
            if (eVar == null || sVar.f6356r) {
                if (eVar == null && (!j0(sVar) || sVar.f6348j == null)) {
                    return false;
                }
                if (z10 && this.f6316y != null) {
                    if (this.f6317z == null) {
                        this.f6317z = new h();
                    }
                    this.f6316y.a(sVar.f6348j, this.f6317z);
                }
                sVar.f6348j.d0();
                if (!f02.onCreatePanelMenu(sVar.f6339a, sVar.f6348j)) {
                    sVar.c(null);
                    if (z10 && (c0Var = this.f6316y) != null) {
                        c0Var.a(null, this.f6317z);
                    }
                    return false;
                }
                sVar.f6356r = false;
            }
            sVar.f6348j.d0();
            Bundle bundle = sVar.f6357s;
            if (bundle != null) {
                sVar.f6348j.P(bundle);
                sVar.f6357s = null;
            }
            if (!f02.onPreparePanel(0, sVar.f6347i, sVar.f6348j)) {
                if (z10 && (c0Var2 = this.f6316y) != null) {
                    c0Var2.a(null, this.f6317z);
                }
                sVar.f6348j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f6354p = z11;
            sVar.f6348j.setQwertyMode(z11);
            sVar.f6348j.c0();
        }
        sVar.f6351m = true;
        sVar.f6352n = false;
        this.U = sVar;
        return true;
    }

    private void B0(boolean z10) {
        c0 c0Var = this.f6316y;
        if (c0Var == null || !c0Var.h() || (ViewConfiguration.get(this.f6309r).hasPermanentMenuKey() && !this.f6316y.e())) {
            s d02 = d0(0, true);
            d02.f6355q = true;
            O(d02, false);
            x0(d02, null);
            return;
        }
        Window.Callback f02 = f0();
        if (this.f6316y.c() && z10) {
            this.f6316y.f();
            if (this.Z) {
                return;
            }
            f02.onPanelClosed(108, d0(0, true).f6348j);
        } else if (f02 == null || this.Z) {
        } else {
            if (this.f6301g0 && (this.f6302h0 & 1) != 0) {
                this.f6310s.getDecorView().removeCallbacks(this.f6303i0);
                this.f6303i0.run();
            }
            s d03 = d0(0, true);
            androidx.appcompat.view.menu.e eVar = d03.f6348j;
            if (eVar == null || d03.f6356r || !f02.onPreparePanel(0, d03.f6347i, eVar)) {
                return;
            }
            f02.onMenuOpened(108, d03.f6348j);
            this.f6316y.g();
        }
    }

    private int C0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i10;
        }
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f6310s.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || u.v((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z10) {
        if (this.Z) {
            return false;
        }
        int J = J();
        boolean J0 = J0(n0(this.f6309r, J), z10);
        if (J == 0) {
            c0(this.f6309r).e();
        } else {
            l lVar = this.f6299e0;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (J == 3) {
            b0(this.f6309r).e();
        } else {
            l lVar2 = this.f6300f0;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return J0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.I.findViewById(16908290);
        View decorView = this.f6310s.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f6309r.obtainStyledAttributes(c.j.f3098z0);
        obtainStyledAttributes.getValue(c.j.L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(c.j.M0, contentFrameLayout.getMinWidthMinor());
        int i10 = c.j.J0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = c.j.K0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = c.j.H0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = c.j.I0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f6310s != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        j jVar = new j(callback);
        this.f6311t = jVar;
        window.setCallback(jVar);
        w0 t10 = w0.t(this.f6309r, null, f6291p0);
        Drawable g10 = t10.g(0);
        if (g10 != null) {
            window.setBackgroundDrawable(g10);
        }
        t10.v();
        this.f6310s = window;
    }

    private d.b I0() {
        for (Context context = this.f6309r; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof d.b) {
                return (d.b) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int J() {
        int i10 = this.f6295a0;
        return i10 != -100 ? i10 : d.d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f6309r
            r1 = 0
            android.content.res.Configuration r0 = r6.P(r0, r7, r1)
            boolean r2 = r6.l0()
            android.content.Context r3 = r6.f6309r
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.W
            if (r8 == 0) goto L47
            boolean r8 = d.e.f6292q0
            if (r8 != 0) goto L30
            boolean r8 = r6.X
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f6308q
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f6308q
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.r(r8)
            r8 = r4
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.K0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f6308q
            boolean r0 = r8 instanceof d.b
            if (r0 == 0) goto L5e
            d.b r8 = (d.b) r8
            r8.A(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.J0(int, boolean):boolean");
    }

    private void K0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f6309r.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            d.h.a(resources);
        }
        int i12 = this.f6296b0;
        if (i12 != 0) {
            this.f6309r.setTheme(i12);
            if (i11 >= 23) {
                this.f6309r.getTheme().applyStyle(this.f6296b0, true);
            }
        }
        if (z10) {
            Object obj = this.f6308q;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.i) {
                    if (!((androidx.lifecycle.i) activity).a().b().e(e.c.STARTED)) {
                        return;
                    }
                } else if (!this.Y) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void M() {
        l lVar = this.f6299e0;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.f6300f0;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private void M0(View view) {
        Context context;
        int i10;
        if ((u.s(view) & 8192) != 0) {
            context = this.f6309r;
            i10 = c.c.abc_decor_view_status_guard_light;
        } else {
            context = this.f6309r;
            i10 = c.c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(androidx.core.content.a.d(context, i10));
    }

    private Configuration P(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f6309r.obtainStyledAttributes(c.j.f3098z0);
        int i10 = c.j.E0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(c.j.N0, false)) {
            z(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            z(108);
        }
        if (obtainStyledAttributes.getBoolean(c.j.F0, false)) {
            z(109);
        }
        if (obtainStyledAttributes.getBoolean(c.j.G0, false)) {
            z(10);
        }
        this.Q = obtainStyledAttributes.getBoolean(c.j.A0, false);
        obtainStyledAttributes.recycle();
        X();
        this.f6310s.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f6309r);
        if (this.R) {
            viewGroup = (ViewGroup) from.inflate(this.P ? c.g.abc_screen_simple_overlay_action_mode : c.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.Q) {
            viewGroup = (ViewGroup) from.inflate(c.g.abc_dialog_title_material, (ViewGroup) null);
            this.O = false;
            this.N = false;
        } else if (this.N) {
            TypedValue typedValue = new TypedValue();
            this.f6309r.getTheme().resolveAttribute(c.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new h.d(this.f6309r, typedValue.resourceId) : this.f6309r).inflate(c.g.abc_screen_toolbar, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(c.f.decor_content_parent);
            this.f6316y = c0Var;
            c0Var.setWindowCallback(f0());
            if (this.O) {
                this.f6316y.k(109);
            }
            if (this.L) {
                this.f6316y.k(2);
            }
            if (this.M) {
                this.f6316y.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.N + ", windowActionBarOverlay: " + this.O + ", android:windowIsFloating: " + this.Q + ", windowActionModeOverlay: " + this.P + ", windowNoTitle: " + this.R + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            u.N(viewGroup, new c());
        } else if (viewGroup instanceof g0) {
            ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.f6316y == null) {
            this.J = (TextView) viewGroup.findViewById(c.f.M);
        }
        c1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(c.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6310s.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6310s.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0091e());
        return viewGroup;
    }

    private void W() {
        if (this.H) {
            return;
        }
        this.I = Q();
        CharSequence e02 = e0();
        if (!TextUtils.isEmpty(e02)) {
            c0 c0Var = this.f6316y;
            if (c0Var != null) {
                c0Var.setWindowTitle(e02);
            } else if (y0() != null) {
                y0().t(e02);
            } else {
                TextView textView = this.J;
                if (textView != null) {
                    textView.setText(e02);
                }
            }
        }
        H();
        w0(this.I);
        this.H = true;
        s d02 = d0(0, false);
        if (this.Z) {
            return;
        }
        if (d02 == null || d02.f6348j == null) {
            k0(108);
        }
    }

    private void X() {
        if (this.f6310s == null) {
            Object obj = this.f6308q;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f6310s == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                o.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.d.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                p.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            if (i14 >= 17) {
                n.a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private l b0(Context context) {
        if (this.f6300f0 == null) {
            this.f6300f0 = new k(context);
        }
        return this.f6300f0;
    }

    private l c0(Context context) {
        if (this.f6299e0 == null) {
            this.f6299e0 = new m(d.j.a(context));
        }
        return this.f6299e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g0() {
        /*
            r3 = this;
            r3.W()
            boolean r0 = r3.N
            if (r0 == 0) goto L37
            d.a r0 = r3.f6313v
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f6308q
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            d.k r0 = new d.k
            java.lang.Object r1 = r3.f6308q
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.O
            r0.<init>(r1, r2)
        L1d:
            r3.f6313v = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            d.k r0 = new d.k
            java.lang.Object r1 = r3.f6308q
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            d.a r0 = r3.f6313v
            if (r0 == 0) goto L37
            boolean r1 = r3.f6304j0
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.g0():void");
    }

    private boolean h0(s sVar) {
        View view = sVar.f6347i;
        if (view != null) {
            sVar.f6346h = view;
            return true;
        } else if (sVar.f6348j == null) {
            return false;
        } else {
            if (this.A == null) {
                this.A = new t();
            }
            View view2 = (View) sVar.a(this.A);
            sVar.f6346h = view2;
            return view2 != null;
        }
    }

    private boolean i0(s sVar) {
        sVar.d(a0());
        sVar.f6345g = new r(sVar.f6350l);
        sVar.f6341c = 81;
        return true;
    }

    private boolean j0(s sVar) {
        Context context = this.f6309r;
        int i10 = sVar.f6339a;
        if ((i10 == 0 || i10 == 108) && this.f6316y != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(c.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(c.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(c.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                h.d dVar = new h.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        sVar.c(eVar);
        return true;
    }

    private void k0(int i10) {
        this.f6302h0 = (1 << i10) | this.f6302h0;
        if (this.f6301g0) {
            return;
        }
        u.C(this.f6310s.getDecorView(), this.f6303i0);
        this.f6301g0 = true;
    }

    private boolean l0() {
        if (!this.f6298d0 && (this.f6308q instanceof Activity)) {
            PackageManager packageManager = this.f6309r.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f6309r, this.f6308q.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.f6297c0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f6297c0 = false;
            }
        }
        this.f6298d0 = true;
        return this.f6297c0;
    }

    private boolean q0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            s d02 = d0(i10, true);
            if (d02.f6353o) {
                return false;
            }
            return A0(d02, keyEvent);
        }
        return false;
    }

    private boolean t0(int i10, KeyEvent keyEvent) {
        boolean z10;
        c0 c0Var;
        if (this.B != null) {
            return false;
        }
        boolean z11 = true;
        s d02 = d0(i10, true);
        if (i10 != 0 || (c0Var = this.f6316y) == null || !c0Var.h() || ViewConfiguration.get(this.f6309r).hasPermanentMenuKey()) {
            boolean z12 = d02.f6353o;
            if (z12 || d02.f6352n) {
                O(d02, true);
                z11 = z12;
            } else {
                if (d02.f6351m) {
                    if (d02.f6356r) {
                        d02.f6351m = false;
                        z10 = A0(d02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        x0(d02, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f6316y.c()) {
            z11 = this.f6316y.f();
        } else {
            if (!this.Z && A0(d02, keyEvent)) {
                z11 = this.f6316y.g();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f6309r.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    private void x0(s sVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.f6353o || this.Z) {
            return;
        }
        if (sVar.f6339a == 0) {
            if ((this.f6309r.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback f02 = f0();
        if (f02 != null && !f02.onMenuOpened(sVar.f6339a, sVar.f6348j)) {
            O(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f6309r.getSystemService("window");
        if (windowManager != null && A0(sVar, keyEvent)) {
            ViewGroup viewGroup = sVar.f6345g;
            if (viewGroup == null || sVar.f6355q) {
                if (viewGroup == null) {
                    if (!i0(sVar) || sVar.f6345g == null) {
                        return;
                    }
                } else if (sVar.f6355q && viewGroup.getChildCount() > 0) {
                    sVar.f6345g.removeAllViews();
                }
                if (!h0(sVar) || !sVar.b()) {
                    sVar.f6355q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = sVar.f6346h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                sVar.f6345g.setBackgroundResource(sVar.f6340b);
                ViewParent parent = sVar.f6346h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(sVar.f6346h);
                }
                sVar.f6345g.addView(sVar.f6346h, layoutParams2);
                if (!sVar.f6346h.hasFocus()) {
                    sVar.f6346h.requestFocus();
                }
            } else {
                View view = sVar.f6347i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    sVar.f6352n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, sVar.f6342d, sVar.f6343e, 1002, 8519680, -3);
                    layoutParams3.gravity = sVar.f6341c;
                    layoutParams3.windowAnimations = sVar.f6344f;
                    windowManager.addView(sVar.f6345g, layoutParams3);
                    sVar.f6353o = true;
                }
            }
            i10 = -2;
            sVar.f6352n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, sVar.f6342d, sVar.f6343e, 1002, 8519680, -3);
            layoutParams32.gravity = sVar.f6341c;
            layoutParams32.windowAnimations = sVar.f6344f;
            windowManager.addView(sVar.f6345g, layoutParams32);
            sVar.f6353o = true;
        }
    }

    private boolean z0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f6351m || A0(sVar, keyEvent)) && (eVar = sVar.f6348j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f6316y == null) {
            O(sVar, true);
        }
        return z10;
    }

    @Override // d.d
    public void A(int i10) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6309r).inflate(i10, viewGroup);
        this.f6311t.a().onContentChanged();
    }

    @Override // d.d
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6311t.a().onContentChanged();
    }

    @Override // d.d
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6311t.a().onContentChanged();
    }

    @Override // d.d
    public void D(int i10) {
        this.f6296b0 = i10;
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.H && (viewGroup = this.I) != null && u.w(viewGroup);
    }

    @Override // d.d
    public final void E(CharSequence charSequence) {
        this.f6315x = charSequence;
        c0 c0Var = this.f6316y;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (y0() != null) {
            y0().t(charSequence);
        } else {
            TextView textView = this.J;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public boolean F() {
        return G(true);
    }

    public h.b F0(b.a aVar) {
        d.c cVar;
        if (aVar != null) {
            h.b bVar = this.B;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            d.a m10 = m();
            if (m10 != null) {
                h.b u10 = m10.u(iVar);
                this.B = u10;
                if (u10 != null && (cVar = this.f6312u) != null) {
                    cVar.f(u10);
                }
            }
            if (this.B == null) {
                this.B = G0(iVar);
            }
            return this.B;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    h.b G0(h.b.a r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.G0(h.b$a):h.b");
    }

    void K(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.T;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f6348j;
            }
        }
        if ((sVar == null || sVar.f6353o) && !this.Z) {
            this.f6311t.a().onPanelClosed(i10, menu);
        }
    }

    void L(androidx.appcompat.view.menu.e eVar) {
        if (this.S) {
            return;
        }
        this.S = true;
        this.f6316y.l();
        Window.Callback f02 = f0();
        if (f02 != null && !this.Z) {
            f02.onPanelClosed(108, eVar);
        }
        this.S = false;
    }

    final int L0(e0 e0Var, Rect rect) {
        boolean z10;
        boolean z11;
        int k10 = e0Var != null ? e0Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.C;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
            if (this.C.isShown()) {
                if (this.f6305k0 == null) {
                    this.f6305k0 = new Rect();
                    this.f6306l0 = new Rect();
                }
                Rect rect2 = this.f6305k0;
                Rect rect3 = this.f6306l0;
                if (e0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(e0Var.i(), e0Var.k(), e0Var.j(), e0Var.h());
                }
                c1.a(this.I, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                e0 p10 = u.p(this.I);
                int i13 = p10 == null ? 0 : p10.i();
                int j10 = p10 == null ? 0 : p10.j();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.K != null) {
                    View view = this.K;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != j10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = i13;
                            marginLayoutParams2.rightMargin = j10;
                            this.K.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f6309r);
                    this.K = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i13;
                    layoutParams.rightMargin = j10;
                    this.I.addView(this.K, -1, layoutParams);
                }
                View view3 = this.K;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    M0(this.K);
                }
                if (!this.P && r5) {
                    k10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.C.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return k10;
    }

    void N(int i10) {
        O(d0(i10, true), true);
    }

    void O(s sVar, boolean z10) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z10 && sVar.f6339a == 0 && (c0Var = this.f6316y) != null && c0Var.c()) {
            L(sVar.f6348j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f6309r.getSystemService("window");
        if (windowManager != null && sVar.f6353o && (viewGroup = sVar.f6345g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                K(sVar.f6339a, sVar, null);
            }
        }
        sVar.f6351m = false;
        sVar.f6352n = false;
        sVar.f6353o = false;
        sVar.f6346h = null;
        sVar.f6355q = true;
        if (this.U == sVar) {
            this.U = null;
        }
    }

    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        d.g gVar;
        boolean z10 = false;
        if (this.f6307m0 == null) {
            String string = this.f6309r.obtainStyledAttributes(c.j.f3098z0).getString(c.j.D0);
            if (string == null) {
                gVar = new d.g();
            } else {
                try {
                    this.f6307m0 = (d.g) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    gVar = new d.g();
                }
            }
            this.f6307m0 = gVar;
        }
        boolean z11 = f6290o0;
        if (z11) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z10 = E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z10 = true;
            }
        }
        return this.f6307m0.q(view, str, context, attributeSet, z10, z11, true, b1.b());
    }

    void S() {
        androidx.appcompat.view.menu.e eVar;
        c0 c0Var = this.f6316y;
        if (c0Var != null) {
            c0Var.l();
        }
        if (this.D != null) {
            this.f6310s.getDecorView().removeCallbacks(this.E);
            if (this.D.isShowing()) {
                try {
                    this.D.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.D = null;
        }
        V();
        s d02 = d0(0, false);
        if (d02 == null || (eVar = d02.f6348j) == null) {
            return;
        }
        eVar.close();
    }

    boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f6308q;
        if (((obj instanceof e.a) || (obj instanceof d.f)) && (decorView = this.f6310s.getDecorView()) != null && androidx.core.view.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f6311t.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void U(int i10) {
        s d02;
        s d03 = d0(i10, true);
        if (d03.f6348j != null) {
            Bundle bundle = new Bundle();
            d03.f6348j.Q(bundle);
            if (bundle.size() > 0) {
                d03.f6357s = bundle;
            }
            d03.f6348j.d0();
            d03.f6348j.clear();
        }
        d03.f6356r = true;
        d03.f6355q = true;
        if ((i10 != 108 && i10 != 0) || this.f6316y == null || (d02 = d0(0, false)) == null) {
            return;
        }
        d02.f6351m = false;
        A0(d02, null);
    }

    void V() {
        a0 a0Var = this.F;
        if (a0Var != null) {
            a0Var.c();
        }
    }

    s Y(Menu menu) {
        s[] sVarArr = this.T;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f6348j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s Y;
        Window.Callback f02 = f0();
        if (f02 == null || this.Z || (Y = Y(eVar.D())) == null) {
            return false;
        }
        return f02.onMenuItemSelected(Y.f6339a, menuItem);
    }

    final Context a0() {
        d.a m10 = m();
        Context k10 = m10 != null ? m10.k() : null;
        return k10 == null ? this.f6309r : k10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        B0(true);
    }

    @Override // d.d
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.I.findViewById(16908290)).addView(view, layoutParams);
        this.f6311t.a().onContentChanged();
    }

    protected s d0(int i10, boolean z10) {
        s[] sVarArr = this.T;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[i10 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.T = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar == null) {
            s sVar2 = new s(i10);
            sVarArr[i10] = sVar2;
            return sVar2;
        }
        return sVar;
    }

    final CharSequence e0() {
        Object obj = this.f6308q;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6315x;
    }

    @Override // d.d
    public Context f(Context context) {
        this.W = true;
        int n02 = n0(context, J());
        if (f6293r0 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, P(context, n02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof h.d) {
            try {
                ((h.d) context).a(P(context, n02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (f6292q0) {
            try {
                Configuration configuration = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
                Configuration configuration2 = context.getResources().getConfiguration();
                Configuration P = P(context, n02, configuration.equals(configuration2) ? null : Z(configuration, configuration2));
                h.d dVar = new h.d(context, c.i.Theme_AppCompat_Empty);
                dVar.a(P);
                boolean z10 = false;
                try {
                    z10 = context.getTheme() != null;
                } catch (NullPointerException unused3) {
                }
                if (z10) {
                    h.f.a(dVar.getTheme());
                }
                return super.f(dVar);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("Application failed to obtain resources from itself", e10);
            }
        }
        return super.f(context);
    }

    final Window.Callback f0() {
        return this.f6310s.getCallback();
    }

    @Override // d.d
    public <T extends View> T i(int i10) {
        W();
        return (T) this.f6310s.findViewById(i10);
    }

    @Override // d.d
    public int k() {
        return this.f6295a0;
    }

    @Override // d.d
    public MenuInflater l() {
        if (this.f6314w == null) {
            g0();
            d.a aVar = this.f6313v;
            this.f6314w = new h.g(aVar != null ? aVar.k() : this.f6309r);
        }
        return this.f6314w;
    }

    @Override // d.d
    public d.a m() {
        g0();
        return this.f6313v;
    }

    public boolean m0() {
        return this.G;
    }

    @Override // d.d
    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f6309r);
        if (from.getFactory() == null) {
            androidx.core.view.f.b(from, this);
        } else if (from.getFactory2() instanceof e) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    int n0(Context context, int i10) {
        l c02;
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        c02 = b0(context);
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                } else {
                    c02 = c0(context);
                }
                return c02.c();
            }
            return i10;
        }
        return -1;
    }

    @Override // d.d
    public void o() {
        d.a m10 = m();
        if (m10 == null || !m10.l()) {
            k0(0);
        }
    }

    boolean o0() {
        h.b bVar = this.B;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        d.a m10 = m();
        return m10 != null && m10.h();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // d.d
    public void p(Configuration configuration) {
        d.a m10;
        if (this.N && this.H && (m10 = m()) != null) {
            m10.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f6309r);
        G(false);
    }

    boolean p0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.V = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // d.d
    public void q(Bundle bundle) {
        this.W = true;
        G(false);
        X();
        Object obj = this.f6308q;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                d.a y02 = y0();
                if (y02 == null) {
                    this.f6304j0 = true;
                } else {
                    y02.r(true);
                }
            }
            d.d.c(this);
        }
        this.X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // d.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6308q
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            d.d.x(r3)
        L9:
            boolean r0 = r3.f6301g0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f6310s
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f6303i0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.Y = r0
            r0 = 1
            r3.Z = r0
            int r0 = r3.f6295a0
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f6308q
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            m.g<java.lang.String, java.lang.Integer> r0 = d.e.f6289n0
            java.lang.Object r1 = r3.f6308q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6295a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            m.g<java.lang.String, java.lang.Integer> r0 = d.e.f6289n0
            java.lang.Object r1 = r3.f6308q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            d.a r0 = r3.f6313v
            if (r0 == 0) goto L5e
            r0.n()
        L5e:
            r3.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.r():void");
    }

    boolean r0(int i10, KeyEvent keyEvent) {
        d.a m10 = m();
        if (m10 == null || !m10.o(i10, keyEvent)) {
            s sVar = this.U;
            if (sVar != null && z0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                s sVar2 = this.U;
                if (sVar2 != null) {
                    sVar2.f6352n = true;
                }
                return true;
            }
            if (this.U == null) {
                s d02 = d0(0, true);
                A0(d02, keyEvent);
                boolean z02 = z0(d02, keyEvent.getKeyCode(), keyEvent, 1);
                d02.f6351m = false;
                if (z02) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // d.d
    public void s(Bundle bundle) {
        W();
    }

    boolean s0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.V;
            this.V = false;
            s d02 = d0(0, false);
            if (d02 != null && d02.f6353o) {
                if (!z10) {
                    O(d02, true);
                }
                return true;
            } else if (o0()) {
                return true;
            }
        } else if (i10 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // d.d
    public void t() {
        d.a m10 = m();
        if (m10 != null) {
            m10.s(true);
        }
    }

    @Override // d.d
    public void u(Bundle bundle) {
    }

    void u0(int i10) {
        d.a m10;
        if (i10 != 108 || (m10 = m()) == null) {
            return;
        }
        m10.i(true);
    }

    @Override // d.d
    public void v() {
        this.Y = true;
        F();
    }

    void v0(int i10) {
        if (i10 == 108) {
            d.a m10 = m();
            if (m10 != null) {
                m10.i(false);
            }
        } else if (i10 == 0) {
            s d02 = d0(i10, true);
            if (d02.f6353o) {
                O(d02, false);
            }
        }
    }

    @Override // d.d
    public void w() {
        this.Y = false;
        d.a m10 = m();
        if (m10 != null) {
            m10.s(false);
        }
    }

    void w0(ViewGroup viewGroup) {
    }

    final d.a y0() {
        return this.f6313v;
    }

    @Override // d.d
    public boolean z(int i10) {
        int C0 = C0(i10);
        if (this.R && C0 == 108) {
            return false;
        }
        if (this.N && C0 == 1) {
            this.N = false;
        }
        if (C0 == 1) {
            H0();
            this.R = true;
            return true;
        } else if (C0 == 2) {
            H0();
            this.L = true;
            return true;
        } else if (C0 == 5) {
            H0();
            this.M = true;
            return true;
        } else if (C0 == 10) {
            H0();
            this.P = true;
            return true;
        } else if (C0 == 108) {
            H0();
            this.N = true;
            return true;
        } else if (C0 != 109) {
            return this.f6310s.requestFeature(C0);
        } else {
            H0();
            this.O = true;
            return true;
        }
    }
}
