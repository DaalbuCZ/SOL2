package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import k0.j;
import l0.b;
import l0.i;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: p  reason: collision with root package name */
    private static final String f2631p = j.f("SystemJobService");

    /* renamed from: n  reason: collision with root package name */
    private i f2632n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, JobParameters> f2633o = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // l0.b
    public void b(String str, boolean z10) {
        JobParameters remove;
        j.c().a(f2631p, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f2633o) {
            remove = this.f2633o.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i k10 = i.k(getApplicationContext());
            this.f2632n = k10;
            k10.m().d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            j.c().h(f2631p, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f2632n;
        if (iVar != null) {
            iVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f2632n == null) {
            j.c().a(f2631p, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            j.c().b(f2631p, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f2633o) {
            if (this.f2633o.containsKey(a10)) {
                j.c().a(f2631p, String.format("Job is already being executed by SystemJobService: %s", a10), new Throwable[0]);
                return false;
            }
            j.c().a(f2631p, String.format("onStartJob for %s", a10), new Throwable[0]);
            this.f2633o.put(a10, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f2532b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f2531a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    aVar.f2533c = jobParameters.getNetwork();
                }
            }
            this.f2632n.v(a10, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f2632n == null) {
            j.c().a(f2631p, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            j.c().b(f2631p, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        j.c().a(f2631p, String.format("onStopJob for %s", a10), new Throwable[0]);
        synchronized (this.f2633o) {
            this.f2633o.remove(a10);
        }
        this.f2632n.x(a10);
        return !this.f2632n.m().f(a10);
    }
}
