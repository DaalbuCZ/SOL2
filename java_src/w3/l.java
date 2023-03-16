package w3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes.dex */
public class l extends androidx.fragment.app.c {

    /* renamed from: w0  reason: collision with root package name */
    private Dialog f16098w0;

    /* renamed from: x0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f16099x0;

    /* renamed from: y0  reason: collision with root package name */
    private Dialog f16100y0;

    public static l u1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) z3.o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f16098w0 = dialog2;
        if (onCancelListener != null) {
            lVar.f16099x0 = onCancelListener;
        }
        return lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f16099x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog q1(Bundle bundle) {
        Dialog dialog = this.f16098w0;
        if (dialog == null) {
            r1(false);
            if (this.f16100y0 == null) {
                this.f16100y0 = new AlertDialog.Builder((Context) z3.o.i(r())).create();
            }
            return this.f16100y0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.c
    public void t1(androidx.fragment.app.i iVar, String str) {
        super.t1(iVar, str);
    }
}
