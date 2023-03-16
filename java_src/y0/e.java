package y0;

import org.json.JSONException;
import org.json.JSONObject;
import y0.c;
/* loaded from: classes.dex */
public class e {
    public static c a(String str) {
        try {
            c cVar = new c();
            JSONObject jSONObject = new JSONObject(str);
            cVar.f(jSONObject.getBoolean("logger_enabled"));
            cVar.d(jSONObject.getBoolean("crashes_enabled"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("latest_sdk_version");
            if (jSONObject2 != null) {
                cVar.c(new c.b(jSONObject2.getInt("android"), jSONObject2.getInt("ios")));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("error");
            if (optJSONObject != null) {
                cVar.b(new c.a(optJSONObject.getString("message"), optJSONObject.getInt("code")));
            }
            return cVar;
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
