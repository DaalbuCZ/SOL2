package j$.util.function;

import j$.util.function.Predicate;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Predicate f9733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Predicate f9734c;

    public /* synthetic */ x(Predicate predicate, Predicate predicate2, int i10) {
        this.f9732a = i10;
        this.f9733b = predicate;
        this.f9734c = predicate2;
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f9732a) {
            case 0:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        switch (this.f9732a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f9732a) {
            case 0:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f9732a) {
            case 0:
                return this.f9733b.test(obj) && this.f9734c.test(obj);
            default:
                return this.f9733b.test(obj) || this.f9734c.test(obj);
        }
    }
}
