package s5;

import java.util.Objects;
import s5.d0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 extends d0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f14137a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14138b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14139c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f14137a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f14138b = str2;
        this.f14139c = z10;
    }

    @Override // s5.d0.c
    public boolean b() {
        return this.f14139c;
    }

    @Override // s5.d0.c
    public String c() {
        return this.f14138b;
    }

    @Override // s5.d0.c
    public String d() {
        return this.f14137a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0.c) {
            d0.c cVar = (d0.c) obj;
            return this.f14137a.equals(cVar.d()) && this.f14138b.equals(cVar.c()) && this.f14139c == cVar.b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f14137a.hashCode() ^ 1000003) * 1000003) ^ this.f14138b.hashCode()) * 1000003) ^ (this.f14139c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f14137a + ", osCodeName=" + this.f14138b + ", isRooted=" + this.f14139c + "}";
    }
}
