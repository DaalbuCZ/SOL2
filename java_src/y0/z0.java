package y0;

import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f16790a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16791b;

    public z0(String str, String str2) {
        this.f16791b = str2;
        this.f16790a = w.a(str);
    }

    private URL b(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder(this.f16791b);
            if (!this.f16791b.endsWith("/")) {
                sb.append("/");
            }
            if (!this.f16791b.contains("intent")) {
                sb.append("intent");
                sb.append("/");
            }
            sb.append(this.f16790a);
            sb.append("/");
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            return new URL(sb.toString());
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public URL a(String str) {
        return b("device", str);
    }

    public URL c(String str) {
        return b("issue", str);
    }

    public URL d(String str) {
        return b("session", str);
    }
}
