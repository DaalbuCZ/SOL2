package y3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import x3.a;
import z3.c;
/* loaded from: classes.dex */
public final class g implements a.f, ServiceConnection {

    /* renamed from: y  reason: collision with root package name */
    private static final String f16979y = g.class.getSimpleName();

    /* renamed from: n  reason: collision with root package name */
    private final String f16980n;

    /* renamed from: o  reason: collision with root package name */
    private final String f16981o;

    /* renamed from: p  reason: collision with root package name */
    private final ComponentName f16982p;

    /* renamed from: q  reason: collision with root package name */
    private final Context f16983q;

    /* renamed from: r  reason: collision with root package name */
    private final c f16984r;

    /* renamed from: s  reason: collision with root package name */
    private final Handler f16985s;

    /* renamed from: t  reason: collision with root package name */
    private final h f16986t;

    /* renamed from: u  reason: collision with root package name */
    private IBinder f16987u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f16988v;

    /* renamed from: w  reason: collision with root package name */
    private String f16989w;

    /* renamed from: x  reason: collision with root package name */
    private String f16990x;

    private final void s() {
        if (Thread.currentThread() != this.f16985s.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void t(String str) {
        String.valueOf(this.f16987u);
    }

    @Override // x3.a.f
    public final boolean a() {
        s();
        return this.f16987u != null;
    }

    @Override // x3.a.f
    public final Set<Scope> c() {
        return Collections.emptySet();
    }

    @Override // x3.a.f
    public final void d(c.e eVar) {
    }

    @Override // x3.a.f
    public final void e(String str) {
        s();
        this.f16989w = str;
        m();
    }

    @Override // x3.a.f
    public final void f(c.InterfaceC0247c interfaceC0247c) {
        s();
        t("Connect started.");
        if (a()) {
            try {
                e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f16982p;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f16980n).setAction(this.f16981o);
            }
            boolean bindService = this.f16983q.bindService(intent, this, z3.h.a());
            this.f16988v = bindService;
            if (!bindService) {
                this.f16987u = null;
                this.f16986t.e(new w3.b(16));
            }
            t("Finished connect.");
        } catch (SecurityException e10) {
            this.f16988v = false;
            this.f16987u = null;
            throw e10;
        }
    }

    @Override // x3.a.f
    public final boolean g() {
        return false;
    }

    @Override // x3.a.f
    public final int h() {
        return 0;
    }

    @Override // x3.a.f
    public final boolean i() {
        s();
        return this.f16988v;
    }

    @Override // x3.a.f
    public final w3.d[] j() {
        return new w3.d[0];
    }

    @Override // x3.a.f
    public final String k() {
        String str = this.f16980n;
        if (str != null) {
            return str;
        }
        z3.o.i(this.f16982p);
        return this.f16982p.getPackageName();
    }

    @Override // x3.a.f
    public final String l() {
        return this.f16989w;
    }

    @Override // x3.a.f
    public final void m() {
        s();
        t("Disconnect called.");
        try {
            this.f16983q.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f16988v = false;
        this.f16987u = null;
    }

    @Override // x3.a.f
    public final boolean n() {
        return false;
    }

    @Override // x3.a.f
    public final void o(z3.i iVar, Set<Scope> set) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f16985s.post(new Runnable() { // from class: y3.t
            @Override // java.lang.Runnable
            public final void run() {
                g.this.q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16985s.post(new Runnable() { // from class: y3.s
            @Override // java.lang.Runnable
            public final void run() {
                g.this.p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        this.f16988v = false;
        this.f16987u = null;
        t("Disconnected.");
        this.f16984r.a(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void q(IBinder iBinder) {
        this.f16988v = false;
        this.f16987u = iBinder;
        t("Connected.");
        this.f16984r.f(new Bundle());
    }

    public final void r(String str) {
        this.f16990x = str;
    }
}
