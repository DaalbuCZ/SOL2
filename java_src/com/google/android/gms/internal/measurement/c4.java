package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class c4 extends i9 implements pa {
    private static final c4 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        c4 c4Var = new c4();
        zza = c4Var;
        i9.v(c4.class, c4Var);
    }

    private c4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H(c4 c4Var, String str) {
        str.getClass();
        c4Var.zzd |= 1;
        c4Var.zze = str;
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
                    return new b4(null);
                }
                return new c4();
            }
            return i9.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzh;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzd & 2) != 0;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final boolean M() {
        return (this.zzd & 8) != 0;
    }
}
