package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k0.j;
import l0.i;
import s0.g;
import s0.h;
import s0.k;
import s0.p;
import s0.q;
import s0.t;
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: t  reason: collision with root package name */
    private static final String f2708t = j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String r(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f13231a, pVar.f13233c, num, pVar.f13232b.name(), str, str2);
    }

    private static String s(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (p pVar : list) {
            Integer num = null;
            g c10 = hVar.c(pVar.f13231a);
            if (c10 != null) {
                num = Integer.valueOf(c10.f13209b);
            }
            sb.append(r(pVar, TextUtils.join(",", kVar.b(pVar.f13231a)), num, TextUtils.join(",", tVar.b(pVar.f13231a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a q() {
        WorkDatabase o10 = i.k(a()).o();
        q B = o10.B();
        k z10 = o10.z();
        t C = o10.C();
        h y10 = o10.y();
        List<p> i10 = B.i(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<p> d10 = B.d();
        List<p> s10 = B.s(200);
        if (i10 != null && !i10.isEmpty()) {
            j c10 = j.c();
            String str = f2708t;
            c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
            j.c().d(str, s(z10, C, y10, i10), new Throwable[0]);
        }
        if (d10 != null && !d10.isEmpty()) {
            j c11 = j.c();
            String str2 = f2708t;
            c11.d(str2, "Running work:\n\n", new Throwable[0]);
            j.c().d(str2, s(z10, C, y10, d10), new Throwable[0]);
        }
        if (s10 != null && !s10.isEmpty()) {
            j c12 = j.c();
            String str3 = f2708t;
            c12.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            j.c().d(str3, s(z10, C, y10, s10), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
