package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class V2 extends Z2 implements j$.util.function.m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public V2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V2(int i10) {
        super(i10);
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: B */
    public j$.util.B spliterator() {
        return new U2(this, 0, this.f10011c, 0, this.f10010b);
    }

    public void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            l((j$.util.function.m) consumer);
        } else if (O3.f9877a) {
            O3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.function.m
    public void d(int i10) {
        A();
        int i11 = this.f10010b;
        this.f10010b = i11 + 1;
        ((int[]) this.f9950e)[i11] = i10;
    }

    @Override // j$.util.stream.Z2
    public Object g(int i10) {
        return new int[i10];
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return j$.util.W.g(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public void t(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        j$.util.function.m mVar = (j$.util.function.m) obj2;
        while (i10 < i11) {
            mVar.d(iArr[i10]);
            i10++;
        }
    }

    public String toString() {
        int[] iArr = (int[]) k();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f10011c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f10011c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public int u(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.Z2
    protected Object[] z(int i10) {
        return new int[i10];
    }
}
