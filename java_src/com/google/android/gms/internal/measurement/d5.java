package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class d5 extends i9 implements pa {
    public static final /* synthetic */ int zza = 0;
    private static final d5 zzd;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private g5 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private boolean zzab;
    private y4 zzac;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private o9 zzh = i9.p();
    private o9 zzi = i9.p();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private o9 zzG = i9.p();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private m9 zzT = i9.m();
    private String zzW = "";
    private String zzX = "";
    private String zzaa = "";
    private String zzad = "";
    private o9 zzae = i9.p();
    private String zzaf = "";

    static {
        d5 d5Var = new d5();
        zzd = d5Var;
        i9.v(d5.class, d5Var);
    }

    private d5() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void A0(d5 d5Var, long j10) {
        d5Var.zze |= 536870912;
        d5Var.zzM = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void F0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zzf |= 8192;
        d5Var.zzad = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void G0(d5 d5Var) {
        d5Var.zzf &= -8193;
        d5Var.zzad = zzd.zzad;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H0(d5 d5Var, Iterable iterable) {
        o9 o9Var = d5Var.zzae;
        if (!o9Var.c()) {
            d5Var.zzae = i9.q(o9Var);
        }
        q7.b(iterable, d5Var.zzae);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zzf |= 16384;
        d5Var.zzaf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K0(d5 d5Var, int i10) {
        d5Var.g1();
        d5Var.zzh.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L0(d5 d5Var, int i10, m5 m5Var) {
        m5Var.getClass();
        d5Var.h1();
        d5Var.zzi.set(i10, m5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M0(d5 d5Var, m5 m5Var) {
        m5Var.getClass();
        d5Var.h1();
        d5Var.zzi.add(m5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void N0(d5 d5Var, Iterable iterable) {
        d5Var.h1();
        q7.b(iterable, d5Var.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void O0(d5 d5Var, int i10) {
        d5Var.h1();
        d5Var.zzi.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P0(d5 d5Var, long j10) {
        d5Var.zze |= 2;
        d5Var.zzj = j10;
    }

    public static c5 P1() {
        return (c5) zzd.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q0(d5 d5Var, long j10) {
        d5Var.zze |= 4;
        d5Var.zzk = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void R0(d5 d5Var, long j10) {
        d5Var.zze |= 8;
        d5Var.zzl = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void S0(d5 d5Var, long j10) {
        d5Var.zze |= 16;
        d5Var.zzm = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T(d5 d5Var) {
        d5Var.zze &= Integer.MAX_VALUE;
        d5Var.zzO = zzd.zzO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T0(d5 d5Var) {
        d5Var.zze &= -17;
        d5Var.zzm = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U(d5 d5Var, int i10) {
        d5Var.zzf |= 2;
        d5Var.zzQ = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U0(d5 d5Var, long j10) {
        d5Var.zze |= 32;
        d5Var.zzn = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V(d5 d5Var, int i10, s4 s4Var) {
        s4Var.getClass();
        d5Var.g1();
        d5Var.zzh.set(i10, s4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V0(d5 d5Var) {
        d5Var.zze &= -33;
        d5Var.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W(d5 d5Var, String str) {
        str.getClass();
        d5Var.zzf |= 4;
        d5Var.zzR = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W0(d5 d5Var, String str) {
        d5Var.zze |= 64;
        d5Var.zzo = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void X(d5 d5Var, g5 g5Var) {
        g5Var.getClass();
        d5Var.zzS = g5Var;
        d5Var.zzf |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void X0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 128;
        d5Var.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Y(d5 d5Var, Iterable iterable) {
        m9 m9Var = d5Var.zzT;
        if (!m9Var.c()) {
            int size = m9Var.size();
            d5Var.zzT = m9Var.y(size == 0 ? 10 : size + size);
        }
        q7.b(iterable, d5Var.zzT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Y0(d5 d5Var) {
        d5Var.zze &= -129;
        d5Var.zzp = zzd.zzp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Z(d5 d5Var, s4 s4Var) {
        s4Var.getClass();
        d5Var.g1();
        d5Var.zzh.add(s4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Z0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 256;
        d5Var.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a0(d5 d5Var, long j10) {
        d5Var.zzf |= 16;
        d5Var.zzU = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a1(d5 d5Var) {
        d5Var.zze &= -257;
        d5Var.zzq = zzd.zzq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b0(d5 d5Var, long j10) {
        d5Var.zzf |= 32;
        d5Var.zzV = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b1(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 512;
        d5Var.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c0(d5 d5Var, String str) {
        d5Var.zzf |= 128;
        d5Var.zzX = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c1(d5 d5Var, int i10) {
        d5Var.zze |= 1024;
        d5Var.zzs = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d0(d5 d5Var, Iterable iterable) {
        d5Var.g1();
        q7.b(iterable, d5Var.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d1(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 2048;
        d5Var.zzt = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e1(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 4096;
        d5Var.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 8192;
        d5Var.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g0(d5 d5Var, long j10) {
        d5Var.zze |= 16384;
        d5Var.zzw = j10;
    }

    private final void g1() {
        o9 o9Var = this.zzh;
        if (o9Var.c()) {
            return;
        }
        this.zzh = i9.q(o9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h0(d5 d5Var, long j10) {
        d5Var.zze |= 32768;
        d5Var.zzx = 74029L;
    }

    private final void h1() {
        o9 o9Var = this.zzi;
        if (o9Var.c()) {
            return;
        }
        this.zzi = i9.q(o9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 65536;
        d5Var.zzy = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void j0(d5 d5Var) {
        d5Var.zze &= -65537;
        d5Var.zzy = zzd.zzy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void k0(d5 d5Var, boolean z10) {
        d5Var.zze |= 131072;
        d5Var.zzz = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void l0(d5 d5Var) {
        d5Var.zze &= -131073;
        d5Var.zzz = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void m0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 262144;
        d5Var.zzA = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void n0(d5 d5Var) {
        d5Var.zze &= -262145;
        d5Var.zzA = zzd.zzA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void o0(d5 d5Var, long j10) {
        d5Var.zze |= 524288;
        d5Var.zzB = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p0(d5 d5Var, int i10) {
        d5Var.zze |= 1048576;
        d5Var.zzC = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void q0(d5 d5Var, String str) {
        d5Var.zze |= 2097152;
        d5Var.zzD = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void r0(d5 d5Var) {
        d5Var.zze &= -2097153;
        d5Var.zzD = zzd.zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void s0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 4194304;
        d5Var.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void t0(d5 d5Var, boolean z10) {
        d5Var.zze |= 8388608;
        d5Var.zzF = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void u0(d5 d5Var, Iterable iterable) {
        o9 o9Var = d5Var.zzG;
        if (!o9Var.c()) {
            d5Var.zzG = i9.q(o9Var);
        }
        q7.b(iterable, d5Var.zzG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void w0(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 16777216;
        d5Var.zzH = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void x0(d5 d5Var, int i10) {
        d5Var.zze |= 33554432;
        d5Var.zzI = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void y0(d5 d5Var, int i10) {
        d5Var.zze |= 1;
        d5Var.zzg = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void z0(d5 d5Var) {
        d5Var.zze &= -268435457;
        d5Var.zzL = zzd.zzL;
    }

    public final int A1() {
        return this.zzg;
    }

    public final boolean B0() {
        return this.zzz;
    }

    public final int B1() {
        return this.zzQ;
    }

    public final boolean C0() {
        return this.zzF;
    }

    public final int C1() {
        return this.zzs;
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
                        return zzd;
                    }
                    return new c5(null);
                }
                return new d5();
            }
            return i9.s(zzd, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zze", "zzf", "zzg", "zzh", s4.class, "zzi", m5.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", o4.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", k4.f3949a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf"});
        }
        return (byte) 1;
    }

    public final boolean D0() {
        return (this.zze & 33554432) != 0;
    }

    public final int D1() {
        return this.zzi.size();
    }

    public final String E() {
        return this.zzv;
    }

    public final boolean E0() {
        return (this.zze & 1048576) != 0;
    }

    public final long E1() {
        return this.zzM;
    }

    public final String F() {
        return this.zzX;
    }

    public final long F1() {
        return this.zzB;
    }

    public final String G() {
        return this.zzq;
    }

    public final long G1() {
        return this.zzU;
    }

    public final String H() {
        return this.zzO;
    }

    public final long H1() {
        return this.zzl;
    }

    public final String I() {
        return this.zzH;
    }

    public final long I1() {
        return this.zzw;
    }

    public final String J() {
        return this.zzE;
    }

    public final long J1() {
        return this.zzn;
    }

    public final String K() {
        return this.zzD;
    }

    public final long K1() {
        return this.zzm;
    }

    public final String L() {
        return this.zzp;
    }

    public final long L1() {
        return this.zzk;
    }

    public final String M() {
        return this.zzo;
    }

    public final long M1() {
        return this.zzj;
    }

    public final String N() {
        return this.zzy;
    }

    public final long N1() {
        return this.zzx;
    }

    public final String O() {
        return this.zzad;
    }

    public final s4 O1(int i10) {
        return (s4) this.zzh.get(i10);
    }

    public final String P() {
        return this.zzr;
    }

    public final List Q() {
        return this.zzG;
    }

    public final List R() {
        return this.zzh;
    }

    public final m5 R1(int i10) {
        return (m5) this.zzi.get(i10);
    }

    public final List S() {
        return this.zzi;
    }

    public final String S1() {
        return this.zzR;
    }

    public final String T1() {
        return this.zzu;
    }

    public final String U1() {
        return this.zzA;
    }

    public final String V1() {
        return this.zzt;
    }

    public final int e0() {
        return this.zzI;
    }

    public final int f1() {
        return this.zzC;
    }

    public final boolean i1() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 128) != 0;
    }

    public final boolean k1() {
        return (this.zze & 524288) != 0;
    }

    public final boolean l1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean m1() {
        return (this.zze & 8) != 0;
    }

    public final boolean n1() {
        return (this.zze & 16384) != 0;
    }

    public final boolean o1() {
        return (this.zze & 131072) != 0;
    }

    public final boolean p1() {
        return (this.zze & 32) != 0;
    }

    public final boolean q1() {
        return (this.zze & 16) != 0;
    }

    public final boolean r1() {
        return (this.zze & 1) != 0;
    }

    public final boolean s1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean t1() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean u1() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean v1() {
        return (this.zze & 4) != 0;
    }

    public final boolean w1() {
        return (this.zze & 1024) != 0;
    }

    public final boolean x1() {
        return (this.zze & 2) != 0;
    }

    public final boolean y1() {
        return (this.zze & 32768) != 0;
    }

    public final int z1() {
        return this.zzh.size();
    }
}
