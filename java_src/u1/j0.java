package u1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p3.m0;
import u1.g;
/* loaded from: classes.dex */
public final class j0 implements g {

    /* renamed from: b  reason: collision with root package name */
    private int f14987b;

    /* renamed from: c  reason: collision with root package name */
    private float f14988c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f14989d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private g.a f14990e;

    /* renamed from: f  reason: collision with root package name */
    private g.a f14991f;

    /* renamed from: g  reason: collision with root package name */
    private g.a f14992g;

    /* renamed from: h  reason: collision with root package name */
    private g.a f14993h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14994i;

    /* renamed from: j  reason: collision with root package name */
    private i0 f14995j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f14996k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f14997l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f14998m;

    /* renamed from: n  reason: collision with root package name */
    private long f14999n;

    /* renamed from: o  reason: collision with root package name */
    private long f15000o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15001p;

    public j0() {
        g.a aVar = g.a.f14942e;
        this.f14990e = aVar;
        this.f14991f = aVar;
        this.f14992g = aVar;
        this.f14993h = aVar;
        ByteBuffer byteBuffer = g.f14941a;
        this.f14996k = byteBuffer;
        this.f14997l = byteBuffer.asShortBuffer();
        this.f14998m = byteBuffer;
        this.f14987b = -1;
    }

    @Override // u1.g
    public boolean a() {
        return this.f14991f.f14943a != -1 && (Math.abs(this.f14988c - 1.0f) >= 1.0E-4f || Math.abs(this.f14989d - 1.0f) >= 1.0E-4f || this.f14991f.f14943a != this.f14990e.f14943a);
    }

    @Override // u1.g
    public boolean b() {
        i0 i0Var;
        return this.f15001p && ((i0Var = this.f14995j) == null || i0Var.k() == 0);
    }

    @Override // u1.g
    public void c() {
        this.f14988c = 1.0f;
        this.f14989d = 1.0f;
        g.a aVar = g.a.f14942e;
        this.f14990e = aVar;
        this.f14991f = aVar;
        this.f14992g = aVar;
        this.f14993h = aVar;
        ByteBuffer byteBuffer = g.f14941a;
        this.f14996k = byteBuffer;
        this.f14997l = byteBuffer.asShortBuffer();
        this.f14998m = byteBuffer;
        this.f14987b = -1;
        this.f14994i = false;
        this.f14995j = null;
        this.f14999n = 0L;
        this.f15000o = 0L;
        this.f15001p = false;
    }

    @Override // u1.g
    public ByteBuffer d() {
        int k10;
        i0 i0Var = this.f14995j;
        if (i0Var != null && (k10 = i0Var.k()) > 0) {
            if (this.f14996k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f14996k = order;
                this.f14997l = order.asShortBuffer();
            } else {
                this.f14996k.clear();
                this.f14997l.clear();
            }
            i0Var.j(this.f14997l);
            this.f15000o += k10;
            this.f14996k.limit(k10);
            this.f14998m = this.f14996k;
        }
        ByteBuffer byteBuffer = this.f14998m;
        this.f14998m = g.f14941a;
        return byteBuffer;
    }

    @Override // u1.g
    public void e() {
        i0 i0Var = this.f14995j;
        if (i0Var != null) {
            i0Var.s();
        }
        this.f15001p = true;
    }

    @Override // u1.g
    public void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f14999n += remaining;
            ((i0) p3.a.e(this.f14995j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // u1.g
    public void flush() {
        if (a()) {
            g.a aVar = this.f14990e;
            this.f14992g = aVar;
            g.a aVar2 = this.f14991f;
            this.f14993h = aVar2;
            if (this.f14994i) {
                this.f14995j = new i0(aVar.f14943a, aVar.f14944b, this.f14988c, this.f14989d, aVar2.f14943a);
            } else {
                i0 i0Var = this.f14995j;
                if (i0Var != null) {
                    i0Var.i();
                }
            }
        }
        this.f14998m = g.f14941a;
        this.f14999n = 0L;
        this.f15000o = 0L;
        this.f15001p = false;
    }

    @Override // u1.g
    public g.a g(g.a aVar) {
        if (aVar.f14945c == 2) {
            int i10 = this.f14987b;
            if (i10 == -1) {
                i10 = aVar.f14943a;
            }
            this.f14990e = aVar;
            g.a aVar2 = new g.a(i10, aVar.f14944b, 2);
            this.f14991f = aVar2;
            this.f14994i = true;
            return aVar2;
        }
        throw new g.b(aVar);
    }

    public long h(long j10) {
        if (this.f15000o >= 1024) {
            long l10 = this.f14999n - ((i0) p3.a.e(this.f14995j)).l();
            int i10 = this.f14993h.f14943a;
            int i11 = this.f14992g.f14943a;
            return i10 == i11 ? m0.M0(j10, l10, this.f15000o) : m0.M0(j10, l10 * i10, this.f15000o * i11);
        }
        return (long) (this.f14988c * j10);
    }

    public void i(float f10) {
        if (this.f14989d != f10) {
            this.f14989d = f10;
            this.f14994i = true;
        }
    }

    public void j(float f10) {
        if (this.f14988c != f10) {
            this.f14988c = f10;
            this.f14994i = true;
        }
    }
}
