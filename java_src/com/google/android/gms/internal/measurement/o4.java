package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class o4 extends i9 implements pa {
    private static final o4 zza;
    private int zzd;
    private int zze;
    private i5 zzf;
    private i5 zzg;
    private boolean zzh;

    static {
        o4 o4Var = new o4();
        zza = o4Var;
        i9.v(o4.class, o4Var);
    }

    private o4() {
    }

    public static n4 F() {
        return (n4) zza.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(o4 o4Var, int i10) {
        o4Var.zzd |= 1;
        o4Var.zze = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(o4 o4Var, i5 i5Var) {
        i5Var.getClass();
        o4Var.zzf = i5Var;
        o4Var.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L(o4 o4Var, i5 i5Var) {
        o4Var.zzg = i5Var;
        o4Var.zzd |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M(o4 o4Var, boolean z10) {
        o4Var.zzd |= 8;
        o4Var.zzh = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new n4(null);
                }
                return new o4();
            }
            return i9.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zze;
    }

    public final i5 H() {
        i5 i5Var = this.zzf;
        return i5Var == null ? i5.L() : i5Var;
    }

    public final i5 I() {
        i5 i5Var = this.zzg;
        return i5Var == null ? i5.L() : i5Var;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zzd & 1) != 0;
    }

    public final boolean P() {
        return (this.zzd & 8) != 0;
    }

    public final boolean Q() {
        return (this.zzd & 4) != 0;
    }
}
