package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import x3.a;
import z3.g0;
/* loaded from: classes.dex */
public class b implements Handler.Callback {
    public static final Status E = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status F = new Status(4, "The user must be signed in to make this API call.");
    private static final Object G = new Object();
    @GuardedBy("lock")
    private static b H;
    @NotOnlyInitialized
    private final Handler C;
    private volatile boolean D;

    /* renamed from: r  reason: collision with root package name */
    private z3.s f3572r;

    /* renamed from: s  reason: collision with root package name */
    private z3.u f3573s;

    /* renamed from: t  reason: collision with root package name */
    private final Context f3574t;

    /* renamed from: u  reason: collision with root package name */
    private final w3.e f3575u;

    /* renamed from: v  reason: collision with root package name */
    private final g0 f3576v;

    /* renamed from: n  reason: collision with root package name */
    private long f3568n = 5000;

    /* renamed from: o  reason: collision with root package name */
    private long f3569o = 120000;

    /* renamed from: p  reason: collision with root package name */
    private long f3570p = 10000;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3571q = false;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicInteger f3577w = new AtomicInteger(1);

    /* renamed from: x  reason: collision with root package name */
    private final AtomicInteger f3578x = new AtomicInteger(0);

    /* renamed from: y  reason: collision with root package name */
    private final Map<y3.b<?>, m<?>> f3579y = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")

    /* renamed from: z  reason: collision with root package name */
    private f f3580z = null;
    @GuardedBy("lock")
    private final Set<y3.b<?>> A = new m.b();
    private final Set<y3.b<?>> B = new m.b();

