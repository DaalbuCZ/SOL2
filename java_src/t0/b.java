package t0;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import k0.m;
import s0.p;
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: p  reason: collision with root package name */
    private static final String f14430p = k0.j.f("EnqueueRunnable");

    /* renamed from: n  reason: collision with root package name */
    private final l0.g f14431n;

    /* renamed from: o  reason: collision with root package name */
    private final l0.c f14432o = new l0.c();

    public b(l0.g gVar) {
        this.f14431n = gVar;
    }

    private static boolean b(l0.g gVar) {
        boolean c10 = c(gVar.g(), gVar.f(), (String[]) l0.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01db A[LOOP:5: B:126:0x01d5->B:128:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(l0.i r19, java.util.List<? extends k0.u> r20, java.lang.String[] r21, java.lang.String r22, k0.d r23) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.c(l0.i, java.util.List, java.lang.String[], java.lang.String, k0.d):boolean");
    }

    private static boolean e(l0.g gVar) {
        List<l0.g> e10 = gVar.e();
        boolean z10 = false;
        if (e10 != null) {
            boolean z11 = false;
            for (l0.g gVar2 : e10) {
                if (gVar2.j()) {
                    k0.j.c().h(f14430p, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    z11 |= e(gVar2);
                }
            }
            z10 = z11;
        }
        return b(gVar) | z10;
    }

    private static void g(p pVar) {
        k0.b bVar = pVar.f13240j;
        String str = pVar.f13233c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f13235e).h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f13233c = ConstraintTrackingWorker.class.getName();
            pVar.f13235e = aVar.a();
        }
    }

    private static boolean h(l0.i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (l0.e eVar : iVar.n()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase o10 = this.f14431n.g().o();
        o10.c();
        try {
            boolean e10 = e(this.f14431n);
            o10.r();
            return e10;
        } finally {
            o10.g();
        }
    }

    public k0.m d() {
        return this.f14432o;
    }

    public void f() {
        l0.i g10 = this.f14431n.g();
        l0.f.b(g10.i(), g10.o(), g10.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f14431n.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f14431n));
            }
            if (a()) {
                d.a(this.f14431n.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f14432o.a(k0.m.f10508a);
        } catch (Throwable th) {
            this.f14432o.a(new m.b.a(th));
        }
    }
}
