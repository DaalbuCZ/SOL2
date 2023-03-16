package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class p5 extends i9 implements pa {
    private static final p5 zza;
    private o9 zzd = i9.p();

    static {
        p5 p5Var = new p5();
        zza = p5Var;
        i9.v(p5.class, p5Var);
    }

    private p5() {
    }

    public static p5 G() {
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
                    return new o5(null);
                }
                return new p5();
            }
            return i9.s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", r5.class});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzd.size();
    }

    public final List H() {
        return this.zzd;
    }
}
