package w2;

import java.util.Arrays;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public abstract class l extends f {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f16038j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f16039k;

    public l(o3.l lVar, o3.p pVar, int i10, m1 m1Var, int i11, Object obj, byte[] bArr) {
        super(lVar, pVar, i10, m1Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = m0.f12311f;
            lVar2 = this;
        } else {
            lVar2 = this;
            bArr2 = bArr;
        }
        lVar2.f16038j = bArr2;
    }

    private void i(int i10) {
        byte[] bArr = this.f16038j;
        if (bArr.length < i10 + 16384) {
            this.f16038j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // o3.h0.e
    public final void b() {
        try {
            this.f16011i.n(this.f16004b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f16039k) {
                i(i11);
                i10 = this.f16011i.b(this.f16038j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f16039k) {
                g(this.f16038j, i11);
            }
        } finally {
            o3.o.a(this.f16011i);
        }
    }

    @Override // o3.h0.e
    public final void c() {
        this.f16039k = true;
    }

    protected abstract void g(byte[] bArr, int i10);

    public byte[] h() {
        return this.f16038j;
    }
}
