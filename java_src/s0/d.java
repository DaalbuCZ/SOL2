package s0;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f13203a;

    /* renamed from: b  reason: collision with root package name */
    public Long f13204b;

    public d(String str, long j10) {
        this.f13203a = str;
        this.f13204b = Long.valueOf(j10);
    }

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f13203a.equals(dVar.f13203a)) {
                Long l10 = this.f13204b;
                Long l11 = dVar.f13204b;
                return l10 != null ? l10.equals(l11) : l11 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f13203a.hashCode() * 31;
        Long l10 = this.f13204b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
