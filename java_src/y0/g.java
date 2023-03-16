package y0;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    public static String a(z1 z1Var, Boolean bool) {
        String format = u.c().format(z1Var.n());
        try {
            l3.a(z1Var, "session == null");
            l3.a(z1Var.d(), "session.getDevice() == null");
            l3.a(z1Var.a(), "session.getApplicationVersion() == null");
            l3.a(Float.valueOf(z1Var.c()), "session.getBatteryLevel() == null");
            l3.a(Long.valueOf(z1Var.e()), "session.getFreeRam() == null");
            l3.a(z1Var.n(), "session.getTime() == null");
            l3.a(z1Var.i(), "session.getOsVersion() == null");
            l3.a(z1Var.f(), "session.getLanguage() == null");
            l3.a(z1Var.o(), "session.getTimezone() == null");
            l3.a(Long.valueOf(z1Var.p()), "session.getTotalRam() == null");
            l3.a(Long.valueOf(z1Var.j()), "session.getRamUsed() == null");
            l3.a(Integer.valueOf(z1Var.h()), "session.getOrientation() == null");
            l3.a(z1Var.k(), "session.getSdkType() == null");
            l3.a(z1Var.m(), "session.getSessionIdentifier() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device", d(z1Var.d()));
            jSONObject.put("app_version", c(z1Var.a()));
            jSONObject.put("battery_level", z1Var.c());
            jSONObject.put("ram_free", z1Var.e());
            jSONObject.put("time", format);
            jSONObject.put("os_version", z1Var.i());
            jSONObject.put("language", z1Var.f());
            jSONObject.put("timezone", z1Var.o());
            jSONObject.put("ram_total", z1Var.p());
            jSONObject.put("ram_used", z1Var.j());
            jSONObject.put("orientation", z1Var.h());
            jSONObject.put("sdk_type", z1Var.k());
            jSONObject.put("session_uid", z1Var.m());
            if (bool.booleanValue()) {
                jSONObject.put("will_resend", true);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }

    private static JSONObject b(g0 g0Var) {
        try {
            l3.a(g0Var, "application == null");
            l3.a(g0Var.a(), "application.getKey() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", g0Var.a());
            return jSONObject;
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }

    private static JSONObject c(l0 l0Var) {
        try {
            l3.a(l0Var, "applicationVersion == null");
            l3.a(l0Var.a(), "applicationVersion.getApplication() == null");
            l3.a(l0Var.e(), "applicationVersion.getVersionName() == null");
            l3.a(l0Var.c(), "applicationVersion.getVersionCode() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app", b(l0Var.a()));
            jSONObject.put("version", l0Var.e());
            jSONObject.put("build", l0Var.c());
            return jSONObject;
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }

    private static JSONObject d(c3 c3Var) {
        try {
            l3.a(c3Var, "device == null");
            l3.a(c3Var.l(), "device.getUdid() == null");
            l3.a(c3Var.e(), "device.getName() == null");
            l3.a(c3Var.c(), "device.getDeviceType() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("udid", c3Var.l());
            jSONObject.put("name", c3Var.e());
            jSONObject.put("device_type", c3Var.c());
            return jSONObject;
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }
}
