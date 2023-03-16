package b2;

import b2.e;
import java.util.Collections;
import p3.a0;
import s1.m1;
import u1.a;
import x1.e0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f2728e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f2729b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2730c;

    /* renamed from: d  reason: collision with root package name */
    private int f2731d;

    public a(e0 e0Var) {
        super(e0Var);
    }

    @Override // b2.e
    protected boolean b(a0 a0Var) {
        m1.b f02;
        if (this.f2729b) {
            a0Var.P(1);
        } else {
            int C = a0Var.C();
            int i10 = (C >> 4) & 15;
            this.f2731d = i10;
            if (i10 == 2) {
                f02 = new m1.b().e0("audio/mpeg").H(1).f0(f2728e[(C >> 2) & 3]);
            } else if (i10 == 7 || i10 == 8) {
                f02 = new m1.b().e0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000);
            } else {
                if (i10 != 10) {
                    throw new e.a("Audio format not supported: " + this.f2731d);
                }
                this.f2729b = true;
            }
            this.f2753a.e(f02.E());
            this.f2730c = true;
            this.f2729b = true;
        }
        return true;
    }

    @Override // b2.e
    protected boolean c(a0 a0Var, long j10) {
        if (this.f2731d == 2) {
            int a10 = a0Var.a();
            this.f2753a.d(a0Var, a10);
            this.f2753a.c(j10, 1, a10, 0, null);
            return true;
        }
        int C = a0Var.C();
        if (C != 0 || this.f2730c) {
            if (this.f2731d != 10 || C == 1) {
                int a11 = a0Var.a();
                this.f2753a.d(a0Var, a11);
                this.f2753a.c(j10, 1, a11, 0, null);
                return true;
            }
            return false;
        }
        int a12 = a0Var.a();
        byte[] bArr = new byte[a12];
        a0Var.j(bArr, 0, a12);
        a.b f10 = u1.a.f(bArr);
        this.f2753a.e(new m1.b().e0("audio/mp4a-latm").I(f10.f14865c).H(f10.f14864b).f0(f10.f14863a).T(Collections.singletonList(bArr)).E());
        this.f2730c = true;
        return false;
    }
}
