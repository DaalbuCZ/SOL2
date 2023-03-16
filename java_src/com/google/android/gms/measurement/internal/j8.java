package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.kd;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j8 {

    /* renamed from: a  reason: collision with root package name */
    protected long f4691a;

    /* renamed from: b  reason: collision with root package name */
    protected long f4692b;

    /* renamed from: c  reason: collision with root package name */
    private final o f4693c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l8 f4694d;

    public j8(l8 l8Var) {
        this.f4694d = l8Var;
        this.f4693c = new h8(this, l8Var.f4438a);
        long b10 = l8Var.f4438a.e().b();
        this.f4691a = b10;
        this.f4692b = b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f4693c.b();
        this.f4691a = 0L;
        this.f4692b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j10) {
        this.f4693c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j10) {
        this.f4694d.h();
        this.f4693c.b();
        this.f4691a = j10;
        this.f4692b = j10;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f4694d.h();
        this.f4694d.i();
        kd.c();
        if (!this.f4694d.f4438a.z().B(null, u2.f5048f0) || this.f4694d.f4438a.o()) {
            this.f4694d.f4438a.F().f4982o.b(this.f4694d.f4438a.e().a());
        }
        long j11 = j10 - this.f4691a;
        if (!z10 && j11 < 1000) {
            this.f4694d.f4438a.d().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f4692b;
            this.f4692b = j10;
        }
        this.f4694d.f4438a.d().v().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        i9.y(this.f4694d.f4438a.K().s(!this.f4694d.f4438a.z().D()), bundle, true);
        if (!z11) {
            this.f4694d.f4438a.I().u("auto", "_e", bundle);
        }
        this.f4691a = j10;
        this.f4693c.b();
        this.f4693c.d(3600000L);
        return true;
    }
}
