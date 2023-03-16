package v1;

import android.media.MediaCodec;
import p3.m0;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f15511a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f15512b;

    /* renamed from: c  reason: collision with root package name */
    public int f15513c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f15514d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f15515e;

    /* renamed from: f  reason: collision with root package name */
    public int f15516f;

    /* renamed from: g  reason: collision with root package name */
    public int f15517g;

    /* renamed from: h  reason: collision with root package name */
    public int f15518h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f15519i;

    /* renamed from: j  reason: collision with root package name */
    private final b f15520j;

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f15521a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f15522b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f15521a = cryptoInfo;
            this.f15522b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f15522b.set(i10, i11);
            this.f15521a.setPattern(this.f15522b);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f15519i = cryptoInfo;
        this.f15520j = m0.f12306a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f15519i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f15514d == null) {
            int[] iArr = new int[1];
            this.f15514d = iArr;
            this.f15519i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f15514d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f15516f = i10;
        this.f15514d = iArr;
        this.f15515e = iArr2;
        this.f15512b = bArr;
        this.f15511a = bArr2;
        this.f15513c = i11;
        this.f15517g = i12;
        this.f15518h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f15519i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (m0.f12306a >= 24) {
            ((b) p3.a.e(this.f15520j)).b(i12, i13);
        }
    }
}
