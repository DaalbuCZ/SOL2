package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import b0.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s0.e;
import s0.k;
import s0.n;
import s0.q;
import s0.t;
/* loaded from: classes.dex */
public abstract class WorkDatabase extends h {

    /* renamed from: l  reason: collision with root package name */
    private static final long f2564l = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.InterfaceC0057c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f2565a;

        a(Context context) {
            this.f2565a = context;
        }

        @Override // b0.c.InterfaceC0057c
        public c a(c.b bVar) {
            c.b.a a10 = c.b.a(this.f2565a);
            a10.c(bVar.f2721b).b(bVar.f2722c).d(true);
            return new c0.c().a(a10.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void c(b0.b bVar) {
            super.c(bVar);
            bVar.e();
            try {
                bVar.m(WorkDatabase.w());
                bVar.J();
            } finally {
                bVar.d();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z10) {
        h.a a10;
        if (z10) {
            a10 = g.c(context, WorkDatabase.class).c();
        } else {
            a10 = g.a(context, WorkDatabase.class, l0.h.d());
            a10.f(new a(context));
        }
        return (WorkDatabase) a10.g(executor).a(u()).b(androidx.work.impl.a.f2574a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f2575b).b(androidx.work.impl.a.f2576c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f2577d).b(androidx.work.impl.a.f2578e).b(androidx.work.impl.a.f2579f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f2580g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f2564l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract s0.b t();

    public abstract e x();

    public abstract s0.h y();

    public abstract k z();
}
