package y0;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public class w0 {
    public w2 a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "https://api.bugfender.com/";
            }
            return new w2(new URL(str), str2, str3);
        } catch (MalformedURLException unused) {
            throw new IllegalArgumentException("Illegal URL");
        }
    }
}
