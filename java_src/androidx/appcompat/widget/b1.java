package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class b1 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f827b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f828a;

    public b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f828a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f827b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable c(int i10) {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Context context = this.f828a.get();
        return context != null ? m0.h().t(context, this, i10) : super.getDrawable(i10);
    }
}
