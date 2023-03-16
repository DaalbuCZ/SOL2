package u1;

import java.nio.ByteBuffer;
import p3.m0;
import u1.g;
/* loaded from: classes.dex */
public final class h0 extends x {

    /* renamed from: i  reason: collision with root package name */
    private final long f14947i;

    /* renamed from: j  reason: collision with root package name */
    private final long f14948j;

    /* renamed from: k  reason: collision with root package name */
    private final short f14949k;

    /* renamed from: l  reason: collision with root package name */
    private int f14950l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14951m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f14952n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f14953o;

    /* renamed from: p  reason: collision with root package name */
    private int f14954p;

    /* renamed from: q  reason: collision with root package name */
    private int f14955q;

    /* renamed from: r  reason: collision with root package name */
    private int f14956r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f14957s;

    /* renamed from: t  reason: collision with root package name */
    private long f14958t;

    public h0() {
        this(150000L, 20000L, (short) 1024);
    }

    public h0(long j10, long j11, short s10) {
        p3.a.a(j11 <= j10);
        this.f14947i = j10;
        this.f14948j = j11;
        this.f14949k = s10;
        byte[] bArr = m0.f12311f;
        this.f14952n = bArr;
        this.f14953o = bArr;
    }

    private int n(long j10) {
        return (int) ((j10 * this.f15078b.f14943a) / 1000000);
    }

    private int o(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs((int) byteBuffer.getShort(limit)) > this.f14949k) {
                int i10 = this.f14950l;
                return ((limit / i10) * i10) + i10;
            }
        }
    }

    private int p(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f14949k) {
                int i10 = this.f14950l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void r(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f14957s = true;
        }
    }

    private void s(byte[] bArr, int i10) {
        m(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f14957s = true;
        }
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p10 = p(byteBuffer);
        int position = p10 - byteBuffer.position();
        byte[] bArr = this.f14952n;
        int length = bArr.length;
        int i10 = this.f14955q;
        int i11 = length - i10;
        if (p10 < limit && position < i11) {
            s(bArr, i10);
            this.f14955q = 0;
            this.f14954p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f14952n, this.f14955q, min);
        int i12 = this.f14955q + min;
        this.f14955q = i12;
        byte[] bArr2 = this.f14952n;
        if (i12 == bArr2.length) {
            if (this.f14957s) {
                s(bArr2, this.f14956r);
                this.f14958t += (this.f14955q - (this.f14956r * 2)) / this.f14950l;
            } else {
                this.f14958t += (i12 - this.f14956r) / this.f14950l;
            }
            x(byteBuffer, this.f14952n, this.f14955q);
            this.f14955q = 0;
            this.f14954p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f14952n.length));
        int o10 = o(byteBuffer);
        if (o10 == byteBuffer.position()) {
            this.f14954p = 1;
        } else {
            byteBuffer.limit(o10);
            r(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void v(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p10 = p(byteBuffer);
        byteBuffer.limit(p10);
        this.f14958t += byteBuffer.remaining() / this.f14950l;
        x(byteBuffer, this.f14953o, this.f14956r);
        if (p10 < limit) {
            s(this.f14953o, this.f14956r);
            this.f14954p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void x(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f14956r);
        int i11 = this.f14956r - min;
        System.arraycopy(bArr, i10 - i11, this.f14953o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f14953o, i11, min);
    }

    @Override // u1.x, u1.g
    public boolean a() {
        return this.f14951m;
    }

    @Override // u1.g
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !h()) {
            int i10 = this.f14954p;
            if (i10 == 0) {
                u(byteBuffer);
            } else if (i10 == 1) {
                t(byteBuffer);
            } else if (i10 != 2) {
                throw new IllegalStateException();
            } else {
                v(byteBuffer);
            }
        }
    }

    @Override // u1.x
    public g.a i(g.a aVar) {
        if (aVar.f14945c == 2) {
            return this.f14951m ? aVar : g.a.f14942e;
        }
        throw new g.b(aVar);
    }

    @Override // u1.x
    protected void j() {
        if (this.f14951m) {
            this.f14950l = this.f15078b.f14946d;
            int n10 = n(this.f14947i) * this.f14950l;
            if (this.f14952n.length != n10) {
                this.f14952n = new byte[n10];
            }
            int n11 = n(this.f14948j) * this.f14950l;
            this.f14956r = n11;
            if (this.f14953o.length != n11) {
                this.f14953o = new byte[n11];
            }
        }
        this.f14954p = 0;
        this.f14958t = 0L;
        this.f14955q = 0;
        this.f14957s = false;
    }

    @Override // u1.x
    protected void k() {
        int i10 = this.f14955q;
        if (i10 > 0) {
            s(this.f14952n, i10);
        }
        if (this.f14957s) {
            return;
        }
        this.f14958t += this.f14956r / this.f14950l;
    }

    @Override // u1.x
    protected void l() {
        this.f14951m = false;
        this.f14956r = 0;
        byte[] bArr = m0.f12311f;
        this.f14952n = bArr;
        this.f14953o = bArr;
    }

    public long q() {
        return this.f14958t;
    }

    public void w(boolean z10) {
        this.f14951m = z10;
    }
}
