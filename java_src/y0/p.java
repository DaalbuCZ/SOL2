package y0;

import org.json.JSONException;
import org.json.JSONObject;
import y0.k3;
/* loaded from: classes.dex */
public class p implements n<k3, String> {
    @Override // y0.n
    /* renamed from: c */
    public String b(k3 k3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("logger_enabled", k3Var.c());
            jSONObject.put("crashes_enabled", k3Var.b());
            jSONObject.put("latest_sdk_version", k3Var.a());
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }

    @Override // y0.n
    /* renamed from: d */
    public k3 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z10 = jSONObject.getBoolean("logger_enabled");
            boolean z11 = jSONObject.getBoolean("crashes_enabled");
            return new k3.b().b(z10).d(z11).a(jSONObject.getInt("latest_sdk_version")).c();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
