package l3;

import d3.h;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class b implements h {

    /* renamed from: o  reason: collision with root package name */
    public static final b f11115o = new b();

    /* renamed from: n  reason: collision with root package name */
    private final List<d3.b> f11116n;

    private b() {
        this.f11116n = Collections.emptyList();
    }

    public b(d3.b bVar) {
        this.f11116n = Collections.singletonList(bVar);
    }

    @Override // d3.h
    public int e(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 == 0);
        return 0L;
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        return j10 >= 0 ? this.f11116n : Collections.emptyList();
    }

    @Override // d3.h
    public int j() {
        return 1;
    }
}
