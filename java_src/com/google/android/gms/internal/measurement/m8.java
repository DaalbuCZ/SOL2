package com.google.android.gms.internal.measurement;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m8 extends p8 {

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f3977d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3978e;

    /* renamed from: f  reason: collision with root package name */
    private int f3979f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m8(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f3977d = bArr;
        this.f3979f = 0;
        this.f3978e = i11;
    }

    public final void E(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f3977d, this.f3979f, i11);
            this.f3979f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new n8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3979f), Integer.valueOf(this.f3978e), Integer.valueOf(i11)), e10);
        }
    }

    public final void F(String str) {
        int i10 = this.f3979f;
        try {
            int a10 = p8.a(str.length() * 3);
            int a11 = p8.a(str.length());
            if (a11 != a10) {
                u(hc.c(str));
                byte[] bArr = this.f3977d;
                int i11 = this.f3979f;
                this.f3979f = hc.b(str, bArr, i11, this.f3978e - i11);
                return;
            }
            int i12 = i10 + a11;
            this.f3979f = i12;
            int b10 = hc.b(str, this.f3977d, i12, this.f3978e - i12);
            this.f3979f = i10;
            u((b10 - i10) - a11);
            this.f3979f = b10;
        } catch (gc e10) {
            this.f3979f = i10;
            e(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new n8(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final int g() {
        return this.f3978e - this.f3979f;
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void h(byte b10) {
        try {
            byte[] bArr = this.f3977d;
            int i10 = this.f3979f;
            this.f3979f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new n8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3979f), Integer.valueOf(this.f3978e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void i(int i10, boolean z10) {
        u(i10 << 3);
        h(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void j(int i10, h8 h8Var) {
        u((i10 << 3) | 2);
        u(h8Var.h());
        h8Var.v(this);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void k(int i10, int i11) {
        u((i10 << 3) | 5);
        l(i11);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void l(int i10) {
        try {
            byte[] bArr = this.f3977d;
            int i11 = this.f3979f;
            int i12 = i11 + 1;
            this.f3979f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f3979f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f3979f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f3979f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new n8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3979f), Integer.valueOf(this.f3978e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void m(int i10, long j10) {
        u((i10 << 3) | 1);
        n(j10);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void n(long j10) {
        try {
            byte[] bArr = this.f3977d;
            int i10 = this.f3979f;
            int i11 = i10 + 1;
            this.f3979f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f3979f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f3979f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f3979f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f3979f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f3979f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f3979f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f3979f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new n8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3979f), Integer.valueOf(this.f3978e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void o(int i10, int i11) {
        u(i10 << 3);
        p(i11);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void p(int i10) {
        if (i10 >= 0) {
            u(i10);
        } else {
            w(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void q(byte[] bArr, int i10, int i11) {
        E(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void r(int i10, String str) {
        u((i10 << 3) | 2);
        F(str);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void s(int i10, int i11) {
        u((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void t(int i10, int i11) {
        u(i10 << 3);
        u(i11);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void u(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f3977d;
                int i11 = this.f3979f;
                this.f3979f = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new n8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3979f), Integer.valueOf(this.f3978e), 1), e10);
            }
        }
        byte[] bArr2 = this.f3977d;
        int i12 = this.f3979f;
        this.f3979f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void v(int i10, long j10) {
        u(i10 << 3);
        w(j10);
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final void w(long j10) {
        boolean z10;
        z10 = p8.f4064c;
        if (z10 && this.f3978e - this.f3979f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f3977d;
                int i10 = this.f3979f;
                this.f3979f = i10 + 1;
                bc.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f3977d;
            int i11 = this.f3979f;
            this.f3979f = i11 + 1;
            bc.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f3977d;
                int i12 = this.f3979f;
                this.f3979f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new n8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3979f), Integer.valueOf(this.f3978e), 1), e10);
            }
        }
        byte[] bArr4 = this.f3977d;
        int i13 = this.f3979f;
        this.f3979f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
