package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0331l1 extends C0326k1 implements F0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0331l1(long j10) {
        super(j10);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.F0, j$.util.stream.H0
    public L0 b() {
        if (this.f10080b >= this.f10079a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f10080b), Integer.valueOf(this.f10079a.length)));
    }

    @Override // j$.util.stream.H0
    public /* bridge */ /* synthetic */ P0 b() {
        b();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void c(double d10) {
        D0.A();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        int i11 = this.f10080b;
        int[] iArr = this.f10079a;
        if (i11 >= iArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f10079a.length)));
        }
        this.f10080b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void h() {
        if (this.f10080b < this.f10079a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f10080b), Integer.valueOf(this.f10079a.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 != this.f10079a.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f10079a.length)));
        }
        this.f10080b = 0;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // j$.util.stream.C0326k1
    public String toString() {
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f10079a.length - this.f10080b), Arrays.toString(this.f10079a));
    }

    @Override // j$.util.function.Consumer
    /* renamed from: u */
    public /* synthetic */ void accept(Integer num) {
        D0.C(this, num);
    }
}
