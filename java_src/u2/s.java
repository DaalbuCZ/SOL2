package u2;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15356a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15357b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15358c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15359d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15360e;

    public s(Object obj) {
        this(obj, -1L);
    }

    public s(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private s(Object obj, int i10, int i11, long j10, int i12) {
        this.f15356a = obj;
        this.f15357b = i10;
        this.f15358c = i11;
        this.f15359d = j10;
        this.f15360e = i12;
    }

    public s(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public s(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(s sVar) {
        this.f15356a = sVar.f15356a;
        this.f15357b = sVar.f15357b;
        this.f15358c = sVar.f15358c;
        this.f15359d = sVar.f15359d;
        this.f15360e = sVar.f15360e;
    }

    public s a(Object obj) {
        return this.f15356a.equals(obj) ? this : new s(obj, this.f15357b, this.f15358c, this.f15359d, this.f15360e);
    }

    public boolean b() {
        return this.f15357b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f15356a.equals(sVar.f15356a) && this.f15357b == sVar.f15357b && this.f15358c == sVar.f15358c && this.f15359d == sVar.f15359d && this.f15360e == sVar.f15360e;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f15356a.hashCode()) * 31) + this.f15357b) * 31) + this.f15358c) * 31) + ((int) this.f15359d)) * 31) + this.f15360e;
    }
}
