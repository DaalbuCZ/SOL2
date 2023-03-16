package j2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p3.m0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f10285b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f10286c;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f10291h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f10292i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f10293j;

    /* renamed from: k  reason: collision with root package name */
    private long f10294k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10295l;

    /* renamed from: m  reason: collision with root package name */
    private IllegalStateException f10296m;

    /* renamed from: a  reason: collision with root package name */
    private final Object f10284a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final k f10287d = new k();

    /* renamed from: e  reason: collision with root package name */
    private final k f10288e = new k();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f10289f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f10290g = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(HandlerThread handlerThread) {
        this.f10285b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f10288e.a(-2);
        this.f10290g.add(mediaFormat);
    }

    private void f() {
        if (!this.f10290g.isEmpty()) {
            this.f10292i = this.f10290g.getLast();
        }
        this.f10287d.b();
        this.f10288e.b();
        this.f10289f.clear();
        this.f10290g.clear();
        this.f10293j = null;
    }

    private boolean i() {
        return this.f10294k > 0 || this.f10295l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f10296m;
        if (illegalStateException == null) {
            return;
        }
        this.f10296m = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f10293j;
        if (codecException == null) {
            return;
        }
        this.f10293j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.f10284a) {
            if (this.f10295l) {
                return;
            }
            long j10 = this.f10294k - 1;
            this.f10294k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                n(new IllegalStateException());
            } else {
                f();
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f10284a) {
            this.f10296m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f10284a) {
            int i10 = -1;
            if (i()) {
                return -1;
            }
            j();
            if (!this.f10287d.d()) {
                i10 = this.f10287d.e();
            }
            return i10;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10284a) {
            if (i()) {
                return -1;
            }
            j();
            if (this.f10288e.d()) {
                return -1;
            }
            int e10 = this.f10288e.e();
            if (e10 >= 0) {
                p3.a.h(this.f10291h);
                MediaCodec.BufferInfo remove = this.f10289f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e10 == -2) {
                this.f10291h = this.f10290g.remove();
            }
            return e10;
        }
    }

    public void e() {
        synchronized (this.f10284a) {
            this.f10294k++;
            ((Handler) m0.j(this.f10286c)).post(new Runnable() { // from class: j2.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.m();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f10284a) {
            mediaFormat = this.f10291h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        p3.a.f(this.f10286c == null);
        this.f10285b.start();
        Handler handler = new Handler(this.f10285b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f10286c = handler;
    }

    public void o() {
        synchronized (this.f10284a) {
            this.f10295l = true;
            this.f10285b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10284a) {
            this.f10293j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f10284a) {
            this.f10287d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10284a) {
            MediaFormat mediaFormat = this.f10292i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f10292i = null;
            }
            this.f10288e.a(i10);
            this.f10289f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10284a) {
            b(mediaFormat);
            this.f10292i = null;
        }
    }
}
