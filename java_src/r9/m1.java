package r9;
/* loaded from: classes.dex */
final class m1 extends i {

    /* renamed from: n  reason: collision with root package name */
    private final j9.l<Throwable, y8.s> f13142n;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(j9.l<? super Throwable, y8.s> lVar) {
        this.f13142n = lVar;
    }

    @Override // r9.j
    public void a(Throwable th) {
        this.f13142n.c(th);
    }

    @Override // j9.l
    public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
        a(th);
        return y8.s.f17099a;
    }

    public String toString() {
        return "InvokeOnCancel[" + o0.a(this.f13142n) + '@' + o0.b(this) + ']';
    }
}
