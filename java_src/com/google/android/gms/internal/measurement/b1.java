package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class b1 extends h1 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f3720a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    private boolean f3721b;

    public static final Object n0(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void T(Bundle bundle) {
        synchronized (this.f3720a) {
            this.f3720a.set(bundle);
            this.f3721b = true;
            this.f3720a.notify();
        }
    }

    public final Bundle e(long j10) {
        Bundle bundle;
        synchronized (this.f3720a) {
            if (!this.f3721b) {
                try {
                    this.f3720a.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f3720a.get();
        }
        return bundle;
    }

    public final Long f(long j10) {
        return (Long) n0(e(j10), Long.class);
    }

    public final String m0(long j10) {
        return (String) n0(e(j10), String.class);
    }
}
