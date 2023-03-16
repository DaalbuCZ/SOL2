package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class w3 extends i9 implements pa {
    private static final w3 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private o9 zzh = i9.p();

    static {
        w3 w3Var = new w3();
        zza = w3Var;
        i9.v(w3.class, w3Var);
    }

    private w3() {
    }

    public static w3 G() {
        return zza;
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
                    return new s3(null);
                }
                return new w3();
            }
            return i9.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", u3.f4233a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzh.size();
    }

    public final String H() {
        return this.zzf;
    }

    public final List I() {
        return this.zzh;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzd & 4) != 0;
    }

    public final boolean L() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }

    public final int N() {
        int a10 = v3.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
