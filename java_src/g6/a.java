package g6;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f7552a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f7553b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f7552a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f7553b = list;
    }

    @Override // g6.l
    public List<String> b() {
        return this.f7553b;
    }

    @Override // g6.l
    public String c() {
        return this.f7552a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f7552a.equals(lVar.c()) && this.f7553b.equals(lVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7552a.hashCode() ^ 1000003) * 1000003) ^ this.f7553b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f7552a + ", usedDates=" + this.f7553b + "}";
    }
}
