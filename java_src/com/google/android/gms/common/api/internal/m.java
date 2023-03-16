package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import x3.a;
import x3.a.d;
import x3.f;
import z3.g0;
/* loaded from: classes.dex */
public final class m<O extends a.d> implements f.a, f.b {
    @NotOnlyInitialized

    /* renamed from: b */
    private final a.f f3608b;

    /* renamed from: c */
    private final y3.b<O> f3609c;

    /* renamed from: d */
    private final e f3610d;

    /* renamed from: g */
    private final int f3613g;

    /* renamed from: h */
    private final y3.z f3614h;

    /* renamed from: i */
    private boolean f3615i;

    /* renamed from: m */
    final /* synthetic */ b f3619m;

    /* renamed from: a */
    private final Queue<x> f3607a = new LinkedList();

    /* renamed from: e */
    private final Set<y3.b0> f3611e = new HashSet();

    /* renamed from: f */
    private final Map<y3.f<?>, y3.v> f3612f = new HashMap();

    /* renamed from: j */
    private final List<n> f3616j = new ArrayList();

    /* renamed from: k */
    private w3.b f3617k = null;

    /* renamed from: l */
    private int f3618l = 0;

    public m(b bVar, x3.e<O> eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f3619m = bVar;
        handler = bVar.C;
        a.f g10 = eVar.g(handler.getLooper(), this);
        this.f3608b = g10;
        this.f3609c = eVar.d();
        this.f3610d = new e();
        this.f3613g = eVar.f();
        if (!g10.n()) {
            this.f3614h = null;
            return;
        }
        context = bVar.f3574t;
        handler2 = bVar.C;
        this.f3614h = eVar.h(context, handler2);
    }

