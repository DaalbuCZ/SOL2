package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class i3 extends i9 implements pa {
    private static final i3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private o9 zzg = i9.p();
    private boolean zzh;
    private p3 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        i3 i3Var = new i3();
        zza = i3Var;
        i9.v(i3.class, i3Var);
    }

    private i3() {
    }

    public static h3 G() {
        return (h3) zza.z();
    }

    public static /* synthetic */ void M(i3 i3Var, String str) {
        i3Var.zzd |= 2;
        i3Var.zzf = str;
    }

    public static /* synthetic */ void N(i3 i3Var, int i10, k3 k3Var) {
        k3Var.getClass();
        o9 o9Var = i3Var.zzg;
        if (!o9Var.c()) {
            i3Var.zzg = i9.q(o9Var);
        }
        i3Var.zzg.set(i10, k3Var);
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
                    return new h3(null);
                }
                return new i3();
            }
            return i9.s(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", k3.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzg.size();
    }

    public final int F() {
        return this.zze;
    }

    public final k3 I(int i10) {
        return (k3) this.zzg.get(i10);
    }

    public final p3 J() {
        p3 p3Var = this.zzi;
        return p3Var == null ? p3.F() : p3Var;
    }

    public final String K() {
        return this.zzf;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean P() {
        return this.zzk;
    }

    public final boolean Q() {
        return this.zzl;
    }

    public final boolean R() {
        return (this.zzd & 8) != 0;
    }

    public final boolean S() {
        return (this.zzd & 1) != 0;
    }

    public final boolean T() {
        return (this.zzd & 64) != 0;
    }
}
