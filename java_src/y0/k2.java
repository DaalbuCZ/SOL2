package y0;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import y0.c3;
import y0.z1;
/* loaded from: classes.dex */
public class k2 implements n<z1, String> {
    private JSONObject d(g0 g0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", g0Var.a());
        return jSONObject;
    }

    private JSONObject e(l0 l0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("application", d(l0Var.a()));
        jSONObject.put("versionName", l0Var.e());
        jSONObject.put("versionCode", l0Var.c());
        return jSONObject;
    }

    private JSONObject f(c3 c3Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("udid", c3Var.l());
        jSONObject.put("name", c3Var.e());
        jSONObject.put("deviceType", c3Var.c());
        jSONObject.put("osVersion", c3Var.f());
        jSONObject.put("version", c3Var.m());
        jSONObject.put("build", c3Var.b());
        jSONObject.put("language", c3Var.d());
        jSONObject.put("timezone", c3Var.i());
        jSONObject.put("sdkType", c3Var.g());
        jSONObject.put("applicationToken", c3Var.a());
        jSONObject.put("sdkVersion", c3Var.h());
        return jSONObject;
    }

    @Override // y0.n
    /* renamed from: c */
    public String b(z1 z1Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device", f(z1Var.d()));
            jSONObject.put("applicationVersion", e(z1Var.a()));
            jSONObject.put("batteryLevel", z1Var.c());
            jSONObject.put("freeRam", z1Var.e());
            jSONObject.put("time", u.c().format(z1Var.n()));
            jSONObject.put("osVersion", z1Var.i());
            jSONObject.put("language", z1Var.f());
            jSONObject.put("timezone", z1Var.o());
            jSONObject.put("totalRam", z1Var.p());
            jSONObject.put("ramUsed", z1Var.j());
            jSONObject.put("orientation", z1Var.h());
            jSONObject.put("sdkType", z1Var.k());
            jSONObject.put("localSessionId", z1Var.g());
            jSONObject.put("sessionId", z1Var.l());
            jSONObject.put("sessionIdentifier", z1Var.m());
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }

    @Override // y0.n
    /* renamed from: g */
    public z1 a(String str) {
        String str2;
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            z1.a aVar = new z1.a();
            JSONObject optJSONObject = jSONObject.optJSONObject("device");
            if (optJSONObject != null) {
                String string = optJSONObject.getString("udid");
                String string2 = optJSONObject.getString("name");
                String string3 = optJSONObject.getString("deviceType");
                String optString = optJSONObject.optString("osVersion");
                String optString2 = optJSONObject.optString("version");
                String optString3 = optJSONObject.optString("build");
                String optString4 = optJSONObject.optString("language");
                String optString5 = optJSONObject.optString("timezone");
                String optString6 = optJSONObject.optString("sdkType");
                str2 = "language";
                str3 = "osVersion";
                aVar.g(new c3.b().n(string).i(string2).g(string3).j(optString).o(optString2).f(optString3).h(optString4).m(optString5).k(optString6).b(optJSONObject.getString("applicationToken")).l(optJSONObject.optString("sdkVersion")).d());
            } else {
                str2 = "language";
                str3 = "osVersion";
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("applicationVersion");
            if (optJSONObject2 != null) {
                String string4 = optJSONObject2.getString("versionName");
                String string5 = optJSONObject2.getString("versionCode");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("application");
                aVar.f(l0.d(new g0(optJSONObject3 != null ? optJSONObject3.getString("key") : null), string4, string5));
            }
            Double valueOf = Double.valueOf(jSONObject.optDouble("batteryLevel"));
            aVar.a(valueOf.isNaN() ? 0.0f : BigDecimal.valueOf(valueOf.doubleValue()).floatValue());
            aVar.c(jSONObject.optLong("freeRam"));
            String optString7 = jSONObject.optString("time", null);
            try {
                aVar.e(optString7 != null ? u.c().parse(optString7) : new Date());
            } catch (ParseException unused) {
                aVar.e(new Date());
            }
            aVar.p(jSONObject.getString("timezone"));
            aVar.o(jSONObject.getLong("totalRam"));
            aVar.k(jSONObject.getLong("ramUsed"));
            aVar.b(jSONObject.getInt("orientation"));
            aVar.l(jSONObject.getString("sdkType"));
            aVar.i(jSONObject.getLong("localSessionId"));
            aVar.m(jSONObject.getLong("sessionId"));
            aVar.j(jSONObject.optString(str3));
            aVar.d(jSONObject.optString(str2));
            String optString8 = jSONObject.optString("sessionIdentifier");
            if (optString8 != null) {
                aVar.n(optString8);
            }
            return aVar.h();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
