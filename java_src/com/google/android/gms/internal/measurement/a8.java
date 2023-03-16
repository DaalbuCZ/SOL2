package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class a8 extends e8 {

    /* renamed from: s  reason: collision with root package name */
    private final int f3679s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a8(byte[] bArr, int i10, int i11) {
        super(bArr);
        h8.C(0, i11, bArr.length);
        this.f3679s = i11;
    }

    @Override // com.google.android.gms.internal.measurement.e8
    protected final int H() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.e8, com.google.android.gms.internal.measurement.h8
    public final byte d(int i10) {
        int i11 = this.f3679s;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
        return this.f3822r[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.e8, com.google.android.gms.internal.measurement.h8
    public final byte g(int i10) {
        return this.f3822r[i10];
    }

    @Override // com.google.android.gms.internal.measurement.e8, com.google.android.gms.internal.measurement.h8
    public final int h() {
        return this.f3679s;
    }
}
