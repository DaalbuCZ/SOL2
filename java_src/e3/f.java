package e3;

import d3.h;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class f implements h {

    /* renamed from: n  reason: collision with root package name */
    private final List<d3.b> f6766n;

    public f(List<d3.b> list) {
        this.f6766n = list;
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
        return j10 >= 0 ? this.f6766n : Collections.emptyList();
    }

    @Override // d3.h
    public int j() {
        return 1;
    }
}
