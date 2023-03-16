package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class g3 extends i9 implements pa {
    private static final g3 zza;
    private int zzd;
    private int zze;
    private o9 zzf = i9.p();
    private o9 zzg = i9.p();
    private boolean zzh;
    private boolean zzi;

    static {
        g3 g3Var = new g3();
        zza = g3Var;
        i9.v(g3.class, g3Var);
    }

    private g3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M(g3 g3Var, int i10, r3 r3Var) {
        r3Var.getClass();
        o9 o9Var = g3Var.zzf;
        if (!o9Var.c()) {
            g3Var.zzf = i9.q(o9Var);
        }
        g3Var.zzf.set(i10, r3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void N(g3 g3Var, int i10, i3 i3Var) {
        i3Var.getClass();
        o9 o9Var = g3Var.zzg;
        if (!o9Var.c()) {
            g3Var.zzg = i9.q(o9Var);
        }
        g3Var.zzg.set(i10, i3Var);
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
                    return new f3(null);
                }
                return new g3();
            }
            return i9.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", r3.class, "zzg", i3.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zze;
    }

    public final int F() {
        return this.zzg.size();
    }

    public final int G() {
        return this.zzf.size();
    }

    public final i3 I(int i10) {
        return (i3) this.zzg.get(i10);
    }

    public final r3 J(int i10) {
        return (r3) this.zzf.get(i10);
    }

    public final List K() {
        return this.zzg;
    }

    public final List L() {
        return this.zzf;
    }

    public final boolean O() {
        return (this.zzd & 1) != 0;
    }
}
