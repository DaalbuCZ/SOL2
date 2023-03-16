package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class b5 extends i9 implements pa {
    private static final b5 zza;
    private o9 zzd = i9.p();

    static {
        b5 b5Var = new b5();
        zza = b5Var;
        i9.v(b5.class, b5Var);
    }

    private b5() {
    }

    public static a5 E() {
        return (a5) zza.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(b5 b5Var, d5 d5Var) {
        d5Var.getClass();
        o9 o9Var = b5Var.zzd;
        if (!o9Var.c()) {
            b5Var.zzd = i9.q(o9Var);
        }
        b5Var.zzd.add(d5Var);
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
                    return new a5(null);
                }
                return new b5();
            }
            return i9.s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", d5.class});
        }
        return (byte) 1;
    }

    public final d5 G(int i10) {
        return (d5) this.zzd.get(0);
    }

    public final List H() {
        return this.zzd;
    }
}
