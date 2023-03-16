package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final class f implements r9.j0 {

    /* renamed from: n  reason: collision with root package name */
    private final b9.g f10917n;

    public f(b9.g gVar) {
        this.f10917n = gVar;
    }

    @Override // r9.j0
    public b9.g d() {
        return this.f10917n;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + d() + ')';
    }
}
