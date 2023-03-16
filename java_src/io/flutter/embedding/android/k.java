package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.layout.j;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.s;
import io.flutter.view.c;
import j8.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n8.a;
/* loaded from: classes.dex */
public class k extends FrameLayout implements a.c, s.e {
    private s A;
    private io.flutter.embedding.android.a B;
    private io.flutter.view.c C;
    private TextServicesManager D;
    private z E;
    private final a.g F;
    private final c.k G;
    private final ContentObserver H;
    private final j8.b I;
    private final androidx.core.util.a<androidx.window.layout.v> J;

    /* renamed from: n  reason: collision with root package name */
    private h f8524n;

    /* renamed from: o  reason: collision with root package name */
    private i f8525o;

    /* renamed from: p  reason: collision with root package name */
    private io.flutter.embedding.android.g f8526p;

    /* renamed from: q  reason: collision with root package name */
    j8.c f8527q;

    /* renamed from: r  reason: collision with root package name */
    private j8.c f8528r;

    /* renamed from: s  reason: collision with root package name */
    private final Set<j8.b> f8529s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f8530t;

    /* renamed from: u  reason: collision with root package name */
    private io.flutter.embedding.engine.a f8531u;

    /* renamed from: v  reason: collision with root package name */
    private final Set<f> f8532v;

    /* renamed from: w  reason: collision with root package name */
    private n8.a f8533w;

    /* renamed from: x  reason: collision with root package name */
    private io.flutter.plugin.editing.f f8534x;

    /* renamed from: y  reason: collision with root package name */
    private io.flutter.plugin.editing.d f8535y;

    /* renamed from: z  reason: collision with root package name */
    private m8.a f8536z;

