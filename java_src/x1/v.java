package x1;

import java.util.Collections;
import java.util.List;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f16281a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16282b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16283c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16284d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16285e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16286f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16287g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16288h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16289i;

    /* renamed from: j  reason: collision with root package name */
    public final long f16290j;

    /* renamed from: k  reason: collision with root package name */
    public final a f16291k;

    /* renamed from: l  reason: collision with root package name */
    private final k2.a f16292l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f16293a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f16294b;

        public a(long[] jArr, long[] jArr2) {
            this.f16293a = jArr;
            this.f16294b = jArr2;
        }
    }

    private v(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, k2.a aVar2) {
        this.f16281a = i10;
        this.f16282b = i11;
        this.f16283c = i12;
        this.f16284d = i13;
        this.f16285e = i14;
        this.f16286f = j(i14);
        this.f16287g = i15;
        this.f16288h = i16;
        this.f16289i = e(i16);
        this.f16290j = j10;
        this.f16291k = aVar;
        this.f16292l = aVar2;
    }

    public v(byte[] bArr, int i10) {
        p3.z zVar = new p3.z(bArr);
        zVar.p(i10 * 8);
        this.f16281a = zVar.h(16);
        this.f16282b = zVar.h(16);
        this.f16283c = zVar.h(24);
        this.f16284d = zVar.h(24);
        int h10 = zVar.h(20);
        this.f16285e = h10;
        this.f16286f = j(h10);
        this.f16287g = zVar.h(3) + 1;
        int h11 = zVar.h(5) + 1;
        this.f16288h = h11;
        this.f16289i = e(h11);
        this.f16290j = zVar.j(36);
        this.f16291k = null;
        this.f16292l = null;
    }

    private static int e(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        return i10 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public v a(List<n2.a> list) {
        return new v(this.f16281a, this.f16282b, this.f16283c, this.f16284d, this.f16285e, this.f16287g, this.f16288h, this.f16290j, this.f16291k, h(new k2.a(list)));
    }

    public v b(a aVar) {
        return new v(this.f16281a, this.f16282b, this.f16283c, this.f16284d, this.f16285e, this.f16287g, this.f16288h, this.f16290j, aVar, this.f16292l);
    }

    public v c(List<String> list) {
        return new v(this.f16281a, this.f16282b, this.f16283c, this.f16284d, this.f16285e, this.f16287g, this.f16288h, this.f16290j, this.f16291k, h(h0.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f16284d;
        if (i10 > 0) {
            j10 = (i10 + this.f16283c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f16281a;
            j10 = ((((i11 != this.f16282b || i11 <= 0) ? 4096L : i11) * this.f16287g) * this.f16288h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f16290j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f16285e;
    }

    public m1 g(byte[] bArr, k2.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f16284d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new m1.b().e0("audio/flac").W(i10).H(this.f16287g).f0(this.f16285e).T(Collections.singletonList(bArr)).X(h(aVar)).E();
    }

    public k2.a h(k2.a aVar) {
        k2.a aVar2 = this.f16292l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long i(long j10) {
        return m0.r((j10 * this.f16285e) / 1000000, 0L, this.f16290j - 1);
    }
}
