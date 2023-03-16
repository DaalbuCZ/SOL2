package io.flutter.embedding.android;

import android.view.textservice.SpellCheckerInfo;
import j$.util.function.Predicate;
import java.util.Objects;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ j f8523a = new j();

    private /* synthetic */ j() {
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

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        boolean x10;
        x10 = k.x((SpellCheckerInfo) obj);
        return x10;
    }
}
