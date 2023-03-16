package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class t5 extends i9 implements pa {
    private static final t5 zza;
    private int zzd;
    private o9 zze = i9.p();
    private p5 zzf;

    static {
        t5 t5Var = new t5();
        zza = t5Var;
        i9.v(t5.class, t5Var);
    }

    private t5() {
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
                    return new s5(null);
                }
                return new t5();
            }
            return i9.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", y5.class, "zzf"});
        }
        return (byte) 1;
    }

    public final p5 E() {
        p5 p5Var = this.zzf;
        return p5Var == null ? p5.G() : p5Var;
    }

    public final List G() {
        return this.zze;
    }
}
