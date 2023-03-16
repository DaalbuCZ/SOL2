package k3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3.m0;
/* loaded from: classes.dex */
final class h implements d3.h {

    /* renamed from: n  reason: collision with root package name */
    private final d f10600n;

    /* renamed from: o  reason: collision with root package name */
    private final long[] f10601o;

    /* renamed from: p  reason: collision with root package name */
    private final Map<String, g> f10602p;

    /* renamed from: q  reason: collision with root package name */
    private final Map<String, e> f10603q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, String> f10604r;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f10600n = dVar;
        this.f10603q = map2;
        this.f10604r = map3;
        this.f10602p = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f10601o = dVar.j();
    }

    @Override // d3.h
    public int e(long j10) {
        int e10 = m0.e(this.f10601o, j10, false, false);
        if (e10 < this.f10601o.length) {
            return e10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        return this.f10601o[i10];
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        return this.f10600n.h(j10, this.f10602p, this.f10603q, this.f10604r);
    }

    @Override // d3.h
    public int j() {
        return this.f10601o.length;
    }
}
