package r6;

import android.content.Context;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import f5.m;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class b {
    public b(f5.e eVar, m mVar, Executor executor) {
        Context l10 = eVar.l();
        com.google.firebase.perf.config.a.g().O(l10);
        com.google.firebase.perf.application.a b10 = com.google.firebase.perf.application.a.b();
        b10.i(l10);
        b10.j(new f());
        if (mVar != null) {
            AppStartTrace q10 = AppStartTrace.q();
            q10.B(l10);
            executor.execute(new AppStartTrace.c(q10));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
