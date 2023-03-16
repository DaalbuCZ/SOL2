package q5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import s5.b0;
/* loaded from: classes.dex */
class f implements z {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12741a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12742b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12743c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(String str, String str2, byte[] bArr) {
        this.f12742b = str;
        this.f12743c = str2;
        this.f12741a = bArr;
    }

    private byte[] a() {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f12741a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean b() {
        byte[] bArr = this.f12741a;
        return bArr == null || bArr.length == 0;
    }

    @Override // q5.z
    public InputStream h() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f12741a);
    }

    @Override // q5.z
    public String i() {
        return this.f12743c;
    }

    @Override // q5.z
    public b0.d.b j() {
        byte[] a10 = a();
        if (a10 == null) {
            return null;
        }
        return b0.d.b.a().b(a10).c(this.f12742b).a();
    }
}
