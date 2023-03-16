package y0;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class j {
    public static String a(List<n0> list, z1 z1Var) {
        try {
            l3.a(list, "logs == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", z1Var.l());
            JSONArray jSONArray = new JSONArray();
            for (n0 n0Var : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("l", n0Var.e());
                jSONObject2.put("ll", n0Var.d());
                jSONObject2.put("at", n0Var.a());
                jSONObject2.put("x", u.c().format(n0Var.b()));
                jSONObject2.put("tg", n0Var.g());
                jSONObject2.put("m", n0Var.f());
                jSONObject2.put("f", n0Var.c());
                jSONObject2.put("t", n0Var.h());
                jSONObject2.put("thn", n0Var.j());
                jSONObject2.put("th", n0Var.i());
                jSONObject2.put("session", new JSONObject(g.a(z1Var, Boolean.FALSE)));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("logs", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
