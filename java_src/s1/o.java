package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class o implements h {

    /* renamed from: q  reason: collision with root package name */
    public static final o f13641q = new o(0, 0, 0);

    /* renamed from: r  reason: collision with root package name */
    public static final h.a<o> f13642r = n.f13635a;

    /* renamed from: n  reason: collision with root package name */
    public final int f13643n;

    /* renamed from: o  reason: collision with root package name */
    public final int f13644o;

    /* renamed from: p  reason: collision with root package name */
    public final int f13645p;

    public o(int i10, int i11, int i12) {
        this.f13643n = i10;
        this.f13644o = i11;
        this.f13645p = i12;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o c(Bundle bundle) {
        return new o(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f13643n == oVar.f13643n && this.f13644o == oVar.f13644o && this.f13645p == oVar.f13645p;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f13643n) * 31) + this.f13644o) * 31) + this.f13645p;
    }
}
