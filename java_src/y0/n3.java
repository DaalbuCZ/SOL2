package y0;

import android.text.TextUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import y0.d3;
/* loaded from: classes.dex */
public class n3 implements n<d3, String> {
    private JSONObject c(d3 d3Var) {
        if (d3Var.d() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", d3Var.d().a());
                return jSONObject;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // y0.n
    /* renamed from: d */
    public d3 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uid");
            String string = jSONObject.getString("title");
            String string2 = jSONObject.getString("text");
            long j10 = jSONObject.getLong("sessionId");
            String optString2 = jSONObject.optString("type");
            if (optString2 == null) {
                optString2 = jSONObject.optString("tag");
            }
            String optString3 = jSONObject.optString("raw");
            JSONObject optJSONObject = jSONObject.optJSONObject("application");
            String string3 = optJSONObject != null ? optJSONObject.getString("key") : null;
            if (string3 != null) {
                d3.b c10 = d3.a().j(string).h(string2).b(j10).e(new g0(string3)).l(optString2).c(optString3);
                if (!TextUtils.isEmpty(optString)) {
                    c10.d(UUID.fromString(optString));
                }
                return c10.f();
            }
            d3.b c11 = d3.a().j(string).h(string2).b(j10).l(optString2).c(optString3);
            if (!TextUtils.isEmpty(optString)) {
                c11.d(UUID.fromString(optString));
            }
            return c11.f();
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // y0.n
    /* renamed from: e */
    public String b(d3 d3Var) {
        JSONObject c10 = c(d3Var);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", d3Var.j().toString());
            jSONObject.put("title", d3Var.h());
            jSONObject.put("text", d3Var.g());
            jSONObject.put("sessionId", d3Var.f());
            jSONObject.put("application", c10);
            jSONObject.putOpt("type", d3Var.i());
            jSONObject.putOpt("raw", d3Var.e());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
