package i7;

import f7.p;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class f extends n7.a {
    private static final Reader G = new a();
    private static final Object H = new Object();
    private Object[] C;
    private int D;
    private String[] E;
    private int[] F;

    /* loaded from: classes.dex */
    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public f(f7.k kVar) {
        super(G);
        this.C = new Object[32];
        this.D = 0;
        this.E = new String[32];
        this.F = new int[32];
        q0(kVar);
    }

    private String B() {
        return " at path " + z();
    }

    private void l0(n7.b bVar) {
        if (Z() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + Z() + B());
    }

    private Object n0() {
        return this.C[this.D - 1];
    }

    private Object o0() {
        Object[] objArr = this.C;
        int i10 = this.D - 1;
        this.D = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void q0(Object obj) {
        int i10 = this.D;
        Object[] objArr = this.C;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.C = Arrays.copyOf(objArr, i11);
            this.F = Arrays.copyOf(this.F, i11);
            this.E = (String[]) Arrays.copyOf(this.E, i11);
        }
        Object[] objArr2 = this.C;
        int i12 = this.D;
        this.D = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // n7.a
    public boolean D() {
        l0(n7.b.BOOLEAN);
        boolean C = ((p) o0()).C();
        int i10 = this.D;
        if (i10 > 0) {
            int[] iArr = this.F;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return C;
    }

    @Override // n7.a
    public double E() {
        n7.b Z = Z();
        n7.b bVar = n7.b.NUMBER;
        if (Z != bVar && Z != n7.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + Z + B());
        }
        double D = ((p) n0()).D();
        if (!t() && (Double.isNaN(D) || Double.isInfinite(D))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + D);
        }
        o0();
        int i10 = this.D;
        if (i10 > 0) {
            int[] iArr = this.F;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return D;
    }

    @Override // n7.a
    public int G() {
        n7.b Z = Z();
        n7.b bVar = n7.b.NUMBER;
        if (Z != bVar && Z != n7.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + Z + B());
        }
        int E = ((p) n0()).E();
        o0();
        int i10 = this.D;
        if (i10 > 0) {
            int[] iArr = this.F;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return E;
    }

    @Override // n7.a
    public long N() {
        n7.b Z = Z();
        n7.b bVar = n7.b.NUMBER;
        if (Z != bVar && Z != n7.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + Z + B());
        }
        long F = ((p) n0()).F();
        o0();
        int i10 = this.D;
        if (i10 > 0) {
            int[] iArr = this.F;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return F;
    }

    @Override // n7.a
    public String O() {
        l0(n7.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) n0()).next();
        String str = (String) entry.getKey();
        this.E[this.D - 1] = str;
        q0(entry.getValue());
        return str;
    }

    @Override // n7.a
    public void S() {
        l0(n7.b.NULL);
        o0();
        int i10 = this.D;
        if (i10 > 0) {
            int[] iArr = this.F;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // n7.a
    public String X() {
        n7.b Z = Z();
        n7.b bVar = n7.b.STRING;
        if (Z == bVar || Z == n7.b.NUMBER) {
            String k10 = ((p) o0()).k();
            int i10 = this.D;
            if (i10 > 0) {
                int[] iArr = this.F;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return k10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + Z + B());
    }

    @Override // n7.a
    public n7.b Z() {
        if (this.D == 0) {
            return n7.b.END_DOCUMENT;
        }
        Object n02 = n0();
        if (n02 instanceof Iterator) {
            boolean z10 = this.C[this.D - 2] instanceof f7.n;
            Iterator it = (Iterator) n02;
            if (!it.hasNext()) {
                return z10 ? n7.b.END_OBJECT : n7.b.END_ARRAY;
            } else if (z10) {
                return n7.b.NAME;
            } else {
                q0(it.next());
                return Z();
            }
        } else if (n02 instanceof f7.n) {
            return n7.b.BEGIN_OBJECT;
        } else {
            if (n02 instanceof f7.h) {
                return n7.b.BEGIN_ARRAY;
            }
            if (!(n02 instanceof p)) {
                if (n02 instanceof f7.m) {
                    return n7.b.NULL;
                }
                if (n02 == H) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
            p pVar = (p) n02;
            if (pVar.K()) {
                return n7.b.STRING;
            }
            if (pVar.H()) {
                return n7.b.BOOLEAN;
            }
            if (pVar.J()) {
                return n7.b.NUMBER;
            }
            throw new AssertionError();
        }
    }

    @Override // n7.a
    public void a() {
        l0(n7.b.BEGIN_ARRAY);
        q0(((f7.h) n0()).iterator());
        this.F[this.D - 1] = 0;
    }

    @Override // n7.a
    public void b() {
        l0(n7.b.BEGIN_OBJECT);
        q0(((f7.n) n0()).D().iterator());
    }

    @Override // n7.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.C = new Object[]{H};
        this.D = 1;
    }

    @Override // n7.a
    public void j0() {
        if (Z() == n7.b.NAME) {
            O();
            this.E[this.D - 2] = "null";
        } else {
            o0();
            int i10 = this.D;
            if (i10 > 0) {
                this.E[i10 - 1] = "null";
            }
        }
        int i11 = this.D;
        if (i11 > 0) {
            int[] iArr = this.F;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // n7.a
    public void k() {
        l0(n7.b.END_ARRAY);
        o0();
        o0();
        int i10 = this.D;
        if (i10 > 0) {
            int[] iArr = this.F;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f7.k m0() {
        n7.b Z = Z();
        if (Z != n7.b.NAME && Z != n7.b.END_ARRAY && Z != n7.b.END_OBJECT && Z != n7.b.END_DOCUMENT) {
            f7.k kVar = (f7.k) n0();
            j0();
            return kVar;
        }
        throw new IllegalStateException("Unexpected " + Z + " when reading a JsonElement.");
    }

    @Override // n7.a
    public void o() {
        l0(n7.b.END_OBJECT);
        o0();
        o0();
        int i10 = this.D;
        if (i10 > 0) {
            int[] iArr = this.F;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void p0() {
        l0(n7.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) n0()).next();
        q0(entry.getValue());
        q0(new p((String) entry.getKey()));
    }

    @Override // n7.a
    public boolean r() {
        n7.b Z = Z();
        return (Z == n7.b.END_OBJECT || Z == n7.b.END_ARRAY) ? false : true;
    }

    @Override // n7.a
    public String toString() {
        return f.class.getSimpleName() + B();
    }

    @Override // n7.a
    public String z() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.D;
            if (i10 >= i11) {
                return sb.toString();
            }
            Object[] objArr = this.C;
            if (objArr[i10] instanceof f7.h) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.F[i10]);
                    sb.append(']');
                }
            } else if ((objArr[i10] instanceof f7.n) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.E;
                if (strArr[i10] != null) {
                    sb.append(strArr[i10]);
                }
            }
            i10++;
        }
    }
}
