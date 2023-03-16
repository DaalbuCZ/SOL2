package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class e4 extends i9 implements pa {
    private static final e4 zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private o9 zzh = i9.p();
    private o9 zzi = i9.p();
    private o9 zzj = i9.p();
    private String zzk = "";
    private o9 zzm = i9.p();
    private o9 zzn = i9.p();
    private String zzo = "";

    static {
        e4 e4Var = new e4();
        zza = e4Var;
        i9.v(e4.class, e4Var);
    }

    private e4() {
    }

    public static d4 I() {
        return (d4) zza.z();
    }

    public static e4 K() {
        return zza;
    }

    public static /* synthetic */ void R(e4 e4Var, int i10, c4 c4Var) {
        c4Var.getClass();
        o9 o9Var = e4Var.zzi;
        if (!o9Var.c()) {
            e4Var.zzi = i9.q(o9Var);
        }
        e4Var.zzi.set(i10, c4Var);
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
                    return new d4(null);
                }
                return new e4();
            }
            return i9.s(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", i4.class, "zzi", c4.class, "zzj", g3.class, "zzk", "zzl", "zzm", t5.class, "zzn", a4.class, "zzo"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzm.size();
    }

    public final int F() {
        return this.zzi.size();
    }

    public final long G() {
        return this.zze;
    }

    public final c4 H(int i10) {
        return (c4) this.zzi.get(i10);
    }

    public final String L() {
        return this.zzf;
    }

    public final String M() {
        return this.zzo;
    }

    public final List N() {
        return this.zzj;
    }

    public final List O() {
        return this.zzn;
    }

    public final List P() {
        return this.zzm;
    }

    public final List Q() {
        return this.zzh;
    }

    public final boolean T() {
        return this.zzl;
    }

    public final boolean U() {
        return (this.zzd & 2) != 0;
    }

    public final boolean V() {
        return (this.zzd & 1) != 0;
    }
}
