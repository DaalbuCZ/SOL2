package j2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import s1.m1;
/* loaded from: classes.dex */
public interface l {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f10310a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f10311b;

        /* renamed from: c  reason: collision with root package name */
        public final m1 f10312c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f10313d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f10314e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10315f;

        private a(n nVar, MediaFormat mediaFormat, m1 m1Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f10310a = nVar;
            this.f10311b = mediaFormat;
            this.f10312c = m1Var;
            this.f10313d = surface;
            this.f10314e = mediaCrypto;
            this.f10315f = i10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, m1 m1Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, m1Var, null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, m1 m1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, m1Var, surface, mediaCrypto, 0);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        l a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(l lVar, long j10, long j11);
    }

    void a();

    int b(MediaCodec.BufferInfo bufferInfo);

    boolean c();

    void d(int i10, boolean z10);

    void e(int i10, int i11, v1.c cVar, long j10, int i12);

    void f(int i10);

    void flush();

    MediaFormat g();

    ByteBuffer h(int i10);

    void i(Surface surface);

    void j(c cVar, Handler handler);

    void k(int i10, int i11, int i12, long j10, int i13);

    void l(Bundle bundle);

    ByteBuffer m(int i10);

    void n(int i10, long j10);

    int o();
}
