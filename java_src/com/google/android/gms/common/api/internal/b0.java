package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class b0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: o  reason: collision with root package name */
    protected volatile boolean f3581o;

    /* renamed from: p  reason: collision with root package name */
    protected final AtomicReference<y> f3582p;

    /* renamed from: q  reason: collision with root package name */
    private final Handler f3583q;

    /* renamed from: r  reason: collision with root package name */
    protected final w3.e f3584r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(y3.e eVar, w3.e eVar2) {
        super(eVar);
        this.f3582p = new AtomicReference<>(null);
        this.f3583q = new j4.f(Looper.getMainLooper());
        this.f3584r = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(w3.b bVar, int i10) {
        this.f3582p.set(null);
        m(bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f3582p.set(null);
        n();
    }

    private static final int p(y yVar) {
        if (yVar == null) {
            return -1;
        }
        return yVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i10, int i11, Intent intent) {
        y yVar = this.f3582p.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int g10 = this.f3584r.g(b());
                if (g10 == 0) {
                    o();
                    return;
                } else if (yVar == null) {
                    return;
                } else {
                    if (yVar.b().k() == 18 && g10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (yVar == null) {
                return;
            }
            l(new w3.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, yVar.b().toString()), p(yVar));
            return;
        }
        if (yVar != null) {
            l(yVar.b(), yVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f3582p.set(bundle.getBoolean("resolving_error", false) ? new y(new w3.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        y yVar = this.f3582p.get();
        if (yVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", yVar.a());
        bundle.putInt("failed_status", yVar.b().k());
        bundle.putParcelable("failed_resolution", yVar.b().v());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f3581o = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f3581o = false;
    }

    protected abstract void m(w3.b bVar, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new w3.b(13, null), p(this.f3582p.get()));
    }

    public final void s(w3.b bVar, int i10) {
        y yVar = new y(bVar, i10);
        if (this.f3582p.compareAndSet(null, yVar)) {
            this.f3583q.post(new a0(this, yVar));
        }
    }
}
