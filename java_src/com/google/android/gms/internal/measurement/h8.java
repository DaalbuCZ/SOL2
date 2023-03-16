package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class h8 implements Iterable, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final h8 f3880o = new e8(p9.f4069d);

    /* renamed from: p  reason: collision with root package name */
    private static final Comparator f3881p;

    /* renamed from: q  reason: collision with root package name */
    private static final g8 f3882q;

    /* renamed from: n  reason: collision with root package name */
    private int f3883n = 0;

    static {
        int i10 = s7.f4151a;
        f3882q = new g8(null);
        f3881p = new y7();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }

    public static h8 E(byte[] bArr, int i10, int i11) {
        C(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new e8(bArr2);
    }

    public static h8 F(String str) {
        return new e8(str.getBytes(p9.f4067b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int D() {
        return this.f3883n;
    }

    public final String G(Charset charset) {
        return h() == 0 ? "" : s(charset);
    }

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte g(int i10);

    public abstract int h();

    public final int hashCode() {
        int i10 = this.f3883n;
        if (i10 == 0) {
            int h10 = h();
            i10 = k(h10, 0, h10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f3883n = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new x7(this);
    }

    protected abstract int k(int i10, int i11, int i12);

    public abstract h8 l(int i10, int i11);

    protected abstract String s(Charset charset);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? pb.a(this) : pb.a(l(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void v(w7 w7Var);

    public abstract boolean x();
}
