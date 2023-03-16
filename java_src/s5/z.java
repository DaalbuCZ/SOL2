package s5;

import java.util.Objects;
import s5.d0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z extends d0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f14352a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14353b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14354c;

    /* renamed from: d  reason: collision with root package name */
    private final long f14355d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14356e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f14357f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14358g;

    /* renamed from: h  reason: collision with root package name */
    private final String f14359h;

    /* renamed from: i  reason: collision with root package name */
    private final String f14360i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f14352a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f14353b = str;
        this.f14354c = i11;
        this.f14355d = j10;
        this.f14356e = j11;
        this.f14357f = z10;
        this.f14358g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f14359h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f14360i = str3;
    }

    @Override // s5.d0.b
    public int a() {
        return this.f14352a;
    }

    @Override // s5.d0.b
    public int b() {
        return this.f14354c;
    }

    @Override // s5.d0.b
    public long d() {
        return this.f14356e;
    }

    @Override // s5.d0.b
    public boolean e() {
        return this.f14357f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0.b) {
            d0.b bVar = (d0.b) obj;
            return this.f14352a == bVar.a() && this.f14353b.equals(bVar.g()) && this.f14354c == bVar.b() && this.f14355d == bVar.j() && this.f14356e == bVar.d() && this.f14357f == bVar.e() && this.f14358g == bVar.i() && this.f14359h.equals(bVar.f()) && this.f14360i.equals(bVar.h());
        }
        return false;
    }

    @Override // s5.d0.b
    public String f() {
        return this.f14359h;
    }

    @Override // s5.d0.b
    public String g() {
        return this.f14353b;
    }

    @Override // s5.d0.b
    public String h() {
        return this.f14360i;
    }

    public int hashCode() {
        long j10 = this.f14355d;
        long j11 = this.f14356e;
        return ((((((((((((((((this.f14352a ^ 1000003) * 1000003) ^ this.f14353b.hashCode()) * 1000003) ^ this.f14354c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14357f ? 1231 : 1237)) * 1000003) ^ this.f14358g) * 1000003) ^ this.f14359h.hashCode()) * 1000003) ^ this.f14360i.hashCode();
    }

    @Override // s5.d0.b
    public int i() {
        return this.f14358g;
    }

    @Override // s5.d0.b
    public long j() {
        return this.f14355d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f14352a + ", model=" + this.f14353b + ", availableProcessors=" + this.f14354c + ", totalRam=" + this.f14355d + ", diskSpace=" + this.f14356e + ", isEmulator=" + this.f14357f + ", state=" + this.f14358g + ", manufacturer=" + this.f14359h + ", modelClass=" + this.f14360i + "}";
    }
}
