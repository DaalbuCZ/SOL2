package y2;

import p3.m0;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f16905a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16906b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16907c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16908d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16909e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f16905a = str;
        this.f16906b = str2;
        this.f16907c = str3;
        this.f16908d = str4;
        this.f16909e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return m0.c(this.f16905a, hVar.f16905a) && m0.c(this.f16906b, hVar.f16906b) && m0.c(this.f16907c, hVar.f16907c) && m0.c(this.f16908d, hVar.f16908d) && m0.c(this.f16909e, hVar.f16909e);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f16905a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16906b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16907c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f16908d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f16909e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
