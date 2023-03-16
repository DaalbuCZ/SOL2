package j8;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.d;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class a implements io.flutter.view.d {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f10401a;

    /* renamed from: c  reason: collision with root package name */
    private Surface f10403c;

    /* renamed from: g  reason: collision with root package name */
    private final j8.b f10407g;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f10402b = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    private boolean f10404d = false;

    /* renamed from: e  reason: collision with root package name */
    private Handler f10405e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private final Set<WeakReference<d.b>> f10406f = new HashSet();

    /* renamed from: j8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0145a implements j8.b {
        C0145a() {
        }

        @Override // j8.b
        public void d() {
            a.this.f10404d = false;
        }

        @Override // j8.b
        public void g() {
            a.this.f10404d = true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f10409a;

        /* renamed from: b  reason: collision with root package name */
        public final d f10410b;

        /* renamed from: c  reason: collision with root package name */
        public final c f10411c;

        public b(Rect rect, d dVar) {
            this.f10409a = rect;
            this.f10410b = dVar;
            this.f10411c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f10409a = rect;
            this.f10410b = dVar;
            this.f10411c = cVar;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: n  reason: collision with root package name */
        public final int f10416n;

        c(int i10) {
            this.f10416n = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: n  reason: collision with root package name */
        public final int f10422n;

        d(int i10) {
            this.f10422n = i10;
        }
    }

    /* loaded from: classes.dex */
    static final class e implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final long f10423n;

        /* renamed from: o  reason: collision with root package name */
        private final FlutterJNI f10424o;

        e(long j10, FlutterJNI flutterJNI) {
            this.f10423n = j10;
            this.f10424o = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10424o.isAttached()) {
                x7.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f10423n + ").");
                this.f10424o.unregisterTexture(this.f10423n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class f implements d.c, d.b {

        /* renamed from: a  reason: collision with root package name */
        private final long f10425a;

        /* renamed from: b  reason: collision with root package name */
        private final SurfaceTextureWrapper f10426b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10427c;

        /* renamed from: d  reason: collision with root package name */
        private d.b f10428d;

        /* renamed from: e  reason: collision with root package name */
        private d.a f10429e;

        /* renamed from: f  reason: collision with root package name */
        private final Runnable f10430f;

        /* renamed from: g  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f10431g;

        /* renamed from: j8.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0146a implements Runnable {
            RunnableC0146a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f10429e != null) {
                    f.this.f10429e.a();
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (f.this.f10427c || !a.this.f10401a.isAttached()) {
                    return;
                }
                f fVar = f.this;
                a.this.m(fVar.f10425a);
            }
        }

        f(long j10, SurfaceTexture surfaceTexture) {
            RunnableC0146a runnableC0146a = new RunnableC0146a();
            this.f10430f = runnableC0146a;
            this.f10431g = new b();
            this.f10425a = j10;
            this.f10426b = new SurfaceTextureWrapper(surfaceTexture, runnableC0146a);
            if (Build.VERSION.SDK_INT >= 21) {
                d().setOnFrameAvailableListener(this.f10431g, new Handler());
            } else {
                d().setOnFrameAvailableListener(this.f10431g);
            }
        }

        private void i() {
            a.this.r(this);
        }

        @Override // io.flutter.view.d.c
        public void a() {
            if (this.f10427c) {
                return;
            }
            x7.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f10425a + ").");
            this.f10426b.release();
            a.this.y(this.f10425a);
            i();
            this.f10427c = true;
        }

        @Override // io.flutter.view.d.c
        public void b(d.b bVar) {
            this.f10428d = bVar;
        }

        @Override // io.flutter.view.d.c
        public void c(d.a aVar) {
            this.f10429e = aVar;
        }

        @Override // io.flutter.view.d.c
        public SurfaceTexture d() {
            return this.f10426b.surfaceTexture();
        }

        @Override // io.flutter.view.d.c
        public long e() {
            return this.f10425a;
        }

        protected void finalize() {
            try {
                if (this.f10427c) {
                    return;
                }
                a.this.f10405e.post(new e(this.f10425a, a.this.f10401a));
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper j() {
            return this.f10426b;
        }

        @Override // io.flutter.view.d.b
        public void onTrimMemory(int i10) {
            d.b bVar = this.f10428d;
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public float f10435a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f10436b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f10437c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f10438d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f10439e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f10440f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f10441g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f10442h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f10443i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f10444j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f10445k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f10446l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f10447m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f10448n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f10449o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f10450p = -1;

        /* renamed from: q  reason: collision with root package name */
        public List<b> f10451q = new ArrayList();

        boolean a() {
            return this.f10436b > 0 && this.f10437c > 0 && this.f10435a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0145a c0145a = new C0145a();
        this.f10407g = c0145a;
        this.f10401a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0145a);
    }

    private void i() {
        Iterator<WeakReference<d.b>> it = this.f10406f.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(long j10) {
        this.f10401a.markTextureFrameAvailable(j10);
    }

    private void p(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f10401a.registerTexture(j10, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(long j10) {
        this.f10401a.unregisterTexture(j10);
    }

    @Override // io.flutter.view.d
    public d.c a() {
        x7.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return o(new SurfaceTexture(0));
    }

    public void g(j8.b bVar) {
        this.f10401a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f10404d) {
            bVar.g();
        }
    }

    void h(d.b bVar) {
        i();
        this.f10406f.add(new WeakReference<>(bVar));
    }

    public void j(ByteBuffer byteBuffer, int i10) {
        this.f10401a.dispatchPointerDataPacket(byteBuffer, i10);
    }

    public boolean k() {
        return this.f10404d;
    }

    public boolean l() {
        return this.f10401a.getIsSoftwareRenderingEnabled();
    }

    public void n(int i10) {
        Iterator<WeakReference<d.b>> it = this.f10406f.iterator();
        while (it.hasNext()) {
            d.b bVar = it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    public d.c o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f10402b.getAndIncrement(), surfaceTexture);
        x7.b.f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.e());
        p(fVar.e(), fVar.j());
        h(fVar);
        return fVar;
    }

    public void q(j8.b bVar) {
        this.f10401a.removeIsDisplayingFlutterUiListener(bVar);
    }

    void r(d.b bVar) {
        for (WeakReference<d.b> weakReference : this.f10406f) {
            if (weakReference.get() == bVar) {
                this.f10406f.remove(weakReference);
                return;
            }
        }
    }

    public void s(boolean z10) {
        this.f10401a.setSemanticsEnabled(z10);
    }

    public void t(g gVar) {
        if (gVar.a()) {
            x7.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f10436b + " x " + gVar.f10437c + "\nPadding - L: " + gVar.f10441g + ", T: " + gVar.f10438d + ", R: " + gVar.f10439e + ", B: " + gVar.f10440f + "\nInsets - L: " + gVar.f10445k + ", T: " + gVar.f10442h + ", R: " + gVar.f10443i + ", B: " + gVar.f10444j + "\nSystem Gesture Insets - L: " + gVar.f10449o + ", T: " + gVar.f10446l + ", R: " + gVar.f10447m + ", B: " + gVar.f10447m + "\nDisplay Features: " + gVar.f10451q.size());
            int[] iArr = new int[gVar.f10451q.size() * 4];
            int[] iArr2 = new int[gVar.f10451q.size()];
            int[] iArr3 = new int[gVar.f10451q.size()];
            for (int i10 = 0; i10 < gVar.f10451q.size(); i10++) {
                b bVar = gVar.f10451q.get(i10);
                int i11 = i10 * 4;
                Rect rect = bVar.f10409a;
                iArr[i11] = rect.left;
                iArr[i11 + 1] = rect.top;
                iArr[i11 + 2] = rect.right;
                iArr[i11 + 3] = rect.bottom;
                iArr2[i10] = bVar.f10410b.f10422n;
                iArr3[i10] = bVar.f10411c.f10416n;
            }
            this.f10401a.setViewportMetrics(gVar.f10435a, gVar.f10436b, gVar.f10437c, gVar.f10438d, gVar.f10439e, gVar.f10440f, gVar.f10441g, gVar.f10442h, gVar.f10443i, gVar.f10444j, gVar.f10445k, gVar.f10446l, gVar.f10447m, gVar.f10448n, gVar.f10449o, gVar.f10450p, iArr, iArr2, iArr3);
        }
    }

    public void u(Surface surface, boolean z10) {
        if (this.f10403c != null && !z10) {
            v();
        }
        this.f10403c = surface;
        this.f10401a.onSurfaceCreated(surface);
    }

    public void v() {
        this.f10401a.onSurfaceDestroyed();
        this.f10403c = null;
        if (this.f10404d) {
            this.f10407g.d();
        }
        this.f10404d = false;
    }

    public void w(int i10, int i11) {
        this.f10401a.onSurfaceChanged(i10, i11);
    }

    public void x(Surface surface) {
        this.f10403c = surface;
        this.f10401a.onSurfaceWindowChanged(surface);
    }
}
