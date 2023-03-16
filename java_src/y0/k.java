package y0;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(g0 g0Var) {
        try {
            l3.a(g0Var, "application == null");
            l3.a(g0Var.a(), "application.getKey()");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", g0Var.a());
            return jSONObject;
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
