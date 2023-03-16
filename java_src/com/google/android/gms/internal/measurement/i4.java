package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class i4 extends i9 implements pa {
    private static final i4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        i4 i4Var = new i4();
        zza = i4Var;
        i9.v(i4.class, i4Var);
    }

    private i4() {
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
                    return new h4(null);
                }
                return new i4();
            }
            return i9.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String F() {
        return this.zze;
    }

    public final String G() {
        return this.zzf;
    }
}
