package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import z3.c;
/* loaded from: classes.dex */
public final class u7 implements ServiceConnection, c.a, c.b {

    /* renamed from: n  reason: collision with root package name */
    private volatile boolean f5094n;

    /* renamed from: o  reason: collision with root package name */
    private volatile b3 f5095o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ v7 f5096p;

    /* JADX INFO: Access modifiers changed from: protected */
    public u7(v7 v7Var) {
        this.f5096p = v7Var;
    }

    @Override // z3.c.a
    public final void a(int i10) {
        z3.o.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f5096p.f4438a.d().q().a("Service connection suspended");
        this.f5096p.f4438a.b().z(new s7(this));
    }

    public final void c(Intent intent) {
        u7 u7Var;
        this.f5096p.h();
        Context c10 = this.f5096p.f4438a.c();
        c4.a b10 = c4.a.b();
        synchronized (this) {
            if (this.f5094n) {
                this.f5096p.f4438a.d().v().a("Connection attempt already in progress");
                return;
            }
            this.f5096p.f4438a.d().v().a("Using local app measurement service");
            this.f5094n = true;
            u7Var = this.f5096p.f5125c;
            b10.a(c10, intent, u7Var, 129);
        }
    }

    public final void d() {
        this.f5096p.h();
        Context c10 = this.f5096p.f4438a.c();
        synchronized (this) {
            if (this.f5094n) {
                this.f5096p.f4438a.d().v().a("Connection attempt already in progress");
            } else if (this.f5095o != null && (this.f5095o.i() || this.f5095o.a())) {
                this.f5096p.f4438a.d().v().a("Already awaiting connection attempt");
            } else {
                this.f5095o = new b3(c10, Looper.getMainLooper(), this, this);
                this.f5096p.f4438a.d().v().a("Connecting to remote service");
                this.f5094n = true;
                z3.o.i(this.f5095o);
                this.f5095o.q();
            }
        }
    }

    @Override // z3.c.b
    public final void e(w3.b bVar) {
        z3.o.d("MeasurementServiceConnection.onConnectionFailed");
        f3 E = this.f5096p.f4438a.E();
        if (E != null) {
            E.w().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f5094n = false;
            this.f5095o = null;
        }
        this.f5096p.f4438a.b().z(new t7(this));
    }

    @Override // z3.c.a
    public final void f(Bundle bundle) {
        z3.o.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                z3.o.i(this.f5095o);
                this.f5096p.f4438a.b().z(new r7(this, (p4.f) this.f5095o.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f5095o = null;
                this.f5094n = false;
            }
        }
    }

    public final void g() {
        if (this.f5095o != null && (this.f5095o.a() || this.f5095o.i())) {
            this.f5095o.m();
        }
        this.f5095o = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u7 u7Var;
        z3.o.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f5094n = false;
                this.f5096p.f4438a.d().r().a("Service connected with null binder");
                return;
            }
            p4.f fVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    fVar = queryLocalInterface instanceof p4.f ? (p4.f) queryLocalInterface : new v2(iBinder);
                    this.f5096p.f4438a.d().v().a("Bound to IMeasurementService interface");
                } else {
                    this.f5096p.f4438a.d().r().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f5096p.f4438a.d().r().a("Service connect failed to get IMeasurementService");
            }
            if (fVar == null) {
                this.f5094n = false;
                try {
                    c4.a b10 = c4.a.b();
                    Context c10 = this.f5096p.f4438a.c();
                    u7Var = this.f5096p.f5125c;
                    b10.c(c10, u7Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f5096p.f4438a.b().z(new p7(this, fVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        z3.o.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f5096p.f4438a.d().q().a("Service disconnected");
        this.f5096p.f4438a.b().z(new q7(this, componentName));
    }
}
