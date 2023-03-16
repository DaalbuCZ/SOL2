package y0;

import android.view.View;
import android.widget.Button;
/* loaded from: classes.dex */
public class a2 extends v1 {

    /* renamed from: q  reason: collision with root package name */
    private View f16436q;

    /* renamed from: r  reason: collision with root package name */
    private b f16437r;

    /* loaded from: classes.dex */
    private class b implements View.OnClickListener {

        /* renamed from: n  reason: collision with root package name */
        private View.OnClickListener f16438n;

        private b(View.OnClickListener onClickListener) {
            this.f16438n = onClickListener;
        }

        public void a() {
            this.f16438n = null;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a2.this.c("OnClick in Button with { id: " + view.getId() + ", text: " + ((Object) ((Button) view).getText()) + " }");
            View.OnClickListener onClickListener = this.f16438n;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public a2(q1 q1Var, boolean z10, boolean z11) {
        super(q1Var, z10, z11);
    }

    @Override // y0.v1, y0.e1
    public void a() {
        this.f16436q.setOnClickListener(null);
        this.f16436q = null;
        b bVar = this.f16437r;
        if (bVar != null) {
            bVar.a();
            this.f16437r = null;
        }
        super.a();
    }

    @Override // y0.e1
    public <T extends View> void b(T t10) {
        this.f16436q = t10;
        if (t10.isClickable()) {
            b bVar = new b(d0.b(t10));
            this.f16437r = bVar;
            t10.setOnClickListener(bVar);
        }
    }
}
