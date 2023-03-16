package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
/* loaded from: classes.dex */
public class i extends TextureView implements j8.c {

    /* renamed from: n  reason: collision with root package name */
    private boolean f8516n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8517o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8518p;

    /* renamed from: q  reason: collision with root package name */
    private j8.a f8519q;

    /* renamed from: r  reason: collision with root package name */
    private Surface f8520r;

    /* renamed from: s  reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f8521s;

    /* loaded from: classes.dex */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            x7.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            i.this.f8516n = true;
            if (i.this.f8517o) {
                i.this.l();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            x7.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            i.this.f8516n = false;
            if (i.this.f8517o) {
                i.this.m();
            }
            if (i.this.f8520r != null) {
                i.this.f8520r.release();
                i.this.f8520r = null;
                return true;
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            x7.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (i.this.f8517o) {
                i.this.k(i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8516n = false;
        this.f8517o = false;
        this.f8518p = false;
        this.f8521s = new a();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10, int i11) {
        if (this.f8519q == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        x7.b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
        this.f8519q.w(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f8519q == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f8520r;
        if (surface != null) {
            surface.release();
            this.f8520r = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f8520r = surface2;
        this.f8519q.u(surface2, this.f8518p);
        this.f8518p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        j8.a aVar = this.f8519q;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.v();
        Surface surface = this.f8520r;
        if (surface != null) {
            surface.release();
            this.f8520r = null;
        }
    }

    private void n() {
        setSurfaceTextureListener(this.f8521s);
    }

    @Override // j8.c
    public void e() {
        if (this.f8519q == null) {
            x7.b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f8519q = null;
        this.f8518p = true;
        this.f8517o = false;
    }

    @Override // j8.c
    public void f(j8.a aVar) {
        x7.b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f8519q != null) {
            x7.b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f8519q.v();
        }
        this.f8519q = aVar;
        this.f8517o = true;
        if (this.f8516n) {
            x7.b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
    }

    @Override // j8.c
    public void g() {
        if (this.f8519q == null) {
            x7.b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            x7.b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        this.f8519q = null;
        this.f8517o = false;
    }

    @Override // j8.c
    public j8.a getAttachedRenderer() {
        return this.f8519q;
    }

    public void setRenderSurface(Surface surface) {
        this.f8520r = surface;
    }
}
