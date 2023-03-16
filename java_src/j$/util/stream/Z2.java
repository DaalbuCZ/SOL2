package j$.util.stream;

import java.util.Arrays;
import java.util.Spliterator;
/* loaded from: classes2.dex */
abstract class Z2 extends AbstractC0294e implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    Object f9950e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f9951f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2() {
        this.f9950e = g(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2(int i10) {
        super(i10);
        this.f9950e = g(1 << this.f10009a);
    }

    private void y() {
        if (this.f9951f == null) {
            Object[] z10 = z(8);
            this.f9951f = z10;
            this.f10012d = new long[8];
            z10[0] = this.f9950e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A() {
        if (this.f10010b == u(this.f9950e)) {
            y();
            int i10 = this.f10011c;
            int i11 = i10 + 1;
            Object[] objArr = this.f9951f;
            if (i11 >= objArr.length || objArr[i10 + 1] == null) {
                x(v() + 1);
            }
            this.f10010b = 0;
            int i12 = this.f10011c + 1;
            this.f10011c = i12;
            this.f9950e = this.f9951f[i12];
        }
    }

    @Override // j$.util.stream.AbstractC0294e
    public void clear() {
        Object[] objArr = this.f9951f;
        if (objArr != null) {
            this.f9950e = objArr[0];
            this.f9951f = null;
            this.f10012d = null;
        }
        this.f10010b = 0;
        this.f10011c = 0;
    }

    public abstract Object g(int i10);

    public void i(Object obj, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > u(obj) || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f10011c == 0) {
            System.arraycopy(this.f9950e, 0, obj, i10, this.f10010b);
            return;
        }
        for (int i11 = 0; i11 < this.f10011c; i11++) {
            Object[] objArr = this.f9951f;
            System.arraycopy(objArr[i11], 0, obj, i10, u(objArr[i11]));
            i10 += u(this.f9951f[i11]);
        }
        int i12 = this.f10010b;
        if (i12 > 0) {
            System.arraycopy(this.f9950e, 0, obj, i10, i12);
        }
    }

    public Object k() {
        long count = count();
        if (count < 2147483639) {
            Object g10 = g((int) count);
            i(g10, 0);
            return g10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void l(Object obj) {
        for (int i10 = 0; i10 < this.f10011c; i10++) {
            Object[] objArr = this.f9951f;
            t(objArr[i10], 0, u(objArr[i10]), obj);
        }
        t(this.f9950e, 0, this.f10010b, obj);
    }

    public abstract j$.util.H spliterator();

    @Override // java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.G.a(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void t(Object obj, int i10, int i11, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int u(Object obj);

    protected long v() {
        int i10 = this.f10011c;
        if (i10 == 0) {
            return u(this.f9950e);
        }
        return u(this.f9951f[i10]) + this.f10012d[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(long j10) {
        if (this.f10011c == 0) {
            if (j10 < this.f10010b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else if (j10 < count()) {
            for (int i10 = 0; i10 <= this.f10011c; i10++) {
                if (j10 < this.f10012d[i10] + u(this.f9951f[i10])) {
                    return i10;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(long j10) {
        int i10;
        long v10 = v();
        if (j10 <= v10) {
            return;
        }
        y();
        int i11 = this.f10011c;
        while (true) {
            i11++;
            if (j10 <= v10) {
                return;
            }
            Object[] objArr = this.f9951f;
            if (i11 >= objArr.length) {
                int length = objArr.length * 2;
                this.f9951f = Arrays.copyOf(objArr, length);
                this.f10012d = Arrays.copyOf(this.f10012d, length);
            }
            int s10 = s(i11);
            this.f9951f[i11] = g(s10);
            long[] jArr = this.f10012d;
            jArr[i11] = jArr[i11 - 1] + u(this.f9951f[i10]);
            v10 += s10;
        }
    }

    protected abstract Object[] z(int i10);
}
