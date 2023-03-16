package q3;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class z implements s1.h {

    /* renamed from: r  reason: collision with root package name */
    public static final z f12692r = new z(0, 0);

    /* renamed from: s  reason: collision with root package name */
    public static final h.a<z> f12693s = y.f12691a;

    /* renamed from: n  reason: collision with root package name */
    public final int f12694n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12695o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12696p;

    /* renamed from: q  reason: collision with root package name */
    public final float f12697q;

    public z(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public z(int i10, int i11, int i12, float f10) {
        this.f12694n = i10;
        this.f12695o = i11;
        this.f12696p = i12;
        this.f12697q = f10;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z c(Bundle bundle) {
        return new z(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0), bundle.getFloat(b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f12694n == zVar.f12694n && this.f12695o == zVar.f12695o && this.f12696p == zVar.f12696p && this.f12697q == zVar.f12697q;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f12694n) * 31) + this.f12695o) * 31) + this.f12696p) * 31) + Float.floatToRawIntBits(this.f12697q);
    }
}
