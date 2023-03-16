package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
@Deprecated
/* loaded from: classes.dex */
public final class b implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f8469a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView.ScaleType f8470b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8471c;

    /* renamed from: d  reason: collision with root package name */
    private C0129b f8472d;

    /* loaded from: classes.dex */
    class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f8473a;

        a(Runnable runnable) {
            this.f8473a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8473a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8473a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0129b extends ImageView {
        public C0129b(Context context) {
            this(context, null, 0);
        }

        public C0129b(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500L);
    }

    public b(Drawable drawable, ImageView.ScaleType scaleType, long j10) {
        this.f8469a = drawable;
        this.f8470b = scaleType;
        this.f8471c = j10;
    }

    @Override // io.flutter.embedding.android.x
    public void a(Runnable runnable) {
        C0129b c0129b = this.f8472d;
        if (c0129b == null) {
            runnable.run();
        } else {
            c0129b.animate().alpha(0.0f).setDuration(this.f8471c).setListener(new a(runnable));
        }
    }

    @Override // io.flutter.embedding.android.x
    public /* synthetic */ boolean b() {
        return w.a(this);
    }

    @Override // io.flutter.embedding.android.x
    public View c(Context context, Bundle bundle) {
        C0129b c0129b = new C0129b(context);
        this.f8472d = c0129b;
        c0129b.a(this.f8469a, this.f8470b);
        return this.f8472d;
    }

    @Override // io.flutter.embedding.android.x
    public /* synthetic */ Bundle d() {
        return w.b(this);
    }
}
