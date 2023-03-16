package x5;

import org.json.JSONObject;
import q5.r;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final r f16366a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(r rVar) {
        this.f16366a = rVar;
    }

    private static h a(int i10) {
        if (i10 != 3) {
            n5.f f10 = n5.f.f();
            f10.d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
            return new b();
        }
        return new l();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f16366a, jSONObject);
    }
}
