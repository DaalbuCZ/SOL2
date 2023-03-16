package n7;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: w  reason: collision with root package name */
    private static final String[] f11787w = new String[128];

    /* renamed from: x  reason: collision with root package name */
    private static final String[] f11788x;

    /* renamed from: n  reason: collision with root package name */
    private final Writer f11789n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f11790o = new int[32];

    /* renamed from: p  reason: collision with root package name */
    private int f11791p = 0;

    /* renamed from: q  reason: collision with root package name */
    private String f11792q;

    /* renamed from: r  reason: collision with root package name */
    private String f11793r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11794s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11795t;

    /* renamed from: u  reason: collision with root package name */
    private String f11796u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11797v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f11787w[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f11787w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f11788x = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        N(6);
        this.f11793r = ":";
        this.f11797v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f11789n = writer;
    }

    private void B() {
        if (this.f11792q == null) {
            return;
        }
        this.f11789n.write(10);
        int i10 = this.f11791p;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f11789n.write(this.f11792q);
        }
    }

    private c E(int i10, char c10) {
        b();
        N(i10);
        this.f11789n.write(c10);
        return this;
    }

    private int G() {
        int i10 = this.f11791p;
        if (i10 != 0) {
            return this.f11790o[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void N(int i10) {
        int i11 = this.f11791p;
        int[] iArr = this.f11790o;
        if (i11 == iArr.length) {
            this.f11790o = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f11790o;
        int i12 = this.f11791p;
        this.f11791p = i12 + 1;
        iArr2[i12] = i10;
    }

    private void O(int i10) {
        this.f11790o[this.f11791p - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f11795t
            if (r0 == 0) goto L7
            java.lang.String[] r0 = n7.c.f11788x
            goto L9
        L7:
            java.lang.String[] r0 = n7.c.f11787w
        L9:
            java.io.Writer r1 = r8.f11789n
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f11789n
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f11789n
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f11789n
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f11789n
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.c.Y(java.lang.String):void");
    }

    private void a() {
        int G = G();
        if (G == 5) {
            this.f11789n.write(44);
        } else if (G != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        B();
        O(4);
    }

    private void b() {
        int G = G();
        if (G == 1) {
            O(2);
        } else if (G != 2) {
            if (G == 4) {
                this.f11789n.append((CharSequence) this.f11793r);
                O(5);
                return;
            }
            if (G != 6) {
                if (G != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f11794s) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            O(7);
            return;
        } else {
            this.f11789n.append(',');
        }
        B();
    }

    private void e0() {
        if (this.f11796u != null) {
            a();
            Y(this.f11796u);
            this.f11796u = null;
        }
    }

    private c j(int i10, int i11, char c10) {
        int G = G();
        if (G == i11 || G == i10) {
            if (this.f11796u != null) {
                throw new IllegalStateException("Dangling name: " + this.f11796u);
            }
            this.f11791p--;
            if (G == i11) {
                B();
            }
            this.f11789n.write(c10);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public c D() {
        if (this.f11796u != null) {
            if (!this.f11797v) {
                this.f11796u = null;
                return this;
            }
            e0();
        }
        b();
        this.f11789n.write("null");
        return this;
    }

    public final void R(boolean z10) {
        this.f11795t = z10;
    }

    public final void S(String str) {
        String str2;
        if (str.length() == 0) {
            this.f11792q = null;
            str2 = ":";
        } else {
            this.f11792q = str;
            str2 = ": ";
        }
        this.f11793r = str2;
    }

    public final void W(boolean z10) {
        this.f11794s = z10;
    }

    public final void X(boolean z10) {
        this.f11797v = z10;
    }

    public c Z(long j10) {
        e0();
        b();
        this.f11789n.write(Long.toString(j10));
        return this;
    }

    public c a0(Boolean bool) {
        if (bool == null) {
            return D();
        }
        e0();
        b();
        this.f11789n.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c b0(Number number) {
        if (number == null) {
            return D();
        }
        e0();
        String obj = number.toString();
        if (this.f11794s || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            b();
            this.f11789n.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c c() {
        e0();
        return E(1, '[');
    }

    public c c0(String str) {
        if (str == null) {
            return D();
        }
        e0();
        b();
        Y(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11789n.close();
        int i10 = this.f11791p;
        if (i10 > 1 || (i10 == 1 && this.f11790o[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f11791p = 0;
    }

    public c d0(boolean z10) {
        e0();
        b();
        this.f11789n.write(z10 ? "true" : "false");
        return this;
    }

    public c f() {
        e0();
        return E(3, '{');
    }

    public void flush() {
        if (this.f11791p == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f11789n.flush();
    }

    public c k() {
        return j(1, 2, ']');
    }

    public c o() {
        return j(3, 5, '}');
    }

    public final boolean p() {
        return this.f11797v;
    }

    public final boolean r() {
        return this.f11795t;
    }

    public boolean t() {
        return this.f11794s;
    }

    public c y(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f11796u == null) {
            if (this.f11791p != 0) {
                this.f11796u = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }
}
