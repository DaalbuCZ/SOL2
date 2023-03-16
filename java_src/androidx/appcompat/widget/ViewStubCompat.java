package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: n  reason: collision with root package name */
    private int f788n;

    /* renamed from: o  reason: collision with root package name */
    private int f789o;

    /* renamed from: p  reason: collision with root package name */
    private WeakReference<View> f790p;

    /* renamed from: q  reason: collision with root package name */
    private LayoutInflater f791q;

    /* renamed from: r  reason: collision with root package name */
    private a f792r;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f788n = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.H3, i10, 0);
        this.f789o = obtainStyledAttributes.getResourceId(c.j.K3, -1);
        this.f788n = obtainStyledAttributes.getResourceId(c.j.J3, 0);
        setId(obtainStyledAttributes.getResourceId(c.j.I3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f788n != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f791q;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f788n, viewGroup, false);
                int i10 = this.f789o;
                if (i10 != -1) {
                    inflate.setId(i10);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f790p = new WeakReference<>(inflate);
                a aVar = this.f792r;
                if (aVar != null) {
                    aVar.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f789o;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f791q;
    }

    public int getLayoutResource() {
        return this.f788n;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f789o = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f791q = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f788n = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f792r = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f790p;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }
}
