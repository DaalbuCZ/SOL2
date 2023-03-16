package j3;

import d3.h;
import java.util.Collections;
import java.util.List;
import p3.m0;
/* loaded from: classes.dex */
final class b implements h {

    /* renamed from: n  reason: collision with root package name */
    private final d3.b[] f10383n;

    /* renamed from: o  reason: collision with root package name */
    private final long[] f10384o;

    public b(d3.b[] bVarArr, long[] jArr) {
        this.f10383n = bVarArr;
        this.f10384o = jArr;
    }

    @Override // d3.h
    public int e(long j10) {
        int e10 = m0.e(this.f10384o, j10, false, false);
        if (e10 < this.f10384o.length) {
            return e10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 >= 0);
        p3.a.a(i10 < this.f10384o.length);
        return this.f10384o[i10];
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        int i10 = m0.i(this.f10384o, j10, true, false);
        if (i10 != -1) {
            d3.b[] bVarArr = this.f10383n;
            if (bVarArr[i10] != d3.b.E) {
                return Collections.singletonList(bVarArr[i10]);
            }
        }
        return Collections.emptyList();
    }

    @Override // d3.h
    public int j() {
        return this.f10384o.length;
    }
}
