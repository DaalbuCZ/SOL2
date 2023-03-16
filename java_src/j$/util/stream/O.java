package j$.util.stream;

import j$.util.C0268m;
/* loaded from: classes2.dex */
final class O extends S implements InterfaceC0347o2 {
    @Override // j$.util.stream.S, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        accept(Integer.valueOf(i10));
    }

    @Override // j$.util.function.A
    public Object get() {
        if (this.f9900a) {
            return C0268m.d(((Integer) this.f9901b).intValue());
        }
        return null;
    }
}
