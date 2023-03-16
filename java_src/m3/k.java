package m3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p3.m0;
/* loaded from: classes.dex */
final class k implements d3.h {

    /* renamed from: n  reason: collision with root package name */
    private final List<e> f11392n;

    /* renamed from: o  reason: collision with root package name */
    private final long[] f11393o;

    /* renamed from: p  reason: collision with root package name */
    private final long[] f11394p;

    public k(List<e> list) {
        this.f11392n = Collections.unmodifiableList(new ArrayList(list));
        this.f11393o = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f11393o;
            jArr[i11] = eVar.f11361b;
            jArr[i11 + 1] = eVar.f11362c;
        }
        long[] jArr2 = this.f11393o;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f11394p = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(e eVar, e eVar2) {
        return Long.compare(eVar.f11361b, eVar2.f11361b);
    }

    @Override // d3.h
    public int e(long j10) {
        int e10 = m0.e(this.f11394p, j10, false, false);
        if (e10 < this.f11394p.length) {
            return e10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 >= 0);
        p3.a.a(i10 < this.f11394p.length);
        return this.f11394p[i10];
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f11392n.size(); i10++) {
            long[] jArr = this.f11393o;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f11392n.get(i10);
                d3.b bVar = eVar.f11360a;
                if (bVar.f6510r == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, j.f11391n);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f11360a.b().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // d3.h
    public int j() {
        return this.f11394p.length;
    }
}
