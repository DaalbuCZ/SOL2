package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.h0;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final long f11021a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f11022b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f11023c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f11024d;

    /* renamed from: e  reason: collision with root package name */
    public static g f11025e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f11026f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f11027g;

    static {
        long e10;
        int a10;
        int d10;
        int d11;
        long e11;
        e10 = h0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f11021a = e10;
        a10 = n9.f.a(f0.a(), 2);
        d10 = h0.d("kotlinx.coroutines.scheduler.core.pool.size", a10, 1, 0, 8, null);
        f11022b = d10;
        d11 = h0.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f11023c = d11;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e11 = h0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f11024d = timeUnit.toNanos(e11);
        f11025e = e.f11011a;
        f11026f = new j(0);
        f11027g = new j(1);
    }
}
