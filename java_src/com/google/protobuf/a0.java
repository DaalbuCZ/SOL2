package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f5906a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f5907b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f5908c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f5909d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.protobuf.i f5910e;

    /* loaded from: classes.dex */
    public interface a extends i<Boolean> {
    }

    /* loaded from: classes.dex */
    public interface b extends i<Double> {
    }

    /* loaded from: classes.dex */
    public interface c {
        int d();
    }

    /* loaded from: classes.dex */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i10);
    }

    /* loaded from: classes.dex */
    public interface f extends i<Float> {
    }

    /* loaded from: classes.dex */
    public interface g extends i<Integer> {
        @Override // com.google.protobuf.a0.i
        i<Integer> i(int i10);

        void r(int i10);

        int u(int i10);
    }

    /* loaded from: classes.dex */
    public interface h extends i<Long> {
    }

    /* loaded from: classes.dex */
    public interface i<E> extends List<E>, RandomAccess {
        boolean B();

        i<E> i(int i10);

        void m();
    }

    static {
        byte[] bArr = new byte[0];
        f5908c = bArr;
        f5909d = ByteBuffer.wrap(bArr);
        f5910e = com.google.protobuf.i.f(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return t1.m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, Object obj2) {
        return ((s0) obj).g().j((s0) obj2).o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f5906a);
    }
}
