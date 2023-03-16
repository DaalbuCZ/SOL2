package y0;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
/* loaded from: classes.dex */
public class j1 {
    public static e1 a(View view, q1 q1Var, boolean z10, boolean z11) {
        if (!(view instanceof Button) || (view instanceof CompoundButton)) {
            if (view instanceof SeekBar) {
                return new y0(q1Var, z10, z11);
            }
            if (view instanceof EditText) {
                return new x(q1Var, z10, z11);
            }
            if (view instanceof Spinner) {
                return new f3(q1Var, z10, z11);
            }
            if (view instanceof CompoundButton) {
                return new m(q1Var, z10, z11);
            }
            return null;
        }
        return new a2(q1Var, z10, z11);
    }
}
