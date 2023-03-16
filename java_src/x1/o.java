package x1;

import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;
import s1.h2;
/* loaded from: classes.dex */
public final class o {
    @Pure
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw h2.a(str, null);
        }
    }

    public static boolean b(m mVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return mVar.l(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(m mVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int e10 = mVar.e(bArr, i10 + i12, i11 - i12);
            if (e10 == -1) {
                break;
            }
            i12 += e10;
        }
        return i12;
    }

    public static boolean d(m mVar, byte[] bArr, int i10, int i11) {
        try {
            mVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(m mVar, int i10) {
        try {
            mVar.h(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
