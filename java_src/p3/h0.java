package p3;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class h0<V> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f12277a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f12278b;

    /* renamed from: c  reason: collision with root package name */
    private int f12279c;

    /* renamed from: d  reason: collision with root package name */
    private int f12280d;

    public h0() {
        this(10);
    }

    public h0(int i10) {
        this.f12277a = new long[i10];
        this.f12278b = (V[]) f(i10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f12279c;
        int i11 = this.f12280d;
        V[] vArr = this.f12278b;
        int length = (i10 + i11) % vArr.length;
        this.f12277a[length] = j10;
        vArr[length] = v10;
        this.f12280d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f12280d;
        if (i10 > 0) {
            if (j10 <= this.f12277a[((this.f12279c + i10) - 1) % this.f12278b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f12278b.length;
        if (this.f12280d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f12279c;
        int i12 = length - i11;
        System.arraycopy(this.f12277a, i11, jArr, 0, i12);
        System.arraycopy(this.f12278b, this.f12279c, vArr, 0, i12);
        int i13 = this.f12279c;
        if (i13 > 0) {
            System.arraycopy(this.f12277a, 0, jArr, i12, i13);
            System.arraycopy(this.f12278b, 0, vArr, i12, this.f12279c);
        }
        this.f12277a = jArr;
        this.f12278b = vArr;
        this.f12279c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V g(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f12280d > 0) {
            long j12 = j10 - this.f12277a[this.f12279c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = j();
            j11 = j12;
        }
        return v10;
    }

    private V j() {
        a.f(this.f12280d > 0);
        V[] vArr = this.f12278b;
        int i10 = this.f12279c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f12279c = (i10 + 1) % vArr.length;
        this.f12280d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f12279c = 0;
        this.f12280d = 0;
        Arrays.fill(this.f12278b, (Object) null);
    }

    public synchronized V h() {
        return this.f12280d == 0 ? null : j();
    }

    public synchronized V i(long j10) {
        return g(j10, true);
    }

    public synchronized int k() {
        return this.f12280d;
    }
}
