package c2;

import java.util.List;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f3136a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f3137b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f3138a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3139b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3140c;

        /* renamed from: d  reason: collision with root package name */
        public final long f3141d;

        public a(String str, String str2, long j10, long j11) {
            this.f3138a = str;
            this.f3139b = str2;
            this.f3140c = j10;
            this.f3141d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f3136a = j10;
        this.f3137b = list;
    }

    public q2.b a(long j10) {
        long j11;
        if (this.f3137b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f3137b.size() - 1; size >= 0; size--) {
            a aVar = this.f3137b.get(size);
            boolean equals = "video/mp4".equals(aVar.f3138a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f3141d;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f3140c;
                j11 = j17;
            }
            if (!equals || j12 == j11) {
                z10 = equals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new q2.b(j13, j14, this.f3136a, j15, j16);
    }
}
