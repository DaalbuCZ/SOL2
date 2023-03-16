package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e8 extends d8 {

    /* renamed from: r  reason: collision with root package name */
    protected final byte[] f3822r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e8(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f3822r = bArr;
    }

    protected int H() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.h8
    public byte d(int i10) {
        return this.f3822r[i10];
    }

    @Override // com.google.android.gms.internal.measurement.h8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h8) && h() == ((h8) obj).h()) {
            if (h() == 0) {
                return true;
            }
            if (obj instanceof e8) {
                e8 e8Var = (e8) obj;
                int D = D();
                int D2 = e8Var.D();
                if (D == 0 || D2 == 0 || D == D2) {
                    int h10 = h();
                    if (h10 > e8Var.h()) {
                        throw new IllegalArgumentException("Length too large: " + h10 + h());
                    } else if (h10 > e8Var.h()) {
                        throw new IllegalArgumentException("Ran off end of other: 0, " + h10 + ", " + e8Var.h());
                    } else {
                        byte[] bArr = this.f3822r;
                        byte[] bArr2 = e8Var.f3822r;
                        e8Var.H();
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < h10) {
                            if (bArr[i10] != bArr2[i11]) {
                                return false;
                            }
                            i10++;
                            i11++;
                        }
                        return true;
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h8
    public byte g(int i10) {
        return this.f3822r[i10];
    }

    @Override // com.google.android.gms.internal.measurement.h8
    public int h() {
        return this.f3822r.length;
    }

    @Override // com.google.android.gms.internal.measurement.h8
    protected final int k(int i10, int i11, int i12) {
        return p9.d(i10, this.f3822r, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.h8
    public final h8 l(int i10, int i11) {
        int C = h8.C(0, i11, h());
        return C == 0 ? h8.f3880o : new a8(this.f3822r, 0, C);
    }

    @Override // com.google.android.gms.internal.measurement.h8
    protected final String s(Charset charset) {
        return new String(this.f3822r, 0, h(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h8
    public final void v(w7 w7Var) {
        ((m8) w7Var).E(this.f3822r, 0, h());
    }

    @Override // com.google.android.gms.internal.measurement.h8
    public final boolean x() {
        return hc.f(this.f3822r, 0, h());
    }
}
