package w3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import z3.p1;
import z3.q1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class v extends p1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f16106a;

    /* JADX INFO: Access modifiers changed from: protected */
    public v(byte[] bArr) {
        z3.o.a(bArr.length == 25);
        this.f16106a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // z3.q1
    public final int c() {
        return this.f16106a;
    }

    @Override // z3.q1
    public final g4.a d() {
        return g4.b.m0(m0());
    }

    public final boolean equals(Object obj) {
        g4.a d10;
        if (obj != null && (obj instanceof q1)) {
            try {
                q1 q1Var = (q1) obj;
                if (q1Var.c() == this.f16106a && (d10 = q1Var.d()) != null) {
                    return Arrays.equals(m0(), (byte[]) g4.b.f(d10));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16106a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] m0();
}
