package a3;

import java.util.List;
import o3.j0;
/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f86a;

    /* renamed from: b  reason: collision with root package name */
    private final List<t2.c> f87b;

    public e(k kVar, List<t2.c> list) {
        this.f86a = kVar;
        this.f87b = list;
    }

    @Override // a3.k
    public j0.a<i> a(h hVar, g gVar) {
        return new t2.b(this.f86a.a(hVar, gVar), this.f87b);
    }

    @Override // a3.k
    public j0.a<i> b() {
        return new t2.b(this.f86a.b(), this.f87b);
    }
}
