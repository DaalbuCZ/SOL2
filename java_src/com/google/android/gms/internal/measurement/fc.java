package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class fc extends ec {
    @Override // com.google.android.gms.internal.measurement.ec
    final int a(int i10, byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i13 < i12) {
                        if (b10 >= -62) {
                            i11 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b10;
                } else if (b10 >= -16) {
                    if (i13 >= i12 - 2) {
                        return hc.a(bArr, i13, i12);
                    }
                    int i14 = i13 + 1;
                    byte b11 = bArr[i13];
                    if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                        int i15 = i14 + 1;
                        if (bArr[i14] <= -65) {
                            i13 = i15 + 1;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                    return -1;
                } else if (i13 >= i12 - 1) {
                    return hc.a(bArr, i13, i12);
                } else {
                    int i16 = i13 + 1;
                    byte b12 = bArr[i13];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i11 = i16 + 1;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
            }
            i11 = i13;
        }
        return 0;
    }
}
