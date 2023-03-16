package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class i5 extends i9 implements pa {
    private static final i5 zza;
    private n9 zzd = i9.n();
    private n9 zze = i9.n();
    private o9 zzf = i9.p();
    private o9 zzg = i9.p();

    static {
        i5 i5Var = new i5();
        zza = i5Var;
        i9.v(i5.class, i5Var);
    }

    private i5() {
    }

    public static h5 J() {
        return (h5) zza.z();
    }

    public static i5 L() {
        return zza;
    }

    public static /* synthetic */ void R(i5 i5Var, Iterable iterable) {
        n9 n9Var = i5Var.zzd;
        if (!n9Var.c()) {
            i5Var.zzd = i9.o(n9Var);
        }
        q7.b(iterable, i5Var.zzd);
    }

    public static /* synthetic */ void T(i5 i5Var, Iterable iterable) {
        n9 n9Var = i5Var.zze;
        if (!n9Var.c()) {
            i5Var.zze = i9.o(n9Var);
        }
        q7.b(iterable, i5Var.zze);
    }

    public static /* synthetic */ void V(i5 i5Var, Iterable iterable) {
        i5Var.b0();
        q7.b(iterable, i5Var.zzf);
    }

    public static /* synthetic */ void X(i5 i5Var, int i10) {
        i5Var.b0();
        i5Var.zzf.remove(i10);
    }

    public static /* synthetic */ void Y(i5 i5Var, Iterable iterable) {
        i5Var.c0();
        q7.b(iterable, i5Var.zzg);
    }

    public static /* synthetic */ void a0(i5 i5Var, int i10) {
        i5Var.c0();
        i5Var.zzg.remove(i10);
    }

    private final void b0() {
        o9 o9Var = this.zzf;
        if (o9Var.c()) {
            return;
        }
        this.zzf = i9.q(o9Var);
    }

    private final void c0() {
        o9 o9Var = this.zzg;
        if (o9Var.c()) {
            return;
        }
        this.zzg = i9.q(o9Var);
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
                    return new h5(null);
                }
                return new i5();
            }
            return i9.s(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", q4.class, "zzg", k5.class});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzf.size();
    }

    public final int F() {
        return this.zze.size();
    }

    public final int G() {
        return this.zzg.size();
    }

    public final int H() {
        return this.zzd.size();
    }

    public final q4 I(int i10) {
        return (q4) this.zzf.get(i10);
    }

    public final k5 M(int i10) {
        return (k5) this.zzg.get(i10);
    }

    public final List N() {
        return this.zzf;
    }

    public final List O() {
        return this.zze;
    }

    public final List P() {
        return this.zzg;
    }

    public final List Q() {
        return this.zzd;
    }
}
