package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u3 extends z3 implements j$.util.z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u3(j$.util.z zVar, long j10, long j11) {
        super(zVar, j10, j11);
    }

    u3(j$.util.z zVar, long j10, long j11, long j12, long j13) {
        super(zVar, j10, j11, j12, j13, null);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.q(this, consumer);
    }

    @Override // j$.util.stream.B3
    protected j$.util.H b(j$.util.H h10, long j10, long j11, long j12, long j13) {
        return new u3((j$.util.z) h10, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.z3
    protected /* bridge */ /* synthetic */ Object c() {
        return t3.f10148a;
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.c(this, consumer);
    }
}
