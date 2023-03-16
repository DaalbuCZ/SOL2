package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class k5 extends i9 implements pa {
    private static final k5 zza;
    private int zzd;
    private int zze;
    private n9 zzf = i9.n();

    static {
        k5 k5Var = new k5();
        zza = k5Var;
        i9.v(k5.class, k5Var);
    }

    private k5() {
    }

    public static j5 H() {
        return (j5) zza.z();
    }

    public static /* synthetic */ void K(k5 k5Var, int i10) {
        k5Var.zzd |= 1;
        k5Var.zze = i10;
    }

    public static /* synthetic */ void L(k5 k5Var, Iterable iterable) {
        n9 n9Var = k5Var.zzf;
        if (!n9Var.c()) {
            k5Var.zzf = i9.o(n9Var);
        }
        q7.b(iterable, k5Var.zzf);
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
                    return new j5(null);
                }
                return new k5();
            }
            return i9.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzf.size();
    }

    public final int F() {
        return this.zze;
    }

    public final long G(int i10) {
        return this.zzf.a(i10);
    }

    public final List J() {
        return this.zzf;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }
}
