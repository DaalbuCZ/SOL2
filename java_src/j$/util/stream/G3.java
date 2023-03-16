package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class G3 extends H3 implements j$.util.H, Consumer {

    /* renamed from: e  reason: collision with root package name */
    Object f9817e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G3(j$.util.H h10, long j10, long j11) {
        super(h10, j10, j11);
    }

    G3(j$.util.H h10, G3 g32) {
        super(h10, g32);
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (p() != 1 && this.f9821a.a(this)) {
            if (n(1L) == 1) {
                consumer.accept(this.f9817e);
                this.f9817e = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f9817e = obj;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C0328k3 c0328k3 = null;
        while (true) {
            int p10 = p();
            if (p10 == 1) {
                return;
            }
            if (p10 == 2) {
                if (c0328k3 == null) {
                    c0328k3 = new C0328k3(128);
                } else {
                    c0328k3.f10094a = 0;
                }
                long j10 = 0;
                while (this.f9821a.a(c0328k3)) {
                    j10++;
                    if (j10 >= 128) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                }
                long n10 = n(j10);
                for (int i10 = 0; i10 < n10; i10++) {
                    consumer.accept(c0328k3.f10082b[i10]);
                }
            } else {
                this.f9821a.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.H
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.H
    public /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0251a.h(this);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0251a.j(this, i10);
    }

    @Override // j$.util.stream.H3
    protected j$.util.H o(j$.util.H h10) {
        return new G3(h10, this);
    }
}
