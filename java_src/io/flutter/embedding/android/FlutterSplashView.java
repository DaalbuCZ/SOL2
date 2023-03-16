package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FlutterSplashView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    private static String f8451w = "FlutterSplashView";

    /* renamed from: n  reason: collision with root package name */
    private x f8452n;

    /* renamed from: o  reason: collision with root package name */
    private k f8453o;

    /* renamed from: p  reason: collision with root package name */
    private View f8454p;

    /* renamed from: q  reason: collision with root package name */
    Bundle f8455q;

    /* renamed from: r  reason: collision with root package name */
    private String f8456r;

    /* renamed from: s  reason: collision with root package name */
    private String f8457s;

    /* renamed from: t  reason: collision with root package name */
    private final k.f f8458t;

    /* renamed from: u  reason: collision with root package name */
    private final j8.b f8459u;

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f8460v;

    @Keep
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    /* loaded from: classes.dex */
    class a implements k.f {
        a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void b(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f8453o.y(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f8453o, FlutterSplashView.this.f8452n);
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
            if (FlutterSplashView.this.f8452n != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f8454p);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.f8457s = flutterSplashView2.f8456r;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8458t = new a();
        this.f8459u = new b();
        this.f8460v = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f8453o;
        if (kVar != null) {
            if (kVar.w()) {
                return this.f8453o.getAttachedFlutterEngine().h().m() != null && this.f8453o.getAttachedFlutterEngine().h().m().equals(this.f8457s);
            }
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
    }

    private boolean i() {
        k kVar = this.f8453o;
        return (kVar == null || !kVar.w() || this.f8453o.u() || h()) ? false : true;
    }

    private boolean j() {
        x xVar;
        k kVar = this.f8453o;
        return kVar != null && kVar.w() && (xVar = this.f8452n) != null && xVar.b() && l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f8456r = this.f8453o.getAttachedFlutterEngine().h().m();
        String str = f8451w;
        x7.b.f(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f8456r);
        this.f8452n.a(this.f8460v);
    }

    private boolean l() {
        k kVar = this.f8453o;
        if (kVar != null) {
            if (kVar.w()) {
                return this.f8453o.u() && !h();
            }
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
    }

    public void g(k kVar, x xVar) {
        k kVar2 = this.f8453o;
        if (kVar2 != null) {
            kVar2.z(this.f8459u);
            removeView(this.f8453o);
        }
        View view = this.f8454p;
        if (view != null) {
            removeView(view);
        }
        this.f8453o = kVar;
        addView(kVar);
        this.f8452n = xVar;
        if (xVar != null) {
            if (i()) {
                x7.b.f(f8451w, "Showing splash screen UI.");
                View c10 = xVar.c(getContext(), this.f8455q);
                this.f8454p = c10;
                addView(c10);
                kVar.l(this.f8459u);
            } else if (!j()) {
                if (kVar.w()) {
                    return;
                }
                x7.b.f(f8451w, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                kVar.k(this.f8458t);
            } else {
                x7.b.f(f8451w, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
                View c11 = xVar.c(getContext(), this.f8455q);
                this.f8454p = c11;
                addView(c11);
                k();
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f8457s = savedState.previousCompletedSplashIsolate;
        this.f8455q = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.f8457s;
        x xVar = this.f8452n;
        savedState.splashScreenState = xVar != null ? xVar.d() : null;
        return savedState;
    }
}
