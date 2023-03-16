package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class T2 extends Z2 implements j$.util.function.h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public T2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T2(int i10) {
        super(i10);
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: B */
    public j$.util.z spliterator() {
        return new S2(this, 0, this.f10011c, 0, this.f10010b);
    }

    public void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.h) {
            l((j$.util.function.h) consumer);
        } else if (O3.f9877a) {
            O3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.function.h
    public void c(double d10) {
        A();
        int i10 = this.f10010b;
        this.f10010b = i10 + 1;
        ((double[]) this.f9950e)[i10] = d10;
    }

    @Override // j$.util.stream.Z2
    public Object g(int i10) {
        return new double[i10];
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return j$.util.W.f(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public void t(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        j$.util.function.h hVar = (j$.util.function.h) obj2;
        while (i10 < i11) {
            hVar.c(dArr[i10]);
            i10++;
        }
    }

    public String toString() {
        double[] dArr = (double[]) k();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f10011c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f10011c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public int u(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.util.stream.Z2
    protected Object[] z(int i10) {
        return new double[i10];
    }
}
