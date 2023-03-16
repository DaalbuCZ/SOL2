package y0;

import java.util.Arrays;
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f16697a;

    /* renamed from: b  reason: collision with root package name */
    private static final char f16698b;

    static {
        char[] charArray = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();
        f16697a = charArray;
        f16698b = charArray[0];
    }

    private static byte a(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < bArr.length) {
            int i14 = (i13 * i11) + (bArr[i10] & 255);
            bArr[i10] = (byte) (i14 / i12);
            i13 = i14 % i12;
            i10++;
        }
        return (byte) i13;
    }

    public static String b(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        int i10 = 0;
        while (i10 < bArr.length && bArr[i10] == 0) {
            i10++;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        int length = copyOf.length * 2;
        char[] cArr = new char[length];
        int i11 = i10;
        int i12 = length;
        while (i11 < copyOf.length) {
            i12--;
            cArr[i12] = f16697a[a(copyOf, i11, 256, 58)];
            if (copyOf[i11] == 0) {
                i11++;
            }
        }
        while (i12 < length && cArr[i12] == f16698b) {
            i12++;
        }
        while (true) {
            i10--;
            if (i10 < 0) {
                return new String(cArr, i12, length - i12);
            }
            i12--;
            cArr[i12] = f16698b;
        }
    }
}
