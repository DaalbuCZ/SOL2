package w2;

import p3.r;
import u2.m0;
import w2.g;
import x1.e0;
/* loaded from: classes.dex */
public final class c implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f15982a;

    /* renamed from: b  reason: collision with root package name */
    private final m0[] f15983b;

    public c(int[] iArr, m0[] m0VarArr) {
        this.f15982a = iArr;
        this.f15983b = m0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f15983b.length];
        int i10 = 0;
        while (true) {
            m0[] m0VarArr = this.f15983b;
            if (i10 >= m0VarArr.length) {
                return iArr;
            }
            iArr[i10] = m0VarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (m0 m0Var : this.f15983b) {
            m0Var.a0(j10);
        }
    }

    @Override // w2.g.b
    public e0 e(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f15982a;
            if (i12 >= iArr.length) {
                r.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new x1.k();
            } else if (i11 == iArr[i12]) {
                return this.f15983b[i12];
            } else {
                i12++;
            }
        }
    }
}
