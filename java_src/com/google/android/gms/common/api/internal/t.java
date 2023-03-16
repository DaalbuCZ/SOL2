package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t<T> extends y3.r {

    /* renamed from: b  reason: collision with root package name */
    protected final t4.j<T> f3640b;

    public t(int i10, t4.j<T> jVar) {
        super(i10);
        this.f3640b = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a(Status status) {
        this.f3640b.d(new x3.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void b(Exception exc) {
        this.f3640b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void c(m<?> mVar) {
        try {
            h(mVar);
        } catch (DeadObjectException e10) {
            a(x.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(x.e(e11));
        } catch (RuntimeException e12) {
            this.f3640b.d(e12);
        }
    }

    protected abstract void h(m<?> mVar);
}
