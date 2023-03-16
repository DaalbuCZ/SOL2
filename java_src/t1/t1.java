package t1;

import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: b  reason: collision with root package name */
    public static final t1 f14677b;

    /* renamed from: a  reason: collision with root package name */
    private final a f14678a;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f14679b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f14680a;

        public a(LogSessionId logSessionId) {
            this.f14680a = logSessionId;
        }
    }

    static {
        f14677b = p3.m0.f12306a < 31 ? new t1() : new t1(a.f14679b);
    }

    public t1() {
        this((a) null);
        p3.a.f(p3.m0.f12306a < 31);
    }

    public t1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private t1(a aVar) {
        this.f14678a = aVar;
    }

    public LogSessionId a() {
        return ((a) p3.a.e(this.f14678a)).f14680a;
    }
}
