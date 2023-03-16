package d9;
/* loaded from: classes.dex */
public abstract class j extends a {
    public j(b9.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.b() == b9.h.f2971n)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // b9.d
    public b9.g b() {
        return b9.h.f2971n;
    }
}
