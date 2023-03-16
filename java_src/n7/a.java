package n7;

import h7.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class a implements Closeable {
    private String[] A;
    private int[] B;

    /* renamed from: n  reason: collision with root package name */
    private final Reader f11763n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11764o = false;

    /* renamed from: p  reason: collision with root package name */
    private final char[] f11765p = new char[1024];

    /* renamed from: q  reason: collision with root package name */
    private int f11766q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f11767r = 0;

    /* renamed from: s  reason: collision with root package name */
    private int f11768s = 0;

    /* renamed from: t  reason: collision with root package name */
    private int f11769t = 0;

    /* renamed from: u  reason: collision with root package name */
    int f11770u = 0;

    /* renamed from: v  reason: collision with root package name */
    private long f11771v;

    /* renamed from: w  reason: collision with root package name */
    private int f11772w;

    /* renamed from: x  reason: collision with root package name */
    private String f11773x;

    /* renamed from: y  reason: collision with root package name */
    private int[] f11774y;

    /* renamed from: z  reason: collision with root package name */
    private int f11775z;

    /* renamed from: n7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0171a extends f {
        C0171a() {
        }

        @Override // h7.f
        public void a(a aVar) {
            int i10;
            if (aVar instanceof i7.f) {
                ((i7.f) aVar).p0();
                return;
            }
            int i11 = aVar.f11770u;
            if (i11 == 0) {
                i11 = aVar.j();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else if (i11 != 14) {
                throw new IllegalStateException("Expected a name but was " + aVar.Z() + aVar.B());
            } else {
                i10 = 10;
            }
            aVar.f11770u = i10;
        }
    }

    static {
        f.f8130a = new C0171a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f11774y = iArr;
        this.f11775z = 0;
        this.f11775z = 0 + 1;
        iArr[0] = 6;
        this.A = new String[32];
        this.B = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f11763n = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r1 != '/') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        r7.f11766q = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (r4 != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        r7.f11766q = r4 - 1;
        r2 = p(2);
        r7.f11766q++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        c();
        r2 = r7.f11766q;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r3 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r3 == '/') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        r7.f11766q = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
        r7.f11766q = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (g0("*\/") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        throw k0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
        r7.f11766q = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (r1 != '#') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int R(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f11765p
        L2:
            int r1 = r7.f11766q
        L4:
            int r2 = r7.f11767r
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f11766q = r1
            boolean r1 = r7.p(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.B()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f11766q
            int r2 = r7.f11767r
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f11768s
            int r1 = r1 + r3
            r7.f11768s = r1
            r7.f11769t = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.f11766q = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f11766q = r4
            boolean r2 = r7.p(r6)
            int r4 = r7.f11766q
            int r4 = r4 + r3
            r7.f11766q = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.c()
            int r2 = r7.f11766q
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f11766q = r2
        L7c:
            r7.h0()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f11766q = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.g0(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f11766q
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.k0(r8)
            throw r8
        L98:
            r2 = 35
            r7.f11766q = r4
            if (r1 != r2) goto La2
            r7.c()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.R(boolean):int");
    }

    private String W(char c10) {
        char[] cArr = this.f11765p;
        StringBuilder sb = null;
        while (true) {
            int i10 = this.f11766q;
            int i11 = this.f11767r;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f11766q = i12;
                        int i13 = (i12 - i10) - 1;
                        if (sb == null) {
                            return new String(cArr, i10, i13);
                        }
                        sb.append(cArr, i10, i13);
                        return sb.toString();
                    } else if (c11 == '\\') {
                        this.f11766q = i12;
                        int i14 = (i12 - i10) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i14 + 1) * 2, 16));
                        }
                        sb.append(cArr, i10, i14);
                        sb.append(d0());
                    } else {
                        if (c11 == '\n') {
                            this.f11768s++;
                            this.f11769t = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i10 - i10) * 2, 16));
                    }
                    sb.append(cArr, i10, i10 - i10);
                    this.f11766q = i10;
                    if (!p(1)) {
                        throw k0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String Y() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f11766q
            int r4 = r3 + r2
            int r5 = r6.f11767r
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f11765p
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.c()
            goto L5c
        L4e:
            char[] r3 = r6.f11765p
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.p(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f11765p
            int r4 = r6.f11766q
            r1.append(r3, r4, r2)
            int r3 = r6.f11766q
            int r3 = r3 + r2
            r6.f11766q = r3
            r2 = 1
            boolean r2 = r6.p(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f11765p
            int r3 = r6.f11766q
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f11765p
            int r3 = r6.f11766q
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f11766q
            int r2 = r2 + r0
            r6.f11766q = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.Y():java.lang.String");
    }

    private int a0() {
        int i10;
        String str;
        String str2;
        char c10 = this.f11765p[this.f11766q];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f11766q + i11 >= this.f11767r && !p(i11 + 1)) {
                return 0;
            }
            char c11 = this.f11765p[this.f11766q + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f11766q + length < this.f11767r || p(length + 1)) && y(this.f11765p[this.f11766q + length])) {
            return 0;
        }
        this.f11766q += length;
        this.f11770u = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        if (y(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
        if (r9 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r13 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
        if (r13 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
        r18.f11771v = r11;
        r18.f11766q += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
        r18.f11770u = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        if (r9 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ba, code lost:
        if (r9 == 4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
        if (r9 != 7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c2, code lost:
        r18.f11772w = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c7, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b0() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.b0():int");
    }

    private void c() {
        if (!this.f11764o) {
            throw k0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void c0(int i10) {
        int i11 = this.f11775z;
        int[] iArr = this.f11774y;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f11774y = Arrays.copyOf(iArr, i12);
            this.B = Arrays.copyOf(this.B, i12);
            this.A = (String[]) Arrays.copyOf(this.A, i12);
        }
        int[] iArr2 = this.f11774y;
        int i13 = this.f11775z;
        this.f11775z = i13 + 1;
        iArr2[i13] = i10;
    }

    private char d0() {
        int i10;
        int i11;
        if (this.f11766q != this.f11767r || p(1)) {
            char[] cArr = this.f11765p;
            int i12 = this.f11766q;
            int i13 = i12 + 1;
            this.f11766q = i13;
            char c10 = cArr[i12];
            if (c10 == '\n') {
                this.f11768s++;
                this.f11769t = i13;
            } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 != 'n') {
                            if (c10 != 'r') {
                                if (c10 != 't') {
                                    if (c10 == 'u') {
                                        if (i13 + 4 <= this.f11767r || p(4)) {
                                            char c11 = 0;
                                            int i14 = this.f11766q;
                                            int i15 = i14 + 4;
                                            while (i14 < i15) {
                                                char c12 = this.f11765p[i14];
                                                char c13 = (char) (c11 << 4);
                                                if (c12 < '0' || c12 > '9') {
                                                    if (c12 >= 'a' && c12 <= 'f') {
                                                        i10 = c12 - 'a';
                                                    } else if (c12 < 'A' || c12 > 'F') {
                                                        throw new NumberFormatException("\\u" + new String(this.f11765p, this.f11766q, 4));
                                                    } else {
                                                        i10 = c12 - 'A';
                                                    }
                                                    i11 = i10 + 10;
                                                } else {
                                                    i11 = c12 - '0';
                                                }
                                                c11 = (char) (c13 + i11);
                                                i14++;
                                            }
                                            this.f11766q += 4;
                                            return c11;
                                        }
                                        throw k0("Unterminated escape sequence");
                                    }
                                    throw k0("Invalid escape sequence");
                                }
                                return '\t';
                            }
                            return '\r';
                        }
                        return '\n';
                    }
                    return '\f';
                }
                return '\b';
            }
            return c10;
        }
        throw k0("Unterminated escape sequence");
    }

    private void f() {
        R(true);
        int i10 = this.f11766q - 1;
        this.f11766q = i10;
        if (i10 + 5 <= this.f11767r || p(5)) {
            char[] cArr = this.f11765p;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
                this.f11766q += 5;
            }
        }
    }

    private void f0(char c10) {
        char[] cArr = this.f11765p;
        while (true) {
            int i10 = this.f11766q;
            int i11 = this.f11767r;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f11766q = i12;
                        return;
                    } else if (c11 == '\\') {
                        this.f11766q = i12;
                        d0();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f11768s++;
                            this.f11769t = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f11766q = i10;
                    if (!p(1)) {
                        throw k0("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean g0(String str) {
        int length = str.length();
        while (true) {
            if (this.f11766q + length > this.f11767r && !p(length)) {
                return false;
            }
            char[] cArr = this.f11765p;
            int i10 = this.f11766q;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f11765p[this.f11766q + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f11768s++;
            this.f11769t = i10 + 1;
            this.f11766q++;
        }
    }

    private void h0() {
        char c10;
        do {
            if (this.f11766q >= this.f11767r && !p(1)) {
                return;
            }
            char[] cArr = this.f11765p;
            int i10 = this.f11766q;
            int i11 = i10 + 1;
            this.f11766q = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f11768s++;
                this.f11769t = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f11766q
            int r2 = r1 + r0
            int r3 = r4.f11767r
            if (r2 >= r3) goto L51
            char[] r2 = r4.f11765p
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.c()
        L4b:
            int r1 = r4.f11766q
            int r1 = r1 + r0
            r4.f11766q = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f11766q = r1
            r0 = 1
            boolean r0 = r4.p(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.i0():void");
    }

    private IOException k0(String str) {
        throw new d(str + B());
    }

    private boolean p(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f11765p;
        int i13 = this.f11769t;
        int i14 = this.f11766q;
        this.f11769t = i13 - i14;
        int i15 = this.f11767r;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f11767r = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f11767r = 0;
        }
        this.f11766q = 0;
        do {
            Reader reader = this.f11763n;
            int i17 = this.f11767r;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f11767r + read;
            this.f11767r = i11;
            if (this.f11768s == 0 && (i12 = this.f11769t) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f11766q++;
                this.f11769t = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private boolean y(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    String B() {
        return " at line " + (this.f11768s + 1) + " column " + ((this.f11766q - this.f11769t) + 1) + " path " + z();
    }

    public boolean D() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 5) {
            this.f11770u = 0;
            int[] iArr = this.B;
            int i11 = this.f11775z - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f11770u = 0;
            int[] iArr2 = this.B;
            int i12 = this.f11775z - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + Z() + B());
        }
    }

    public double E() {
        String W;
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f11770u = 0;
            int[] iArr = this.B;
            int i11 = this.f11775z - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f11771v;
        }
        if (i10 == 16) {
            this.f11773x = new String(this.f11765p, this.f11766q, this.f11772w);
            this.f11766q += this.f11772w;
        } else {
            if (i10 == 8 || i10 == 9) {
                W = W(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                W = Y();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + Z() + B());
            }
            this.f11773x = W;
        }
        this.f11770u = 11;
        double parseDouble = Double.parseDouble(this.f11773x);
        if (!this.f11764o && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + B());
        }
        this.f11773x = null;
        this.f11770u = 0;
        int[] iArr2 = this.B;
        int i12 = this.f11775z - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int G() {
        String W;
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            long j10 = this.f11771v;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f11770u = 0;
                int[] iArr = this.B;
                int i12 = this.f11775z - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f11771v + B());
        }
        if (i10 == 16) {
            this.f11773x = new String(this.f11765p, this.f11766q, this.f11772w);
            this.f11766q += this.f11772w;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected an int but was " + Z() + B());
        } else {
            if (i10 == 10) {
                W = Y();
            } else {
                W = W(i10 == 8 ? '\'' : '\"');
            }
            this.f11773x = W;
            try {
                int parseInt = Integer.parseInt(this.f11773x);
                this.f11770u = 0;
                int[] iArr2 = this.B;
                int i13 = this.f11775z - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f11770u = 11;
        double parseDouble = Double.parseDouble(this.f11773x);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f11773x + B());
        }
        this.f11773x = null;
        this.f11770u = 0;
        int[] iArr3 = this.B;
        int i15 = this.f11775z - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long N() {
        String W;
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f11770u = 0;
            int[] iArr = this.B;
            int i11 = this.f11775z - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f11771v;
        }
        if (i10 == 16) {
            this.f11773x = new String(this.f11765p, this.f11766q, this.f11772w);
            this.f11766q += this.f11772w;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected a long but was " + Z() + B());
        } else {
            if (i10 == 10) {
                W = Y();
            } else {
                W = W(i10 == 8 ? '\'' : '\"');
            }
            this.f11773x = W;
            try {
                long parseLong = Long.parseLong(this.f11773x);
                this.f11770u = 0;
                int[] iArr2 = this.B;
                int i12 = this.f11775z - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f11770u = 11;
        double parseDouble = Double.parseDouble(this.f11773x);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f11773x + B());
        }
        this.f11773x = null;
        this.f11770u = 0;
        int[] iArr3 = this.B;
        int i13 = this.f11775z - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    public String O() {
        char c10;
        String W;
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 14) {
            W = Y();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 != 13) {
                throw new IllegalStateException("Expected a name but was " + Z() + B());
            } else {
                c10 = '\"';
            }
            W = W(c10);
        }
        this.f11770u = 0;
        this.A[this.f11775z - 1] = W;
        return W;
    }

    public void S() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 7) {
            this.f11770u = 0;
            int[] iArr = this.B;
            int i11 = this.f11775z - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + Z() + B());
    }

    public String X() {
        String str;
        char c10;
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 10) {
            str = Y();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.f11773x;
                this.f11773x = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f11771v);
            } else if (i10 != 16) {
                throw new IllegalStateException("Expected a string but was " + Z() + B());
            } else {
                str = new String(this.f11765p, this.f11766q, this.f11772w);
                this.f11766q += this.f11772w;
            }
            str = W(c10);
        }
        this.f11770u = 0;
        int[] iArr = this.B;
        int i11 = this.f11775z - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public b Z() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void a() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 3) {
            c0(1);
            this.B[this.f11775z - 1] = 0;
            this.f11770u = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + Z() + B());
    }

    public void b() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 1) {
            c0(3);
            this.f11770u = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + Z() + B());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11770u = 0;
        this.f11774y[0] = 8;
        this.f11775z = 1;
        this.f11763n.close();
    }

    public final void e0(boolean z10) {
        this.f11764o = z10;
    }

    int j() {
        int i10;
        int R;
        int[] iArr = this.f11774y;
        int i11 = this.f11775z;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 != 2) {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5 && (R = R(true)) != 44) {
                    if (R != 59) {
                        if (R == 125) {
                            this.f11770u = 2;
                            return 2;
                        }
                        throw k0("Unterminated object");
                    }
                    c();
                }
                int R2 = R(true);
                if (R2 == 34) {
                    i10 = 13;
                } else if (R2 == 39) {
                    c();
                    i10 = 12;
                } else if (R2 == 125) {
                    if (i12 != 5) {
                        this.f11770u = 2;
                        return 2;
                    }
                    throw k0("Expected name");
                } else {
                    c();
                    this.f11766q--;
                    if (!y((char) R2)) {
                        throw k0("Expected name");
                    }
                    i10 = 14;
                }
            } else if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int R3 = R(true);
                if (R3 != 58) {
                    if (R3 != 61) {
                        throw k0("Expected ':'");
                    }
                    c();
                    if (this.f11766q < this.f11767r || p(1)) {
                        char[] cArr = this.f11765p;
                        int i13 = this.f11766q;
                        if (cArr[i13] == '>') {
                            this.f11766q = i13 + 1;
                        }
                    }
                }
            } else if (i12 == 6) {
                if (this.f11764o) {
                    f();
                }
                this.f11774y[this.f11775z - 1] = 7;
            } else if (i12 == 7) {
                if (R(false) == -1) {
                    i10 = 17;
                } else {
                    c();
                    this.f11766q--;
                }
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.f11770u = i10;
            return i10;
        } else {
            int R4 = R(true);
            if (R4 != 44) {
                if (R4 != 59) {
                    if (R4 == 93) {
                        this.f11770u = 4;
                        return 4;
                    }
                    throw k0("Unterminated array");
                }
                c();
            }
        }
        int R5 = R(true);
        if (R5 != 34) {
            if (R5 == 39) {
                c();
                this.f11770u = 8;
                return 8;
            }
            if (R5 != 44 && R5 != 59) {
                if (R5 == 91) {
                    this.f11770u = 3;
                    return 3;
                } else if (R5 != 93) {
                    if (R5 == 123) {
                        this.f11770u = 1;
                        return 1;
                    }
                    this.f11766q--;
                    int a02 = a0();
                    if (a02 != 0) {
                        return a02;
                    }
                    int b02 = b0();
                    if (b02 != 0) {
                        return b02;
                    }
                    if (!y(this.f11765p[this.f11766q])) {
                        throw k0("Expected value");
                    }
                    c();
                    i10 = 10;
                } else if (i12 == 1) {
                    this.f11770u = 4;
                    return 4;
                }
            }
            if (i12 == 1 || i12 == 2) {
                c();
                this.f11766q--;
                this.f11770u = 7;
                return 7;
            }
            throw k0("Unexpected value");
        }
        i10 = 9;
        this.f11770u = i10;
        return i10;
    }

    public void j0() {
        char c10;
        int i10 = 0;
        do {
            int i11 = this.f11770u;
            if (i11 == 0) {
                i11 = j();
            }
            if (i11 == 3) {
                c0(1);
            } else if (i11 == 1) {
                c0(3);
            } else {
                if (i11 == 4 || i11 == 2) {
                    this.f11775z--;
                    i10--;
                } else if (i11 == 14 || i11 == 10) {
                    i0();
                } else {
                    if (i11 == 8 || i11 == 12) {
                        c10 = '\'';
                    } else if (i11 == 9 || i11 == 13) {
                        c10 = '\"';
                    } else if (i11 == 16) {
                        this.f11766q += this.f11772w;
                    }
                    f0(c10);
                }
                this.f11770u = 0;
            }
            i10++;
            this.f11770u = 0;
        } while (i10 != 0);
        int[] iArr = this.B;
        int i12 = this.f11775z;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.A[i12 - 1] = "null";
    }

    public void k() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + Z() + B());
        }
        int i11 = this.f11775z - 1;
        this.f11775z = i11;
        int[] iArr = this.B;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f11770u = 0;
    }

    public void o() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + Z() + B());
        }
        int i11 = this.f11775z - 1;
        this.f11775z = i11;
        this.A[i11] = null;
        int[] iArr = this.B;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f11770u = 0;
    }

    public boolean r() {
        int i10 = this.f11770u;
        if (i10 == 0) {
            i10 = j();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final boolean t() {
        return this.f11764o;
    }

    public String toString() {
        return getClass().getSimpleName() + B();
    }

    public String z() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = this.f11775z;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f11774y[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(this.B[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String[] strArr = this.A;
                if (strArr[i11] != null) {
                    sb.append(strArr[i11]);
                }
            }
        }
        return sb.toString();
    }
}
