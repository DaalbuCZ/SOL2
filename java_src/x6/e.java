package x6;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import v6.h;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f16393a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            u6.a.e().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static boolean c(String str) {
        return str == null || !f16393a.matcher(str).matches();
    }

    public static void d(h hVar) {
        if (!hVar.i()) {
            hVar.r();
        }
        hVar.b();
    }
}