    /* loaded from: classes.dex */
    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z10, boolean z11) {
            k.this.A(z10, z11);
        }
    }

    /* loaded from: classes.dex */
    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (k.this.f8531u == null) {
                return;
            }
            x7.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            k.this.C();
        }
    }

    /* loaded from: classes.dex */
    class c implements j8.b {
        c() {
        }

        @Override // j8.b
        public void d() {
            k.this.f8530t = false;
            for (j8.b bVar : k.this.f8529s) {
                bVar.d();
            }
        }

        @Override // j8.b
        public void g() {
            k.this.f8530t = true;
            for (j8.b bVar : k.this.f8529s) {
                bVar.g();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements androidx.core.util.a<androidx.window.layout.v> {
        d() {
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(androidx.window.layout.v vVar) {
            k.this.setWindowInfoListenerDisplayFeatures(vVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements j8.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j8.a f8541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f8542b;

        e(j8.a aVar, Runnable runnable) {
            this.f8541a = aVar;
            this.f8542b = runnable;
        }

        @Override // j8.b
        public void d() {
        }

        @Override // j8.b
        public void g() {
            this.f8541a.q(this);
            this.f8542b.run();
            k kVar = k.this;
            if ((kVar.f8527q instanceof io.flutter.embedding.android.g) || kVar.f8526p == null) {
                return;
            }
            k.this.f8526p.g();
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private k(Context context, AttributeSet attributeSet, h hVar) {
        super(context, attributeSet);
        this.f8529s = new HashSet();
        this.f8532v = new HashSet();
        this.F = new a.g();
        this.G = new a();
        this.H = new b(new Handler(Looper.getMainLooper()));
        this.I = new c();
        this.J = new d();
        this.f8524n = hVar;
        this.f8527q = hVar;
        v();
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.f8529s = new HashSet();
        this.f8532v = new HashSet();
        this.F = new a.g();
        this.G = new a();
        this.H = new b(new Handler(Looper.getMainLooper()));
        this.I = new c();
        this.J = new d();
        this.f8525o = iVar;
        this.f8527q = iVar;
        v();
    }

    public k(Context context, h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10, boolean z11) {
        boolean z12 = false;
        if (!this.f8531u.p().l() && !z10 && !z11) {
            z12 = true;
        }
        setWillNotDraw(z12);
    }

    private void D() {
        if (!w()) {
            x7.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.F.f10435a = getResources().getDisplayMetrics().density;
        this.F.f10450p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f8531u.p().t(this.F);
    }

    private g o() {
        Context context = getContext();
        int i10 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            } else if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    @TargetApi(20)
    private int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void v() {
        View view;
        x7.b.f("FlutterView", "Initializing FlutterView");
        if (this.f8524n != null) {
            x7.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f8524n;
        } else if (this.f8525o != null) {
            x7.b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f8525o;
        } else {
            x7.b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f8526p;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean x(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    public void B(Runnable runnable) {
        io.flutter.embedding.android.g gVar = this.f8526p;
        if (gVar == null) {
            x7.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        j8.c cVar = this.f8528r;
        if (cVar == null) {
            x7.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f8527q = cVar;
        this.f8528r = null;
        io.flutter.embedding.engine.a aVar = this.f8531u;
        if (aVar == null) {
            gVar.g();
            runnable.run();
            return;
        }
        j8.a p10 = aVar.p();
        if (p10 == null) {
            this.f8526p.g();
            runnable.run();
            return;
        }
        this.f8527q.f(p10);
        p10.g(new e(p10, runnable));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r3 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void C() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1a
            k8.m$b r0 = k8.m.b.dark
            goto L1c
        L1a:
            k8.m$b r0 = k8.m.b.light
        L1c:
            android.view.textservice.TextServicesManager r3 = r6.D
            if (r3 == 0) goto L40
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            j$.util.stream.Stream r3 = j$.util.Collection$EL.stream(r3)
            io.flutter.embedding.android.j r4 = io.flutter.embedding.android.j.f8523a
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.D
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L40
            if (r3 == 0) goto L40
        L3e:
            r3 = r2
            goto L41
        L40:
            r3 = r1
        L41:
            io.flutter.embedding.engine.a r4 = r6.f8531u
            k8.m r4 = r4.r()
            k8.m$a r4 = r4.a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            k8.m$a r4 = r4.e(r5)
            k8.m$a r3 = r4.c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L6e
            r1 = r2
        L6e:
            k8.m$a r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            k8.m$a r1 = r1.f(r2)
            k8.m$a r0 = r1.d(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.k.C():void");
    }

    @Override // io.flutter.embedding.android.s.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f8534x.j(sparseArray);
    }

    @Override // n8.a.c
    @TargetApi(c.j.f3076u3)
    public PointerIcon b(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    @Override // io.flutter.embedding.android.s.e
    public boolean c(KeyEvent keyEvent) {
        return this.f8534x.r(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f8531u;
        return aVar != null ? aVar.n().F(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (w() && this.A.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT <= 19) {
            a.g gVar = this.F;
            gVar.f10438d = rect.top;
            gVar.f10439e = rect.right;
            gVar.f10440f = 0;
            gVar.f10441g = rect.left;
            gVar.f10442h = 0;
            gVar.f10443i = 0;
            gVar.f10444j = rect.bottom;
            gVar.f10445k = 0;
            x7.b.f("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.F.f10438d + ", Left: " + this.F.f10441g + ", Right: " + this.F.f10439e + "\nKeyboard insets: Bottom: " + this.F.f10444j + ", Left: " + this.F.f10445k + ", Right: " + this.F.f10443i);
            D();
            return true;
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.C;
        if (cVar == null || !cVar.D()) {
            return null;
        }
        return this.C;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f8531u;
    }

    @Override // io.flutter.embedding.android.s.e
    public l8.c getBinaryMessenger() {
        return this.f8531u.h();
    }

    public io.flutter.embedding.android.g getCurrentImageSurface() {
        return this.f8526p;
    }

    public boolean j() {
        io.flutter.embedding.android.g gVar = this.f8526p;
        if (gVar != null) {
            return gVar.a();
        }
        return false;
    }

    public void k(f fVar) {
        this.f8532v.add(fVar);
    }

    public void l(j8.b bVar) {
        this.f8529s.add(bVar);
    }

    public void m(io.flutter.embedding.android.g gVar) {
        io.flutter.embedding.engine.a aVar = this.f8531u;
        if (aVar != null) {
            gVar.f(aVar.p());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        x7.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (w()) {
            if (aVar == this.f8531u) {
                x7.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                x7.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f8531u = aVar;
        j8.a p10 = aVar.p();
        this.f8530t = p10.k();
        this.f8527q.f(p10);
        p10.g(this.I);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f8533w = new n8.a(this, this.f8531u.k());
        }
        this.f8534x = new io.flutter.plugin.editing.f(this, this.f8531u.u(), this.f8531u.n());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.D = textServicesManager;
            this.f8535y = new io.flutter.plugin.editing.d(textServicesManager, this.f8531u.s());
        } catch (Exception unused) {
            x7.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f8536z = this.f8531u.j();
        this.A = new s(this);
        this.B = new io.flutter.embedding.android.a(this.f8531u.p(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, aVar.f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f8531u.n());
        this.C = cVar;
        cVar.Y(this.G);
        A(this.C.D(), this.C.E());
        this.f8531u.n().a(this.C);
        this.f8531u.n().D(this.f8531u.p());
        this.f8534x.q().restartInput(this);
        C();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.H);
        D();
        aVar.n().E(this);
        for (f fVar : this.f8532v) {
            fVar.b(aVar);
        }
        if (this.f8530t) {
            this.I.g();
        }
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            a.g gVar = this.F;
            gVar.f10446l = systemGestureInsets.top;
            gVar.f10447m = systemGestureInsets.right;
            gVar.f10448n = systemGestureInsets.bottom;
            gVar.f10449o = systemGestureInsets.left;
        }
        boolean z10 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z11 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i10 >= 30) {
            int navigationBars = z11 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z10) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            a.g gVar2 = this.F;
            gVar2.f10438d = insets.top;
            gVar2.f10439e = insets.right;
            gVar2.f10440f = insets.bottom;
            gVar2.f10441g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            a.g gVar3 = this.F;
            gVar3.f10442h = insets2.top;
            gVar3.f10443i = insets2.right;
            gVar3.f10444j = insets2.bottom;
            gVar3.f10445k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            a.g gVar4 = this.F;
            gVar4.f10446l = insets3.top;
            gVar4.f10447m = insets3.right;
            gVar4.f10448n = insets3.bottom;
            gVar4.f10449o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.g gVar5 = this.F;
                gVar5.f10438d = Math.max(Math.max(gVar5.f10438d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.g gVar6 = this.F;
                gVar6.f10439e = Math.max(Math.max(gVar6.f10439e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.g gVar7 = this.F;
                gVar7.f10440f = Math.max(Math.max(gVar7.f10440f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.g gVar8 = this.F;
                gVar8.f10441g = Math.max(Math.max(gVar8.f10441g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z11) {
                gVar9 = o();
            }
            this.F.f10438d = z10 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.F.f10439e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.F.f10440f = (z11 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.F.f10441g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.F;
            gVar10.f10442h = 0;
            gVar10.f10443i = 0;
            gVar10.f10444j = t(windowInsets);
            this.F.f10445k = 0;
        }
        x7.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.F.f10438d + ", Left: " + this.F.f10441g + ", Right: " + this.F.f10439e + "\nKeyboard insets: Bottom: " + this.F.f10444j + ", Left: " + this.F.f10445k + ", Right: " + this.F.f10443i + "System Gesture Insets - Left: " + this.F.f10449o + ", Top: " + this.F.f10446l + ", Right: " + this.F.f10447m + ", Bottom: " + this.F.f10444j);
        D();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = r();
        Activity e10 = w8.h.e(getContext());
        z zVar = this.E;
        if (zVar == null || e10 == null) {
            return;
        }
        zVar.a(e10, androidx.core.content.a.i(getContext()), this.J);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f8531u != null) {
            x7.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f8536z.d(configuration);
            C();
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !w() ? super.onCreateInputConnection(editorInfo) : this.f8534x.o(this, this.A, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        z zVar = this.E;
        if (zVar != null) {
            zVar.b(this.J);
        }
        this.E = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (w() && this.B.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !w() ? super.onHoverEvent(motionEvent) : this.C.J(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.f8534x.z(viewStructure, i10);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        x7.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i12 + " x " + i13 + ", it is now " + i10 + " x " + i11);
        a.g gVar = this.F;
        gVar.f10436b = i10;
        gVar.f10437c = i11;
        D();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (w()) {
            if (Build.VERSION.SDK_INT >= 21) {
                requestUnbufferedDispatch(motionEvent);
            }
            return this.B.f(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        this.f8527q.e();
        io.flutter.embedding.android.g gVar = this.f8526p;
        if (gVar == null) {
            io.flutter.embedding.android.g q10 = q();
            this.f8526p = q10;
            addView(q10);
        } else {
            gVar.j(getWidth(), getHeight());
        }
        this.f8528r = this.f8527q;
        io.flutter.embedding.android.g gVar2 = this.f8526p;
        this.f8527q = gVar2;
        io.flutter.embedding.engine.a aVar = this.f8531u;
        if (aVar != null) {
            gVar2.f(aVar.p());
        }
    }

    public io.flutter.embedding.android.g q() {
        return new io.flutter.embedding.android.g(getContext(), getWidth(), getHeight(), g.b.background);
    }

    protected z r() {
        try {
            return new z(new j0.a(androidx.window.layout.q.f2491a.a(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        x7.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f8531u);
        if (!w()) {
            x7.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (f fVar : this.f8532v) {
            fVar.a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.H);
        this.f8531u.n().K();
        this.f8531u.n().d();
        this.C.Q();
        this.C = null;
        this.f8534x.q().restartInput(this);
        this.f8534x.p();
        this.A.c();
        io.flutter.plugin.editing.d dVar = this.f8535y;
        if (dVar != null) {
            dVar.b();
        }
        n8.a aVar = this.f8533w;
        if (aVar != null) {
            aVar.c();
        }
        j8.a p10 = this.f8531u.p();
        this.f8530t = false;
        p10.q(this.I);
        p10.v();
        p10.s(false);
        j8.c cVar = this.f8528r;
        if (cVar != null && this.f8527q == this.f8526p) {
            this.f8527q = cVar;
        }
        this.f8527q.g();
        io.flutter.embedding.android.g gVar = this.f8526p;
        if (gVar != null) {
            gVar.c();
            removeView(this.f8526p);
            this.f8526p = null;
        }
        this.f8528r = null;
        this.f8531u = null;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        j8.c cVar = this.f8527q;
        if (cVar instanceof h) {
            ((h) cVar).setVisibility(i10);
        }
    }

    @TargetApi(28)
    protected void setWindowInfoListenerDisplayFeatures(androidx.window.layout.v vVar) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<androidx.window.layout.e> a10 = vVar.a();
        ArrayList arrayList = new ArrayList();
        for (androidx.window.layout.e eVar : a10) {
            x7.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + eVar.a().toString() + " and type = " + eVar.getClass().getSimpleName());
            if (eVar instanceof androidx.window.layout.j) {
                androidx.window.layout.j jVar = (androidx.window.layout.j) eVar;
                arrayList.add(new a.b(eVar.a(), jVar.g() == j.a.f2451d ? a.d.HINGE : a.d.FOLD, jVar.f() == j.b.f2454c ? a.c.POSTURE_FLAT : jVar.f() == j.b.f2455d ? a.c.POSTURE_HALF_OPENED : a.c.UNKNOWN));
            } else {
                arrayList.add(new a.b(eVar.a(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                x7.b.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new a.b(rect, a.d.CUTOUT));
            }
        }
        this.F.f10451q = arrayList;
        D();
    }

    public boolean u() {
        return this.f8530t;
    }

    public boolean w() {
        io.flutter.embedding.engine.a aVar = this.f8531u;
        return aVar != null && aVar.p() == this.f8527q.getAttachedRenderer();
    }

    public void y(f fVar) {
        this.f8532v.remove(fVar);
    }

    public void z(j8.b bVar) {
        this.f8529s.remove(bVar);
    }
}
