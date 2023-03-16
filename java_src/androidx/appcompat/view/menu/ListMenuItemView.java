package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.w0;
import androidx.core.view.u;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    private Drawable A;
    private boolean B;
    private LayoutInflater C;
    private boolean D;

    /* renamed from: n  reason: collision with root package name */
    private g f509n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f510o;

    /* renamed from: p  reason: collision with root package name */
    private RadioButton f511p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f512q;

    /* renamed from: r  reason: collision with root package name */
    private CheckBox f513r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f514s;

    /* renamed from: t  reason: collision with root package name */
    private ImageView f515t;

    /* renamed from: u  reason: collision with root package name */
    private ImageView f516u;

    /* renamed from: v  reason: collision with root package name */
    private LinearLayout f517v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f518w;

    /* renamed from: x  reason: collision with root package name */
    private int f519x;

    /* renamed from: y  reason: collision with root package name */
    private Context f520y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f521z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        w0 u10 = w0.u(getContext(), attributeSet, c.j.W1, i10, 0);
        this.f518w = u10.f(c.j.Y1);
        this.f519x = u10.m(c.j.X1, -1);
        this.f521z = u10.a(c.j.Z1, false);
        this.f520y = context;
        this.A = u10.f(c.j.f2975a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, c.a.dropDownListViewStyle, 0);
        this.B = obtainStyledAttributes.hasValue(0);
        u10.v();
        obtainStyledAttributes.recycle();
    }

    private void b(View view) {
        c(view, -1);
    }

    private void c(View view, int i10) {
        LinearLayout linearLayout = this.f517v;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(c.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f513r = checkBox;
        b(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(c.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f510o = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(c.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f511p = radioButton;
        b(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.C == null) {
            this.C = LayoutInflater.from(getContext());
        }
        return this.C;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f515t;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f516u;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f516u.getLayoutParams();
        rect.top += this.f516u.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i10) {
        this.f509n = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f509n;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f509n.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f514s.setText(this.f509n.h());
        }
        if (this.f514s.getVisibility() != i10) {
            this.f514s.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        u.I(this, this.f518w);
        TextView textView = (TextView) findViewById(c.f.M);
        this.f512q = textView;
        int i10 = this.f519x;
        if (i10 != -1) {
            textView.setTextAppearance(this.f520y, i10);
        }
        this.f514s = (TextView) findViewById(c.f.shortcut);
        ImageView imageView = (ImageView) findViewById(c.f.submenuarrow);
        this.f515t = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A);
        }
        this.f516u = (ImageView) findViewById(c.f.group_divider);
        this.f517v = (LinearLayout) findViewById(c.f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f510o != null && this.f521z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f510o.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f511p == null && this.f513r == null) {
            return;
        }
        if (this.f509n.m()) {
            if (this.f511p == null) {
                g();
            }
            compoundButton = this.f511p;
            compoundButton2 = this.f513r;
        } else {
            if (this.f513r == null) {
                e();
            }
            compoundButton = this.f513r;
            compoundButton2 = this.f511p;
        }
        if (z10) {
            compoundButton.setChecked(this.f509n.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f513r;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f511p;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f509n.m()) {
            if (this.f511p == null) {
                g();
            }
            compoundButton = this.f511p;
        } else {
            if (this.f513r == null) {
                e();
            }
            compoundButton = this.f513r;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.D = z10;
        this.f521z = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f516u;
        if (imageView != null) {
            imageView.setVisibility((this.B || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f509n.z() || this.D;
        if (z10 || this.f521z) {
            ImageView imageView = this.f510o;
            if (imageView == null && drawable == null && !this.f521z) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f521z) {
                this.f510o.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f510o;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f510o.getVisibility() != 0) {
                this.f510o.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f512q.setText(charSequence);
            if (this.f512q.getVisibility() == 0) {
                return;
            }
            textView = this.f512q;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f512q.getVisibility() == 8) {
                return;
            }
            textView = this.f512q;
        }
        textView.setVisibility(i10);
    }
}
