package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.k3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0328k3 extends AbstractC0333l3 implements Consumer {

    /* renamed from: b  reason: collision with root package name */
    final Object[] f10082b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0328k3(int i10) {
        this.f10082b = new Object[i10];
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        Object[] objArr = this.f10082b;
        int i10 = this.f10094a;
        this.f10094a = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }
}
