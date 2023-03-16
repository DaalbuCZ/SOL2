package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0370u1 extends C0366t1 implements G0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0370u1(long j10) {
        super(j10);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public N0 b() {
        if (this.f10144b >= this.f10143a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f10144b), Integer.valueOf(this.f10143a.length)));
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
    public /* synthetic */ void d(int i10) {
        D0.E();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        int i10 = this.f10144b;
        long[] jArr = this.f10143a;
        if (i10 >= jArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f10143a.length)));
        }
        this.f10144b = i10 + 1;
        jArr[i10] = j10;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void h() {
        if (this.f10144b < this.f10143a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f10144b), Integer.valueOf(this.f10143a.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 != this.f10143a.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f10143a.length)));
        }
        this.f10144b = 0;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // j$.util.stream.C0366t1
    public String toString() {
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f10143a.length - this.f10144b), Arrays.toString(this.f10143a));
    }

    @Override // j$.util.function.Consumer
    /* renamed from: u */
    public /* synthetic */ void accept(Long l10) {
        D0.D(this, l10);
    }
}
