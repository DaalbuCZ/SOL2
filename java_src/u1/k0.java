package u1;

import java.nio.ByteBuffer;
import p3.m0;
import u1.g;
/* loaded from: classes.dex */
final class k0 extends x {

    /* renamed from: i  reason: collision with root package name */
    private int f15004i;

    /* renamed from: j  reason: collision with root package name */
    private int f15005j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15006k;

    /* renamed from: l  reason: collision with root package name */
    private int f15007l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f15008m = m0.f12311f;

    /* renamed from: n  reason: collision with root package name */
    private int f15009n;

    /* renamed from: o  reason: collision with root package name */
    private long f15010o;

    @Override // u1.x, u1.g
    public boolean b() {
        return super.b() && this.f15009n == 0;
    }

    @Override // u1.x, u1.g
    public ByteBuffer d() {
        int i10;
        if (super.b() && (i10 = this.f15009n) > 0) {
            m(i10).put(this.f15008m, 0, this.f15009n).flip();
            this.f15009n = 0;
        }
        return super.d();
    }

    @Override // u1.g
    public void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f15007l);
        this.f15010o += min / this.f15078b.f14946d;
        this.f15007l -= min;
        byteBuffer.position(position + min);
        if (this.f15007l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f15009n + i11) - this.f15008m.length;
        ByteBuffer m10 = m(length);
        int q10 = m0.q(length, 0, this.f15009n);
        m10.put(this.f15008m, 0, q10);
        int q11 = m0.q(length - q10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + q11);
        m10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - q11;
        int i13 = this.f15009n - q10;
        this.f15009n = i13;
        byte[] bArr = this.f15008m;
        System.arraycopy(bArr, q10, bArr, 0, i13);
        byteBuffer.get(this.f15008m, this.f15009n, i12);
        this.f15009n += i12;
        m10.flip();
    }

    @Override // u1.x
    public g.a i(g.a aVar) {
        if (aVar.f14945c == 2) {
            this.f15006k = true;
            return (this.f15004i == 0 && this.f15005j == 0) ? g.a.f14942e : aVar;
        }
        throw new g.b(aVar);
    }

    @Override // u1.x
    protected void j() {
        if (this.f15006k) {
            this.f15006k = false;
            int i10 = this.f15005j;
            int i11 = this.f15078b.f14946d;
            this.f15008m = new byte[i10 * i11];
            this.f15007l = this.f15004i * i11;
        }
        this.f15009n = 0;
    }

    @Override // u1.x
    protected void k() {
        int i10;
        if (this.f15006k) {
            if (this.f15009n > 0) {
                this.f15010o += i10 / this.f15078b.f14946d;
            }
            this.f15009n = 0;
        }
    }

    @Override // u1.x
    protected void l() {
        this.f15008m = m0.f12311f;
    }

    public long n() {
        return this.f15010o;
    }

    public void o() {
        this.f15010o = 0L;
    }

    public void p(int i10, int i11) {
        this.f15004i = i10;
        this.f15005j = i11;
    }
}
