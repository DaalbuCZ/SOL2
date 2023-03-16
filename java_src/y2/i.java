package y2;

import android.net.Uri;
import p3.k0;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f16910a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16911b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16912c;

    /* renamed from: d  reason: collision with root package name */
    private int f16913d;

    public i(String str, long j10, long j11) {
        this.f16912c = str == null ? "" : str;
        this.f16910a = j10;
        this.f16911b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f16911b;
            if (j10 != -1) {
                long j11 = this.f16910a;
                if (j11 + j10 == iVar.f16910a) {
                    long j12 = iVar.f16911b;
                    return new i(c10, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f16911b;
            if (j13 != -1) {
                long j14 = iVar.f16910a;
                if (j14 + j13 == this.f16910a) {
                    return new i(c10, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return k0.e(str, this.f16912c);
    }

    public String c(String str) {
        return k0.d(str, this.f16912c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f16910a == iVar.f16910a && this.f16911b == iVar.f16911b && this.f16912c.equals(iVar.f16912c);
    }

    public int hashCode() {
        if (this.f16913d == 0) {
            this.f16913d = ((((527 + ((int) this.f16910a)) * 31) + ((int) this.f16911b)) * 31) + this.f16912c.hashCode();
        }
        return this.f16913d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f16912c + ", start=" + this.f16910a + ", length=" + this.f16911b + ")";
    }
}
