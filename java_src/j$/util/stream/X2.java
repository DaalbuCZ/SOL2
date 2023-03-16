package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class X2 extends Z2 implements j$.util.function.r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public X2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(int i10) {
        super(i10);
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: B */
    public j$.util.D spliterator() {
        return new W2(this, 0, this.f10011c, 0, this.f10010b);
    }

    public void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.r) {
            l((j$.util.function.r) consumer);
        } else if (O3.f9877a) {
            O3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.function.r
    public void e(long j10) {
        A();
        int i10 = this.f10010b;
        this.f10010b = i10 + 1;
        ((long[]) this.f9950e)[i10] = j10;
    }

    @Override // j$.util.stream.Z2
    public Object g(int i10) {
        return new long[i10];
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return j$.util.W.h(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public void t(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        j$.util.function.r rVar = (j$.util.function.r) obj2;
        while (i10 < i11) {
            rVar.e(jArr[i10]);
            i10++;
        }
    }

    public String toString() {
        long[] jArr = (long[]) k();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f10011c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f10011c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public int u(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // j$.util.stream.Z2
    protected Object[] z(int i10) {
        return new long[i10];
    }
}
