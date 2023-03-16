package d2;

import x1.m;
/* loaded from: classes.dex */
final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f6501d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6502a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f6503b;

    /* renamed from: c  reason: collision with root package name */
    private int f6504c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f6501d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11;
        int i12 = 0;
        do {
            long[] jArr = f6501d;
            if (i12 >= jArr.length) {
                return -1;
            }
            i11 = ((jArr[i12] & i10) > 0L ? 1 : ((jArr[i12] & i10) == 0L ? 0 : -1));
            i12++;
        } while (i11 == 0);
        return i12;
    }

    public int b() {
        return this.f6504c;
    }

    public long d(m mVar, boolean z10, boolean z11, int i10) {
        if (this.f6503b == 0) {
            if (!mVar.d(this.f6502a, 0, 1, z10)) {
                return -1L;
            }
            int c10 = c(this.f6502a[0] & 255);
            this.f6504c = c10;
            if (c10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f6503b = 1;
        }
        int i11 = this.f6504c;
        if (i11 > i10) {
            this.f6503b = 0;
            return -2L;
        }
        if (i11 != 1) {
            mVar.readFully(this.f6502a, 1, i11 - 1);
        }
        this.f6503b = 0;
        return a(this.f6502a, this.f6504c, z11);
    }

    public void e() {
        this.f6503b = 0;
        this.f6504c = 0;
    }
}
