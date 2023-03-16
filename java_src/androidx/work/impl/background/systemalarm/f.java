package androidx.work.impl.background.systemalarm;

import android.content.Context;
import k0.j;
import s0.p;
/* loaded from: classes.dex */
public class f implements l0.e {

    /* renamed from: o  reason: collision with root package name */
    private static final String f2629o = j.f("SystemAlarmScheduler");

    /* renamed from: n  reason: collision with root package name */
    private final Context f2630n;

    public f(Context context) {
        this.f2630n = context.getApplicationContext();
    }

    private void b(p pVar) {
        j.c().a(f2629o, String.format("Scheduling work with workSpecId %s", pVar.f13231a), new Throwable[0]);
        this.f2630n.startService(b.f(this.f2630n, pVar.f13231a));
    }

    @Override // l0.e
    public void a(String str) {
        this.f2630n.startService(b.g(this.f2630n, str));
    }

    @Override // l0.e
    public void c(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }

    @Override // l0.e
    public boolean f() {
        return true;
    }
}
