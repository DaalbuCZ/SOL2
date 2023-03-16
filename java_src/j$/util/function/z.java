package j$.util.function;
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements java.util.function.Predicate {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Predicate f9736a;

    private /* synthetic */ z(Predicate predicate) {
        this.f9736a = predicate;
    }

    public static /* synthetic */ java.util.function.Predicate a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof y ? ((y) predicate).f9735a : new z(predicate);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return a(this.f9736a.and(y.a(predicate)));
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ java.util.function.Predicate negate() {
        return a(this.f9736a.negate());
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return a(this.f9736a.or(y.a(predicate)));
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ boolean test(Object obj) {
        return this.f9736a.test(obj);
    }
}
