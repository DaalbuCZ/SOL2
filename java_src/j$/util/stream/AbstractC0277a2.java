package j$.util.stream;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0277a2 implements L3 {

    /* renamed from: a  reason: collision with root package name */
    private final int f9976a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0277a2(int i10) {
        this.f9976a = i10;
    }

    @Override // j$.util.stream.L3
    public /* synthetic */ int a() {
        return 0;
    }

    public abstract Y1 b();

    @Override // j$.util.stream.L3
    public Object f(D0 d02, j$.util.H h10) {
        return ((Y1) new C0282b2(this, d02, h10).invoke()).get();
    }

    @Override // j$.util.stream.L3
    public Object g(D0 d02, j$.util.H h10) {
        Y1 b10 = b();
        AbstractC0284c abstractC0284c = (AbstractC0284c) d02;
        Objects.requireNonNull(b10);
        abstractC0284c.e0(abstractC0284c.J0(b10), h10);
        return b10.get();
    }
}
