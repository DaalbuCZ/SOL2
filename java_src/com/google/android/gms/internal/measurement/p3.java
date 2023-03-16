package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class p3 extends i9 implements pa {
    private static final p3 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        p3 p3Var = new p3();
        zza = p3Var;
        i9.v(p3.class, p3Var);
    }

    private p3() {
    }

    public static p3 F() {
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
                    return new l3(null);
                }
                return new p3();
            }
            return i9.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", n3.f4027a, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String G() {
        return this.zzg;
    }

    public final String H() {
        return this.zzi;
    }

    public final String I() {
        return this.zzh;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzd & 1) != 0;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final boolean M() {
        return (this.zzd & 2) != 0;
    }

    public final boolean N() {
        return (this.zzd & 16) != 0;
    }

    public final boolean O() {
        return (this.zzd & 8) != 0;
    }

    public final int P() {
        int a10 = o3.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
