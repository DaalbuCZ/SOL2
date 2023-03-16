package u1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import u1.g;
/* loaded from: classes.dex */
public abstract class x implements g {

    /* renamed from: b  reason: collision with root package name */
    protected g.a f15078b;

    /* renamed from: c  reason: collision with root package name */
    protected g.a f15079c;

    /* renamed from: d  reason: collision with root package name */
    private g.a f15080d;

    /* renamed from: e  reason: collision with root package name */
    private g.a f15081e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f15082f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f15083g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15084h;

    public x() {
        ByteBuffer byteBuffer = g.f14941a;
        this.f15082f = byteBuffer;
        this.f15083g = byteBuffer;
        g.a aVar = g.a.f14942e;
        this.f15080d = aVar;
        this.f15081e = aVar;
        this.f15078b = aVar;
        this.f15079c = aVar;
    }

    @Override // u1.g
    public boolean a() {
        return this.f15081e != g.a.f14942e;
    }

    @Override // u1.g
    public boolean b() {
        return this.f15084h && this.f15083g == g.f14941a;
    }

    @Override // u1.g
    public final void c() {
        flush();
        this.f15082f = g.f14941a;
        g.a aVar = g.a.f14942e;
        this.f15080d = aVar;
        this.f15081e = aVar;
        this.f15078b = aVar;
        this.f15079c = aVar;
        l();
    }

    @Override // u1.g
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f15083g;
        this.f15083g = g.f14941a;
        return byteBuffer;
    }

    @Override // u1.g
    public final void e() {
        this.f15084h = true;
        k();
    }

    @Override // u1.g
    public final void flush() {
        this.f15083g = g.f14941a;
        this.f15084h = false;
        this.f15078b = this.f15080d;
        this.f15079c = this.f15081e;
        j();
    }

    @Override // u1.g
    public final g.a g(g.a aVar) {
        this.f15080d = aVar;
        this.f15081e = i(aVar);
        return a() ? this.f15081e : g.a.f14942e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h() {
        return this.f15083g.hasRemaining();
    }

    protected abstract g.a i(g.a aVar);

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer m(int i10) {
        if (this.f15082f.capacity() < i10) {
            this.f15082f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f15082f.clear();
        }
        ByteBuffer byteBuffer = this.f15082f;
        this.f15083g = byteBuffer;
        return byteBuffer;
    }
}
