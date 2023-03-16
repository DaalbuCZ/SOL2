package r9;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o1 extends v1 {

    /* renamed from: r  reason: collision with root package name */
    private final j9.l<Throwable, y8.s> f13150r;

    /* JADX WARN: Multi-variable type inference failed */
    public o1(j9.l<? super Throwable, y8.s> lVar) {
        this.f13150r = lVar;
    }

    @Override // r9.x
    public void C(Throwable th) {
        this.f13150r.c(th);
    }

    @Override // j9.l
    public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
        C(th);
        return y8.s.f17099a;
    }
}
