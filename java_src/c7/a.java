package c7;

import java.util.Objects;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f3223a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3224b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f3223a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f3224b = str2;
    }

    @Override // c7.f
    @Nonnull
    public String b() {
        return this.f3223a;
    }

    @Override // c7.f
    @Nonnull
    public String c() {
        return this.f3224b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f3223a.equals(fVar.b()) && this.f3224b.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3223a.hashCode() ^ 1000003) * 1000003) ^ this.f3224b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f3223a + ", version=" + this.f3224b + "}";
    }
}
