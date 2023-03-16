package j$.util.concurrent;

import j$.util.AbstractC0251a;
import j$.util.H;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f extends p implements H {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f9672i;

    /* renamed from: j  reason: collision with root package name */
    long f9673j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i10, int i11, int i12, long j10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, i11, i12);
        this.f9672i = concurrentHashMap;
        this.f9673j = j10;
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        l b10 = b();
        if (b10 == null) {
            return false;
        }
        consumer.accept(new k(b10.f9682b, b10.f9683c, this.f9672i));
        return true;
    }

    @Override // j$.util.H
    public int characteristics() {
        return 4353;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f9673j;
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (true) {
            l b10 = b();
            if (b10 == null) {
                return;
            }
            consumer.accept(new k(b10.f9682b, b10.f9683c, this.f9672i));
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

    @Override // j$.util.H
    public H trySplit() {
        int i10 = this.f9694f;
        int i11 = this.f9695g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        l[] lVarArr = this.f9689a;
        int i13 = this.f9696h;
        this.f9695g = i12;
        long j10 = this.f9673j >>> 1;
        this.f9673j = j10;
        return new f(lVarArr, i13, i12, i11, j10, this.f9672i);
    }
}
