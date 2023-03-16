package k9;
/* loaded from: classes.dex */
public abstract class p extends c implements o9.f {
    public p() {
    }

    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return h().equals(pVar.h()) && g().equals(pVar.g()) && i().equals(pVar.i()) && k.a(e(), pVar.e());
        } else if (obj instanceof o9.f) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + g().hashCode()) * 31) + i().hashCode();
    }

    public String toString() {
        o9.a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        return "property " + g() + " (Kotlin reflection is not available)";
    }
}
