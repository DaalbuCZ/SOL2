package j$.util.function;

import j$.util.function.Predicate;
import java.util.Comparator;
import java.util.Objects;
/* renamed from: j$.util.function.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0258a implements InterfaceC0260c, Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9725a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9726b;

    public /* synthetic */ C0258a(Object obj, int i10) {
        this.f9725a = i10;
        this.f9726b = obj;
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.BiFunction
    public Object s(Object obj, Object obj2) {
        switch (this.f9725a) {
            case 0:
                return ((Comparator) this.f9726b).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) this.f9726b).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f9726b).test(obj);
    }
}
