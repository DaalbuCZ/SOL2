package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class k3 extends i9 implements pa {
    private static final k3 zza;
    private int zzd;
    private w3 zze;
    private p3 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        k3 k3Var = new k3();
        zza = k3Var;
        i9.v(k3.class, k3Var);
    }

    private k3() {
    }

    public static k3 F() {
        return zza;
    }

    public static /* synthetic */ void J(k3 k3Var, String str) {
        k3Var.zzd |= 8;
        k3Var.zzh = str;
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
                    return new j3(null);
                }
                return new k3();
            }
            return i9.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final p3 G() {
        p3 p3Var = this.zzf;
        return p3Var == null ? p3.F() : p3Var;
    }

    public final w3 H() {
        w3 w3Var = this.zze;
        return w3Var == null ? w3.G() : w3Var;
    }

    public final String I() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final boolean M() {
        return (this.zzd & 2) != 0;
    }

    public final boolean N() {
        return (this.zzd & 8) != 0;
    }

    public final boolean O() {
        return (this.zzd & 1) != 0;
    }
}
