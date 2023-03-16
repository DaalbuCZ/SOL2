package j$.util.stream;

import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
/* renamed from: j$.util.stream.a3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0278a3 extends AbstractC0294e implements Consumer, Iterable {

    /* renamed from: e  reason: collision with root package name */
    protected Object[] f9977e = new Object[16];

    /* renamed from: f  reason: collision with root package name */
    protected Object[][] f9978f;

    private void v() {
        if (this.f9978f == null) {
            Object[][] objArr = new Object[8];
            this.f9978f = objArr;
            this.f10012d = new long[8];
            objArr[0] = this.f9977e;
        }
    }

    public void a(Consumer consumer) {
        for (int i10 = 0; i10 < this.f10011c; i10++) {
            for (Object obj : this.f9978f[i10]) {
                consumer.accept(obj);
            }
        }
        for (int i11 = 0; i11 < this.f10010b; i11++) {
            consumer.accept(this.f9977e[i11]);
        }
    }

    public void accept(Object obj) {
        if (this.f10010b == this.f9977e.length) {
            v();
            int i10 = this.f10011c;
            int i11 = i10 + 1;
            Object[][] objArr = this.f9978f;
            if (i11 >= objArr.length || objArr[i10 + 1] == null) {
                u(t() + 1);
            }
            this.f10010b = 0;
            int i12 = this.f10011c + 1;
            this.f10011c = i12;
            this.f9977e = this.f9978f[i12];
        }
        Object[] objArr2 = this.f9977e;
        int i13 = this.f10010b;
        this.f10010b = i13 + 1;
        objArr2[i13] = obj;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.AbstractC0294e
    public void clear() {
        Object[][] objArr = this.f9978f;
        if (objArr != null) {
            this.f9977e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f9977e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f9978f = null;
            this.f10012d = null;
        } else {
            for (int i11 = 0; i11 < this.f10010b; i11++) {
                this.f9977e[i11] = null;
            }
        }
        this.f10010b = 0;
        this.f10011c = 0;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return j$.util.W.i(spliterator());
    }

    public void m(Object[] objArr, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > objArr.length || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f10011c == 0) {
            System.arraycopy(this.f9977e, 0, objArr, i10, this.f10010b);
            return;
        }
        for (int i11 = 0; i11 < this.f10011c; i11++) {
            Object[][] objArr2 = this.f9978f;
            System.arraycopy(objArr2[i11], 0, objArr, i10, objArr2[i11].length);
            i10 += this.f9978f[i11].length;
        }
        int i12 = this.f10010b;
        if (i12 > 0) {
            System.arraycopy(this.f9977e, 0, objArr, i10, i12);
        }
    }

    public j$.util.H spliterator() {
        return new R2(this, 0, this.f10011c, 0, this.f10010b);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.G.a(spliterator());
    }

    protected long t() {
        int i10 = this.f10011c;
        if (i10 == 0) {
            return this.f9977e.length;
        }
        return this.f9978f[i10].length + this.f10012d[i10];
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        a(new C0279b(arrayList, 8));
        StringBuilder b10 = j$.time.a.b("SpinedBuffer:");
        b10.append(arrayList.toString());
        return b10.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(long j10) {
        Object[][] objArr;
        int i10;
        long t10 = t();
        if (j10 <= t10) {
            return;
        }
        v();
        int i11 = this.f10011c;
        while (true) {
            i11++;
            if (j10 <= t10) {
                return;
            }
            Object[][] objArr2 = this.f9978f;
            if (i11 >= objArr2.length) {
                int length = objArr2.length * 2;
                this.f9978f = (Object[][]) Arrays.copyOf(objArr2, length);
                this.f10012d = Arrays.copyOf(this.f10012d, length);
            }
            int s10 = s(i11);
            this.f9978f[i11] = new Object[s10];
            long[] jArr = this.f10012d;
            jArr[i11] = jArr[i11 - 1] + objArr[i10].length;
            t10 += s10;
        }
    }
}
