package j$.util.function;
/* loaded from: classes2.dex */
public final /* synthetic */ class y implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ java.util.function.Predicate f9735a;

    private /* synthetic */ y(java.util.function.Predicate predicate) {
        this.f9735a = predicate;
    }

    public static /* synthetic */ Predicate a(java.util.function.Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof z ? ((z) predicate).f9736a : new y(predicate);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return a(this.f9735a.and(z.a(predicate)));
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return a(this.f9735a.negate());
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return a(this.f9735a.or(z.a(predicate)));
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ boolean test(Object obj) {
        return this.f9735a.test(obj);
    }
}
