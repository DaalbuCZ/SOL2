package r9;
/* loaded from: classes.dex */
public final class p extends r1 {

    /* renamed from: r  reason: collision with root package name */
    public final l<?> f13151r;

    public p(l<?> lVar) {
        this.f13151r = lVar;
    }

    @Override // r9.x
    public void C(Throwable th) {
        l<?> lVar = this.f13151r;
        lVar.I(lVar.z(D()));
    }

    @Override // j9.l
    public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
        C(th);
        return y8.s.f17099a;
    }
}
