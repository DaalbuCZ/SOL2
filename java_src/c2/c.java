package c2;

import x1.m;
import x1.w;
/* loaded from: classes.dex */
final class c extends w {

    /* renamed from: b  reason: collision with root package name */
    private final long f3142b;

    public c(m mVar, long j10) {
        super(mVar);
        p3.a.a(mVar.q() >= j10);
        this.f3142b = j10;
    }

    @Override // x1.w, x1.m
    public long a() {
        return super.a() - this.f3142b;
    }

    @Override // x1.w, x1.m
    public long m() {
        return super.m() - this.f3142b;
    }

    @Override // x1.w, x1.m
    public long q() {
        return super.q() - this.f3142b;
    }
}
