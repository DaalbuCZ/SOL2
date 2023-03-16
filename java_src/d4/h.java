package d4;

import android.os.SystemClock;
/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final h f6555a = new h();

    private h() {
    }

    public static e d() {
        return f6555a;
    }

    @Override // d4.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // d4.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // d4.e
    public final long c() {
        return System.nanoTime();
    }
}
