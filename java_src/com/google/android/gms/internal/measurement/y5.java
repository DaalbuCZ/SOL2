package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class y5 extends i9 implements pa {
    private static final y5 zza;
    private int zzd;
    private int zze;
    private o9 zzf = i9.p();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        y5 y5Var = new y5();
        zza = y5Var;
        i9.v(y5.class, y5Var);
    }

    private y5() {
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
                    return new u5(null);
                }
                return new y5();
            }
            return i9.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", w5.f4271a, "zzf", y5.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double E() {
        return this.zzj;
    }

    public final String G() {
        return this.zzg;
    }

    public final String H() {
        return this.zzh;
    }

    public final List I() {
        return this.zzf;
    }

    public final boolean J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zzd & 8) != 0;
    }

    public final boolean L() {
        return (this.zzd & 16) != 0;
    }

    public final boolean M() {
        return (this.zzd & 4) != 0;
    }

    public final int N() {
        int a10 = x5.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
