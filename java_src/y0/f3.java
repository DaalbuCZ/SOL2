package y0;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
/* loaded from: classes.dex */
public class f3 extends v1 {

    /* renamed from: q  reason: collision with root package name */
    private View f16526q;

    /* loaded from: classes.dex */
    private class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: n  reason: collision with root package name */
        private final AdapterView.OnItemSelectedListener f16527n;

        private b(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f16527n = onItemSelectedListener;
        }

        private int a(View view) {
            if (view != null) {
                return view.getId();
            }
            return -1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            f3.this.c("OnItemSelected in Spinner with { id: " + a(view) + ", position: " + i10 + " }");
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f16527n;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelected(adapterView, view, i10, j10);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f16527n;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onNothingSelected(adapterView);
            }
        }
    }

    public f3(q1 q1Var, boolean z10, boolean z11) {
        super(q1Var, z10, z11);
    }

    @Override // y0.v1, y0.e1
    public void a() {
        ((Spinner) this.f16526q).setOnItemSelectedListener(null);
        this.f16526q = null;
        super.a();
    }

    @Override // y0.e1
    public <T extends View> void b(T t10) {
        this.f16526q = t10;
        ((Spinner) t10).setOnItemSelectedListener(new b(d0.c(t10)));
    }
}
