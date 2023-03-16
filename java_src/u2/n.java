package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f15308h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f15309a;

    /* renamed from: b  reason: collision with root package name */
    public final o3.p f15310b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f15311c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f15312d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15313e;

    /* renamed from: f  reason: collision with root package name */
    public final long f15314f;

    /* renamed from: g  reason: collision with root package name */
    public final long f15315g;

    public n(long j10, o3.p pVar, long j11) {
        this(j10, pVar, pVar.f12034a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public n(long j10, o3.p pVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f15309a = j10;
        this.f15310b = pVar;
        this.f15311c = uri;
        this.f15312d = map;
        this.f15313e = j11;
        this.f15314f = j12;
        this.f15315g = j13;
    }

    public static long a() {
        return f15308h.getAndIncrement();
    }
}
