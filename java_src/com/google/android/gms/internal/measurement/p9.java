package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public final class p9 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f4066a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f4067b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    static final Charset f4068c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f4069d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f4070e;

    /* renamed from: f  reason: collision with root package name */
    public static final l8 f4071f;

    static {
        byte[] bArr = new byte[0];
        f4069d = bArr;
        f4070e = ByteBuffer.wrap(bArr);
        int i10 = l8.f3961a;
        j8 j8Var = new j8(bArr, 0, 0, false, null);
        try {
            j8Var.c(0);
            f4071f = j8Var;
        } catch (r9 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d10 = d(length, bArr, 0, length);
        if (d10 == 0) {
            return 1;
        }
        return d10;
    }

    public static int c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static String g(byte[] bArr) {
        return new String(bArr, f4067b);
    }

    public static boolean h(byte[] bArr) {
        return hc.e(bArr);
    }
}
