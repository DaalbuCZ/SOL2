package s0;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f13208a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13209b;

    public g(String str, int i10) {
        this.f13208a = str;
        this.f13209b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f13209b != gVar.f13209b) {
                return false;
            }
            return this.f13208a.equals(gVar.f13208a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f13208a.hashCode() * 31) + this.f13209b;
    }
}
