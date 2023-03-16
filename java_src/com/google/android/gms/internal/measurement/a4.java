package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class a4 extends i9 implements pa {
    private static final a4 zza;
    private int zzd;
    private String zze = "";
    private o9 zzf = i9.p();
    private boolean zzg;

    static {
        a4 a4Var = new a4();
        zza = a4Var;
        i9.v(a4.class, a4Var);
    }

    private a4() {
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
                    return new z3(null);
                }
                return new a4();
            }
            return i9.s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", g4.class, "zzg"});
        }
        return (byte) 1;
    }

    public final String F() {
        return this.zze;
    }
}
