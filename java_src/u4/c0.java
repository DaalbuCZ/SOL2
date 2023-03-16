package u4;
/* loaded from: classes.dex */
final class c0 extends d {

    /* renamed from: a  reason: collision with root package name */
    private final int f15415a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15416b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c0(int i10, boolean z10, b0 b0Var) {
        this.f15415a = i10;
        this.f15416b = z10;
    }

    @Override // u4.d
    public final boolean a() {
        return this.f15416b;
    }

    @Override // u4.d
    public final int b() {
        return this.f15415a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f15415a == dVar.b() && this.f15416b == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15415a ^ 1000003) * 1000003) ^ (true != this.f15416b ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f15415a;
        boolean z10 = this.f15416b;
        return "AppUpdateOptions{appUpdateType=" + i10 + ", allowAssetPackDeletion=" + z10 + "}";
    }
}
