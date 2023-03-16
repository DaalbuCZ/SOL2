package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f10955a = new e0("CONDITION_FALSE");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f10956b = new e0("LIST_EMPTY");

    public static final Object a() {
        return f10955a;
    }

    public static final r b(Object obj) {
        r rVar;
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        return (a0Var == null || (rVar = a0Var.f10906a) == null) ? (r) obj : rVar;
    }
}
