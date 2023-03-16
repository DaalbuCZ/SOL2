package m2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f11335a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f11336b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f11335a = byteArrayOutputStream;
        this.f11336b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f11335a.reset();
        try {
            b(this.f11336b, aVar.f11329n);
            String str = aVar.f11330o;
            if (str == null) {
                str = "";
            }
            b(this.f11336b, str);
            this.f11336b.writeLong(aVar.f11331p);
            this.f11336b.writeLong(aVar.f11332q);
            this.f11336b.write(aVar.f11333r);
            this.f11336b.flush();
            return this.f11335a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
