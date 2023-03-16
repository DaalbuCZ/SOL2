package n1;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n1.d;
@AutoValue
/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private q1.a f11502a;

        /* renamed from: b  reason: collision with root package name */
        private Map<e1.d, b> f11503b = new HashMap();

        public a a(e1.d dVar, b bVar) {
            this.f11503b.put(dVar, bVar);
            return this;
        }

        public g b() {
            Objects.requireNonNull(this.f11502a, "missing required property: clock");
            if (this.f11503b.keySet().size() >= e1.d.values().length) {
                Map<e1.d, b> map = this.f11503b;
                this.f11503b = new HashMap();
                return g.d(this.f11502a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(q1.a aVar) {
            this.f11502a = aVar;
            return this;
        }
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {

        @AutoValue.Builder
        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11;
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * i11)));
    }

    public static a b() {
        return new a();
    }

    static g d(q1.a aVar, Map<e1.d, b> map) {
        return new n1.c(aVar, map);
    }

    public static g f(q1.a aVar) {
        return b().a(e1.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(e1.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(e1.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, e1.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract q1.a e();

    public long g(e1.d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<e1.d, b> h();
}
