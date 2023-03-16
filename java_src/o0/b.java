package o0;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11813a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11814b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11815c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11816d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f11813a = z10;
        this.f11814b = z11;
        this.f11815c = z12;
        this.f11816d = z13;
    }

    public boolean a() {
        return this.f11813a;
    }

    public boolean b() {
        return this.f11815c;
    }

    public boolean c() {
        return this.f11816d;
    }

    public boolean d() {
        return this.f11814b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f11813a == bVar.f11813a && this.f11814b == bVar.f11814b && this.f11815c == bVar.f11815c && this.f11816d == bVar.f11816d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public int hashCode() {
        ?? r02 = this.f11813a;
        int i10 = r02;
        if (this.f11814b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f11815c) {
            i11 = i10 + 256;
        }
        return this.f11816d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f11813a), Boolean.valueOf(this.f11814b), Boolean.valueOf(this.f11815c), Boolean.valueOf(this.f11816d));
    }
}
