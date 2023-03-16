package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0286c1 extends C0281b1 implements E0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0286c1(long j10) {
        super(j10);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.E0, j$.util.stream.H0
    public J0 b() {
        if (this.f9984b >= this.f9983a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f9984b), Integer.valueOf(this.f9983a.length)));
    }

    @Override // j$.util.stream.H0
    public /* bridge */ /* synthetic */ P0 b() {
        b();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        int i10 = this.f9984b;
        double[] dArr = this.f9983a;
        if (i10 >= dArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f9983a.length)));
        }
        this.f9984b = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void d(int i10) {
        D0.E();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void h() {
        if (this.f9984b < this.f9983a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f9984b), Integer.valueOf(this.f9983a.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 != this.f9983a.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f9983a.length)));
        }
        this.f9984b = 0;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // j$.util.stream.C0281b1
    public String toString() {
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f9983a.length - this.f9984b), Arrays.toString(this.f9983a));
    }

    @Override // j$.util.function.Consumer
    /* renamed from: u */
    public /* synthetic */ void accept(Double d10) {
        D0.B(this, d10);
    }
}
