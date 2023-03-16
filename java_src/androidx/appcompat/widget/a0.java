package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f804l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f805m = new ConcurrentHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f806n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f807a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f808b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f809c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f810d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f811e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f812f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f813g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f814h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f815i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f816j;

    /* renamed from: k  reason: collision with root package name */
    private final c f817k;

    /* loaded from: classes.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.a0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.a0.a, androidx.appcompat.widget.a0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.a0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) a0.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(TextView textView) {
        this.f815i = textView;
        this.f816j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f817k = i10 >= 29 ? new b() : i10 >= 23 ? new a() : new c();
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f812f = c(iArr);
            B();
        }
    }

    private boolean B() {
        int[] iArr = this.f812f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f813g = z10;
        if (z10) {
            this.f807a = 1;
            this.f810d = iArr[0];
            this.f811e = iArr[length - 1];
            this.f809c = -1.0f;
        }
        return z10;
    }

    private boolean C(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f815i.getText();
        TransformationMethod transformationMethod = this.f815i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f815i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f815i.getMaxLines() : -1;
        q(i10);
        StaticLayout e10 = e(text, (Layout.Alignment) r(this.f815i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e10.getLineCount() <= maxLines && e10.getLineEnd(e10.getLineCount() - 1) == text.length())) && ((float) e10.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f815i instanceof k);
    }

    private void E(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        } else {
            this.f807a = 1;
            this.f810d = f10;
            this.f811e = f11;
            this.f809c = f12;
            this.f813g = false;
        }
    }

    private static <T> T a(Object obj, String str, T t10) {
        try {
            Field o10 = o(str);
            return o10 == null ? t10 : (T) o10.get(obj);
        } catch (IllegalAccessException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return t10;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f807a = 0;
        this.f810d = -1.0f;
        this.f811e = -1.0f;
        this.f809c = -1.0f;
        this.f812f = new int[0];
        this.f808b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f814h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f815i.getLineSpacingExtra(), this.f815i.getLineSpacingMultiplier()).setIncludePad(this.f815i.getIncludeFontPadding()).setBreakStrategy(this.f815i.getBreakStrategy()).setHyphenationFrequency(this.f815i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            this.f817k.a(obtain, this.f815i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f814h, i10, alignment, ((Float) a(this.f815i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f815i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f815i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f814h, i10, alignment, this.f815i.getLineSpacingMultiplier(), this.f815i.getLineSpacingExtra(), this.f815i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int i10;
        int length = this.f812f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = length - 1;
        while (true) {
            int i14 = i12;
            int i15 = i11;
            i11 = i14;
            while (i11 <= i13) {
                i10 = (i11 + i13) / 2;
                if (C(this.f812f[i10], rectF)) {
                    break;
                }
                i15 = i10 - 1;
                i13 = i15;
            }
            return this.f812f[i15];
            i12 = i10 + 1;
        }
    }

    private static Field o(String str) {
        try {
            Field field = f806n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f806n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = f805m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f805m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T r(Object obj, String str, T t10) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void x(float f10) {
        if (f10 != this.f815i.getPaint().getTextSize()) {
            this.f815i.getPaint().setTextSize(f10);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f815i.isInLayout() : false;
            if (this.f815i.getLayout() != null) {
                this.f808b = false;
                try {
                    Method p10 = p("nullLayouts");
                    if (p10 != null) {
                        p10.invoke(this.f815i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    this.f815i.forceLayout();
                } else {
                    this.f815i.requestLayout();
                }
                this.f815i.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f807a == 1) {
            if (!this.f813g || this.f812f.length == 0) {
                int floor = ((int) Math.floor((this.f811e - this.f810d) / this.f809c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f810d + (i10 * this.f809c));
                }
                this.f812f = c(iArr);
            }
            this.f808b = true;
        } else {
            this.f808b = false;
        }
        return this.f808b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (s()) {
            if (this.f808b) {
                if (this.f815i.getMeasuredHeight() <= 0 || this.f815i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f817k.b(this.f815i) ? 1048576 : (this.f815i.getMeasuredWidth() - this.f815i.getTotalPaddingLeft()) - this.f815i.getTotalPaddingRight();
                int height = (this.f815i.getHeight() - this.f815i.getCompoundPaddingBottom()) - this.f815i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f804l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float i10 = i(rectF);
                    if (i10 != this.f815i.getTextSize()) {
                        y(0, i10);
                    }
                }
            }
            this.f808b = true;
        }
    }

    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        return i12 >= 23 ? f(charSequence, alignment, i10, i11) : i12 >= 16 ? h(charSequence, alignment, i10) : g(charSequence, alignment, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f811e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return Math.round(this.f810d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return Math.round(this.f809c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] m() {
        return this.f812f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f807a;
    }

    void q(int i10) {
        TextPaint textPaint = this.f814h;
        if (textPaint == null) {
            this.f814h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f814h.set(this.f815i.getPaint());
        this.f814h.setTextSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        return D() && this.f807a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f816j;
        int[] iArr = c.j.f3013i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f815i;
        androidx.core.view.u.F(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = c.j.f3038n0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f807a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = c.j.f3033m0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = c.j.f3023k0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = c.j.f3018j0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = c.j.f3028l0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.f807a = 0;
        } else if (this.f807a == 1) {
            if (!this.f813g) {
                DisplayMetrics displayMetrics = this.f816j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10, int i11, int i12, int i13) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f816j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int[] iArr, int i10) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f816j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f812f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f813g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(int i10) {
        if (D()) {
            if (i10 == 0) {
                d();
            } else if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            } else {
                DisplayMetrics displayMetrics = this.f816j.getResources().getDisplayMetrics();
                E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (z()) {
                    b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i10, float f10) {
        Context context = this.f816j;
        x(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
