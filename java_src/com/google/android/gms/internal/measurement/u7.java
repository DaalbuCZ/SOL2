package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i10, t7 t7Var) {
        int j10 = j(bArr, i10, t7Var);
        int i11 = t7Var.f4187a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - j10) {
                if (i11 == 0) {
                    t7Var.f4189c = h8.f3880o;
                    return j10;
                }
                t7Var.f4189c = h8.E(bArr, j10, i11);
                return j10 + i11;
            }
            throw r9.f();
        }
        throw r9.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(za zaVar, byte[] bArr, int i10, int i11, int i12, t7 t7Var) {
        Object e10 = zaVar.e();
        int n10 = n(e10, zaVar, bArr, i10, i11, i12, t7Var);
        zaVar.a(e10);
        t7Var.f4189c = e10;
        return n10;
    }

    static int d(za zaVar, byte[] bArr, int i10, int i11, t7 t7Var) {
        Object e10 = zaVar.e();
        int o10 = o(e10, zaVar, bArr, i10, i11, t7Var);
        zaVar.a(e10);
        t7Var.f4189c = e10;
        return o10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(za zaVar, int i10, byte[] bArr, int i11, int i12, o9 o9Var, t7 t7Var) {
        int d10 = d(zaVar, bArr, i11, i12, t7Var);
        while (true) {
            o9Var.add(t7Var.f4189c);
            if (d10 >= i12) {
                break;
            }
            int j10 = j(bArr, d10, t7Var);
            if (i10 != t7Var.f4187a) {
                break;
            }
            d10 = d(zaVar, bArr, j10, i12, t7Var);
        }
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(byte[] bArr, int i10, o9 o9Var, t7 t7Var) {
        j9 j9Var = (j9) o9Var;
        int j10 = j(bArr, i10, t7Var);
        int i11 = t7Var.f4187a + j10;
        while (j10 < i11) {
            j10 = j(bArr, j10, t7Var);
            j9Var.k(t7Var.f4187a);
        }
        if (j10 == i11) {
            return j10;
        }
        throw r9.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i10, t7 t7Var) {
        int j10 = j(bArr, i10, t7Var);
        int i11 = t7Var.f4187a;
        if (i11 >= 0) {
            if (i11 == 0) {
                t7Var.f4189c = "";
                return j10;
            }
            t7Var.f4189c = new String(bArr, j10, i11, p9.f4067b);
            return j10 + i11;
        }
        throw r9.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i10, t7 t7Var) {
        int j10 = j(bArr, i10, t7Var);
        int i11 = t7Var.f4187a;
        if (i11 >= 0) {
            if (i11 == 0) {
                t7Var.f4189c = "";
                return j10;
            }
            t7Var.f4189c = hc.d(bArr, j10, i11);
            return j10 + i11;
        }
        throw r9.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12, sb sbVar, t7 t7Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int m10 = m(bArr, i11, t7Var);
                sbVar.j(i10, Long.valueOf(t7Var.f4188b));
                return m10;
            } else if (i13 == 1) {
                sbVar.j(i10, Long.valueOf(p(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int j10 = j(bArr, i11, t7Var);
                int i14 = t7Var.f4187a;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - j10) {
                        sbVar.j(i10, i14 == 0 ? h8.f3880o : h8.E(bArr, j10, i14));
                        return j10 + i14;
                    }
                    throw r9.f();
                }
                throw r9.d();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    sbVar.j(i10, Integer.valueOf(b(bArr, i11)));
                    return i11 + 4;
                }
                throw r9.b();
            } else {
                int i15 = (i10 & (-8)) | 4;
                sb f10 = sb.f();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int j11 = j(bArr, i11, t7Var);
                    int i17 = t7Var.f4187a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = j11;
                        break;
                    }
                    int i18 = i(i16, bArr, j11, i12, f10, t7Var);
                    i16 = i17;
                    i11 = i18;
                }
                if (i11 > i12 || i16 != i15) {
                    throw r9.e();
                }
                sbVar.j(i10, f10);
                return i11;
            }
        }
        throw r9.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(byte[] bArr, int i10, t7 t7Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            t7Var.f4187a = b10;
            return i11;
        }
        return k(b10, bArr, i11, t7Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, byte[] bArr, int i11, t7 t7Var) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                t7Var.f4187a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            t7Var.f4187a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        t7Var.f4187a = i14 | i13;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i10, byte[] bArr, int i11, int i12, o9 o9Var, t7 t7Var) {
        j9 j9Var = (j9) o9Var;
        int j10 = j(bArr, i11, t7Var);
        while (true) {
            j9Var.k(t7Var.f4187a);
            if (j10 >= i12) {
                break;
            }
            int j11 = j(bArr, j10, t7Var);
            if (i10 != t7Var.f4187a) {
                break;
            }
            j10 = j(bArr, j11, t7Var);
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(byte[] bArr, int i10, t7 t7Var) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            t7Var.f4188b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        t7Var.f4188b = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(Object obj, za zaVar, byte[] bArr, int i10, int i11, int i12, t7 t7Var) {
        int J = ((ra) zaVar).J(obj, bArr, i10, i11, i12, t7Var);
        t7Var.f4189c = obj;
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(Object obj, za zaVar, byte[] bArr, int i10, int i11, t7 t7Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = k(i13, bArr, i12, t7Var);
            i13 = t7Var.f4187a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw r9.f();
        }
        int i15 = i13 + i14;
        zaVar.f(obj, bArr, i14, i15, t7Var);
        t7Var.f4189c = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long p(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
