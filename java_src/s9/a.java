package s9;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.u;
import r9.z1;
/* loaded from: classes.dex */
public final class a implements u {
    @Override // kotlinx.coroutines.internal.u
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.u
    public z1 b(List<? extends u> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.u
    public int c() {
        return 1073741823;
    }
}
