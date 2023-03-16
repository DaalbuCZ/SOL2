package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/* loaded from: classes.dex */
public class h extends SurfaceView implements j8.c {

    /* renamed from: n  reason: collision with root package name */
    private final boolean f8507n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8508o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8509p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f8510q;

    /* renamed from: r  reason: collision with root package name */
    private j8.a f8511r;

    /* renamed from: s  reason: collision with root package name */
    private final SurfaceHolder.Callback f8512s;

    /* renamed from: t  reason: collision with root package name */
    private final j8.b f8513t;

    /* loaded from: classes.dex */
    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            x7.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (h.this.f8510q) {
                h.this.j(i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            x7.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            h.this.f8508o = true;
            if (h.this.f8510q) {
                h.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            x7.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            h.this.f8508o = false;
            if (h.this.f8510q) {
                h.this.l();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements j8.b {
        b() {
        }

        @Override // j8.b
        public void d() {
        }

        @Override // j8.b
        public void g() {
            x7.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            h.this.setAlpha(1.0f);
            if (h.this.f8511r != null) {
                h.this.f8511r.q(this);
            }
        }
    }

    private h(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.f8508o = false;
        this.f8509p = false;
        this.f8510q = false;
        this.f8512s = new a();
        this.f8513t = new b();
        this.f8507n = z10;
        m();
    }

    public h(Context context, boolean z10) {
        this(context, null, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i10, int i11) {
        if (this.f8511r == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        x7.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
        this.f8511r.w(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f8511r == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f8511r.u(getHolder().getSurface(), this.f8509p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        j8.a aVar = this.f8511r;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.v();
    }

    private void m() {
        if (this.f8507n) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f8512s);
        setAlpha(0.0f);
    }

    @Override // j8.c
    public void e() {
        if (this.f8511r == null) {
            x7.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f8511r = null;
        this.f8509p = true;
        this.f8510q = false;
    }

    @Override // j8.c
    public void f(j8.a aVar) {
        x7.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f8511r != null) {
            x7.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f8511r.v();
            this.f8511r.q(this.f8513t);
        }
        this.f8511r = aVar;
        this.f8510q = true;
        aVar.g(this.f8513t);
        if (this.f8508o) {
            x7.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f8509p = false;
    }

    @Override // j8.c
    public void g() {
        if (this.f8511r == null) {
            x7.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            x7.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        setAlpha(0.0f);
        this.f8511r.q(this.f8513t);
        this.f8511r = null;
        this.f8510q = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // j8.c
    public j8.a getAttachedRenderer() {
        return this.f8511r;
    }
}
