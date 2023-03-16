package y3;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
final class d0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f16967n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f16968o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ e0 f16969p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(e0 e0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f16969p = e0Var;
        this.f16967n = lifecycleCallback;
        this.f16968o = str;
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
        e0 e0Var = this.f16969p;
        i10 = e0Var.f16972o;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f16967n;
            bundle = e0Var.f16973p;
            if (bundle != null) {
                bundle3 = e0Var.f16973p;
                bundle2 = bundle3.getBundle(this.f16968o);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i11 = this.f16969p.f16972o;
        if (i11 >= 2) {
            this.f16967n.j();
        }
        i12 = this.f16969p.f16972o;
        if (i12 >= 3) {
            this.f16967n.h();
        }
        i13 = this.f16969p.f16972o;
        if (i13 >= 4) {
            this.f16967n.k();
        }
        i14 = this.f16969p.f16972o;
        if (i14 >= 5) {
            this.f16967n.g();
        }
    }
}
