package r9;
/* loaded from: classes.dex */
public final class r extends r1 implements q {

    /* renamed from: r  reason: collision with root package name */
    public final s f13159r;

    public r(s sVar) {
        this.f13159r = sVar;
    }

    @Override // r9.x
    public void C(Throwable th) {
        this.f13159r.y(D());
    }

    @Override // j9.l
    public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
        C(th);
        return y8.s.f17099a;
    }

    @Override // r9.q
    public p1 getParent() {
        return D();
    }

    @Override // r9.q
    public boolean l(Throwable th) {
        return D().J(th);
    }
}
