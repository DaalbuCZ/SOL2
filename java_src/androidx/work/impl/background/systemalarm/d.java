package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import java.util.Collections;
import java.util.List;
import k0.j;
import s0.p;
import t0.n;
/* loaded from: classes.dex */
public class d implements o0.c, l0.b, n.b {

    /* renamed from: w  reason: collision with root package name */
    private static final String f2603w = j.f("DelayMetCommandHandler");

    /* renamed from: n  reason: collision with root package name */
    private final Context f2604n;

    /* renamed from: o  reason: collision with root package name */
    private final int f2605o;

    /* renamed from: p  reason: collision with root package name */
    private final String f2606p;

    /* renamed from: q  reason: collision with root package name */
    private final e f2607q;

    /* renamed from: r  reason: collision with root package name */
    private final o0.d f2608r;

    /* renamed from: u  reason: collision with root package name */
    private PowerManager.WakeLock f2611u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2612v = false;

    /* renamed from: t  reason: collision with root package name */
    private int f2610t = 0;

    /* renamed from: s  reason: collision with root package name */
    private final Object f2609s = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, int i10, String str, e eVar) {
        this.f2604n = context;
        this.f2605o = i10;
        this.f2607q = eVar;
        this.f2606p = str;
        this.f2608r = new o0.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f2609s) {
            this.f2608r.e();
            this.f2607q.h().c(this.f2606p);
            PowerManager.WakeLock wakeLock = this.f2611u;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.c().a(f2603w, String.format("Releasing wakelock %s for WorkSpec %s", this.f2611u, this.f2606p), new Throwable[0]);
                this.f2611u.release();
            }
        }
    }

    private void g() {
        synchronized (this.f2609s) {
            if (this.f2610t < 2) {
                this.f2610t = 2;
                j c10 = j.c();
                String str = f2603w;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f2606p), new Throwable[0]);
                Intent g10 = b.g(this.f2604n, this.f2606p);
                e eVar = this.f2607q;
                eVar.k(new e.b(eVar, g10, this.f2605o));
                if (this.f2607q.e().g(this.f2606p)) {
                    j.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f2606p), new Throwable[0]);
                    Intent f10 = b.f(this.f2604n, this.f2606p);
                    e eVar2 = this.f2607q;
                    eVar2.k(new e.b(eVar2, f10, this.f2605o));
                } else {
                    j.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2606p), new Throwable[0]);
                }
            } else {
                j.c().a(f2603w, String.format("Already stopped work for %s", this.f2606p), new Throwable[0]);
            }
        }
    }

    @Override // t0.n.b
    public void a(String str) {
        j.c().a(f2603w, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // l0.b
    public void b(String str, boolean z10) {
        j.c().a(f2603w, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent f10 = b.f(this.f2604n, this.f2606p);
            e eVar = this.f2607q;
            eVar.k(new e.b(eVar, f10, this.f2605o));
        }
        if (this.f2612v) {
            Intent a10 = b.a(this.f2604n);
            e eVar2 = this.f2607q;
            eVar2.k(new e.b(eVar2, a10, this.f2605o));
        }
    }

    @Override // o0.c
    public void d(List<String> list) {
        g();
    }

    @Override // o0.c
    public void e(List<String> list) {
        if (list.contains(this.f2606p)) {
            synchronized (this.f2609s) {
                if (this.f2610t == 0) {
                    this.f2610t = 1;
                    j.c().a(f2603w, String.format("onAllConstraintsMet for %s", this.f2606p), new Throwable[0]);
                    if (this.f2607q.e().j(this.f2606p)) {
                        this.f2607q.h().b(this.f2606p, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    j.c().a(f2603w, String.format("Already started work for %s", this.f2606p), new Throwable[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f2611u = t0.j.b(this.f2604n, String.format("%s (%s)", this.f2606p, Integer.valueOf(this.f2605o)));
        j c10 = j.c();
        String str = f2603w;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f2611u, this.f2606p), new Throwable[0]);
        this.f2611u.acquire();
        p l10 = this.f2607q.g().o().B().l(this.f2606p);
        if (l10 == null) {
            g();
            return;
        }
        boolean b10 = l10.b();
        this.f2612v = b10;
        if (b10) {
            this.f2608r.d(Collections.singletonList(l10));
            return;
        }
        j.c().a(str, String.format("No constraints for %s", this.f2606p), new Throwable[0]);
        e(Collections.singletonList(this.f2606p));
    }
}
