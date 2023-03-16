package x4;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
/* loaded from: classes.dex */
public class a extends x3.b {
    public a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i10), y4.a.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
