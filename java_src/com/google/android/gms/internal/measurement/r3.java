package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class r3 extends i9 implements pa {
    private static final r3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private k3 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        r3 r3Var = new r3();
        zza = r3Var;
        i9.v(r3.class, r3Var);
    }

    private r3() {
    }

    public static q3 G() {
        return (q3) zza.z();
    }

    public static /* synthetic */ void J(r3 r3Var, String str) {
        r3Var.zzd |= 2;
        r3Var.zzf = str;
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
                    return new q3(null);
                }
                return new r3();
            }
            return i9.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zze;
    }

    public final k3 F() {
        k3 k3Var = this.zzg;
        return k3Var == null ? k3.F() : k3Var;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }

    public final boolean O() {
        return (this.zzd & 32) != 0;
    }
}
