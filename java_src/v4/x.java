package v4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends t {

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ d0 f15685o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(d0 d0Var) {
        this.f15685o = d0Var;
    }

    @Override // v4.t
    public final void a() {
        IInterface iInterface;
        s sVar;
        Context context;
        ServiceConnection serviceConnection;
        d0 d0Var = this.f15685o;
        iInterface = d0Var.f15661m;
        if (iInterface != null) {
            sVar = d0Var.f15650b;
            sVar.d("Unbind from service.", new Object[0]);
            d0 d0Var2 = this.f15685o;
            context = d0Var2.f15649a;
            serviceConnection = d0Var2.f15660l;
            context.unbindService(serviceConnection);
            this.f15685o.f15655g = false;
            this.f15685o.f15661m = null;
            this.f15685o.f15660l = null;
        }
        this.f15685o.t();
    }
}
