package f2;

import java.nio.ByteBuffer;
import java.util.UUID;
import p3.a0;
/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final UUID f7116a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7117b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f7118c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f7116a = uuid;
            this.f7117b = i10;
            this.f7118c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        if (a0Var.f() < 32) {
            return null;
        }
        a0Var.O(0);
        if (a0Var.m() == a0Var.a() + 4 && a0Var.m() == 1886614376) {
            int c10 = f2.a.c(a0Var.m());
            if (c10 > 1) {
                p3.r.i("PsshAtomUtil", "Unsupported pssh version: " + c10);
                return null;
            }
            UUID uuid = new UUID(a0Var.v(), a0Var.v());
            if (c10 == 1) {
                a0Var.P(a0Var.G() * 16);
            }
            int G = a0Var.G();
            if (G != a0Var.a()) {
                return null;
            }
            byte[] bArr2 = new byte[G];
            a0Var.j(bArr2, 0, G);
            return new a(uuid, c10, bArr2);
        }
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f7116a)) {
            return d10.f7118c;
        }
        p3.r.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f7116a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f7116a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f7117b;
    }
}
