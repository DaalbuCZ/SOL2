package j$.util.stream;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B0 implements L3 {

    /* renamed from: a  reason: collision with root package name */
    private final int f9778a;

    /* renamed from: b  reason: collision with root package name */
    final A0 f9779b;

    /* renamed from: c  reason: collision with root package name */
    final j$.util.function.A f9780c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B0(int i10, A0 a02, j$.util.function.A a10) {
        this.f9778a = i10;
        this.f9779b = a02;
        this.f9780c = a10;
    }

    @Override // j$.util.stream.L3
    public int a() {
        return EnumC0298e3.f10031u | EnumC0298e3.f10028r;
    }

    @Override // j$.util.stream.L3
    public Object f(D0 d02, j$.util.H h10) {
        return (Boolean) new C0(this, d02, h10).invoke();
    }

    @Override // j$.util.stream.L3
    public Object g(D0 d02, j$.util.H h10) {
        AbstractC0389z0 abstractC0389z0 = (AbstractC0389z0) this.f9780c.get();
        AbstractC0284c abstractC0284c = (AbstractC0284c) d02;
        Objects.requireNonNull(abstractC0389z0);
        abstractC0284c.e0(abstractC0284c.J0(abstractC0389z0), h10);
        return Boolean.valueOf(abstractC0389z0.f10190b);
    }
}
