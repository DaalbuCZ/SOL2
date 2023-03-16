package y0;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    public static String a(String str, c3 c3Var, Map<String, ?> map) {
        try {
            l3.a(str, "applicationToken == null");
            l3.a(c3Var, "device == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_token", str);
            jSONObject.put("device", b(c3Var, map));
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }

    private static JSONObject b(c3 c3Var, Map<String, ?> map) {
        try {
            l3.a(c3Var, "device == null");
            l3.a(c3Var.l(), "udid == null");
            l3.a(c3Var.e(), "name == null");
            l3.a(c3Var.f(), "osVersion == null");
            l3.a(c3Var.m(), "version == null");
            l3.a(c3Var.b(), "build == null");
            l3.a(c3Var.d(), "language == null");
            l3.a(c3Var.g(), "sdkType == null");
            l3.a(c3Var.i(), "timezone == null");
            l3.a(c3Var.c(), "device_type == null");
            l3.a(c3Var.h(), "sdk_version == null");
            l3.a(Long.valueOf(c3Var.k()), "total_storage_size == null");
            l3.a(Long.valueOf(c3Var.j()), "total_storage_available == null");
            l3.a(Boolean.valueOf(c3Var.n()), "firebase_test_lab == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("udid", c3Var.l());
            jSONObject.put("name", c3Var.e());
            jSONObject.put("os_version", c3Var.f());
            jSONObject.put("version", c3Var.m());
            jSONObject.put("build", c3Var.b());
            jSONObject.put("language", c3Var.d());
            jSONObject.put("sdk_type", c3Var.g());
            jSONObject.put("timezone", c3Var.i());
            jSONObject.put("device_type", c3Var.c());
            jSONObject.put("sdk_version", c3Var.h());
            jSONObject.put("total_storage_size", c3Var.k());
            jSONObject.put("total_storage_available", c3Var.j());
            jSONObject.put("firebase_test_lab", c3Var.n());
            if (!map.isEmpty()) {
                if (map.containsKey("$android_id")) {
                    jSONObject.put("$android_id", map.remove("$android_id"));
                }
                if (map.containsKey("$package_id")) {
                    jSONObject.put("$package_id", map.remove("$package_id"));
                }
                if (!map.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, ?> entry : map.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("key_values", jSONObject2);
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
