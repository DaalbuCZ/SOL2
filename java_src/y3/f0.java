package y3;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
final class f0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f16976n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f16977o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ g0 f16978p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(g0 g0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f16978p = g0Var;
        this.f16976n = lifecycleCallback;
        this.f16977o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        g0 g0Var = this.f16978p;
        i10 = g0Var.f16993m0;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f16976n;
            bundle = g0Var.f16994n0;
            if (bundle != null) {
                bundle3 = g0Var.f16994n0;
                bundle2 = bundle3.getBundle(this.f16977o);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i11 = this.f16978p.f16993m0;
        if (i11 >= 2) {
            this.f16976n.j();
        }
        i12 = this.f16978p.f16993m0;
        if (i12 >= 3) {
            this.f16976n.h();
        }
        i13 = this.f16978p.f16993m0;
        if (i13 >= 4) {
            this.f16976n.k();
        }
        i14 = this.f16978p.f16993m0;
        if (i14 >= 5) {
            this.f16976n.g();
        }
    }
}
