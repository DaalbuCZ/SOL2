package v1;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s1.j1;
/* loaded from: classes.dex */
public class g extends v1.a {

    /* renamed from: o  reason: collision with root package name */
    public final c f15535o;

    /* renamed from: p  reason: collision with root package name */
    public ByteBuffer f15536p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15537q;

    /* renamed from: r  reason: collision with root package name */
    public long f15538r;

    /* renamed from: s  reason: collision with root package name */
    public ByteBuffer f15539s;

    /* renamed from: t  reason: collision with root package name */
    private final int f15540t;

    /* renamed from: u  reason: collision with root package name */
    private final int f15541u;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: n  reason: collision with root package name */
        public final int f15542n;

        /* renamed from: o  reason: collision with root package name */
        public final int f15543o;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f15542n = i10;
            this.f15543o = i11;
        }
    }

    static {
        j1.a("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    public g(int i10, int i11) {
        this.f15535o = new c();
        this.f15540t = i10;
        this.f15541u = i11;
    }

    public static g B() {
        return new g(0);
    }

    private ByteBuffer x(int i10) {
        int i11 = this.f15540t;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f15536p;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public final boolean A() {
        return q(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void C(int i10) {
        ByteBuffer byteBuffer = this.f15539s;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f15539s = ByteBuffer.allocate(i10);
        } else {
            this.f15539s.clear();
        }
    }

    @Override // v1.a
    public void m() {
        super.m();
        ByteBuffer byteBuffer = this.f15536p;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f15539s;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f15537q = false;
    }

    @EnsuresNonNull({"data"})
    public void y(int i10) {
        int i11 = i10 + this.f15541u;
        ByteBuffer byteBuffer = this.f15536p;
        if (byteBuffer == null) {
            this.f15536p = x(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f15536p = byteBuffer;
            return;
        }
        ByteBuffer x10 = x(i12);
        x10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            x10.put(byteBuffer);
        }
        this.f15536p = x10;
    }

    public final void z() {
        ByteBuffer byteBuffer = this.f15536p;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f15539s;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
