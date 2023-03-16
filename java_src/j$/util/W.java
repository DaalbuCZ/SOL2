package j$.util;

import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class W {

    /* renamed from: a  reason: collision with root package name */
    private static final H f9632a = new S();

    /* renamed from: b  reason: collision with root package name */
    private static final B f9633b = new P();

    /* renamed from: c  reason: collision with root package name */
    private static final D f9634c = new Q();

    /* renamed from: d  reason: collision with root package name */
    private static final z f9635d = new O();

    private static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }

    public static z b() {
        return f9635d;
    }

    public static B c() {
        return f9633b;
    }

    public static D d() {
        return f9634c;
    }

    public static H e() {
        return f9632a;
    }

    public static InterfaceC0272q f(z zVar) {
        Objects.requireNonNull(zVar);
        return new L(zVar);
    }

    public static InterfaceC0392t g(B b10) {
        Objects.requireNonNull(b10);
        return new J(b10);
    }

    public static InterfaceC0395w h(D d10) {
        Objects.requireNonNull(d10);
        return new K(d10);
    }

    public static java.util.Iterator i(H h10) {
        Objects.requireNonNull(h10);
        return new I(h10);
    }

    public static z j(double[] dArr, int i10, int i11, int i12) {
        Objects.requireNonNull(dArr);
        a(dArr.length, i10, i11);
        return new N(dArr, i10, i11, i12);
    }

    public static B k(int[] iArr, int i10, int i11, int i12) {
        Objects.requireNonNull(iArr);
        a(iArr.length, i10, i11);
        return new T(iArr, i10, i11, i12);
    }

    public static D l(long[] jArr, int i10, int i11, int i12) {
        Objects.requireNonNull(jArr);
        a(jArr.length, i10, i11);
        return new V(jArr, i10, i11, i12);
    }

    public static H m(Object[] objArr, int i10, int i11, int i12) {
        Objects.requireNonNull(objArr);
        a(objArr.length, i10, i11);
        return new M(objArr, i10, i11, i12);
    }
}
