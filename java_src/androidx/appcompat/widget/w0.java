package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1058a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1059b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1060c;

    private w0(Context context, TypedArray typedArray) {
        this.f1058a = context;
        this.f1059b = typedArray;
    }

    public static w0 s(Context context, int i10, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static w0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 u(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1059b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1059b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList c10;
        return (!this.f1059b.hasValue(i10) || (resourceId = this.f1059b.getResourceId(i10, 0)) == 0 || (c10 = e.a.c(this.f1058a, resourceId)) == null) ? this.f1059b.getColorStateList(i10) : c10;
    }

    public int d(int i10, int i11) {
        return this.f1059b.getDimensionPixelOffset(i10, i11);
    }

    public int e(int i10, int i11) {
        return this.f1059b.getDimensionPixelSize(i10, i11);
    }

    public Drawable f(int i10) {
        int resourceId;
        return (!this.f1059b.hasValue(i10) || (resourceId = this.f1059b.getResourceId(i10, 0)) == 0) ? this.f1059b.getDrawable(i10) : e.a.d(this.f1058a, resourceId);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f1059b.hasValue(i10) || (resourceId = this.f1059b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1058a, resourceId, true);
    }

    public float h(int i10, float f10) {
        return this.f1059b.getFloat(i10, f10);
    }

    public Typeface i(int i10, int i11, h.e eVar) {
        int resourceId = this.f1059b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1060c == null) {
            this.f1060c = new TypedValue();
        }
        return androidx.core.content.res.h.e(this.f1058a, resourceId, this.f1060c, i11, eVar);
    }

    public int j(int i10, int i11) {
        return this.f1059b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1059b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1059b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1059b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1059b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1059b.getText(i10);
    }

    public CharSequence[] p(int i10) {
        return this.f1059b.getTextArray(i10);
    }

    public TypedArray q() {
        return this.f1059b;
    }

    public boolean r(int i10) {
        return this.f1059b.hasValue(i10);
    }

    public void v() {
        this.f1059b.recycle();
    }
}
