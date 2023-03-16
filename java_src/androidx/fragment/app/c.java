package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: l0  reason: collision with root package name */
    private Handler f1875l0;

    /* renamed from: m0  reason: collision with root package name */
    private Runnable f1876m0 = new a();

    /* renamed from: n0  reason: collision with root package name */
    int f1877n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    int f1878o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    boolean f1879p0 = true;

    /* renamed from: q0  reason: collision with root package name */
    boolean f1880q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    int f1881r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    Dialog f1882s0;

    /* renamed from: t0  reason: collision with root package name */
    boolean f1883t0;

    /* renamed from: u0  reason: collision with root package name */
    boolean f1884u0;

    /* renamed from: v0  reason: collision with root package name */
    boolean f1885v0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f1882s0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V(Bundle bundle) {
        Bundle bundle2;
        super.V(bundle);
        if (this.f1880q0) {
            View L = L();
            if (L != null) {
                if (L.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f1882s0.setContentView(L);
            }
            d l10 = l();
            if (l10 != null) {
                this.f1882s0.setOwnerActivity(l10);
            }
            this.f1882s0.setCancelable(this.f1879p0);
            this.f1882s0.setOnCancelListener(this);
            this.f1882s0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f1882s0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y(Context context) {
        super.Y(context);
        if (this.f1885v0) {
            return;
        }
        this.f1884u0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(Bundle bundle) {
        super.b0(bundle);
        this.f1875l0 = new Handler();
        this.f1880q0 = this.J == 0;
        if (bundle != null) {
            this.f1877n0 = bundle.getInt("android:style", 0);
            this.f1878o0 = bundle.getInt("android:theme", 0);
            this.f1879p0 = bundle.getBoolean("android:cancelable", true);
            this.f1880q0 = bundle.getBoolean("android:showsDialog", this.f1880q0);
            this.f1881r0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        super.i0();
        Dialog dialog = this.f1882s0;
        if (dialog != null) {
            this.f1883t0 = true;
            dialog.setOnDismissListener(null);
            this.f1882s0.dismiss();
            if (!this.f1884u0) {
                onDismiss(this.f1882s0);
            }
            this.f1882s0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j0() {
        super.j0();
        if (this.f1885v0 || this.f1884u0) {
            return;
        }
        this.f1884u0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater k0(Bundle bundle) {
        Context f10;
        if (this.f1880q0) {
            Dialog q12 = q1(bundle);
            this.f1882s0 = q12;
            if (q12 != null) {
                s1(q12, this.f1877n0);
                f10 = this.f1882s0.getContext();
            } else {
                f10 = this.F.f();
            }
            return (LayoutInflater) f10.getSystemService("layout_inflater");
        }
        return super.k0(bundle);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1883t0) {
            return;
        }
        p1(true, true);
    }

    void p1(boolean z10, boolean z11) {
        if (this.f1884u0) {
            return;
        }
        this.f1884u0 = true;
        this.f1885v0 = false;
        Dialog dialog = this.f1882s0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1882s0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f1875l0.getLooper()) {
                    onDismiss(this.f1882s0);
                } else {
                    this.f1875l0.post(this.f1876m0);
                }
            }
        }
        this.f1883t0 = true;
        if (this.f1881r0 >= 0) {
            b1().f(this.f1881r0, 1);
            this.f1881r0 = -1;
            return;
        }
        n a10 = b1().a();
        a10.g(this);
        if (z10) {
            a10.e();
        } else {
            a10.d();
        }
    }

    public Dialog q1(Bundle bundle) {
        throw null;
    }

    public void r1(boolean z10) {
        this.f1880q0 = z10;
    }

    public void s1(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        dialog.requestWindowFeature(1);
    }

    public void t1(i iVar, String str) {
        this.f1884u0 = false;
        this.f1885v0 = true;
        n a10 = iVar.a();
        a10.b(this, str);
        a10.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void x0(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.x0(bundle);
        Dialog dialog = this.f1882s0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f1877n0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f1878o0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f1879p0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f1880q0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f1881r0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        super.y0();
        Dialog dialog = this.f1882s0;
        if (dialog != null) {
            this.f1883t0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z0() {
        super.z0();
        Dialog dialog = this.f1882s0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
