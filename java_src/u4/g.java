package u4;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private n f15424a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ g(f fVar) {
    }

    public final e a() {
        n nVar = this.f15424a;
        if (nVar != null) {
            return new e0(nVar, null);
        }
        throw new IllegalStateException(String.valueOf(n.class.getCanonicalName()).concat(" must be set"));
    }

    public final g b(n nVar) {
        this.f15424a = nVar;
        return this;
    }
}
