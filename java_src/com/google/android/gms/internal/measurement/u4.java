package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class u4 extends i9 implements pa {
    private static final u4 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        u4 u4Var = new u4();
        zza = u4Var;
        i9.v(u4.class, u4Var);
    }

    private u4() {
    }

    public static t4 E() {
        return (t4) zza.z();
    }

    public static /* synthetic */ void G(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzd |= 1;
        u4Var.zze = str;
    }

    public static /* synthetic */ void H(u4 u4Var, long j10) {
        u4Var.zzd |= 2;
        u4Var.zzf = j10;
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
                    return new t4(null);
                }
                return new u4();
            }
            return i9.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
