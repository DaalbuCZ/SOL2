package r3;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q3.j;
/* loaded from: classes.dex */
public final class f extends GLSurfaceView {

    /* renamed from: n  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f12999n;

    /* renamed from: o  reason: collision with root package name */
    private final SensorManager f13000o;

    /* renamed from: p  reason: collision with root package name */
    private final Sensor f13001p;

    /* renamed from: q  reason: collision with root package name */
    private final c f13002q;

    /* renamed from: r  reason: collision with root package name */
    private final Handler f13003r;

    /* renamed from: s  reason: collision with root package name */
    private final d f13004s;

    /* renamed from: t  reason: collision with root package name */
    private SurfaceTexture f13005t;

    /* renamed from: u  reason: collision with root package name */
    private Surface f13006u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f13007v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f13008w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f13009x;

    /* loaded from: classes.dex */
    public interface a {
        void h(Surface surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.f13006u;
        if (surface != null) {
            Iterator<a> it = this.f12999n.iterator();
            while (it.hasNext()) {
                it.next().h(surface);
            }
        }
        c(this.f13005t, surface);
        this.f13005t = null;
        this.f13006u = null;
    }

    private static void c(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void e() {
        boolean z10 = this.f13007v && this.f13008w;
        Sensor sensor = this.f13001p;
        if (sensor == null || z10 == this.f13009x) {
            return;
        }
        if (z10) {
            this.f13000o.registerListener(this.f13002q, sensor, 0);
        } else {
            this.f13000o.unregisterListener(this.f13002q);
        }
        this.f13009x = z10;
    }

    public void d(a aVar) {
        this.f12999n.remove(aVar);
    }

    public r3.a getCameraMotionListener() {
        return this.f13004s;
    }

    public j getVideoFrameMetadataListener() {
        return this.f13004s;
    }

    public Surface getVideoSurface() {
        return this.f13006u;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13003r.post(new Runnable() { // from class: r3.e
            @Override // java.lang.Runnable
            public final void run() {
                f.this.b();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f13008w = false;
        e();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f13008w = true;
        e();
    }

    public void setDefaultStereoMode(int i10) {
        throw null;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f13007v = z10;
        e();
    }
}
