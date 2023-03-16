package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class y4 extends i9 implements pa {
    private static final y4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private m4 zzg;

    static {
        y4 y4Var = new y4();
        zza = y4Var;
        i9.v(y4.class, y4Var);
    }

    private y4() {
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
                    return new x4(null);
                }
                return new y4();
            }
            return i9.s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
