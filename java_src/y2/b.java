package y2;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f16861a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16862b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16863c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16864d;

    public b(String str, String str2, int i10, int i11) {
        this.f16861a = str;
        this.f16862b = str2;
        this.f16863c = i10;
        this.f16864d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f16863c == bVar.f16863c && this.f16864d == bVar.f16864d && a5.i.a(this.f16861a, bVar.f16861a) && a5.i.a(this.f16862b, bVar.f16862b);
        }
        return false;
    }

    public int hashCode() {
        return a5.i.b(this.f16861a, this.f16862b, Integer.valueOf(this.f16863c), Integer.valueOf(this.f16864d));
    }
}
