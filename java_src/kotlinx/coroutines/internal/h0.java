package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final /* synthetic */ class h0 {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) f0.c(str, i10, i11, i12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        Long f10;
        String d10 = f0.d(str);
        if (d10 == null) {
            return j10;
        }
        f10 = q9.l.f(d10);
        if (f10 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d10 + '\'').toString());
        }
        long longValue = f10.longValue();
        boolean z10 = false;
        if (j11 <= longValue && longValue <= j12) {
            z10 = true;
        }
        if (z10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
    }

    public static final boolean c(String str, boolean z10) {
        String d10 = f0.d(str);
        return d10 != null ? Boolean.parseBoolean(d10) : z10;
    }

    public static /* synthetic */ int d(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return f0.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long e(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return f0.c(str, j10, j13, j12);
    }
}
