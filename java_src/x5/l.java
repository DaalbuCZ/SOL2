package x5;

import org.json.JSONObject;
import q5.r;
import x5.d;
/* loaded from: classes.dex */
class l implements h {
    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(r rVar, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : rVar.a() + (j10 * 1000);
    }

    @Override // x5.h
    public d a(r rVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new d(d(rVar, optInt2, jSONObject), c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject()), b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
