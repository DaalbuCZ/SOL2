package u1;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final int f15076a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15077b;

    public w(int i10, float f10) {
        this.f15076a = i10;
        this.f15077b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f15076a == wVar.f15076a && Float.compare(wVar.f15077b, this.f15077b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f15076a) * 31) + Float.floatToIntBits(this.f15077b);
    }
}
