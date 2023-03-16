package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0302f2 extends AbstractC0317i2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0302f2(j$.util.H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final boolean U0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public final InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0317i2, j$.util.stream.Stream
    public void a(Consumer consumer) {
        if (isParallel()) {
            super.a(consumer);
        } else {
            X0().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0317i2, j$.util.stream.Stream
    public void d(Consumer consumer) {
        if (!isParallel()) {
            X0().forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        L0(new X(consumer, true));
    }
}
