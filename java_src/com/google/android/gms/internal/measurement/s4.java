package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class s4 extends i9 implements pa {
    private static final s4 zza;
    private int zzd;
    private o9 zze = i9.p();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        s4 s4Var = new s4();
        zza = s4Var;
        i9.v(s4.class, s4Var);
    }

    private s4() {
    }

    public static r4 I() {
        return (r4) zza.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void N(s4 s4Var, int i10, w4 w4Var) {
        w4Var.getClass();
        s4Var.Y();
        s4Var.zze.set(i10, w4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void O(s4 s4Var, w4 w4Var) {
        w4Var.getClass();
        s4Var.Y();
        s4Var.zze.add(w4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P(s4 s4Var, Iterable iterable) {
        s4Var.Y();
        q7.b(iterable, s4Var.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void R(s4 s4Var, int i10) {
        s4Var.Y();
        s4Var.zze.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void S(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzd |= 1;
        s4Var.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T(s4 s4Var, long j10) {
        s4Var.zzd |= 2;
        s4Var.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U(s4 s4Var, long j10) {
        s4Var.zzd |= 4;
        s4Var.zzh = j10;
    }

    private final void Y() {
        o9 o9Var = this.zze;
        if (o9Var.c()) {
            return;
        }
        this.zze = i9.q(o9Var);
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
                    return new r4(null);
                }
                return new s4();
            }
            return i9.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", w4.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int E() {
        return this.zzi;
    }

    public final int F() {
        return this.zze.size();
    }

    public final long G() {
        return this.zzh;
    }

    public final long H() {
        return this.zzg;
    }

    public final w4 K(int i10) {
        return (w4) this.zze.get(i10);
    }

    public final String L() {
        return this.zzf;
    }

    public final List M() {
        return this.zze;
    }

    public final boolean V() {
        return (this.zzd & 8) != 0;
    }

    public final boolean W() {
        return (this.zzd & 4) != 0;
    }

    public final boolean X() {
        return (this.zzd & 2) != 0;
    }
}
