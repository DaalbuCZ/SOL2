package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class r5 extends i9 implements pa {
    private static final r5 zza;
    private int zzd;
    private String zze = "";
    private o9 zzf = i9.p();

    static {
        r5 r5Var = new r5();
        zza = r5Var;
        i9.v(r5.class, r5Var);
    }

    private r5() {
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
                    return new q5(null);
                }
                return new r5();
            }
            return i9.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", y5.class});
        }
        return (byte) 1;
    }

    public final String F() {
        return this.zze;
    }

    public final List G() {
        return this.zzf;
    }
}
