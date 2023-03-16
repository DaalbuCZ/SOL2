package n1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
/* loaded from: classes.dex */
public class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11497a;

    /* renamed from: b  reason: collision with root package name */
    private final o1.d f11498b;

    /* renamed from: c  reason: collision with root package name */
    private final g f11499c;

    public e(Context context, o1.d dVar, g gVar) {
        this.f11497a = context;
        this.f11498b = dVar;
        this.f11499c = gVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // n1.y
    public void a(g1.p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f11497a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f11497a.getSystemService("jobscheduler");
        int c10 = c(pVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            k1.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long x10 = this.f11498b.x(pVar);
        JobInfo.Builder c11 = this.f11499c.c(new JobInfo.Builder(c10, componentName), pVar.d(), x10, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", r1.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        k1.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c10), Long.valueOf(this.f11499c.g(pVar.d(), x10, i10)), Long.valueOf(x10), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    @Override // n1.y
    public void b(g1.p pVar, int i10) {
        a(pVar, i10, false);
    }

    int c(g1.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f11497a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(r1.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
