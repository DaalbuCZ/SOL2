package z3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 implements Handler.Callback {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ j1 f17394n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ i1(j1 j1Var, h1 h1Var) {
        this.f17394n = j1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f17394n.f17395f;
            synchronized (hashMap) {
                f1 f1Var = (f1) message.obj;
                hashMap2 = this.f17394n.f17395f;
                g1 g1Var = (g1) hashMap2.get(f1Var);
                if (g1Var != null && g1Var.i()) {
                    if (g1Var.j()) {
                        g1Var.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f17394n.f17395f;
                    hashMap3.remove(f1Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            hashMap4 = this.f17394n.f17395f;
            synchronized (hashMap4) {
                f1 f1Var2 = (f1) message.obj;
                hashMap5 = this.f17394n.f17395f;
                g1 g1Var2 = (g1) hashMap5.get(f1Var2);
                if (g1Var2 != null && g1Var2.a() == 3) {
                    String valueOf = String.valueOf(f1Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b10 = g1Var2.b();
                    if (b10 == null) {
                        b10 = f1Var2.b();
                    }
                    if (b10 == null) {
                        String d10 = f1Var2.d();
                        o.i(d10);
                        b10 = new ComponentName(d10, "unknown");
                    }
                    g1Var2.onServiceDisconnected(b10);
                }
            }
            return true;
        }
    }
}
