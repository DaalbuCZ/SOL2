package y3;
/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ r4.l f17009n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ z f17010o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(z zVar, r4.l lVar) {
        this.f17010o = zVar;
        this.f17009n = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z.o0(this.f17010o, this.f17009n);
    }
}
