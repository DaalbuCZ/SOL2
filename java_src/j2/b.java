package j2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import j2.b;
import j2.l;
import java.nio.ByteBuffer;
import p3.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f10257a;

    /* renamed from: b  reason: collision with root package name */
    private final g f10258b;

    /* renamed from: c  reason: collision with root package name */
    private final e f10259c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10260d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10261e;

    /* renamed from: f  reason: collision with root package name */
    private int f10262f;

    /* renamed from: j2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0144b implements l.b {

        /* renamed from: a  reason: collision with root package name */
        private final a5.o<HandlerThread> f10263a;

        /* renamed from: b  reason: collision with root package name */
        private final a5.o<HandlerThread> f10264b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f10265c;

        public C0144b(final int i10, boolean z10) {
            this(new a5.o() { // from class: j2.c
                @Override // a5.o
                public final Object get() {
                    HandlerThread e10;
                    e10 = b.C0144b.e(i10);
                    return e10;
                }
            }, new a5.o() { // from class: j2.d
                @Override // a5.o
                public final Object get() {
                    HandlerThread f10;
                    f10 = b.C0144b.f(i10);
                    return f10;
                }
            }, z10);
        }

        C0144b(a5.o<HandlerThread> oVar, a5.o<HandlerThread> oVar2, boolean z10) {
            this.f10263a = oVar;
            this.f10264b = oVar2;
            this.f10265c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.t(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.u(i10));
        }

        @Override // j2.l.b
        /* renamed from: d */
        public b a(l.a aVar) {
            MediaCodec mediaCodec;
            b bVar;
            String str = aVar.f10310a.f10318a;
            b bVar2 = null;
            try {
                j0.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodec, this.f10263a.get(), this.f10264b.get(), this.f10265c);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodec = null;
            }
            try {
                j0.c();
                bVar.w(aVar.f10311b, aVar.f10313d, aVar.f10314e, aVar.f10315f);
                return bVar;
            } catch (Exception e12) {
                e = e12;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f10257a = mediaCodec;
        this.f10258b = new g(handlerThread);
        this.f10259c = new e(mediaCodec, handlerThread2);
        this.f10260d = z10;
        this.f10262f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i10) {
        return v(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(int i10) {
        return v(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String v(int i10, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f10258b.h(this.f10257a);
        j0.a("configureCodec");
        this.f10257a.configure(mediaFormat, surface, mediaCrypto, i10);
        j0.c();
        this.f10259c.q();
        j0.a("startCodec");
        this.f10257a.start();
        j0.c();
        this.f10262f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void y() {
        if (this.f10260d) {
            try {
                this.f10259c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // j2.l
    public void a() {
        try {
            if (this.f10262f == 1) {
                this.f10259c.p();
                this.f10258b.o();
            }
            this.f10262f = 2;
        } finally {
            if (!this.f10261e) {
                this.f10257a.release();
                this.f10261e = true;
            }
        }
    }

    @Override // j2.l
    public int b(MediaCodec.BufferInfo bufferInfo) {
        return this.f10258b.d(bufferInfo);
    }

    @Override // j2.l
    public boolean c() {
        return false;
    }

    @Override // j2.l
    public void d(int i10, boolean z10) {
        this.f10257a.releaseOutputBuffer(i10, z10);
    }

    @Override // j2.l
    public void e(int i10, int i11, v1.c cVar, long j10, int i12) {
        this.f10259c.n(i10, i11, cVar, j10, i12);
    }

    @Override // j2.l
    public void f(int i10) {
        y();
        this.f10257a.setVideoScalingMode(i10);
    }

    @Override // j2.l
    public void flush() {
        this.f10259c.i();
        this.f10257a.flush();
        this.f10258b.e();
        this.f10257a.start();
    }

    @Override // j2.l
    public MediaFormat g() {
        return this.f10258b.g();
    }

    @Override // j2.l
    public ByteBuffer h(int i10) {
        return this.f10257a.getInputBuffer(i10);
    }

    @Override // j2.l
    public void i(Surface surface) {
        y();
        this.f10257a.setOutputSurface(surface);
    }

    @Override // j2.l
    public void j(final l.c cVar, Handler handler) {
        y();
        this.f10257a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: j2.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.this.x(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // j2.l
    public void k(int i10, int i11, int i12, long j10, int i13) {
        this.f10259c.m(i10, i11, i12, j10, i13);
    }

    @Override // j2.l
    public void l(Bundle bundle) {
        y();
        this.f10257a.setParameters(bundle);
    }

    @Override // j2.l
    public ByteBuffer m(int i10) {
        return this.f10257a.getOutputBuffer(i10);
    }

    @Override // j2.l
    public void n(int i10, long j10) {
        this.f10257a.releaseOutputBuffer(i10, j10);
    }

    @Override // j2.l
    public int o() {
        return this.f10258b.c();
    }
}
