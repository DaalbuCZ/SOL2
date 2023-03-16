package q3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
/* loaded from: classes.dex */
public final class i extends Surface {

    /* renamed from: q  reason: collision with root package name */
    private static int f12626q;

    /* renamed from: r  reason: collision with root package name */
    private static boolean f12627r;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f12628n;

    /* renamed from: o  reason: collision with root package name */
    private final b f12629o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12630p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: n  reason: collision with root package name */
        private p3.j f12631n;

        /* renamed from: o  reason: collision with root package name */
        private Handler f12632o;

        /* renamed from: p  reason: collision with root package name */
        private Error f12633p;

        /* renamed from: q  reason: collision with root package name */
        private RuntimeException f12634q;

        /* renamed from: r  reason: collision with root package name */
        private i f12635r;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) {
            p3.a.e(this.f12631n);
            this.f12631n.h(i10);
            this.f12635r = new i(this, this.f12631n.g(), i10 != 0);
        }

        private void d() {
            p3.a.e(this.f12631n);
            this.f12631n.i();
        }

        public i a(int i10) {
            boolean z10;
            start();
            this.f12632o = new Handler(getLooper(), this);
            this.f12631n = new p3.j(this.f12632o);
            synchronized (this) {
                z10 = false;
                this.f12632o.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f12635r == null && this.f12634q == null && this.f12633p == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f12634q;
            if (runtimeException == null) {
                Error error = this.f12633p;
                if (error == null) {
                    return (i) p3.a.e(this.f12635r);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            p3.a.e(this.f12632o);
            this.f12632o.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    p3.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f12633p = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    p3.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f12634q = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private i(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f12629o = bVar;
        this.f12628n = z10;
    }

    private static int a(Context context) {
        if (p3.m.b(context)) {
            return p3.m.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (i.class) {
            if (!f12627r) {
                f12626q = a(context);
                f12627r = true;
            }
            z10 = f12626q != 0;
        }
        return z10;
    }

    public static i c(Context context, boolean z10) {
        p3.a.f(!z10 || b(context));
        return new b().a(z10 ? f12626q : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f12629o) {
            if (!this.f12630p) {
                this.f12629o.c();
                this.f12630p = true;
            }
        }
    }
}