    public static /* bridge */ /* synthetic */ void B(m mVar, n nVar) {
        if (mVar.f3616j.contains(nVar) && !mVar.f3615i) {
            if (mVar.f3608b.a()) {
                mVar.i();
            } else {
                mVar.E();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void C(m mVar, n nVar) {
        Handler handler;
        Handler handler2;
        w3.d dVar;
        w3.d[] g10;
        if (mVar.f3616j.remove(nVar)) {
            handler = mVar.f3619m.C;
            handler.removeMessages(15, nVar);
            handler2 = mVar.f3619m.C;
            handler2.removeMessages(16, nVar);
            dVar = nVar.f3621b;
            ArrayList arrayList = new ArrayList(mVar.f3607a.size());
            for (x xVar : mVar.f3607a) {
                if ((xVar instanceof y3.r) && (g10 = ((y3.r) xVar).g(mVar)) != null && d4.b.c(g10, dVar)) {
                    arrayList.add(xVar);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                x xVar2 = (x) arrayList.get(i10);
                mVar.f3607a.remove(xVar2);
                xVar2.b(new x3.l(dVar));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean N(m mVar, boolean z10) {
        return mVar.q(false);
    }

    private final w3.d c(w3.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            w3.d[] j10 = this.f3608b.j();
            if (j10 == null) {
                j10 = new w3.d[0];
            }
            m.a aVar = new m.a(j10.length);
            for (w3.d dVar : j10) {
                aVar.put(dVar.k(), Long.valueOf(dVar.s()));
            }
            for (w3.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.k());
                if (l10 == null || l10.longValue() < dVar2.s()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void d(w3.b bVar) {
        for (y3.b0 b0Var : this.f3611e) {
            b0Var.b(this.f3609c, bVar, z3.n.a(bVar, w3.b.f16057r) ? this.f3608b.k() : null);
        }
        this.f3611e.clear();
    }

    public final void g(Status status) {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        h(status, null, false);
    }

    private final void h(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<x> it = this.f3607a.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (!z10 || next.f3645a == 2) {
                if (status != null) {
                    next.a(status);
                } else {
                    next.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.f3607a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayList.get(i10);
            if (!this.f3608b.a()) {
                return;
            }
            if (o(xVar)) {
                this.f3607a.remove(xVar);
            }
        }
    }

    public final void j() {
        D();
        d(w3.b.f16057r);
        n();
        Iterator<y3.v> it = this.f3612f.values().iterator();
        if (it.hasNext()) {
            y3.i<a.b, ?> iVar = it.next().f17006a;
            throw null;
        }
        i();
        l();
    }

    public final void k(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        g0 g0Var;
        D();
        this.f3615i = true;
        this.f3610d.c(i10, this.f3608b.l());
        b bVar = this.f3619m;
        handler = bVar.C;
        handler2 = bVar.C;
        Message obtain = Message.obtain(handler2, 9, this.f3609c);
        j10 = this.f3619m.f3568n;
        handler.sendMessageDelayed(obtain, j10);
        b bVar2 = this.f3619m;
        handler3 = bVar2.C;
        handler4 = bVar2.C;
        Message obtain2 = Message.obtain(handler4, 11, this.f3609c);
        j11 = this.f3619m.f3569o;
        handler3.sendMessageDelayed(obtain2, j11);
        g0Var = this.f3619m.f3576v;
        g0Var.c();
        for (y3.v vVar : this.f3612f.values()) {
            vVar.f17007b.run();
        }
    }

    private final void l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f3619m.C;
        handler.removeMessages(12, this.f3609c);
        b bVar = this.f3619m;
        handler2 = bVar.C;
        handler3 = bVar.C;
        Message obtainMessage = handler3.obtainMessage(12, this.f3609c);
        j10 = this.f3619m.f3570p;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    private final void m(x xVar) {
        xVar.d(this.f3610d, P());
        try {
            xVar.c(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.f3608b.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        Handler handler;
        Handler handler2;
        if (this.f3615i) {
            handler = this.f3619m.C;
            handler.removeMessages(11, this.f3609c);
            handler2 = this.f3619m.C;
            handler2.removeMessages(9, this.f3609c);
            this.f3615i = false;
        }
    }

    private final boolean o(x xVar) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(xVar instanceof y3.r)) {
            m(xVar);
            return true;
        }
        y3.r rVar = (y3.r) xVar;
        w3.d c10 = c(rVar.g(this));
        if (c10 == null) {
            m(xVar);
            return true;
        }
        String name = this.f3608b.getClass().getName();
        String k10 = c10.k();
        long s10 = c10.s();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(k10).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(k10);
        sb.append(", ");
        sb.append(s10);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        z10 = this.f3619m.D;
        if (!z10 || !rVar.f(this)) {
            rVar.b(new x3.l(c10));
            return true;
        }
        n nVar = new n(this.f3609c, c10, null);
        int indexOf = this.f3616j.indexOf(nVar);
        if (indexOf >= 0) {
            n nVar2 = this.f3616j.get(indexOf);
            handler5 = this.f3619m.C;
            handler5.removeMessages(15, nVar2);
            b bVar = this.f3619m;
            handler6 = bVar.C;
            handler7 = bVar.C;
            Message obtain = Message.obtain(handler7, 15, nVar2);
            j12 = this.f3619m.f3568n;
            handler6.sendMessageDelayed(obtain, j12);
            return false;
        }
        this.f3616j.add(nVar);
        b bVar2 = this.f3619m;
        handler = bVar2.C;
        handler2 = bVar2.C;
        Message obtain2 = Message.obtain(handler2, 15, nVar);
        j10 = this.f3619m.f3568n;
        handler.sendMessageDelayed(obtain2, j10);
        b bVar3 = this.f3619m;
        handler3 = bVar3.C;
        handler4 = bVar3.C;
        Message obtain3 = Message.obtain(handler4, 16, nVar);
        j11 = this.f3619m.f3569o;
        handler3.sendMessageDelayed(obtain3, j11);
        w3.b bVar4 = new w3.b(2, null);
        if (p(bVar4)) {
            return false;
        }
        this.f3619m.g(bVar4, this.f3613g);
        return false;
    }

    private final boolean p(w3.b bVar) {
        Object obj;
        f fVar;
        Set set;
        f fVar2;
        obj = b.G;
        synchronized (obj) {
            b bVar2 = this.f3619m;
            fVar = bVar2.f3580z;
            if (fVar != null) {
                set = bVar2.A;
                if (set.contains(this.f3609c)) {
                    fVar2 = this.f3619m.f3580z;
                    fVar2.s(bVar, this.f3613g);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean q(boolean z10) {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        if (this.f3608b.a() && this.f3612f.size() == 0) {
            if (!this.f3610d.e()) {
                this.f3608b.e("Timing out service connection.");
                return true;
            }
            if (z10) {
                l();
            }
            return false;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ y3.b w(m mVar) {
        return mVar.f3609c;
    }

    public static /* bridge */ /* synthetic */ void y(m mVar, Status status) {
        mVar.g(status);
    }

    public final void D() {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        this.f3617k = null;
    }

    public final void E() {
        Handler handler;
        w3.b bVar;
        g0 g0Var;
        Context context;
        handler = this.f3619m.C;
        z3.o.c(handler);
        if (this.f3608b.a() || this.f3608b.i()) {
            return;
        }
        try {
            b bVar2 = this.f3619m;
            g0Var = bVar2.f3576v;
            context = bVar2.f3574t;
            int b10 = g0Var.b(context, this.f3608b);
            if (b10 != 0) {
                w3.b bVar3 = new w3.b(b10, null);
                String name = this.f3608b.getClass().getName();
                String obj = bVar3.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(obj);
                Log.w("GoogleApiManager", sb.toString());
                H(bVar3, null);
                return;
            }
            b bVar4 = this.f3619m;
            a.f fVar = this.f3608b;
            p pVar = new p(bVar4, fVar, this.f3609c);
            if (fVar.n()) {
                ((y3.z) z3.o.i(this.f3614h)).p0(pVar);
            }
            try {
                this.f3608b.f(pVar);
            } catch (SecurityException e10) {
                e = e10;
                bVar = new w3.b(10);
                H(bVar, e);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            bVar = new w3.b(10);
        }
    }

    public final void F(x xVar) {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        if (this.f3608b.a()) {
            if (o(xVar)) {
                l();
                return;
            } else {
                this.f3607a.add(xVar);
                return;
            }
        }
        this.f3607a.add(xVar);
        w3.b bVar = this.f3617k;
        if (bVar == null || !bVar.x()) {
            E();
        } else {
            H(this.f3617k, null);
        }
    }

    public final void G() {
        this.f3618l++;
    }

    public final void H(w3.b bVar, Exception exc) {
        Handler handler;
        g0 g0Var;
        boolean z10;
        Status h10;
        Status h11;
        Status h12;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f3619m.C;
        z3.o.c(handler);
        y3.z zVar = this.f3614h;
        if (zVar != null) {
            zVar.q0();
        }
        D();
        g0Var = this.f3619m.f3576v;
        g0Var.c();
        d(bVar);
        if ((this.f3608b instanceof b4.e) && bVar.k() != 24) {
            this.f3619m.f3571q = true;
            b bVar2 = this.f3619m;
            handler5 = bVar2.C;
            handler6 = bVar2.C;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (bVar.k() == 4) {
            status = b.F;
            g(status);
        } else if (this.f3607a.isEmpty()) {
            this.f3617k = bVar;
        } else if (exc != null) {
            handler4 = this.f3619m.C;
            z3.o.c(handler4);
            h(null, exc, false);
        } else {
            z10 = this.f3619m.D;
            if (!z10) {
                h10 = b.h(this.f3609c, bVar);
                g(h10);
                return;
            }
            h11 = b.h(this.f3609c, bVar);
            h(h11, null, true);
            if (this.f3607a.isEmpty() || p(bVar) || this.f3619m.g(bVar, this.f3613g)) {
                return;
            }
            if (bVar.k() == 18) {
                this.f3615i = true;
            }
            if (!this.f3615i) {
                h12 = b.h(this.f3609c, bVar);
                g(h12);
                return;
            }
            b bVar3 = this.f3619m;
            handler2 = bVar3.C;
            handler3 = bVar3.C;
            Message obtain = Message.obtain(handler3, 9, this.f3609c);
            j10 = this.f3619m.f3568n;
            handler2.sendMessageDelayed(obtain, j10);
        }
    }

    public final void I(w3.b bVar) {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        a.f fVar = this.f3608b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.e(sb.toString());
        H(bVar, null);
    }

    public final void J(y3.b0 b0Var) {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        this.f3611e.add(b0Var);
    }

    public final void K() {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        if (this.f3615i) {
            E();
        }
    }

    public final void L() {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        g(b.E);
        this.f3610d.d();
        for (y3.f fVar : (y3.f[]) this.f3612f.keySet().toArray(new y3.f[0])) {
            F(new w(fVar, new t4.j()));
        }
        d(new w3.b(4));
        if (this.f3608b.a()) {
            this.f3608b.d(new l(this));
        }
    }

    public final void M() {
        Handler handler;
        w3.e eVar;
        Context context;
        handler = this.f3619m.C;
        z3.o.c(handler);
        if (this.f3615i) {
            n();
            b bVar = this.f3619m;
            eVar = bVar.f3575u;
            context = bVar.f3574t;
            g(eVar.g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f3608b.e("Timing out connection while resuming.");
        }
    }

    public final boolean O() {
        return this.f3608b.a();
    }

    public final boolean P() {
        return this.f3608b.n();
    }

    @Override // y3.c
    public final void a(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f3619m.C;
        if (myLooper == handler.getLooper()) {
            k(i10);
            return;
        }
        handler2 = this.f3619m.C;
        handler2.post(new j(this, i10));
    }

    public final boolean b() {
        return q(true);
    }

    @Override // y3.h
    public final void e(w3.b bVar) {
        H(bVar, null);
    }

    @Override // y3.c
    public final void f(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f3619m.C;
        if (myLooper == handler.getLooper()) {
            j();
            return;
        }
        handler2 = this.f3619m.C;
        handler2.post(new i(this));
    }

    public final int r() {
        return this.f3613g;
    }

    public final int s() {
        return this.f3618l;
    }

    public final w3.b t() {
        Handler handler;
        handler = this.f3619m.C;
        z3.o.c(handler);
        return this.f3617k;
    }

    public final a.f v() {
        return this.f3608b;
    }

    public final Map<y3.f<?>, y3.v> x() {
        return this.f3612f;
    }
}
