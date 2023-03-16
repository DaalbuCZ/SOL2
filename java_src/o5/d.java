package o5;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d implements b, p5.b {

    /* renamed from: a  reason: collision with root package name */
    private p5.a f12151a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p5.b
    public void a(p5.a aVar) {
        this.f12151a = aVar;
        n5.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // o5.b
    public void i(String str, Bundle bundle) {
        p5.a aVar = this.f12151a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                n5.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
