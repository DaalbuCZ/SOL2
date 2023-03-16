package u2;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class m implements o3.l {

    /* renamed from: a  reason: collision with root package name */
    private final o3.l f15272a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15273b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15274c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f15275d;

    /* renamed from: e  reason: collision with root package name */
    private int f15276e;

    /* loaded from: classes.dex */
    public interface a {
        void a(p3.a0 a0Var);
    }

    public m(o3.l lVar, int i10, a aVar) {
        p3.a.a(i10 > 0);
        this.f15272a = lVar;
        this.f15273b = i10;
        this.f15274c = aVar;
        this.f15275d = new byte[1];
        this.f15276e = i10;
    }

    private boolean r() {
        if (this.f15272a.b(this.f15275d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f15275d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int b10 = this.f15272a.b(bArr, i12, i11);
            if (b10 == -1) {
                return false;
            }
            i12 += b10;
            i11 -= b10;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f15274c.a(new p3.a0(bArr, i10));
        }
        return true;
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        if (this.f15276e == 0) {
            if (!r()) {
                return -1;
            }
            this.f15276e = this.f15273b;
        }
        int b10 = this.f15272a.b(bArr, i10, Math.min(this.f15276e, i11));
        if (b10 != -1) {
            this.f15276e -= b10;
        }
        return b10;
    }

    @Override // o3.l
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // o3.l
    public Map<String, List<String>> f() {
        return this.f15272a.f();
    }

    @Override // o3.l
    public void i(o3.p0 p0Var) {
        p3.a.e(p0Var);
        this.f15272a.i(p0Var);
    }

    @Override // o3.l
    public Uri k() {
        return this.f15272a.k();
    }

    @Override // o3.l
    public long n(o3.p pVar) {
        throw new UnsupportedOperationException();
    }
}
