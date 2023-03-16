package d2;

import p3.a0;
import x1.m;
/* loaded from: classes.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f6499a = new a0(8);

    /* renamed from: b  reason: collision with root package name */
    private int f6500b;

    private long a(m mVar) {
        int i10 = 0;
        mVar.o(this.f6499a.d(), 0, 1);
        int i11 = this.f6499a.d()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        mVar.o(this.f6499a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f6499a.d()[i10] & 255) + (i14 << 8);
        }
        this.f6500b += i13 + 1;
        return i14;
    }

    public boolean b(m mVar) {
        long a10;
        int i10;
        long a11 = mVar.a();
        int i11 = (a11 > (-1L) ? 1 : (a11 == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && a11 <= 1024) {
            j10 = a11;
        }
        int i12 = (int) j10;
        mVar.o(this.f6499a.d(), 0, 4);
        long E = this.f6499a.E();
        this.f6500b = 4;
        while (E != 440786851) {
            int i13 = this.f6500b + 1;
            this.f6500b = i13;
            if (i13 == i12) {
                return false;
            }
            mVar.o(this.f6499a.d(), 0, 1);
            E = ((E << 8) & (-256)) | (this.f6499a.d()[0] & 255);
        }
        long a12 = a(mVar);
        long j11 = this.f6500b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a12 >= a11) {
            return false;
        }
        while (true) {
            int i14 = this.f6500b;
            long j12 = j11 + a12;
            if (i14 >= j12) {
                return ((long) i14) == j12;
            } else if (a(mVar) != Long.MIN_VALUE && (a(mVar)) >= 0 && a10 <= 2147483647L) {
                if (i10 != 0) {
                    int i15 = (int) a10;
                    mVar.p(i15);
                    this.f6500b += i15;
                }
            }
        }
    }
}
