package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class X extends Y {

    /* renamed from: b  reason: collision with root package name */
    final Consumer f9930b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X(Consumer consumer, boolean z10) {
        super(z10);
        this.f9930b = consumer;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f9930b.accept(obj);
    }
}
