package y2;

import p3.m0;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f16892a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16893b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16894c;

    public e(String str, String str2, String str3) {
        this.f16892a = str;
        this.f16893b = str2;
        this.f16894c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return m0.c(this.f16892a, eVar.f16892a) && m0.c(this.f16893b, eVar.f16893b) && m0.c(this.f16894c, eVar.f16894c);
    }

    public int hashCode() {
        int hashCode = this.f16892a.hashCode() * 31;
        String str = this.f16893b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16894c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
