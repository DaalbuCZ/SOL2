package k9;
/* loaded from: classes.dex */
public class i extends c implements h, o9.d {

    /* renamed from: u  reason: collision with root package name */
    private final int f10894u;

    /* renamed from: v  reason: collision with root package name */
    private final int f10895v;

    public i(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f10894u = i10;
        this.f10895v = i11 >> 1;
    }

    @Override // k9.c
    protected o9.a b() {
        return s.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return g().equals(iVar.g()) && i().equals(iVar.i()) && this.f10895v == iVar.f10895v && this.f10894u == iVar.f10894u && k.a(e(), iVar.e()) && k.a(h(), iVar.h());
        } else if (obj instanceof o9.d) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    @Override // k9.h
    public int f() {
        return this.f10894u;
    }

    public int hashCode() {
        return (((h() == null ? 0 : h().hashCode() * 31) + g().hashCode()) * 31) + i().hashCode();
    }

    public String toString() {
        o9.a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        if ("<init>".equals(g())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + g() + " (Kotlin reflection is not available)";
    }
}
