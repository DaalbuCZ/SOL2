package l0;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import s0.p;
import s0.q;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11052a = k0.j.f("Schedulers");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            n0.b bVar = new n0.b(context, iVar);
            t0.d.a(context, SystemJobService.class, true);
            k0.j.c().a(f11052a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c10 = c(context);
        if (c10 == null) {
            androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
            t0.d.a(context, SystemAlarmService.class, true);
            k0.j.c().a(f11052a, "Created SystemAlarmScheduler", new Throwable[0]);
            return fVar;
        }
        return c10;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q B = workDatabase.B();
        workDatabase.c();
        try {
            List<p> k10 = B.k(aVar.h());
            List<p> s10 = B.s(200);
            if (k10 != null && k10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (p pVar : k10) {
                    B.f(pVar.f13231a, currentTimeMillis);
                }
            }
            workDatabase.r();
            if (k10 != null && k10.size() > 0) {
                p[] pVarArr = (p[]) k10.toArray(new p[k10.size()]);
                for (e eVar : list) {
                    if (eVar.f()) {
                        eVar.c(pVarArr);
                    }
                }
            }
            if (s10 == null || s10.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) s10.toArray(new p[s10.size()]);
            for (e eVar2 : list) {
                if (!eVar2.f()) {
                    eVar2.c(pVarArr2);
                }
            }
        } finally {
            workDatabase.g();
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            k0.j.c().a(f11052a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            k0.j.c().a(f11052a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
