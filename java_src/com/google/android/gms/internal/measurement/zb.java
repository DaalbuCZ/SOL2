package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
final class zb extends ac {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(k(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(j(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final void c(Object obj, long j10, boolean z10) {
        if (bc.f3754h) {
            bc.d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            bc.e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final void d(Object obj, long j10, byte b10) {
        if (bc.f3754h) {
            bc.d(obj, j10, b10);
        } else {
            bc.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final void e(Object obj, long j10, double d10) {
        o(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final void f(Object obj, long j10, float f10) {
        n(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final boolean g(Object obj, long j10) {
        return bc.f3754h ? bc.y(obj, j10) : bc.z(obj, j10);
    }
}
