package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class q4 extends i9 implements pa {
    private static final q4 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        q4 q4Var = new q4();
        zza = q4Var;
        i9.v(q4.class, q4Var);
    }

    private q4() {
    }

    public static p4 G() {
        return (p4) zza.z();
    }

    public static /* synthetic */ void I(q4 q4Var, int i10) {
        q4Var.zzd |= 1;
        q4Var.zze = i10;
    }

    public static /* synthetic */ void J(q4 q4Var, long j10) {
        q4Var.zzd |= 2;
        q4Var.zzf = j10;
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
                    return new p4(null);
                }
                return new q4();
            }
            return i9.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zze;
    }

    public final long F() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzd & 2) != 0;
    }

    public final boolean L() {
        return (this.zzd & 1) != 0;
    }
}
