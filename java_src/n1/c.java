package n1;

import java.util.Map;
import java.util.Objects;
import n1.g;
/* loaded from: classes.dex */
final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final q1.a f11489a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<e1.d, g.b> f11490b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(q1.a aVar, Map<e1.d, g.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f11489a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f11490b = map;
    }

    @Override // n1.g
    q1.a e() {
        return this.f11489a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f11489a.equals(gVar.e()) && this.f11490b.equals(gVar.h());
        }
        return false;
    }

    @Override // n1.g
    Map<e1.d, g.b> h() {
        return this.f11490b;
    }

    public int hashCode() {
        return ((this.f11489a.hashCode() ^ 1000003) * 1000003) ^ this.f11490b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f11489a + ", values=" + this.f11490b + "}";
    }
}
