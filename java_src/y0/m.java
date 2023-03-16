package y0;

import android.view.View;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public class m extends v1 {

    /* renamed from: q  reason: collision with root package name */
    private View f16570q;

    /* loaded from: classes.dex */
    private class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final CompoundButton.OnCheckedChangeListener f16571a;

        private b(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f16571a = onCheckedChangeListener;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            m.this.c("OnCheckedChanged in CompoundButton (Switch / SwitchCompat) with { id: " + compoundButton.getId() + ", checked: " + z10 + " }");
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f16571a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
            }
        }
    }

    public m(q1 q1Var, boolean z10, boolean z11) {
        super(q1Var, z10, z11);
    }

    @Override // y0.v1, y0.e1
    public void a() {
        ((CompoundButton) this.f16570q).setOnCheckedChangeListener(null);
        this.f16570q = null;
        super.a();
    }

    @Override // y0.e1
    public <T extends View> void b(T t10) {
        this.f16570q = t10;
        ((CompoundButton) t10).setOnCheckedChangeListener(new b(d0.a(t10)));
    }
}
