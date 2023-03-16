package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class w4 extends i9 implements pa {
    private static final w4 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private o9 zzj = i9.p();

    static {
        w4 w4Var = new w4();
        zza = w4Var;
        i9.v(w4.class, w4Var);
    }

    private w4() {
    }

    public static v4 I() {
        return (v4) zza.z();
    }

    public static /* synthetic */ void N(w4 w4Var, String str) {
        str.getClass();
        w4Var.zzd |= 1;
        w4Var.zze = str;
    }

    public static /* synthetic */ void O(w4 w4Var, String str) {
        str.getClass();
        w4Var.zzd |= 2;
        w4Var.zzf = str;
    }

    public static /* synthetic */ void P(w4 w4Var) {
        w4Var.zzd &= -3;
        w4Var.zzf = zza.zzf;
    }

    public static /* synthetic */ void Q(w4 w4Var, long j10) {
        w4Var.zzd |= 4;
        w4Var.zzg = j10;
    }

    public static /* synthetic */ void R(w4 w4Var) {
        w4Var.zzd &= -5;
        w4Var.zzg = 0L;
    }

    public static /* synthetic */ void S(w4 w4Var, double d10) {
        w4Var.zzd |= 16;
        w4Var.zzi = d10;
    }

    public static /* synthetic */ void T(w4 w4Var) {
        w4Var.zzd &= -17;
        w4Var.zzi = 0.0d;
    }

    public static /* synthetic */ void U(w4 w4Var, w4 w4Var2) {
        w4Var2.getClass();
        w4Var.c0();
        w4Var.zzj.add(w4Var2);
    }

    public static /* synthetic */ void V(w4 w4Var, Iterable iterable) {
        w4Var.c0();
        q7.b(iterable, w4Var.zzj);
    }

    private final void c0() {
        o9 o9Var = this.zzj;
        if (o9Var.c()) {
            return;
        }
        this.zzj = i9.q(o9Var);
    }

    @Override // com.google.android.gms.internal.measurement.i9
    public final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new v4(null);
                }
                return new w4();
            }
            return i9.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", w4.class});
        }
        return (byte) 1;
    }

    public final double E() {
        return this.zzi;
    }

    public final float F() {
        return this.zzh;
    }

    public final int G() {
        return this.zzj.size();
    }

    public final long H() {
        return this.zzg;
    }

    public final String K() {
        return this.zze;
    }

    public final String L() {
        return this.zzf;
    }

    public final List M() {
        return this.zzj;
    }

    public final boolean X() {
        return (this.zzd & 16) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 8) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 4) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 1) != 0;
    }

    public final boolean b0() {
        return (this.zzd & 2) != 0;
    }
}
