package y0;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    public static String a(d3 d3Var, z1 z1Var) {
        try {
            l3.a(d3Var, "Issue == null");
            l3.a(d3Var.d(), "Application == null");
            l3.a(d3Var.f(), "sessionId == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("uid", d3Var.j() != null ? d3Var.j().toString() : null);
            jSONObject.put("title", d3Var.h());
            jSONObject.put("text", d3Var.g());
            jSONObject.put("session_id", d3Var.f());
            jSONObject.put("app", k.a(d3Var.d()));
            jSONObject.putOpt("type", d3Var.i());
            jSONObject.putOpt("raw", d3Var.e());
            jSONObject.put("session", new JSONObject(g.a(z1Var, Boolean.FALSE)));
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
