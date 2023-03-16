package b8;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import w8.h;
@TargetApi(19)
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: n  reason: collision with root package name */
    private FlutterMutatorsStack f2951n;

    /* renamed from: o  reason: collision with root package name */
    private float f2952o;

    /* renamed from: p  reason: collision with root package name */
    private int f2953p;

    /* renamed from: q  reason: collision with root package name */
    private int f2954q;

    /* renamed from: r  reason: collision with root package name */
    private int f2955r;

    /* renamed from: s  reason: collision with root package name */
    private int f2956s;

    /* renamed from: t  reason: collision with root package name */
    private final io.flutter.embedding.android.a f2957t;

    /* renamed from: u  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f2958u;

    /* renamed from: b8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalFocusChangeListenerC0067a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f2959n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ View f2960o;

        ViewTreeObserver$OnGlobalFocusChangeListenerC0067a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f2959n = onFocusChangeListener;
            this.f2960o = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f2959n;
            View view3 = this.f2960o;
            onFocusChangeListener.onFocusChange(view3, h.c(view3));
        }
    }

    public a(Context context, float f10, io.flutter.embedding.android.a aVar) {
        super(context, null);
        this.f2952o = f10;
        this.f2957t = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f2951n.getFinalMatrix());
        float f10 = this.f2952o;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f2953p, -this.f2954q);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i10, int i11, int i12, int i13) {
        this.f2951n = flutterMutatorsStack;
        this.f2953p = i10;
        this.f2954q = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f2958u) == null) {
            return;
        }
        this.f2958u = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f2951n.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.f2953p, -this.f2954q);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
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
        if (this.f2957t == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f2953p;
            this.f2955r = i11;
            i10 = this.f2954q;
            this.f2956s = i10;
            f10 = i11;
        } else if (action == 2) {
            matrix.postTranslate(this.f2955r, this.f2956s);
            this.f2955r = this.f2953p;
            this.f2956s = this.f2954q;
            return this.f2957t.g(motionEvent, matrix);
        } else {
            f10 = this.f2953p;
            i10 = this.f2954q;
        }
        matrix.postTranslate(f10, i10);
        return this.f2957t.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f2958u == null) {
            ViewTreeObserver$OnGlobalFocusChangeListenerC0067a viewTreeObserver$OnGlobalFocusChangeListenerC0067a = new ViewTreeObserver$OnGlobalFocusChangeListenerC0067a(onFocusChangeListener, this);
            this.f2958u = viewTreeObserver$OnGlobalFocusChangeListenerC0067a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserver$OnGlobalFocusChangeListenerC0067a);
        }
    }
}
