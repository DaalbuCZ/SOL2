package w2;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f15979b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15980c;

    /* renamed from: d  reason: collision with root package name */
    private long f15981d;

    public b(long j10, long j11) {
        this.f15979b = j10;
        this.f15980c = j11;
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f15981d;
        if (j10 < this.f15979b || j10 > this.f15980c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d() {
        return this.f15981d;
    }

    public boolean e() {
        return this.f15981d > this.f15980c;
    }

    public void f() {
        this.f15981d = this.f15979b - 1;
    }

    @Override // w2.o
    public boolean next() {
        this.f15981d++;
        return !e();
    }
}
