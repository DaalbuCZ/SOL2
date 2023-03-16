package y3;
/* loaded from: classes.dex */
public final class f<L> {

    /* renamed from: a  reason: collision with root package name */
    private final L f16974a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16975b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f16974a == fVar.f16974a && this.f16975b.equals(fVar.f16975b);
        }
        return false;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f16974a) * 31) + this.f16975b.hashCode();
    }
}
