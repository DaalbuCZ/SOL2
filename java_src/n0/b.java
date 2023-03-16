package n0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k0.j;
import k0.n;
import k0.s;
import l0.e;
import l0.i;
import s0.g;
import s0.p;
import s0.q;
import t0.c;
/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: r  reason: collision with root package name */
    private static final String f11478r = j.f("SystemJobScheduler");

    /* renamed from: n  reason: collision with root package name */
    private final Context f11479n;

    /* renamed from: o  reason: collision with root package name */
    private final JobScheduler f11480o;

    /* renamed from: p  reason: collision with root package name */
    private final i f11481p;

    /* renamed from: q  reason: collision with root package name */
    private final a f11482q;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f11479n = context;
        this.f11481p = iVar;
        this.f11480o = jobScheduler;
        this.f11482q = aVar;
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g10) {
            d(jobScheduler, jobInfo.getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            j.c().b(f11478r, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    private static List<Integer> e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            j.c().b(f11478r, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> b10 = iVar.o().y().b();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                String h10 = h(jobInfo);
                if (TextUtils.isEmpty(h10)) {
                    d(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(h10);
                }
            }
        }
        Iterator<String> it = b10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    j.c().a(f11478r, "Reconciling jobs", new Throwable[0]);
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase o10 = iVar.o();
            o10.c();
            try {
                q B = o10.B();
                for (String str : b10) {
                    B.f(str, -1L);
                }
                o10.r();
            } finally {
                o10.g();
            }
        }
        return z10;
    }

    @Override // l0.e
    public void a(String str) {
        List<Integer> e10 = e(this.f11479n, this.f11480o, str);
        if (e10 == null || e10.isEmpty()) {
            return;
        }
        for (Integer num : e10) {
            d(this.f11480o, num.intValue());
        }
        this.f11481p.o().y().d(str);
    }

    @Override // l0.e
    public void c(p... pVarArr) {
        List<Integer> e10;
        WorkDatabase o10 = this.f11481p.o();
        c cVar = new c(o10);
        for (p pVar : pVarArr) {
            o10.c();
            try {
                p l10 = o10.B().l(pVar.f13231a);
                if (l10 == null) {
                    j.c().h(f11478r, "Skipping scheduling " + pVar.f13231a + " because it's no longer in the DB", new Throwable[0]);
                } else if (l10.f13232b != s.ENQUEUED) {
                    j.c().h(f11478r, "Skipping scheduling " + pVar.f13231a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    g c10 = o10.y().c(pVar.f13231a);
                    int d10 = c10 != null ? c10.f13209b : cVar.d(this.f11481p.i().i(), this.f11481p.i().g());
                    if (c10 == null) {
                        this.f11481p.o().y().a(new g(pVar.f13231a, d10));
                    }
                    j(pVar, d10);
                    if (Build.VERSION.SDK_INT == 23 && (e10 = e(this.f11479n, this.f11480o, pVar.f13231a)) != null) {
                        int indexOf = e10.indexOf(Integer.valueOf(d10));
                        if (indexOf >= 0) {
                            e10.remove(indexOf);
                        }
                        j(pVar, !e10.isEmpty() ? e10.get(0).intValue() : cVar.d(this.f11481p.i().i(), this.f11481p.i().g()));
                    }
                }
                o10.r();
                o10.g();
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    @Override // l0.e
    public boolean f() {
        return true;
    }

    public void j(p pVar, int i10) {
        JobInfo a10 = this.f11482q.a(pVar, i10);
        j c10 = j.c();
        String str = f11478r;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f13231a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f11480o.schedule(a10) == 0) {
                j.c().h(str, String.format("Unable to schedule work ID %s", pVar.f13231a), new Throwable[0]);
                if (pVar.f13247q && pVar.f13248r == n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f13247q = false;
                    j.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f13231a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> g10 = g(this.f11479n, this.f11480o);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f11481p.o().B().r().size()), Integer.valueOf(this.f11481p.i().h()));
            j.c().b(f11478r, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            j.c().b(f11478r, String.format("Unable to schedule %s", pVar), th);
        }
    }
}
