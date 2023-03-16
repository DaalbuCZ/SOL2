package kotlinx.coroutines.scheduling;

import r9.g1;
/* loaded from: classes.dex */
public class f extends g1 {

    /* renamed from: q  reason: collision with root package name */
    private final int f11012q;

    /* renamed from: r  reason: collision with root package name */
    private final int f11013r;

    /* renamed from: s  reason: collision with root package name */
    private final long f11014s;

    /* renamed from: t  reason: collision with root package name */
    private final String f11015t;

    /* renamed from: u  reason: collision with root package name */
    private a f11016u = Y();

    public f(int i10, int i11, long j10, String str) {
        this.f11012q = i10;
        this.f11013r = i11;
        this.f11014s = j10;
        this.f11015t = str;
    }

    private final a Y() {
        return new a(this.f11012q, this.f11013r, this.f11014s, this.f11015t);
    }

    public final void Z(Runnable runnable, i iVar, boolean z10) {
        this.f11016u.j(runnable, iVar, z10);
    }

    @Override // r9.d0
    public void b(b9.g gVar, Runnable runnable) {
        a.k(this.f11016u, runnable, null, false, 6, null);
    }
}
