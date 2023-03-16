package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import k0.j;
import k0.l;
import k0.t;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2634a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.c().a(f2634a, "Requesting diagnostics", new Throwable[0]);
        try {
            t.e(context).d(l.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            j.c().b(f2634a, "WorkManager is not initialized", e10);
        }
    }
}
