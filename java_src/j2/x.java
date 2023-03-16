package j2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import j2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import p3.j0;
import p3.m0;
/* loaded from: classes.dex */
public final class x implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f10376a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f10377b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f10378c;

    /* loaded from: classes.dex */
    public static class b implements l.b {
        @Override // j2.l.b
        public l a(l.a aVar) {
            MediaCodec b10;
            MediaCodec mediaCodec = null;
            try {
                b10 = b(aVar);
            } catch (IOException e10) {
                e = e10;
            } catch (RuntimeException e11) {
                e = e11;
            }
            try {
                j0.a("configureCodec");
                b10.configure(aVar.f10311b, aVar.f10313d, aVar.f10314e, aVar.f10315f);
                j0.c();
                j0.a("startCodec");
                b10.start();
                j0.c();
                return new x(b10);
            } catch (IOException | RuntimeException e12) {
                e = e12;
                mediaCodec = b10;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        protected MediaCodec b(l.a aVar) {
            p3.a.e(aVar.f10310a);
            String str = aVar.f10310a.f10318a;
            j0.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            j0.c();
            return createByCodecName;
        }
    }

    private x(MediaCodec mediaCodec) {
        this.f10376a = mediaCodec;
        if (m0.f12306a < 21) {
            this.f10377b = mediaCodec.getInputBuffers();
            this.f10378c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // j2.l
    public void a() {
        this.f10377b = null;
        this.f10378c = null;
        this.f10376a.release();
    }

    @Override // j2.l
    public int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f10376a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && m0.f12306a < 21) {
                this.f10378c = this.f10376a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // j2.l
    public boolean c() {
        return false;
    }

    @Override // j2.l
    public void d(int i10, boolean z10) {
        this.f10376a.releaseOutputBuffer(i10, z10);
    }

    @Override // j2.l
    public void e(int i10, int i11, v1.c cVar, long j10, int i12) {
        this.f10376a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // j2.l
    public void f(int i10) {
        this.f10376a.setVideoScalingMode(i10);
    }

    @Override // j2.l
    public void flush() {
        this.f10376a.flush();
    }

    @Override // j2.l
    public MediaFormat g() {
        return this.f10376a.getOutputFormat();
    }

    @Override // j2.l
    public ByteBuffer h(int i10) {
        return m0.f12306a >= 21 ? this.f10376a.getInputBuffer(i10) : ((ByteBuffer[]) m0.j(this.f10377b))[i10];
    }

    @Override // j2.l
    public void i(Surface surface) {
        this.f10376a.setOutputSurface(surface);
    }

    @Override // j2.l
    public void j(final l.c cVar, Handler handler) {
        this.f10376a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: j2.w
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                x.this.q(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // j2.l
    public void k(int i10, int i11, int i12, long j10, int i13) {
        this.f10376a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // j2.l
    public void l(Bundle bundle) {
        this.f10376a.setParameters(bundle);
    }

    @Override // j2.l
    public ByteBuffer m(int i10) {
        return m0.f12306a >= 21 ? this.f10376a.getOutputBuffer(i10) : ((ByteBuffer[]) m0.j(this.f10378c))[i10];
    }

    @Override // j2.l
    public void n(int i10, long j10) {
        this.f10376a.releaseOutputBuffer(i10, j10);
    }

    @Override // j2.l
    public int o() {
        return this.f10376a.dequeueInputBuffer(0L);
    }
}
