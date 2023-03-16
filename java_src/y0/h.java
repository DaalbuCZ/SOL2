package y0;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h {
    public static g2 a(String str) {
        try {
            return new g2(new JSONObject(str).getInt("id"));
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
