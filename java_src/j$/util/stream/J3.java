package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class J3 extends AbstractC0303f3 {
    J3(D0 d02, j$.util.H h10, boolean z10) {
        super(d02, h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(D0 d02, j$.util.function.A a10, boolean z10) {
        super(d02, a10, z10);
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean b10 = b();
        if (b10) {
            C0278a3 c0278a3 = (C0278a3) this.f10052h;
            long j10 = this.f10051g;
            if (c0278a3.f10011c != 0) {
                if (j10 < c0278a3.count()) {
                    for (int i10 = 0; i10 <= c0278a3.f10011c; i10++) {
                        long[] jArr = c0278a3.f10012d;
                        long j11 = jArr[i10];
                        Object[][] objArr = c0278a3.f9978f;
                        if (j10 < j11 + objArr[i10].length) {
                            obj = objArr[i10][(int) (j10 - jArr[i10])];
                        }
                    }
                    throw new IndexOutOfBoundsException(Long.toString(j10));
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else if (j10 >= c0278a3.f10010b) {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else {
                obj = c0278a3.f9977e[(int) j10];
            }
            consumer.accept(obj);
        }
        return b10;
    }

    @Override // j$.util.stream.AbstractC0303f3
    void e() {
        C0278a3 c0278a3 = new C0278a3();
        this.f10052h = c0278a3;
        this.f10049e = this.f10046b.J0(new I3(c0278a3, 1));
        this.f10050f = new C0279b(this, 7);
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        if (this.f10052h != null || this.f10053i) {
            do {
            } while (a(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        d();
        this.f10046b.I0(new I3(consumer, 0), this.f10048d);
        this.f10053i = true;
    }

    @Override // j$.util.stream.AbstractC0303f3
    AbstractC0303f3 h(j$.util.H h10) {
        return new J3(this.f10046b, h10, this.f10045a);
    }
}
