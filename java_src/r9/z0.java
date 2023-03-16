package r9;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 implements k1 {

    /* renamed from: n  reason: collision with root package name */
    private final boolean f13195n;

    public z0(boolean z10) {
        this.f13195n = z10;
    }

    @Override // r9.k1
    public boolean a() {
        return this.f13195n;
    }

    @Override // r9.k1
    public a2 i() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
