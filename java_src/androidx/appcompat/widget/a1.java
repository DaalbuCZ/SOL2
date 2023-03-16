package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
/* loaded from: classes.dex */
class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f818a;

    /* renamed from: b  reason: collision with root package name */
    private final View f819b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f820c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f821d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f822e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f823f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f824g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f821d = layoutParams;
        this.f822e = new Rect();
        this.f823f = new int[2];
        this.f824g = new int[2];
        this.f818a = context;
        View inflate = LayoutInflater.from(context).inflate(c.g.abc_tooltip, (ViewGroup) null);
        this.f819b = inflate;
        this.f820c = (TextView) inflate.findViewById(c.f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = c.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f818a.getResources().getDimensionPixelOffset(c.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f818a.getResources().getDimensionPixelOffset(c.d.tooltip_precise_anchor_extra_offset);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f818a.getResources().getDimensionPixelOffset(z10 ? c.d.tooltip_y_offset_touch : c.d.tooltip_y_offset_non_touch);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f822e);
        Rect rect = this.f822e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f818a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f822e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f824g);
        view.getLocationOnScreen(this.f823f);
        int[] iArr = this.f823f;
        int i13 = iArr[0];
        int[] iArr2 = this.f824g;
        iArr[0] = i13 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f819b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f819b.getMeasuredHeight();
        int[] iArr3 = this.f823f;
        int i14 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i15 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i15 <= this.f822e.height() : i14 < 0) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i15;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f818a.getSystemService("window")).removeView(this.f819b);
        }
    }

    boolean d() {
        return this.f819b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f820c.setText(charSequence);
        a(view, i10, i11, z10, this.f821d);
        ((WindowManager) this.f818a.getSystemService("window")).addView(this.f819b, this.f821d);
    }
}
