package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.d;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(20)
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    SingleViewPresentation f8822a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8823b;

    /* renamed from: c  reason: collision with root package name */
    private final io.flutter.plugin.platform.a f8824c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8825d;

    /* renamed from: e  reason: collision with root package name */
    private final d.c f8826e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f8827f;

    /* renamed from: g  reason: collision with root package name */
    private final Surface f8828g;

    /* renamed from: h  reason: collision with root package name */
    private VirtualDisplay f8829h;

    /* renamed from: i  reason: collision with root package name */
    private int f8830i;

    /* renamed from: j  reason: collision with root package name */
    private int f8831j;

    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f8832n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Runnable f8833o;

        /* renamed from: io.flutter.plugin.platform.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0133a implements Runnable {
            RunnableC0133a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f8832n.postDelayed(aVar.f8833o, 128L);
            }
        }

        a(View view, Runnable runnable) {
            this.f8832n = view;
            this.f8833o = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f8832n, new RunnableC0133a());
            this.f8832n.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final View f8836a;

        /* renamed from: b  reason: collision with root package name */
        Runnable f8837b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f8836a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f8836a = view;
            this.f8837b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f8837b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f8837b = null;
            this.f8836a.post(new a());
        }
    }

    private r(Context context, io.flutter.plugin.platform.a aVar, VirtualDisplay virtualDisplay, f fVar, Surface surface, d.c cVar, View.OnFocusChangeListener onFocusChangeListener, int i10, Object obj) {
        this.f8823b = context;
        this.f8824c = aVar;
        this.f8826e = cVar;
        this.f8827f = onFocusChangeListener;
        this.f8828g = surface;
        this.f8829h = virtualDisplay;
        this.f8825d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f8829h.getDisplay(), fVar, aVar, i10, onFocusChangeListener);
        this.f8822a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static r a(Context context, io.flutter.plugin.platform.a aVar, f fVar, d.c cVar, int i10, int i11, int i12, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        context.getResources().getDisplayMetrics();
        if (i10 == 0 || i11 == 0) {
            return null;
        }
        cVar.d().setDefaultBufferSize(i10, i11);
        Surface surface = new Surface(cVar.d());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        r rVar = new r(context, aVar, createVirtualDisplay, fVar, surface, cVar, onFocusChangeListener, i12, obj);
        rVar.f8830i = i10;
        rVar.f8831j = i11;
        return rVar;
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f8822a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public int c() {
        return this.f8831j;
    }

    public int d() {
        return this.f8830i;
    }

    public View e() {
        SingleViewPresentation singleViewPresentation = this.f8822a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(View view) {
        SingleViewPresentation singleViewPresentation = this.f8822a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f8822a.getView().g(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        SingleViewPresentation singleViewPresentation = this.f8822a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f8822a.getView().i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        SingleViewPresentation singleViewPresentation = this.f8822a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f8822a.getView().f();
    }

    public void i(int i10, int i11, Runnable runnable) {
        boolean isFocused = e().isFocused();
        SingleViewPresentation.e detachState = this.f8822a.detachState();
        this.f8829h.setSurface(null);
        this.f8829h.release();
        this.f8830i = i10;
        this.f8831j = i11;
        this.f8826e.d().setDefaultBufferSize(i10, i11);
        this.f8829h = ((DisplayManager) this.f8823b.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, this.f8825d, this.f8828g, 0);
        View e10 = e();
        e10.addOnAttachStateChangeListener(new a(e10, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f8823b, this.f8829h.getDisplay(), this.f8824c, detachState, this.f8827f, isFocused);
        singleViewPresentation.show();
        this.f8822a.cancel();
        this.f8822a = singleViewPresentation;
    }
}
