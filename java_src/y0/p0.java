package y0;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public class p0 {
    static long a(byte[] bArr, int i10, ByteOrder byteOrder) {
        long j10 = 0;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            for (int i11 = i10; i11 < i10 + 8; i11++) {
                j10 = (j10 << 8) | (bArr[i11] & 255);
            }
        } else {
            for (int i12 = i10 + 7; i12 >= i10; i12--) {
                j10 = (j10 << 8) | (bArr[i12] & 255);
            }
        }
        return j10;
    }

    public static UUID b(UUID uuid, String str) {
        return c(uuid, str.getBytes(Charset.forName("UTF-8")));
    }

    public static UUID c(UUID uuid, byte[] bArr) {
        Objects.requireNonNull(bArr, "name == null");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            if (uuid == null) {
                messageDigest.update(new byte[16]);
            } else {
                long mostSignificantBits = uuid.getMostSignificantBits();
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                messageDigest.update(f(mostSignificantBits, byteOrder));
                messageDigest.update(f(uuid.getLeastSignificantBits(), byteOrder));
            }
            return d(messageDigest.digest(bArr), 5);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    static UUID d(byte[] bArr, int i10) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        long a10 = a(bArr, 0, byteOrder);
        long a11 = a(bArr, 8, byteOrder);
        return new UUID((i10 << 12) | (a10 & (-61441)), (4611686018427387903L & a11) | Long.MIN_VALUE);
    }

    static void e(long j10, byte[] bArr, int i10, ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            for (int i11 = i10 + 7; i11 >= i10; i11--) {
                bArr[i11] = (byte) (j10 & 255);
                j10 >>= 8;
            }
            return;
        }
        for (int i12 = i10; i12 < i10 + 8; i12++) {
            bArr[i12] = (byte) (j10 & 255);
            j10 >>= 8;
        }
    }

    static byte[] f(long j10, ByteOrder byteOrder) {
        byte[] bArr = new byte[8];
        e(j10, bArr, 0, byteOrder);
        return bArr;
    }

    public static UUID g(UUID uuid) {
        return b(uuid, UUID.randomUUID().toString());
    }
}
