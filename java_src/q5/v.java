package q5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import s5.b0;
/* loaded from: classes.dex */
class v implements z {

    /* renamed from: a  reason: collision with root package name */
    private final File f12884a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12885b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12886c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(String str, String str2, File file) {
        this.f12885b = str;
        this.f12886c = str2;
        this.f12884a = file;
    }

    private byte[] a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream h10 = h();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (h10 == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (h10 != null) {
                    h10.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = h10.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        h10.close();
                        return byteArray;
                    }
                    gZIPOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // q5.z
    public InputStream h() {
        if (this.f12884a.exists() && this.f12884a.isFile()) {
            try {
                return new FileInputStream(this.f12884a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // q5.z
    public String i() {
        return this.f12886c;
    }

    @Override // q5.z
    public b0.d.b j() {
        byte[] a10 = a();
        if (a10 != null) {
            return b0.d.b.a().b(a10).c(this.f12885b).a();
        }
        return null;
    }
}
