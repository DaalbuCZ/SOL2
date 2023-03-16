package y0;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class x extends v1 implements TextWatcher {

    /* renamed from: q  reason: collision with root package name */
    private final q1 f16756q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f16757r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f16758s;

    /* renamed from: t  reason: collision with root package name */
    private EditText f16759t;

    /* renamed from: u  reason: collision with root package name */
    private Timer f16760u;

    /* loaded from: classes.dex */
    private static class b extends TimerTask {

        /* renamed from: n  reason: collision with root package name */
        private final int f16761n;

        /* renamed from: o  reason: collision with root package name */
        private final String f16762o;

        /* renamed from: p  reason: collision with root package name */
        private final q1 f16763p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f16764q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f16765r;

        private b(int i10, String str, q1 q1Var, boolean z10, boolean z11) {
            this.f16761n = i10;
            this.f16762o = str;
            this.f16763p = q1Var;
            this.f16764q = z10;
            this.f16765r = z11;
        }

        private void a(String str) {
            if (this.f16764q) {
                i0.a("Interaction", str);
            }
            if (this.f16765r) {
                this.f16763p.l("Interaction", str);
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder("OnTextChanged in EditText with { id: " + this.f16761n);
            if (this.f16762o != null) {
                sb.append(", text: ");
                sb.append(this.f16762o);
            }
            sb.append(" }");
            a(sb.toString());
        }
    }

    public x(q1 q1Var, boolean z10, boolean z11) {
        super(q1Var, z10, z11);
        this.f16756q = q1Var;
        this.f16757r = z10;
        this.f16758s = z11;
    }

    private static boolean f(EditText editText) {
        int inputType = editText.getInputType();
        return inputType == 129 || inputType == 145 || (h3.a() && inputType == 225) || ((h3.a() && inputType == 18) || (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // y0.v1, y0.e1
    public void a() {
        this.f16759t.addTextChangedListener(null);
        this.f16759t = null;
        Timer timer = this.f16760u;
        if (timer != null) {
            timer.purge();
            this.f16760u = null;
        }
        super.a();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Timer timer = new Timer();
        this.f16760u = timer;
        timer.schedule(new b(this.f16759t.getId(), f(this.f16759t) ? null : editable.toString(), this.f16756q, this.f16757r, this.f16758s), 600L);
    }

    @Override // y0.e1
    public <T extends View> void b(T t10) {
        EditText editText = (EditText) t10;
        this.f16759t = editText;
        editText.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Timer timer = this.f16760u;
        if (timer != null) {
            timer.cancel();
        }
    }
}
