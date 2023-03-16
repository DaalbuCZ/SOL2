package f5;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class m {
    public static m a(long j10, long j11, long j12) {
        return new a(j10, j11, j12);
    }

    public static m e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
