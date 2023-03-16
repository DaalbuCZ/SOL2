package i3;

import d3.h;
import java.util.Collections;
import java.util.List;
import p3.m0;
/* loaded from: classes.dex */
final class d implements h {

    /* renamed from: n  reason: collision with root package name */
    private final List<List<d3.b>> f8322n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Long> f8323o;

    public d(List<List<d3.b>> list, List<Long> list2) {
        this.f8322n = list;
        this.f8323o = list2;
    }

    @Override // d3.h
    public int e(long j10) {
        int d10 = m0.d(this.f8323o, Long.valueOf(j10), false, false);
        if (d10 < this.f8323o.size()) {
            return d10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 >= 0);
        p3.a.a(i10 < this.f8323o.size());
        return this.f8323o.get(i10).longValue();
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        int f10 = m0.f(this.f8323o, Long.valueOf(j10), true, false);
        return f10 == -1 ? Collections.emptyList() : this.f8322n.get(f10);
    }

    @Override // d3.h
    public int j() {
        return this.f8323o.size();
    }
}
