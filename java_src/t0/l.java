package t0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import k0.s;
import s0.q;
/* loaded from: classes.dex */
public class l implements k0.f {

    /* renamed from: d  reason: collision with root package name */
    private static final String f14463d = k0.j.f("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final u0.a f14464a;

    /* renamed from: b  reason: collision with root package name */
    final r0.a f14465b;

    /* renamed from: c  reason: collision with root package name */
    final q f14466c;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f14467n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ UUID f14468o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k0.e f14469p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Context f14470q;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, k0.e eVar, Context context) {
            this.f14467n = cVar;
            this.f14468o = uuid;
            this.f14469p = eVar;
            this.f14470q = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f14467n.isCancelled()) {
                    String uuid = this.f14468o.toString();
                    s j10 = l.this.f14466c.j(uuid);
                    if (j10 == null || j10.e()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    l.this.f14465b.a(uuid, this.f14469p);
                    this.f14470q.startService(androidx.work.impl.foreground.a.a(this.f14470q, uuid, this.f14469p));
                }
                this.f14467n.p(null);
            } catch (Throwable th) {
                this.f14467n.q(th);
            }
        }
    }

    public l(WorkDatabase workDatabase, r0.a aVar, u0.a aVar2) {
        this.f14465b = aVar;
        this.f14464a = aVar2;
        this.f14466c = workDatabase.B();
    }

    @Override // k0.f
    public e5.a<Void> a(Context context, UUID uuid, k0.e eVar) {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        this.f14464a.b(new a(t10, uuid, eVar, context));
        return t10;
    }
}
