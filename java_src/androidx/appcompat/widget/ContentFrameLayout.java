package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: n  reason: collision with root package name */
    private TypedValue f700n;

    /* renamed from: o  reason: collision with root package name */
    private TypedValue f701o;

    /* renamed from: p  reason: collision with root package name */
    private TypedValue f702p;

    /* renamed from: q  reason: collision with root package name */
    private TypedValue f703q;

    /* renamed from: r  reason: collision with root package name */
    private TypedValue f704r;

    /* renamed from: s  reason: collision with root package name */
    private TypedValue f705s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f706t;

    /* renamed from: u  reason: collision with root package name */
    private a f707u;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f706t = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i10, int i11, int i12, int i13) {
        this.f706t.set(i10, i11, i12, i13);
        if (androidx.core.view.u.w(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f704r == null) {
            this.f704r = new TypedValue();
        }
        return this.f704r;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f705s == null) {
            this.f705s = new TypedValue();
        }
        return this.f705s;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f702p == null) {
            this.f702p = new TypedValue();
        }
        return this.f702p;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f703q == null) {
            this.f703q = new TypedValue();
        }
        return this.f703q;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f700n == null) {
            this.f700n = new TypedValue();
        }
        return this.f700n;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f701o == null) {
            this.f701o = new TypedValue();
        }
        return this.f701o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f707u;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f707u;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f707u = aVar;
    }
}
