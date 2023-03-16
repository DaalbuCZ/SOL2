package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class g5 extends i9 implements pa {
    private static final g5 zza;
    private int zzd;
    private int zze = 1;
    private o9 zzf = i9.p();

    static {
        g5 g5Var = new g5();
        zza = g5Var;
        i9.v(g5.class, g5Var);
    }

    private g5() {
    }

    public static e5 E() {
        return (e5) zza.z();
    }

    public static /* synthetic */ void G(g5 g5Var, u4 u4Var) {
        u4Var.getClass();
        o9 o9Var = g5Var.zzf;
        if (!o9Var.c()) {
            g5Var.zzf = i9.q(o9Var);
        }
        g5Var.zzf.add(u4Var);
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
                    return new e5(null);
                }
                return new g5();
            }
            return i9.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", f5.f3846a, "zzf", u4.class});
        }
        return (byte) 1;
    }
}
