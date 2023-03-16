package aa;

import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes.dex */
public class c implements Serializable, Comparable<c> {

    /* renamed from: q  reason: collision with root package name */
    static final char[] f300q = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: r  reason: collision with root package name */
    public static final c f301r = p(new byte[0]);

    /* renamed from: n  reason: collision with root package name */
    final byte[] f302n;

    /* renamed from: o  reason: collision with root package name */
    transient int f303o;

    /* renamed from: p  reason: collision with root package name */
    transient String f304p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(byte[] bArr) {
        this.f302n = bArr;
    }

    static int e(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static c h(String str) {
        if (str != null) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: " + str);
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((j(str.charAt(i11)) << 4) + j(str.charAt(i11 + 1)));
            }
            return p(bArr);
        }
        throw new IllegalArgumentException("hex == null");
    }

    private static int j(char c10) {
        if (c10 < '0' || c10 > '9') {
            char c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                c11 = 'A';
                if (c10 < 'A' || c10 > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c10);
                }
            }
            return (c10 - c11) + 10;
        }
        return c10 - '0';
    }

    public static c p(byte... bArr) {
        if (bArr != null) {
            return new c((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int r10 = cVar.r();
            byte[] bArr = this.f302n;
            if (r10 == bArr.length && cVar.q(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(c cVar) {
        int r10 = r();
        int r11 = cVar.r();
        int min = Math.min(r10, r11);
        for (int i10 = 0; i10 < min; i10++) {
            int l10 = l(i10) & 255;
            int l11 = cVar.l(i10) & 255;
            if (l10 != l11) {
                return l10 < l11 ? -1 : 1;
            }
        }
        if (r10 == r11) {
            return 0;
        }
        return r10 < r11 ? -1 : 1;
    }

    public int hashCode() {
        int i10 = this.f303o;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f302n);
        this.f303o = hashCode;
        return hashCode;
    }

    public byte l(int i10) {
        return this.f302n[i10];
    }

    public String m() {
        byte[] bArr = this.f302n;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f300q;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean q(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f302n;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && g.a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public int r() {
        return this.f302n.length;
    }

    public c s(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f302n;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f302n.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new c(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String t() {
        String str = this.f304p;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f302n, g.f316a);
        this.f304p = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f302n.length == 0) {
            return "[size=0]";
        }
        String t10 = t();
        int e10 = e(t10, 64);
        if (e10 == -1) {
            if (this.f302n.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(m());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f302n.length);
                sb2.append(" hex=");
                sb2.append(s(0, 64).m());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = t10.substring(0, e10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (e10 < t10.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f302n.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}
