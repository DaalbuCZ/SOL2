package j$.util.concurrent;

import j$.util.AbstractC0251a;
import j$.util.H;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends p implements H {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9676i;

    /* renamed from: j  reason: collision with root package name */
    long f9677j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i10, int i11, int i12, long j10, int i13) {
        super(lVarArr, i10, i11, i12);
        this.f9676i = i13;
        this.f9677j = j10;
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        switch (this.f9676i) {
            case 0:
                Objects.requireNonNull(consumer);
                l b10 = b();
                if (b10 == null) {
                    return false;
                }
                consumer.accept(b10.f9682b);
                return true;
            default:
                Objects.requireNonNull(consumer);
                l b11 = b();
                if (b11 == null) {
                    return false;
                }
                consumer.accept(b11.f9683c);
                return true;
        }
    }

    @Override // j$.util.H
    public int characteristics() {
        switch (this.f9676i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.H
    public long estimateSize() {
        switch (this.f9676i) {
            case 0:
                return this.f9677j;
            default:
                return this.f9677j;
        }
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        switch (this.f9676i) {
            case 0:
                Objects.requireNonNull(consumer);
                while (true) {
                    l b10 = b();
                    if (b10 == null) {
                        return;
                    }
                    consumer.accept(b10.f9682b);
                }
            default:
                Objects.requireNonNull(consumer);
                while (true) {
                    l b11 = b();
                    if (b11 == null) {
                        return;
                    }
                    consumer.accept(b11.f9683c);
                }
        }
    }

    @Override // j$.util.H
    public Comparator getComparator() {
        switch (this.f9676i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.H
    public /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f9676i) {
            case 0:
                return AbstractC0251a.h(this);
            default:
                return AbstractC0251a.h(this);
        }
    }

    @Override // j$.util.H
    public /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f9676i) {
            case 0:
                return AbstractC0251a.j(this, i10);
            default:
                return AbstractC0251a.j(this, i10);
        }
    }

    @Override // j$.util.H
    public H trySplit() {
        switch (this.f9676i) {
            case 0:
                int i10 = this.f9694f;
                int i11 = this.f9695g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                l[] lVarArr = this.f9689a;
                int i13 = this.f9696h;
                this.f9695g = i12;
                long j10 = this.f9677j >>> 1;
                this.f9677j = j10;
                return new j(lVarArr, i13, i12, i11, j10, 0);
            default:
                int i14 = this.f9694f;
                int i15 = this.f9695g;
                int i16 = (i14 + i15) >>> 1;
                if (i16 <= i14) {
                    return null;
                }
                l[] lVarArr2 = this.f9689a;
                int i17 = this.f9696h;
                this.f9695g = i16;
                long j11 = this.f9677j >>> 1;
                this.f9677j = j11;
                return new j(lVarArr2, i17, i16, i15, j11, 1);
        }
    }
}
