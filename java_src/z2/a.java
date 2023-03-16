package z2;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o3.p0;
/* loaded from: classes.dex */
class a implements o3.l {

    /* renamed from: a  reason: collision with root package name */
    private final o3.l f17176a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f17177b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f17178c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f17179d;

    public a(o3.l lVar, byte[] bArr, byte[] bArr2) {
        this.f17176a = lVar;
        this.f17177b = bArr;
        this.f17178c = bArr2;
    }

    @Override // o3.i
    public final int b(byte[] bArr, int i10, int i11) {
        p3.a.e(this.f17179d);
        int read = this.f17179d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // o3.l
    public void close() {
        if (this.f17179d != null) {
            this.f17179d = null;
            this.f17176a.close();
        }
    }

    @Override // o3.l
    public final Map<String, List<String>> f() {
        return this.f17176a.f();
    }

    @Override // o3.l
    public final void i(p0 p0Var) {
        p3.a.e(p0Var);
        this.f17176a.i(p0Var);
    }

    @Override // o3.l
    public final Uri k() {
        return this.f17176a.k();
    }

    @Override // o3.l
    public final long n(o3.p pVar) {
        try {
            Cipher r10 = r();
            try {
                r10.init(2, new SecretKeySpec(this.f17177b, "AES"), new IvParameterSpec(this.f17178c));
                o3.n nVar = new o3.n(this.f17176a, pVar);
                this.f17179d = new CipherInputStream(nVar, r10);
                nVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    protected Cipher r() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
