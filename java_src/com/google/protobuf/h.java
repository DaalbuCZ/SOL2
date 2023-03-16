package com.google.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final h f5966o = new j(a0.f5908c);

    /* renamed from: p  reason: collision with root package name */
    private static final f f5967p;

    /* renamed from: q  reason: collision with root package name */
    private static final Comparator<h> f5968q;

    /* renamed from: n  reason: collision with root package name */
    private int f5969n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: n  reason: collision with root package name */
        private int f5970n = 0;

        /* renamed from: o  reason: collision with root package name */
        private final int f5971o;

        a() {
            this.f5971o = h.this.size();
        }

        @Override // com.google.protobuf.h.g
        public byte e() {
            int i10 = this.f5970n;
            if (i10 < this.f5971o) {
                this.f5970n = i10 + 1;
                return h.this.x(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f5970n < this.f5971o;
        }
    }

    /* loaded from: classes.dex */
    static class b implements Comparator<h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            g it = hVar.iterator();
            g it2 = hVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(h.K(it.e()), h.K(it2.e()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    /* loaded from: classes.dex */
    static abstract class c implements g, Iterator {
        c() {
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(e());
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Byte> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e extends j {

        /* renamed from: s  reason: collision with root package name */
        private final int f5973s;

        /* renamed from: t  reason: collision with root package name */
        private final int f5974t;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.k(i10, i10 + i11, bArr.length);
            this.f5973s = i10;
            this.f5974t = i11;
        }

        @Override // com.google.protobuf.h.j
        protected int T() {
            return this.f5973s;
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        public byte g(int i10) {
            h.h(i10, size());
            return this.f5977r[this.f5973s + i10];
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        public int size() {
            return this.f5974t;
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        protected void v(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f5977r, T() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        byte x(int i10) {
            return this.f5977r[this.f5973s + i10];
        }
    }

    /* loaded from: classes.dex */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface g extends java.util.Iterator<Byte> {
        byte e();
    }

    /* renamed from: com.google.protobuf.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0085h {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.protobuf.k f5975a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f5976b;

        private C0085h(int i10) {
            byte[] bArr = new byte[i10];
            this.f5976b = bArr;
            this.f5975a = com.google.protobuf.k.d0(bArr);
        }

        /* synthetic */ C0085h(int i10, a aVar) {
            this(i10);
        }

        public h a() {
            this.f5975a.c();
            return new j(this.f5976b);
        }

        public com.google.protobuf.k b() {
            return this.f5975a;
        }
    }

    /* loaded from: classes.dex */
    static abstract class i extends h {
        i() {
        }

        @Override // com.google.protobuf.h, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: r  reason: collision with root package name */
        protected final byte[] f5977r;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f5977r = bArr;
        }

        @Override // com.google.protobuf.h
        public final boolean C() {
            int T = T();
            return t1.n(this.f5977r, T, size() + T);
        }

        @Override // com.google.protobuf.h
        public final com.google.protobuf.i F() {
            return com.google.protobuf.i.h(this.f5977r, T(), size(), true);
        }

        @Override // com.google.protobuf.h
        protected final int G(int i10, int i11, int i12) {
            return a0.i(i10, this.f5977r, T() + i11, i12);
        }

        @Override // com.google.protobuf.h
        public final h I(int i10, int i11) {
            int k10 = h.k(i10, i11, size());
            return k10 == 0 ? h.f5966o : new e(this.f5977r, T() + i10, k10);
        }

        @Override // com.google.protobuf.h
        protected final String M(Charset charset) {
            return new String(this.f5977r, T(), size(), charset);
        }

        @Override // com.google.protobuf.h
        final void R(com.google.protobuf.g gVar) {
            gVar.a(this.f5977r, T(), size());
        }

        final boolean S(h hVar, int i10, int i11) {
            if (i11 > hVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > hVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
            } else if (hVar instanceof j) {
                j jVar = (j) hVar;
                byte[] bArr = this.f5977r;
                byte[] bArr2 = jVar.f5977r;
                int T = T() + i11;
                int T2 = T();
                int T3 = jVar.T() + i10;
                while (T2 < T) {
                    if (bArr[T2] != bArr2[T3]) {
                        return false;
                    }
                    T2++;
                    T3++;
                }
                return true;
            } else {
                return hVar.I(i10, i12).equals(I(0, i11));
            }
        }

        protected int T() {
            return 0;
        }

        @Override // com.google.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof h) && size() == ((h) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    int H = H();
                    int H2 = jVar.H();
                    if (H == 0 || H2 == 0 || H == H2) {
                        return S(jVar, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.google.protobuf.h
        public byte g(int i10) {
            return this.f5977r[i10];
        }

        @Override // com.google.protobuf.h
        public int size() {
            return this.f5977r.length;
        }

        @Override // com.google.protobuf.h
        protected void v(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f5977r, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.h
        byte x(int i10) {
            return this.f5977r[i10];
        }
    }

    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f5967p = com.google.protobuf.d.c() ? new k(null) : new d(null);
        f5968q = new b();
    }

    h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0085h E(int i10) {
        return new C0085h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(byte b10) {
        return b10 & 255;
    }

    private String O() {
        if (size() <= 50) {
            return m1.a(this);
        }
        return m1.a(I(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h P(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h Q(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void h(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int k(int i10, int i11, int i12) {
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

    public static h l(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        return new j(f5967p.a(bArr, i10, i11));
    }

    public static h s(String str) {
        return new j(str.getBytes(a0.f5906a));
    }

    public abstract boolean C();

    @Override // java.lang.Iterable
    /* renamed from: D */
    public g iterator() {
        return new a();
    }

    public abstract com.google.protobuf.i F();

    protected abstract int G(int i10, int i11, int i12);

    protected final int H() {
        return this.f5969n;
    }

    public abstract h I(int i10, int i11);

    public final byte[] J() {
        int size = size();
        if (size == 0) {
            return a0.f5908c;
        }
        byte[] bArr = new byte[size];
        v(bArr, 0, 0, size);
        return bArr;
    }

    public final String L(Charset charset) {
        return size() == 0 ? "" : M(charset);
    }

    protected abstract String M(Charset charset);

    public final String N() {
        return L(a0.f5906a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void R(com.google.protobuf.g gVar);

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public final int hashCode() {
        int i10 = this.f5969n;
        if (i10 == 0) {
            int size = size();
            i10 = G(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f5969n = i10;
        }
        return i10;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), O());
    }

    protected abstract void v(byte[] bArr, int i10, int i11, int i12);

    abstract byte x(int i10);
}
