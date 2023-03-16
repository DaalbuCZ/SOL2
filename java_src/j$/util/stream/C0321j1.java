package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0321j1 extends S0 implements H0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0321j1(long j10, j$.util.function.n nVar) {
        super(j10, nVar);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        int i10 = this.f9903b;
        Object[] objArr = this.f9902a;
        if (i10 >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f9902a.length)));
        }
        this.f9903b = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.H0
    public P0 b() {
        if (this.f9903b >= this.f9902a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f9903b), Integer.valueOf(this.f9902a.length)));
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
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void h() {
        if (this.f9903b < this.f9902a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f9903b), Integer.valueOf(this.f9902a.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 != this.f9902a.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f9902a.length)));
        }
        this.f9903b = 0;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // j$.util.stream.S0
    public String toString() {
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(this.f9902a.length - this.f9903b), Arrays.toString(this.f9902a));
    }
}
