package y0;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i {
    public static String a(String str, String str2, q<?> qVar) {
        try {
            l3.a(str, "applicationKey == null");
            l3.a(str2, "deviceId == null");
            l3.a(qVar, "keyValuePair == null");
            l3.a(qVar.a(), "key == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_key", str);
            jSONObject.put("device_id", str2);
            jSONObject.put("key", qVar.a());
            jSONObject.put("value", qVar.b());
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
