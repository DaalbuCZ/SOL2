package r5;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import r5.e;
/* loaded from: classes.dex */
class f implements r5.a {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f13045d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final File f13046a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13047b;

    /* renamed from: c  reason: collision with root package name */
    private e f13048c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f13049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f13050b;

        a(byte[] bArr, int[] iArr) {
            this.f13049a = bArr;
            this.f13050b = iArr;
        }

        @Override // r5.e.d
        public void a(InputStream inputStream, int i10) {
            try {
                inputStream.read(this.f13049a, this.f13050b[0], i10);
                int[] iArr = this.f13050b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f13052a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13053b;

        b(byte[] bArr, int i10) {
            this.f13052a = bArr;
            this.f13053b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(File file, int i10) {
        this.f13046a = file;
        this.f13047b = i10;
    }

    private void f(long j10, String str) {
        int i10;
        if (this.f13048c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f13047b / 4) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f13048c.j(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f13045d));
            while (!this.f13048c.y() && this.f13048c.Y() > this.f13047b) {
                this.f13048c.R();
            }
        } catch (IOException e10) {
            n5.f.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (this.f13046a.exists()) {
            h();
            e eVar = this.f13048c;
            if (eVar == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[eVar.Y()];
            try {
                this.f13048c.r(new a(bArr, iArr));
            } catch (IOException e10) {
                n5.f.f().e("A problem occurred while reading the Crashlytics log file.", e10);
            }
            return new b(bArr, iArr[0]);
        }
        return null;
    }

    private void h() {
        if (this.f13048c == null) {
            try {
                this.f13048c = new e(this.f13046a);
            } catch (IOException e10) {
                n5.f f10 = n5.f.f();
                f10.e("Could not open log file: " + this.f13046a, e10);
            }
        }
    }

    @Override // r5.a
    public void a() {
        q5.h.e(this.f13048c, "There was a problem closing the Crashlytics log file.");
        this.f13048c = null;
    }

    @Override // r5.a
    public String b() {
        byte[] c10 = c();
        if (c10 != null) {
            return new String(c10, f13045d);
        }
        return null;
    }

    @Override // r5.a
    public byte[] c() {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        int i10 = g10.f13053b;
        byte[] bArr = new byte[i10];
        System.arraycopy(g10.f13052a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // r5.a
    public void d() {
        a();
        this.f13046a.delete();
    }

    @Override // r5.a
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
