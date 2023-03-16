package q3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p3.m0;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final q3.e f12637a = new q3.e();

    /* renamed from: b  reason: collision with root package name */
    private final b f12638b;

    /* renamed from: c  reason: collision with root package name */
    private final e f12639c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12640d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f12641e;

    /* renamed from: f  reason: collision with root package name */
    private float f12642f;

    /* renamed from: g  reason: collision with root package name */
    private float f12643g;

    /* renamed from: h  reason: collision with root package name */
    private float f12644h;

    /* renamed from: i  reason: collision with root package name */
    private float f12645i;

    /* renamed from: j  reason: collision with root package name */
    private int f12646j;

    /* renamed from: k  reason: collision with root package name */
    private long f12647k;

    /* renamed from: l  reason: collision with root package name */
    private long f12648l;

    /* renamed from: m  reason: collision with root package name */
    private long f12649m;

    /* renamed from: n  reason: collision with root package name */
    private long f12650n;

    /* renamed from: o  reason: collision with root package name */
    private long f12651o;

    /* renamed from: p  reason: collision with root package name */
    private long f12652p;

    /* renamed from: q  reason: collision with root package name */
    private long f12653q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                p3.r.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f12654a;

        private c(WindowManager windowManager) {
            this.f12654a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // q3.l.b
        public void a(b.a aVar) {
            aVar.a(this.f12654a.getDefaultDisplay());
        }

        @Override // q3.l.b
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f12655a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f12656b;

        private d(DisplayManager displayManager) {
            this.f12655a = displayManager;
        }

        private Display c() {
            return this.f12655a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // q3.l.b
        public void a(b.a aVar) {
            this.f12656b = aVar;
            this.f12655a.registerDisplayListener(this, m0.w());
            aVar.a(c());
        }

        @Override // q3.l.b
        public void b() {
            this.f12655a.unregisterDisplayListener(this);
            this.f12656b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f12656b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: s  reason: collision with root package name */
        private static final e f12657s = new e();

        /* renamed from: n  reason: collision with root package name */
        public volatile long f12658n = -9223372036854775807L;

        /* renamed from: o  reason: collision with root package name */
        private final Handler f12659o;

        /* renamed from: p  reason: collision with root package name */
        private final HandlerThread f12660p;

        /* renamed from: q  reason: collision with root package name */
        private Choreographer f12661q;

        /* renamed from: r  reason: collision with root package name */
        private int f12662r;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f12660p = handlerThread;
            handlerThread.start();
            Handler v10 = m0.v(handlerThread.getLooper(), this);
            this.f12659o = v10;
            v10.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f12661q;
            if (choreographer != null) {
                int i10 = this.f12662r + 1;
                this.f12662r = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f12661q = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                p3.r.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static e d() {
            return f12657s;
        }

        private void f() {
            Choreographer choreographer = this.f12661q;
            if (choreographer != null) {
                int i10 = this.f12662r - 1;
                this.f12662r = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f12658n = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f12659o.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f12658n = j10;
            ((Choreographer) p3.a.e(this.f12661q)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f12659o.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public l(Context context) {
        b f10 = f(context);
        this.f12638b = f10;
        this.f12639c = f10 != null ? e.d() : null;
        this.f12647k = -9223372036854775807L;
        this.f12648l = -9223372036854775807L;
        this.f12642f = -1.0f;
        this.f12645i = 1.0f;
        this.f12646j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (m0.f12306a < 30 || (surface = this.f12641e) == null || this.f12646j == Integer.MIN_VALUE || this.f12644h == 0.0f) {
            return;
        }
        this.f12644h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static b f(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            b d10 = m0.f12306a >= 17 ? d.d(applicationContext) : null;
            return d10 == null ? c.c(applicationContext) : d10;
        }
        return null;
    }

    private void n() {
        this.f12649m = 0L;
        this.f12652p = -1L;
        this.f12650n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f12647k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            p3.r.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f12647k = -9223372036854775807L;
        }
        this.f12648l = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.f12643g) >= (r7.f12637a.e() && (r7.f12637a.d() > 5000000000L ? 1 : (r7.f12637a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r7.f12637a.c() >= 30) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            r7 = this;
            int r0 = p3.m0.f12306a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f12641e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            q3.e r0 = r7.f12637a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            q3.e r0 = r7.f12637a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r7.f12642f
        L1d:
            float r2 = r7.f12643g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            q3.e r1 = r7.f12637a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            q3.e r1 = r7.f12637a
            long r1 = r1.d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f12643g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            q3.e r2 = r7.f12637a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f12643g = r0
            r7.r(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.l.q():void");
    }

    private void r(boolean z10) {
        Surface surface;
        if (m0.f12306a < 30 || (surface = this.f12641e) == null || this.f12646j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f12640d) {
            float f11 = this.f12643g;
            if (f11 != -1.0f) {
                f10 = this.f12645i * f11;
            }
        }
        if (z10 || this.f12644h != f10) {
            this.f12644h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        e eVar;
        if (this.f12652p != -1 && this.f12637a.e()) {
            long a10 = this.f12653q + (((float) (this.f12637a.a() * (this.f12649m - this.f12652p))) / this.f12645i);
            if (c(j10, a10)) {
                j11 = a10;
                this.f12650n = this.f12649m;
                this.f12651o = j11;
                eVar = this.f12639c;
                if (eVar != null || this.f12647k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f12658n;
                return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f12647k) - this.f12648l;
            }
            n();
        }
        j11 = j10;
        this.f12650n = this.f12649m;
        this.f12651o = j11;
        eVar = this.f12639c;
        if (eVar != null) {
        }
        return j11;
    }

    public void g(float f10) {
        this.f12642f = f10;
        this.f12637a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f12650n;
        if (j11 != -1) {
            this.f12652p = j11;
            this.f12653q = this.f12651o;
        }
        this.f12649m++;
        this.f12637a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f12645i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f12640d = true;
        n();
        if (this.f12638b != null) {
            ((e) p3.a.e(this.f12639c)).a();
            this.f12638b.a(new b.a() { // from class: q3.k
                @Override // q3.l.b.a
                public final void a(Display display) {
                    l.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f12640d = false;
        b bVar = this.f12638b;
        if (bVar != null) {
            bVar.b();
            ((e) p3.a.e(this.f12639c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof i) {
            surface = null;
        }
        if (this.f12641e == surface) {
            return;
        }
        d();
        this.f12641e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f12646j == i10) {
            return;
        }
        this.f12646j = i10;
        r(true);
    }
}
