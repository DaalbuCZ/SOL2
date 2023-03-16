package j$.util.stream;

import j$.util.C0267l;
/* loaded from: classes2.dex */
final class N extends S implements InterfaceC0342n2 {
    @Override // j$.util.stream.S, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        accept(Double.valueOf(d10));
    }

    @Override // j$.util.function.A
    public Object get() {
        if (this.f9900a) {
            return C0267l.d(((Double) this.f9901b).doubleValue());
        }
        return null;
    }
}
