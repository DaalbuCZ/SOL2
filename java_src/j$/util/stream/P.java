package j$.util.stream;

import j$.util.C0269n;
/* loaded from: classes2.dex */
final class P extends S implements InterfaceC0352p2 {
    @Override // j$.util.stream.S, j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        accept(Long.valueOf(j10));
    }

    @Override // j$.util.function.A
    public Object get() {
        if (this.f9900a) {
            return C0269n.d(((Long) this.f9901b).longValue());
        }
        return null;
    }
}
