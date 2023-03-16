package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;
/* loaded from: classes.dex */
public class e {

    /* renamed from: e  reason: collision with root package name */
    private static e f9399e;

    /* renamed from: f  reason: collision with root package name */
    private static b f9400f;

    /* renamed from: b  reason: collision with root package name */
    private FlutterJNI f9402b;

    /* renamed from: a  reason: collision with root package name */
    private long f9401a = -1;

    /* renamed from: c  reason: collision with root package name */
    private c f9403c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    private final FlutterJNI.b f9404d = new a();

    /* loaded from: classes.dex */
    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j10) {
            if (e.this.f9403c != null) {
                e.this.f9403c.f9408n = j10;
                c cVar = e.this.f9403c;
                e.this.f9403c = null;
                return cVar;
            }
            return new c(j10);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j10) {
            Choreographer.getInstance().postFrameCallback(b(j10));
        }
    }

    @TargetApi(17)
    /* loaded from: classes.dex */
    class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private DisplayManager f9406a;

        b(DisplayManager displayManager) {
            this.f9406a = displayManager;
        }

        void a() {
            this.f9406a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                float refreshRate = this.f9406a.getDisplay(0).getRefreshRate();
                e.this.f9401a = (long) (1.0E9d / refreshRate);
                e.this.f9402b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Choreographer.FrameCallback {

        /* renamed from: n  reason: collision with root package name */
        private long f9408n;

        c(long j10) {
            this.f9408n = j10;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            long nanoTime = System.nanoTime() - j10;
            e.this.f9402b.onVsync(nanoTime < 0 ? 0L : nanoTime, e.this.f9401a, this.f9408n);
            e.this.f9403c = this;
        }
    }

    private e(FlutterJNI flutterJNI) {
        this.f9402b = flutterJNI;
    }

    public static e f(float f10, FlutterJNI flutterJNI) {
        if (f9399e == null) {
            f9399e = new e(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f10);
        e eVar = f9399e;
        eVar.f9401a = (long) (1.0E9d / f10);
        return eVar;
    }

    @TargetApi(17)
    public static e g(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f9399e == null) {
            f9399e = new e(flutterJNI);
        }
        if (f9400f == null) {
            e eVar = f9399e;
            Objects.requireNonNull(eVar);
            b bVar = new b(displayManager);
            f9400f = bVar;
            bVar.a();
        }
        if (f9399e.f9401a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f9399e.f9401a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f9399e;
    }

    public void h() {
        this.f9402b.setAsyncWaitForVsyncDelegate(this.f9404d);
    }
}
