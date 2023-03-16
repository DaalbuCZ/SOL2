package j2;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p3.m0;
/* loaded from: classes.dex */
class e {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque<b> f10268g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f10269h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f10270a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f10271b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f10272c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f10273d;

    /* renamed from: e  reason: collision with root package name */
    private final p3.g f10274e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10275f;

    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f10277a;

        /* renamed from: b  reason: collision with root package name */
        public int f10278b;

        /* renamed from: c  reason: collision with root package name */
        public int f10279c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f10280d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f10281e;

        /* renamed from: f  reason: collision with root package name */
        public int f10282f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f10277a = i10;
            this.f10278b = i11;
            this.f10279c = i12;
            this.f10281e = j10;
            this.f10282f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new p3.g());
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, p3.g gVar) {
        this.f10270a = mediaCodec;
        this.f10271b = handlerThread;
        this.f10274e = gVar;
        this.f10273d = new AtomicReference<>();
    }

    private void b() {
        this.f10274e.c();
        ((Handler) p3.a.e(this.f10272c)).obtainMessage(2).sendToTarget();
        this.f10274e.a();
    }

    private static void c(v1.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f15516f;
        cryptoInfo.numBytesOfClearData = e(cVar.f15514d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f15515e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) p3.a.e(d(cVar.f15512b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) p3.a.e(d(cVar.f15511a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f15513c;
        if (m0.f12306a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f15517g, cVar.f15518h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f10277a, bVar.f10278b, bVar.f10279c, bVar.f10281e, bVar.f10282f);
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            h(bVar.f10277a, bVar.f10278b, bVar.f10280d, bVar.f10281e, bVar.f10282f);
        } else if (i10 != 2) {
            this.f10273d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f10274e.e();
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f10270a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            this.f10273d.compareAndSet(null, e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f10269h) {
                this.f10270a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            this.f10273d.compareAndSet(null, e10);
        }
    }

    private void j() {
        ((Handler) p3.a.e(this.f10272c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f10268g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private void l() {
        RuntimeException andSet = this.f10273d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f10268g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f10275f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) m0.j(this.f10272c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, v1.c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f10280d);
        ((Handler) m0.j(this.f10272c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f10275f) {
            i();
            this.f10271b.quit();
        }
        this.f10275f = false;
    }

    public void q() {
        if (this.f10275f) {
            return;
        }
        this.f10271b.start();
        this.f10272c = new a(this.f10271b.getLooper());
        this.f10275f = true;
    }

    public void r() {
        b();
    }
}
