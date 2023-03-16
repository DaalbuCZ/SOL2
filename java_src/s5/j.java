package s5;

import s5.b0;
/* loaded from: classes.dex */
final class j extends b0.e.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f14230a;

    @Override // s5.b0.e.a.b
    public String a() {
        return this.f14230a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.a.b) {
            return this.f14230a.equals(((b0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f14230a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f14230a + "}";
    }
}
