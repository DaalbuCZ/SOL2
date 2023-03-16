package w3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: n  reason: collision with root package name */
    private Dialog f16062n;

    /* renamed from: o  reason: collision with root package name */
    private DialogInterface.OnCancelListener f16063o;

    /* renamed from: p  reason: collision with root package name */
    private Dialog f16064p;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) z3.o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f16062n = dialog2;
        if (onCancelListener != null) {
            cVar.f16063o = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f16063o;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f16062n;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f16064p == null) {
                this.f16064p = new AlertDialog.Builder((Context) z3.o.i(getActivity())).create();
            }
            return this.f16064p;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
