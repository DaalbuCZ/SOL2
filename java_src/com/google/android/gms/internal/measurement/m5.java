package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class m5 extends i9 implements pa {
    private static final m5 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        m5 m5Var = new m5();
        zza = m5Var;
        i9.v(m5.class, m5Var);
    }

    private m5() {
    }

    public static l5 H() {
        return (l5) zza.z();
    }

    public static /* synthetic */ void L(m5 m5Var, long j10) {
        m5Var.zzd |= 1;
        m5Var.zze = j10;
    }

    public static /* synthetic */ void M(m5 m5Var, String str) {
        str.getClass();
        m5Var.zzd |= 2;
        m5Var.zzf = str;
    }

    public static /* synthetic */ void N(m5 m5Var, String str) {
        str.getClass();
        m5Var.zzd |= 4;
        m5Var.zzg = str;
    }

    public static /* synthetic */ void O(m5 m5Var) {
        m5Var.zzd &= -5;
        m5Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void P(m5 m5Var, long j10) {
        m5Var.zzd |= 8;
        m5Var.zzh = j10;
    }

    public static /* synthetic */ void Q(m5 m5Var) {
        m5Var.zzd &= -9;
        m5Var.zzh = 0L;
    }

    public static /* synthetic */ void R(m5 m5Var, double d10) {
        m5Var.zzd |= 32;
        m5Var.zzj = d10;
    }

    public static /* synthetic */ void S(m5 m5Var) {
        m5Var.zzd &= -33;
        m5Var.zzj = 0.0d;
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
                    return new l5(null);
                }
                return new m5();
            }
            return i9.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double E() {
        return this.zzj;
    }

    public final long F() {
        return this.zzh;
    }

    public final long G() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }

    public final String K() {
        return this.zzg;
    }

    public final boolean T() {
        return (this.zzd & 32) != 0;
    }

    public final boolean U() {
        return (this.zzd & 8) != 0;
    }

    public final boolean V() {
        return (this.zzd & 1) != 0;
    }

    public final boolean W() {
        return (this.zzd & 4) != 0;
    }
}
