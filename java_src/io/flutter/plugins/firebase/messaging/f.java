package io.flutter.plugins.firebase.messaging;

import android.content.SharedPreferences;
import com.google.firebase.messaging.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    private static f f8975c;

    /* renamed from: a  reason: collision with root package name */
    private final String f8976a = ",";

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f8977b;

    public static f b() {
        if (f8975c == null) {
            f8975c = new f();
        }
        return f8975c;
    }

    private SharedPreferences c() {
        if (this.f8977b == null) {
            this.f8977b = p8.a.a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.f8977b;
    }

    private Map<String, Object> f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public Map<String, Object> a(String str) {
        String d10 = d(str, null);
        if (d10 != null) {
            try {
                HashMap hashMap = new HashMap(1);
                Map<String, Object> f10 = f(new JSONObject(d10));
                f10.put("to", str);
                hashMap.put("message", f10);
                return hashMap;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public String d(String str, String str2) {
        return c().getString(str, str2);
    }

    public List<Object> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public void g(String str) {
        c().edit().remove(str).apply();
        String d10 = d("notification_ids", "");
        if (d10.isEmpty()) {
            return;
        }
        h("notification_ids", d10.replace(str + ",", ""));
    }

    public void h(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }

    public void i(o0 o0Var) {
        h(o0Var.x(), new JSONObject(g.f(o0Var)).toString());
        String str = d("notification_ids", "") + o0Var.x() + ",";
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
        if (arrayList.size() > 20) {
            String str2 = (String) arrayList.get(0);
            c().edit().remove(str2).apply();
            str = str.replace(str2 + ",", "");
        }
        h("notification_ids", str);
    }
}
