package j$.util.stream;

import java.util.Comparator;
/* loaded from: classes2.dex */
abstract class E2 extends AbstractC0337m2 {

    /* renamed from: b  reason: collision with root package name */
    protected final Comparator f9803b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f9804c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(InterfaceC0356q2 interfaceC0356q2, Comparator comparator) {
        super(interfaceC0356q2);
        this.f9803b = comparator;
    }

    @Override // j$.util.stream.AbstractC0337m2, j$.util.stream.InterfaceC0356q2
    public final boolean r() {
        this.f9804c = true;
        return false;
    }
}
