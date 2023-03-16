package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final i6.b<i5.a> f5904a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f5905b = DesugarCollections.synchronizedMap(new HashMap());

    public q(i6.b<i5.a> bVar) {
        this.f5904a = bVar;
    }

    public void a(String str, e eVar) {
        JSONObject optJSONObject;
        i5.a aVar = this.f5904a.get();
        if (aVar == null) {
            return;
        }
        JSONObject f10 = eVar.f();
        if (f10.length() < 1) {
            return;
        }
        JSONObject d10 = eVar.d();
        if (d10.length() >= 1 && (optJSONObject = f10.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f5905b) {
                if (optString.equals(this.f5905b.get(str))) {
                    return;
                }
                this.f5905b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", d10.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                aVar.f("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                aVar.f("fp", "_fpc", bundle2);
            }
        }
    }
}
