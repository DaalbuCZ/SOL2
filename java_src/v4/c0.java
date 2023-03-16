package v4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ d0 f15647n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c0(d0 d0Var, b0 b0Var) {
        this.f15647n = d0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d0.f(this.f15647n).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f15647n.c().post(new z(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d0.f(this.f15647n).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f15647n.c().post(new a0(this));
    }
}
