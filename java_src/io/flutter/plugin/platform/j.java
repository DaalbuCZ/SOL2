package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.view.d;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(c.j.f3071t3)
/* loaded from: classes.dex */
public class j extends FrameLayout {
    private final d.b A;

    /* renamed from: n  reason: collision with root package name */
    private int f8770n;

    /* renamed from: o  reason: collision with root package name */
    private int f8771o;

    /* renamed from: p  reason: collision with root package name */
    private int f8772p;

    /* renamed from: q  reason: collision with root package name */
    private int f8773q;

    /* renamed from: r  reason: collision with root package name */
    private int f8774r;

    /* renamed from: s  reason: collision with root package name */
    private int f8775s;

    /* renamed from: t  reason: collision with root package name */
    private SurfaceTexture f8776t;

    /* renamed from: u  reason: collision with root package name */
    private Surface f8777u;

    /* renamed from: v  reason: collision with root package name */
    private io.flutter.embedding.android.a f8778v;

    /* renamed from: w  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f8779w;

    /* renamed from: x  reason: collision with root package name */
    private final AtomicLong f8780x;

    /* renamed from: y  reason: collision with root package name */
    private final d.a f8781y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f8782z;

    /* loaded from: classes.dex */
    class a implements d.a {
        a() {
        }

        @Override // io.flutter.view.d.a
        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                j.this.f8780x.decrementAndGet();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements d.b {
        b() {
        }

        @Override // io.flutter.view.d.b
        public void onTrimMemory(int i10) {
            if (i10 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            j.this.f8782z = true;
        }
    }

    /* loaded from: classes.dex */
    class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f8785n;

        c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f8785n = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f8785n;
            j jVar = j.this;
            onFocusChangeListener.onFocusChange(jVar, w8.h.c(jVar));
        }
    }

    public j(Context context) {
        super(context);
        this.f8780x = new AtomicLong(0L);
        this.f8781y = new a();
        this.f8782z = false;
        this.A = new b();
        setWillNotDraw(false);
    }

    public j(Context context, d.c cVar) {
        this(context);
        cVar.c(this.f8781y);
        cVar.b(this.A);
        l(cVar.d());
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f8780x.incrementAndGet();
        }
    }

    private void g() {
        if (this.f8782z) {
            Surface surface = this.f8777u;
            if (surface != null) {
                surface.release();
            }
            this.f8777u = c(this.f8776t);
            this.f8782z = false;
        }
    }

    private boolean n() {
        return Build.VERSION.SDK_INT != 29 || this.f8780x.get() <= 0;
    }

    protected Surface c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int d() {
        return this.f8775s;
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.f8777u;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (surface.isValid()) {
            SurfaceTexture surfaceTexture = this.f8776t;
            if (surfaceTexture != null && !surfaceTexture.isReleased()) {
                if (!n()) {
                    invalidate();
                    return;
                }
                g();
                Canvas lockHardwareCanvas = this.f8777u.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    f();
                    return;
                } finally {
                    this.f8777u.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            str = "Invalid texture. The platform view cannot be displayed.";
        } else {
            str = "Invalid surface. The platform view cannot be displayed.";
        }
        x7.b.b("PlatformViewWrapper", str);
    }

    public int e() {
        return this.f8774r;
    }

    public void h() {
        this.f8776t = null;
        Surface surface = this.f8777u;
        if (surface != null) {
            surface.release();
            this.f8777u = null;
        }
    }

    public void i(int i10, int i11) {
        this.f8774r = i10;
        this.f8775s = i11;
        SurfaceTexture surfaceTexture = this.f8776t;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f8772p = layoutParams.leftMargin;
        this.f8773q = layoutParams.topMargin;
    }

    public void k(View.OnFocusChangeListener onFocusChangeListener) {
        o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f8779w == null) {
            c cVar = new c(onFocusChangeListener);
            this.f8779w = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    @SuppressLint({"NewApi"})
    public void l(SurfaceTexture surfaceTexture) {
        int i10;
        if (Build.VERSION.SDK_INT < 23) {
            x7.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f8776t = surfaceTexture;
        int i11 = this.f8774r;
        if (i11 > 0 && (i10 = this.f8775s) > 0) {
            surfaceTexture.setDefaultBufferSize(i11, i10);
        }
        Surface surface = this.f8777u;
        if (surface != null) {
            surface.release();
        }
        Surface c10 = c(surfaceTexture);
        this.f8777u = c10;
        Canvas lockHardwareCanvas = c10.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            f();
        } finally {
            this.f8777u.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void m(io.flutter.embedding.android.a aVar) {
        this.f8778v = aVar;
    }

    public void o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f8779w) == null) {
            return;
        }
        this.f8779w = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (this.f8778v == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f8772p;
            this.f8770n = i11;
            i10 = this.f8773q;
            this.f8771o = i10;
            f10 = i11;
        } else if (action == 2) {
            matrix.postTranslate(this.f8770n, this.f8771o);
            this.f8770n = this.f8772p;
            this.f8771o = this.f8773q;
            return this.f8778v.g(motionEvent, matrix);
        } else {
            f10 = this.f8772p;
            i10 = this.f8773q;
        }
        matrix.postTranslate(f10, i10);
        return this.f8778v.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
