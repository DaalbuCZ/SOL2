package j$.util.stream;

import j$.util.function.Predicate;
import java.util.Objects;
/* loaded from: classes2.dex */
final class M implements L3 {

    /* renamed from: a  reason: collision with root package name */
    private final int f9855a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f9856b;

    /* renamed from: c  reason: collision with root package name */
    final Object f9857c;

    /* renamed from: d  reason: collision with root package name */
    final Predicate f9858d;

    /* renamed from: e  reason: collision with root package name */
    final j$.util.function.A f9859e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(boolean z10, int i10, Object obj, Predicate predicate, j$.util.function.A a10) {
        this.f9856b = z10;
        this.f9855a = i10;
        this.f9857c = obj;
        this.f9858d = predicate;
        this.f9859e = a10;
    }

    @Override // j$.util.stream.L3
    public int a() {
        return EnumC0298e3.f10031u | (this.f9856b ? 0 : EnumC0298e3.f10028r);
    }

    @Override // j$.util.stream.L3
    public Object f(D0 d02, j$.util.H h10) {
        return new T(this, d02, h10).invoke();
    }

    @Override // j$.util.stream.L3
    public Object g(D0 d02, j$.util.H h10) {
        M3 m32 = (M3) this.f9859e.get();
        AbstractC0284c abstractC0284c = (AbstractC0284c) d02;
        Objects.requireNonNull(m32);
        abstractC0284c.e0(abstractC0284c.J0(m32), h10);
        Object obj = m32.get();
        return obj != null ? obj : this.f9857c;
    }
}
