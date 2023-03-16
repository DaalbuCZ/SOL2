package l8;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f11211a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11212b;

    public j(String str, Object obj) {
        this.f11211a = str;
        this.f11212b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f11212b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f11212b;
    }

    public boolean c(String str) {
        Object obj = this.f11212b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