    private b(Context context, Looper looper, w3.e eVar) {
        this.D = true;
        this.f3574t = context;
        j4.f fVar = new j4.f(looper, this);
        this.C = fVar;
        this.f3575u = eVar;
        this.f3576v = new g0(eVar);
        if (d4.i.a(context)) {
            this.D = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status h(y3.b<?> bVar, w3.b bVar2) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(bVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b10);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(bVar2, sb.toString());
    }

    private final m<?> i(x3.e<?> eVar) {
        y3.b<?> d10 = eVar.d();
        m<?> mVar = this.f3579y.get(d10);
        if (mVar == null) {
            mVar = new m<>(this, eVar);
            this.f3579y.put(d10, mVar);
        }
        if (mVar.P()) {
            this.B.add(d10);
        }
        mVar.E();
        return mVar;
    }

    private final z3.u j() {
        if (this.f3573s == null) {
            this.f3573s = z3.t.a(this.f3574t);
        }
        return this.f3573s;
    }

    private final void k() {
        z3.s sVar = this.f3572r;
        if (sVar != null) {
            if (sVar.k() > 0 || f()) {
                j().a(sVar);
            }
            this.f3572r = null;
        }
    }

    private final <T> void l(t4.j<T> jVar, int i10, x3.e eVar) {
        q b10;
        if (i10 == 0 || (b10 = q.b(this, i10, eVar.d())) == null) {
            return;
        }
        t4.i<T> a10 = jVar.a();
        final Handler handler = this.C;
        handler.getClass();
        a10.b(new Executor() { // from class: y3.m
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b10);
    }

    public static b x(Context context) {
        b bVar;
        synchronized (G) {
            if (H == null) {
                H = new b(context.getApplicationContext(), z3.h.c().getLooper(), w3.e.m());
            }
            bVar = H;
        }
        return bVar;
    }

    public final <O extends a.d, ResultT> void D(x3.e<O> eVar, int i10, c<a.b, ResultT> cVar, t4.j<ResultT> jVar, y3.k kVar) {
        l(jVar, cVar.d(), eVar);
        v vVar = new v(i10, cVar, jVar, kVar);
        Handler handler = this.C;
        handler.sendMessage(handler.obtainMessage(4, new y3.u(vVar, this.f3578x.get(), eVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(z3.m mVar, int i10, long j10, int i11) {
        Handler handler = this.C;
        handler.sendMessage(handler.obtainMessage(18, new r(mVar, i10, j10, i11)));
    }

    public final void F(w3.b bVar, int i10) {
        if (g(bVar, i10)) {
            return;
        }
        Handler handler = this.C;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
    }

    public final void a() {
        Handler handler = this.C;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(x3.e<?> eVar) {
        Handler handler = this.C;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(f fVar) {
        synchronized (G) {
            if (this.f3580z != fVar) {
                this.f3580z = fVar;
                this.A.clear();
            }
            this.A.addAll(fVar.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(f fVar) {
        synchronized (G) {
            if (this.f3580z == fVar) {
                this.f3580z = null;
                this.A.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f3571q) {
            return false;
        }
        z3.q a10 = z3.p.b().a();
        if (a10 == null || a10.v()) {
            int a11 = this.f3576v.a(this.f3574t, 203400000);
            return a11 == -1 || a11 == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(w3.b bVar, int i10) {
        return this.f3575u.w(this.f3574t, bVar, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        m<?> mVar;
        t4.j<Boolean> b10;
        Boolean valueOf;
        y3.b bVar;
        y3.b bVar2;
        y3.b bVar3;
        y3.b bVar4;
        int i10 = message.what;
        switch (i10) {
            case 1:
                this.f3570p = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.C.removeMessages(12);
                for (y3.b<?> bVar5 : this.f3579y.keySet()) {
                    Handler handler = this.C;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar5), this.f3570p);
                }
                break;
            case 2:
                y3.b0 b0Var = (y3.b0) message.obj;
                Iterator<y3.b<?>> it = b0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        y3.b<?> next = it.next();
                        m<?> mVar2 = this.f3579y.get(next);
                        if (mVar2 == null) {
                            b0Var.b(next, new w3.b(13), null);
                            break;
                        } else if (mVar2.O()) {
                            b0Var.b(next, w3.b.f16057r, mVar2.v().k());
                        } else {
                            w3.b t10 = mVar2.t();
                            if (t10 != null) {
                                b0Var.b(next, t10, null);
                            } else {
                                mVar2.J(b0Var);
                                mVar2.E();
                            }
                        }
                    }
                }
            case 3:
                for (m<?> mVar3 : this.f3579y.values()) {
                    mVar3.D();
                    mVar3.E();
                }
                break;
            case 4:
            case 8:
            case 13:
                y3.u uVar = (y3.u) message.obj;
                m<?> mVar4 = this.f3579y.get(uVar.f17005c.d());
                if (mVar4 == null) {
                    mVar4 = i(uVar.f17005c);
                }
                if (!mVar4.P() || this.f3578x.get() == uVar.f17004b) {
                    mVar4.F(uVar.f17003a);
                    break;
                } else {
                    uVar.f17003a.a(E);
                    mVar4.L();
                    break;
                }
            case 5:
                int i11 = message.arg1;
                w3.b bVar6 = (w3.b) message.obj;
                Iterator<m<?>> it2 = this.f3579y.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        m<?> next2 = it2.next();
                        mVar = next2.r() == i11 ? next2 : null;
                    }
                }
                if (mVar != null) {
                    if (bVar6.k() == 13) {
                        String e10 = this.f3575u.e(bVar6.k());
                        String s10 = bVar6.s();
                        StringBuilder sb = new StringBuilder(String.valueOf(e10).length() + 69 + String.valueOf(s10).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e10);
                        sb.append(": ");
                        sb.append(s10);
                        m.y(mVar, new Status(17, sb.toString()));
                        break;
                    } else {
                        m.y(mVar, h(m.w(mVar), bVar6));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i11);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f3574t.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f3574t.getApplicationContext());
                    a.b().a(new h(this));
                    if (!a.b().e(true)) {
                        this.f3570p = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                i((x3.e) message.obj);
                break;
            case 9:
                if (this.f3579y.containsKey(message.obj)) {
                    this.f3579y.get(message.obj).K();
                    break;
                }
                break;
            case 10:
                for (y3.b<?> bVar7 : this.B) {
                    m<?> remove = this.f3579y.remove(bVar7);
                    if (remove != null) {
                        remove.L();
                    }
                }
                this.B.clear();
                break;
            case 11:
                if (this.f3579y.containsKey(message.obj)) {
                    this.f3579y.get(message.obj).M();
                    break;
                }
                break;
            case 12:
                if (this.f3579y.containsKey(message.obj)) {
                    this.f3579y.get(message.obj).b();
                    break;
                }
                break;
            case 14:
                g gVar = (g) message.obj;
                y3.b<?> a10 = gVar.a();
                if (this.f3579y.containsKey(a10)) {
                    boolean N = m.N(this.f3579y.get(a10), false);
                    b10 = gVar.b();
                    valueOf = Boolean.valueOf(N);
                } else {
                    b10 = gVar.b();
                    valueOf = Boolean.FALSE;
                }
                b10.c(valueOf);
                break;
            case 15:
                n nVar = (n) message.obj;
                Map<y3.b<?>, m<?>> map = this.f3579y;
                bVar = nVar.f3620a;
                if (map.containsKey(bVar)) {
                    Map<y3.b<?>, m<?>> map2 = this.f3579y;
                    bVar2 = nVar.f3620a;
                    m.B(map2.get(bVar2), nVar);
                    break;
                }
                break;
            case 16:
                n nVar2 = (n) message.obj;
                Map<y3.b<?>, m<?>> map3 = this.f3579y;
                bVar3 = nVar2.f3620a;
                if (map3.containsKey(bVar3)) {
                    Map<y3.b<?>, m<?>> map4 = this.f3579y;
                    bVar4 = nVar2.f3620a;
                    m.C(map4.get(bVar4), nVar2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                r rVar = (r) message.obj;
                if (rVar.f3637c == 0) {
                    j().a(new z3.s(rVar.f3636b, Arrays.asList(rVar.f3635a)));
                    break;
                } else {
                    z3.s sVar = this.f3572r;
                    if (sVar != null) {
                        List<z3.m> s11 = sVar.s();
                        if (sVar.k() != rVar.f3636b || (s11 != null && s11.size() >= rVar.f3638d)) {
                            this.C.removeMessages(17);
                            k();
                        } else {
                            this.f3572r.v(rVar.f3635a);
                        }
                    }
                    if (this.f3572r == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(rVar.f3635a);
                        this.f3572r = new z3.s(rVar.f3636b, arrayList);
                        Handler handler2 = this.C;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), rVar.f3637c);
                        break;
                    }
                }
                break;
            case 19:
                this.f3571q = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i10);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f3577w.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m w(y3.b<?> bVar) {
        return this.f3579y.get(bVar);
    }
}
