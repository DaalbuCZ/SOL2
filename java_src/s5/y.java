package s5;

import java.util.Objects;
import s5.d0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y extends d0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14346a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14347b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14348c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14349d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14350e;

    /* renamed from: f  reason: collision with root package name */
    private final n5.e f14351f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, String str2, String str3, String str4, int i10, n5.e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f14346a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f14347b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f14348c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f14349d = str4;
        this.f14350e = i10;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f14351f = eVar;
    }

    @Override // s5.d0.a
    public String a() {
        return this.f14346a;
    }

    @Override // s5.d0.a
    public int c() {
        return this.f14350e;
    }

    @Override // s5.d0.a
    public n5.e d() {
        return this.f14351f;
    }

    @Override // s5.d0.a
    public String e() {
        return this.f14349d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0.a) {
            d0.a aVar = (d0.a) obj;
            return this.f14346a.equals(aVar.a()) && this.f14347b.equals(aVar.f()) && this.f14348c.equals(aVar.g()) && this.f14349d.equals(aVar.e()) && this.f14350e == aVar.c() && this.f14351f.equals(aVar.d());
        }
        return false;
    }

    @Override // s5.d0.a
    public String f() {
        return this.f14347b;
    }

    @Override // s5.d0.a
    public String g() {
        return this.f14348c;
    }

    public int hashCode() {
        return ((((((((((this.f14346a.hashCode() ^ 1000003) * 1000003) ^ this.f14347b.hashCode()) * 1000003) ^ this.f14348c.hashCode()) * 1000003) ^ this.f14349d.hashCode()) * 1000003) ^ this.f14350e) * 1000003) ^ this.f14351f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f14346a + ", versionCode=" + this.f14347b + ", versionName=" + this.f14348c + ", installUuid=" + this.f14349d + ", deliveryMechanism=" + this.f14350e + ", developmentPlatformProvider=" + this.f14351f + "}";
    }
}
