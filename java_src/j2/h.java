package j2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class h extends v1.g {

    /* renamed from: v  reason: collision with root package name */
    private long f10297v;

    /* renamed from: w  reason: collision with root package name */
    private int f10298w;

    /* renamed from: x  reason: collision with root package name */
    private int f10299x;

    public h() {
        super(2);
        this.f10299x = 32;
    }

    private boolean E(v1.g gVar) {
        ByteBuffer byteBuffer;
        if (I()) {
            if (this.f10298w < this.f10299x && gVar.s() == s()) {
                ByteBuffer byteBuffer2 = gVar.f15536p;
                return byteBuffer2 == null || (byteBuffer = this.f15536p) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }

    public boolean D(v1.g gVar) {
        p3.a.a(!gVar.A());
        p3.a.a(!gVar.r());
        p3.a.a(!gVar.t());
        if (E(gVar)) {
            int i10 = this.f10298w;
            this.f10298w = i10 + 1;
            if (i10 == 0) {
                this.f15538r = gVar.f15538r;
                if (gVar.v()) {
                    w(1);
                }
            }
            if (gVar.s()) {
                w(Integer.MIN_VALUE);
            }
            ByteBuffer byteBuffer = gVar.f15536p;
            if (byteBuffer != null) {
                y(byteBuffer.remaining());
                this.f15536p.put(byteBuffer);
            }
            this.f10297v = gVar.f15538r;
            return true;
        }
        return false;
    }

    public long F() {
        return this.f15538r;
    }

    public long G() {
        return this.f10297v;
    }

    public int H() {
        return this.f10298w;
    }

    public boolean I() {
        return this.f10298w > 0;
    }

    public void J(int i10) {
        p3.a.a(i10 > 0);
        this.f10299x = i10;
    }

    @Override // v1.g, v1.a
    public void m() {
        super.m();
        this.f10298w = 0;
    }
}
