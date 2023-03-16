package h7;

import f7.s;
import i7.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    private static final class a extends Writer {

        /* renamed from: n  reason: collision with root package name */
        private final Appendable f8156n;

        /* renamed from: o  reason: collision with root package name */
        private final C0122a f8157o = new C0122a();

        /* renamed from: h7.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0122a implements CharSequence {

            /* renamed from: n  reason: collision with root package name */
            char[] f8158n;

            C0122a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f8158n[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f8158n.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f8158n, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f8156n = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f8156n.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            C0122a c0122a = this.f8157o;
            c0122a.f8158n = cArr;
            this.f8156n.append(c0122a, i10, i11 + i10);
        }
    }

    public static f7.k a(n7.a aVar) {
        boolean z10;
        try {
            try {
                aVar.Z();
                z10 = false;
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return n.U.c(aVar);
            } catch (EOFException e11) {
                e = e11;
                if (z10) {
                    return f7.m.f7331a;
                }
                throw new s(e);
            }
        } catch (n7.d e12) {
            throw new s(e12);
        } catch (IOException e13) {
            throw new f7.l(e13);
        } catch (NumberFormatException e14) {
            throw new s(e14);
        }
    }

    public static void b(f7.k kVar, n7.c cVar) {
        n.U.e(cVar, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
