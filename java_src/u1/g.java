package u1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p3.m0;
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f14941a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f14942e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f14943a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14944b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14945c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14946d;

        public a(int i10, int i11, int i12) {
            this.f14943a = i10;
            this.f14944b = i11;
            this.f14945c = i12;
            this.f14946d = m0.s0(i12) ? m0.d0(i12, i11) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f14943a + ", channelCount=" + this.f14944b + ", encoding=" + this.f14945c + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    boolean a();

    boolean b();

    void c();

    ByteBuffer d();

    void e();

    void f(ByteBuffer byteBuffer);

    void flush();

    a g(a aVar);
}
