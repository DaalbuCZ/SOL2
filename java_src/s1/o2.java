package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class o2 implements h {

    /* renamed from: q  reason: collision with root package name */
    public static final o2 f13648q = new o2(1.0f);

    /* renamed from: r  reason: collision with root package name */
    public static final h.a<o2> f13649r = n2.f13639a;

    /* renamed from: n  reason: collision with root package name */
    public final float f13650n;

    /* renamed from: o  reason: collision with root package name */
    public final float f13651o;

    /* renamed from: p  reason: collision with root package name */
    private final int f13652p;

    public o2(float f10) {
        this(f10, 1.0f);
    }

    public o2(float f10, float f11) {
        p3.a.a(f10 > 0.0f);
        p3.a.a(f11 > 0.0f);
        this.f13650n = f10;
        this.f13651o = f11;
        this.f13652p = Math.round(f10 * 1000.0f);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o2 d(Bundle bundle) {
        return new o2(bundle.getFloat(c(0), 1.0f), bundle.getFloat(c(1), 1.0f));
    }

    public long b(long j10) {
        return j10 * this.f13652p;
    }

    public o2 e(float f10) {
        return new o2(f10, this.f13651o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o2.class != obj.getClass()) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f13650n == o2Var.f13650n && this.f13651o == o2Var.f13651o;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f13650n)) * 31) + Float.floatToRawIntBits(this.f13651o);
    }

    public String toString() {
        return p3.m0.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f13650n), Float.valueOf(this.f13651o));
    }
}
