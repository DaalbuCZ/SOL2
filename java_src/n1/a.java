package n1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
/* loaded from: classes.dex */
public class a implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11483a;

    /* renamed from: b  reason: collision with root package name */
    private final o1.d f11484b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f11485c;

    /* renamed from: d  reason: collision with root package name */
    private final g f11486d;

    /* renamed from: e  reason: collision with root package name */
    private final q1.a f11487e;

    a(Context context, o1.d dVar, AlarmManager alarmManager, q1.a aVar, g gVar) {
        this.f11483a = context;
        this.f11484b = dVar;
        this.f11485c = alarmManager;
        this.f11487e = aVar;
        this.f11486d = gVar;
    }

    public a(Context context, o1.d dVar, q1.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    @Override // n1.y
    public void a(g1.p pVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", pVar.b());
        builder.appendQueryParameter("priority", String.valueOf(r1.a.a(pVar.d())));
        if (pVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(pVar.c(), 0));
        }
        Intent intent = new Intent(this.f11483a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && c(intent)) {
            k1.a.b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long x10 = this.f11484b.x(pVar);
        long g10 = this.f11486d.g(pVar.d(), x10, i10);
        k1.a.c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", pVar, Long.valueOf(g10), Long.valueOf(x10), Integer.valueOf(i10));
        this.f11485c.set(3, this.f11487e.a() + g10, PendingIntent.getBroadcast(this.f11483a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    @Override // n1.y
    public void b(g1.p pVar, int i10) {
        a(pVar, i10, false);
    }

    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f11483a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }
}
